package gen.wzp.main.person;

import gen.wzp.main.MyConstants;
import gen.wzp.main.R;
import gen.wzp.main.domain.MyTask;
import gen.wzp.main.domain.MyTime;
import gen.wzp.main.domain.UserInfo;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class PersonLight extends Activity {

	public static UserInfo myselfInfo = null;
	public static List<MyTime> myselfTime = null;
	
	public static List<MyTask> myselfTask = null;

	private ImageView headImage;
	private ImageView lightImage;
	private AnimationDrawable lightAnim = null;

	private boolean lightFlag = false;

	private TextView lightText;
	
	private Button turnBtn;

	private TextView nameText;
	private TextView msgNumText;

	private TextView personwordsText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.person_main);

		getWindow().setSoftInputMode(
				WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

		initView();
		initData();
		initPersonTimeBar();

		initPersonTimeTask();
	}

	public void person_timebar_edit(View v) {
		Intent intent = new Intent(PersonLight.this, TimeEdit.class);
		startActivity(intent);
	}
	
	public void person_time_btn3(View v){
		Intent intent = new Intent(PersonLight.this, PlanEdit.class);
		startActivity(intent);
	}

	public void person_turn_on(View v) {
		if (lightFlag == false) {
			Toast.makeText(getApplicationContext(),
					"时光灯已点亮，\n" + "你的好友可以看到你的时光状态了。", Toast.LENGTH_LONG).show();
			lightFlag = true;
			lightText.setText(" 已点亮");
			turnBtn.setText("Turn Off");
			
			initLightAnim();
		} else{
			Toast.makeText(getApplicationContext(),
					"时光灯已关闭。\n", Toast.LENGTH_SHORT).show();
			lightFlag = false;
			
			lightImage = (ImageView) findViewById(R.id.person_light);
			Object obj = lightImage.getBackground();
			lightAnim = (AnimationDrawable) obj;
			lightAnim.stop();
			
			lightText.setText(" 未点亮");
			turnBtn.setText("Turn On");
			
			
		}
	}

	private void initLightAnim() {
		lightImage = (ImageView) findViewById(R.id.person_light);
		Object obj = lightImage.getBackground();
		lightAnim = (AnimationDrawable) obj;
		lightAnim.stop();
		if (lightFlag == true) {
			lightAnim.start();
		}
	}

	public void get_person_msg(View v) {
		Intent intent = new Intent(PersonLight.this, PersonMessage.class);
		startActivity(intent);
	}

	private void initView() {
		headImage = (ImageView) this.findViewById(R.id.person_head);
		lightImage = (ImageView) this.findViewById(R.id.person_light);
		lightText = (TextView) this.findViewById(R.id.person_light_text);
		nameText = (TextView) this.findViewById(R.id.person_name);
		msgNumText = (TextView) this.findViewById(R.id.person_msg_num);

		personwordsText = (TextView) this.findViewById(R.id.personwords_text);
		
		turnBtn = (Button) this.findViewById(R.id.person_turn_on);

	}

	private void initData() {

		myselfInfo = MyConstants.DaveInfo;
		headImage.setImageResource(Integer.parseInt(myselfInfo.getHead()));

		myselfTime = new ArrayList<MyTime>();
		myselfTime = MyConstants.DaveTime;
		
		myselfTask = new ArrayList<MyTask>();
		myselfTask = MyConstants.DaveTask;
	}

	private void initPersonTimeBar() {
		RelativeLayout mLayout = (RelativeLayout) this
				.findViewById(R.id.person_timebar_layout);
		LayoutInflater mInflater = LayoutInflater.from(mLayout.getContext());

		for (int i = 0; i < myselfTime.size(); i++) {
			MyTime myTime = myselfTime.get(i);

			View mView = mInflater.inflate(R.layout.time_block_green, null);

			Bitmap bmp = BitmapFactory.decodeResource(getResources(),
					myTime.getTimepic_id());
			ImageView mImage = (ImageView) mView
					.findViewById(R.id.time_block_image);
			mImage.setImageBitmap(bmp);

			RelativeLayout.LayoutParams mLayoutParams = new RelativeLayout.LayoutParams(
					LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
			mLayoutParams.leftMargin = 50 * Integer.valueOf(myTime
					.getTimevalue().substring(0,
							myTime.getTimevalue().indexOf(':')));
			mLayoutParams.topMargin = 24;

			mImage.setPadding(5, 5, 5, 5);
			mImage.setBackgroundColor(Color.argb(255, 128, 172, 4));
			mImage.setLayoutParams(mLayoutParams);

			// 填补空白的区域
			TextView mText = (TextView) mView
					.findViewById(R.id.time_block_fill);
			String timeStr = myTime.getTimevalue();
			int start = Integer.valueOf(timeStr.substring(0,
					timeStr.indexOf(':')));
			int end = Integer.valueOf(timeStr.substring(
					timeStr.indexOf('~') + 1, timeStr.lastIndexOf(":")));
			int timeLength = (end - start - 1) * 50;
			if (timeLength < 0)
				timeLength = 0;

			mLayoutParams = new RelativeLayout.LayoutParams(timeLength, 50);
			mLayoutParams.leftMargin = 2 + 50 + 50 * Integer.valueOf(timeStr
					.substring(0, timeStr.indexOf(':')));
			mLayoutParams.topMargin = 29;
			mImage.setBackgroundColor(Color.argb(255, 128, 172, 4));
			mText.setLayoutParams(mLayoutParams);

			// mView.bringToFront();
			mLayout.addView(mView, i);
		}
	}

	private void initPersonTimeTask() {
		LinearLayout tLayout = (LinearLayout) this
				.findViewById(R.id.person_timeplan_layout1);
		LayoutInflater tInflater = LayoutInflater.from(tLayout.getContext());
		
		for(int i=0; i<myselfTask.size(); i++){
			View tView = tInflater.inflate(R.layout.person_easy_timeplan,null);
			((ImageView) tView.findViewById(R.id.person_easy_timeplan_image))
			        .setImageResource(myselfTask.get(i).getTaskpic());
			((TextView) tView.findViewById(R.id.person_easy_timeplan_text1))
			        .setText(myselfTask.get(i).getTaskname());
			((TextView) tView.findViewById(R.id.person_easy_timeplan_text2))
			        .setText("完成度： "+myselfTask.get(i).getPercent());
			
			tLayout.addView(tView);
		}

	}

}
