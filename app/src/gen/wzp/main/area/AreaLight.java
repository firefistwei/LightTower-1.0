package gen.wzp.main.area;

import gen.wzp.main.R;
import gen.wzp.main.domain.MyArea;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AreaLight extends Activity {

	private ImageView imageView = null;
	private AnimationDrawable anim = null;
	Context context = null;

	public static List<MyArea> areaList = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.area_main);

		getWindow().setSoftInputMode(
				WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

		context = this;
		initImageAnim();

		initShowAreaData();
		initShowAreaView();
	}

	private void initShowAreaData() {
		areaList = new ArrayList<MyArea>();
		areaList.add(new MyArea(10001, 7711, "门诺时代户外探险队", R.drawable.area1, 24,
				""));
		areaList.add(new MyArea(10001, 7712, "黑魔法算法研究组", R.drawable.area2, 11,
				""));
		areaList.add(new MyArea(10001, 7713, "门奇小子Android小组", R.drawable.area3,
				5, ""));
		areaList.add(new MyArea(10001, 7714, "爱阅读书帮", R.drawable.area4, 19, ""));
		areaList.add(new MyArea(10001, 7715, "熬夜达人社团", R.drawable.area5, 7, ""));
		areaList.add(new MyArea(10001, 7716, "我爱交流讨论区", R.drawable.area6, 35,
				""));
	}

	private void initShowAreaView() {
		LinearLayout mLayout = (LinearLayout) this
				.findViewById(R.id.area_main_areas_layout);
		LayoutInflater mInflater = LayoutInflater.from(mLayout.getContext());
		
		for (int i = 0; i < areaList.size(); i++) {
			MyArea myArea = areaList.get(i);
			
			View mView = mInflater.inflate(R.layout.area_main_areas, null);
			
			((ImageView) mView.findViewById(R.id.area_main_areas_img1))
			    .setImageResource(myArea.getGpic());
			((TextView) mView.findViewById(R.id.area_main_areas_text1))
	            .setText(myArea.getGname());
			((TextView) mView.findViewById(R.id.area_main_areas_text2))
            .setText(myArea.getMax_member()+"人");
			
			mLayout.addView(mView, i);
			
		}
		
	}

	private void initImageAnim() {
		imageView = (ImageView) findViewById(R.id.area_anim_image);
		Object obj = imageView.getBackground();
		anim = (AnimationDrawable) obj;
		anim.stop();
		anim.start();
	}

	public void area_search_btn(View v) {
		Intent intent = new Intent(AreaLight.this, SearchForArea.class);
		startActivity(intent);
	}

}
