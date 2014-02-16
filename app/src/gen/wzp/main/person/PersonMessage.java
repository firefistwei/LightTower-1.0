package gen.wzp.main.person;

import gen.wzp.main.MyConstants;
import gen.wzp.main.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class PersonMessage extends Activity{

	Context context = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.person_message);
		
		context = this;
		ListView mListView = null;
		mListView = (ListView)this.findViewById(R.id.person_msg_lv);
		SimpleAdapter adapter = new SimpleAdapter(this,getMsgData(),
				R.layout.person_message_block,
				new String[]{"head","sender","content","time"},
				new int[]{R.id.person_msg_img1,R.id.person_msg_text1,
			              R.id.person_msg_text2,R.id.person_msg_text3});
		mListView.setAdapter(adapter);
	}

	private List<Map<String,Object>> getMsgData() {
		
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("head",R.drawable.random_head2);
		map.put("sender", "Mary");
		map.put("content", "晚上一起去图书馆吧?!");
		map.put("time", MyConstants.alltime);
		list.add(map);
		
		map = new HashMap<String,Object>();
		map.put("head",R.drawable.random_head3);
		map.put("sender", "Tom");
		map.put("content", "嘿，老兄，晚上喝酒走，老李请客。");
		map.put("time", MyConstants.alltime);
		list.add(map);
		
		map = new HashMap<String,Object>();
		map.put("head",R.drawable.random_head4);
		map.put("sender", "Jack");
		map.put("content", "明天在ack见！");
		map.put("time", MyConstants.alltime);
		list.add(map);
		
		return list;
	}

	public void person_message_back(View v){
		this.finish();
	}
}
