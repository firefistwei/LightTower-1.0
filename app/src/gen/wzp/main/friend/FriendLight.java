package gen.wzp.main.friend;

import gen.wzp.main.R;
import java.util.ArrayList;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class FriendLight extends FragmentActivity {

	public static FriendLight instance = null;
	private static final String TAG = "FriendLight";

	private ArrayList<Fragment> fragmentsList;
	private CustomViewPager viewPager;
	private ImageView imageView;

	private Bitmap cursor;
	private int offset;
	private int currentItem;
	private Matrix matrix = new Matrix();
	private int bmWidth;
	private Animation animation;
	private TextView tv1, tv2, tv3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.friend_main);

		instance = this;

		imageView = (ImageView) findViewById(R.id.cursor);
		tv1 = (TextView) findViewById(R.id.textView1);
		tv2 = (TextView) findViewById(R.id.textView2);
		tv3 = (TextView) findViewById(R.id.textView3);

		

		initCursor();

		// Fragment friend_TimeState = new Friend_TimeState();
		// Fragment friend_HotDegree = new Friend_HotDegree();
		// Fragment friend_Position = new Friend_HotDegree();

		fragmentsList = new ArrayList<Fragment>();

		fragmentsList.add(Fragment.instantiate(this,
				Friend_TimeState.class.getName()));
		fragmentsList.add(Fragment.instantiate(this,
				Friend_HotDegree.class.getName()));
		fragmentsList.add(Fragment.instantiate(this,
				Friend_Position.class.getName()));

		viewPager = (CustomViewPager) findViewById(R.id.viewPager);

		viewPager.setAdapter(new MyFragmentPagerAdapter(this
				.getSupportFragmentManager(), fragmentsList));

		viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			@Override
			public void onPageSelected(int arg0) {
				int one = offset * 2 + bmWidth;// 页卡1 -> 页卡2 偏移量
				// int two = one * 2;// 页卡1 -> 页卡3 偏移量

				animation = new TranslateAnimation(one * currentItem, one
						* arg0, 0, 0);// 显然这个比较简洁，只有一行代码。
				currentItem = arg0;
				animation.setFillAfter(true);// True:图片停在动画结束位置
				animation.setDuration(300);
				imageView.startAnimation(animation);

			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
			}
		});

		tv1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				viewPager.setCurrentItem(0);
			}
		});

		tv2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				viewPager.setCurrentItem(1);
			}
		});

		tv3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				viewPager.setCurrentItem(2);
			}
		});

	}

	private void initCursor() {
		cursor = BitmapFactory
				.decodeResource(getResources(), R.drawable.cursor);
		bmWidth = cursor.getWidth();

		DisplayMetrics dm;
		dm = getResources().getDisplayMetrics();

		offset = (dm.widthPixels - 3 * bmWidth) / 6;
		matrix.setTranslate(offset, 0);
		imageView.setImageMatrix(matrix);
		currentItem = 1;
	}

	//      friend_position中的控件                  ////////////////////////////////////////
	public void start_searching(View v) { // 图
		Intent intent = new Intent(FriendLight.this, PositionView.class);
		startActivity(intent);

	}

	public void btn_start_position(View v) { // 按钮
		Intent intent = new Intent(FriendLight.this, PositionView.class);
		startActivity(intent);
	}


}
