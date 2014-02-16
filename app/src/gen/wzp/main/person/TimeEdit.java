package gen.wzp.main.person;

import gen.wzp.main.MyConstants;
import gen.wzp.main.R;
import gen.wzp.main.domain.MyTime;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TimeEdit extends Activity {

	public static List<MyTime> personalTime = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.person_timeedit);

		getWindow().setSoftInputMode(
				WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

		initTimeTaskData();
		initTimeTaskView();
	}

	private void initTimeTaskData() {
		personalTime = new ArrayList<MyTime>();
		personalTime = MyConstants.DaveTime;

	}

	private void initTimeTaskView() {
		LinearLayout mLayout = (LinearLayout) this
				.findViewById(R.id.person_ed_timetask_layout);
		LayoutInflater mInflater = LayoutInflater.from(mLayout.getContext());

		for (int i = 0; i < personalTime.size(); i++) {
			MyTime myTime = personalTime.get(i);

			View mView = mInflater.inflate(R.layout.person_ed_timetask, null);

			Bitmap bmp = BitmapFactory.decodeResource(getResources(),
					myTime.getTimepic_id());
			ImageView taskImage = (ImageView) mView
					.findViewById(R.id.person_timetask_image);
			taskImage.setImageBitmap(bmp);

			// //对时间格式进行微调，让其更好看一些， '~'两边加空格
			String formatTime = myTime.getTimevalue();
			String resultTime = 
					formatTime.substring(0, formatTime.indexOf('~'))
					+ " ~ "
					+ formatTime.substring(formatTime.indexOf('~') + 1,
							formatTime.length());

			((TextView) mView.findViewById(R.id.person_timetask_text1))
					.setText(resultTime);
			
			String chineseStr = MyConstants.timeTaskChinese.get(
					MyConstants.timeTaskName.indexOf(myTime.getTimename()));
			((TextView) mView.findViewById(R.id.person_timetask_text2))
			        .setText(chineseStr);
			
			((TextView) mView.findViewById(R.id.person_timetask_text3))
			        .setText(MyConstants.date);

			mLayout.addView(mView, i);
		}
	}
	
	public void person_timeedit_back(View v){
		this.finish();
	}
	
	public void person_time_to_plan(View v){
		Intent intent = new Intent(TimeEdit.this, PlanEdit.class);
		startActivity(intent);
		this.finish();
	}

}
