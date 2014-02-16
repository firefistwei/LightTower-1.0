package gen.wzp.main.active;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import gen.wzp.main.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class ActiveLight extends Activity {

	private ImageView imageView = null;
	private AnimationDrawable anim = null;

	private ListView mListView = null;

	Context context = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.active_main);

		getWindow().setSoftInputMode(
				WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

		context = this;
		initImageAnim();
		mListView = (ListView) this.findViewById(R.id.active_listview);

		SimpleAdapter adapter = new SimpleAdapter(this, initList(),
				R.layout.active_list, new String[] { "image1", "tv1", "tv2",
						"image2" }, new int[] { R.id.active_list_img1,
						R.id.active_list_tv1, R.id.active_list_tv2,
						R.id.active_list_img2 });
		mListView.setAdapter(adapter);
		
		mListView.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				switch (position){
				case 0:
					//Toast.makeText(getApplicationContext(), "你点了 我的活动 ", 1000).show();
					break;
				case 1:
					//Toast.makeText(getApplicationContext(), "你点了 个人活动 ", 1000).show();
					break;
				case 2:
					//Toast.makeText(getApplicationContext(), "你点了 公共活动 ", 1000).show();
					break;
				case 3:
					//Toast.makeText(getApplicationContext(), "Nothing ", 1000).show();
					break;
				}
				
			}
			
		});
	}

	
	
	private void initImageAnim() {
		imageView = (ImageView) findViewById(R.id.active_anim_image);
		Object obj = imageView.getBackground();
		anim = (AnimationDrawable) obj;
		anim.stop();
		anim.start();
	}

	private List<Map<String, Object>> initList() {
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>> ();
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("image1",R.drawable.list_img1);
		map.put("tv1","我的活动");
		map.put("tv2", "Just call your friends to have a good time.");
		map.put("image2",R.drawable.arrow_1);
		list.add(map);
		
		map = new HashMap<String,Object>();
		map.put("image1",R.drawable.list_img2);
		map.put("tv1","个人活动");
		map.put("tv2", "To find the public activities in this area.");
		map.put("image2",R.drawable.arrow_1);
		list.add(map);
		
		map = new HashMap<String,Object>();
		map.put("image1",R.drawable.list_img3);
		map.put("tv1","公共活动");
		map.put("tv2", "The activities from friends that you'd join.");
		map.put("image2",R.drawable.arrow_1);
		list.add(map);
		
		return list;
	}

	public void active_main_btn(View v){
		Intent intent = new Intent(ActiveLight.this, PublicActive.class);
		startActivity(intent);
	}
	
}
