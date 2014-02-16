package gen.wzp.main;

import gen.wzp.main.active.ActiveLight;
import gen.wzp.main.area.AreaLight;
import gen.wzp.main.friend.FriendLight;
import gen.wzp.main.person.PersonLight;
import gen.wzp.main.setting.SettingLight;
import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.WindowManager.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TabHost;
import android.widget.TextView;


public class MainActivity extends TabActivity implements OnClickListener {
	public static MainActivity instance = null;

	private boolean menu_display = false;
	private PopupWindow menuWindow;
	private LayoutInflater inflater;
	private View layout;
	private LinearLayout menu_btn;

	public static String TAB_TAG_PERSON = "PersonLight";
	public static String TAB_TAG_FRIEND = "FriendLight";
	public static String TAB_TAG_ACTIVE = "ActiveLight";
	public static String TAB_TAG_AREA = "AreaLight";
	public static String TAB_TAG_SETTING = "SettingLight";

	public static TabHost mTabHost;
	ImageView mBut1, mBut2, mBut3, mBut4, mBut5;
	TextView mCateText1, mCateText2, mCateText3, mCateText4, mCateText5;
	int mCurTabId = R.id.channel1;

	private Animation left_in, left_out;
	private Animation right_in, right_out;

	static final int COLOR1 = Color.parseColor("#4f4f4f");
	static final int COLOR2 = Color.parseColor("#78ac04");

	@Override
	public void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		instance = this;

		left_in = AnimationUtils.loadAnimation(this, R.anim.left_in);
		left_out = AnimationUtils.loadAnimation(this, R.anim.left_out);

		right_in = AnimationUtils.loadAnimation(this, R.anim.right_in);
		right_out = AnimationUtils.loadAnimation(this, R.anim.right_out);

		mTabHost = this.getTabHost();

		mTabHost.addTab(mTabHost
				.newTabSpec(TAB_TAG_PERSON)
				.setIndicator(getString(R.string.tab_personlight),
						getResources().getDrawable(R.drawable.icon_1p))
				.setContent(new Intent(this, PersonLight.class)));
		mTabHost.addTab(mTabHost
				.newTabSpec(TAB_TAG_FRIEND)
				.setIndicator(getString(R.string.tab_friendlight),
						getResources().getDrawable(R.drawable.icon_2p))
				.setContent(new Intent(this, FriendLight.class)));
		mTabHost.addTab(mTabHost
				.newTabSpec(TAB_TAG_ACTIVE)
				.setIndicator(getString(R.string.tab_activelight),
						getResources().getDrawable(R.drawable.icon_3p))
				.setContent(new Intent(this, ActiveLight.class)));
		mTabHost.addTab(mTabHost
				.newTabSpec(TAB_TAG_AREA)
				.setIndicator(getString(R.string.tab_arealight),
						getResources().getDrawable(R.drawable.icon_4p))
				.setContent(new Intent(this, AreaLight.class)));
		mTabHost.addTab(mTabHost
				.newTabSpec(TAB_TAG_SETTING)
				.setIndicator(getString(R.string.tab_settinglight),
						getResources().getDrawable(R.drawable.icon_5p))
				.setContent(new Intent(this, SettingLight.class)));

		mBut1 = (ImageView) findViewById(R.id.imageView1);
		mBut2 = (ImageView) findViewById(R.id.imageView2);
		mBut3 = (ImageView) findViewById(R.id.imageView3);
		mBut4 = (ImageView) findViewById(R.id.imageView4);
		mBut5 = (ImageView) findViewById(R.id.imageView5);
		findViewById(R.id.channel1).setOnClickListener(this);
		findViewById(R.id.channel2).setOnClickListener(this);
		findViewById(R.id.channel3).setOnClickListener(this);
		findViewById(R.id.channel4).setOnClickListener(this);
		findViewById(R.id.channel5).setOnClickListener(this);
		mCateText1 = (TextView) findViewById(R.id.textView1);
		mCateText2 = (TextView) findViewById(R.id.textView2);
		mCateText3 = (TextView) findViewById(R.id.textView3);
		mCateText4 = (TextView) findViewById(R.id.textView4);
		mCateText5 = (TextView) findViewById(R.id.textView5);
	}

	@Override
	public void onClick(View v) {

		if (mCurTabId == v.getId()) {
			return;
		}
		mBut1.setImageResource(R.drawable.icon_1n);
		mBut2.setImageResource(R.drawable.icon_2n);
		mBut3.setImageResource(R.drawable.icon_3n);
		mBut4.setImageResource(R.drawable.icon_4n);
		mBut5.setImageResource(R.drawable.icon_5n);

		mCateText1.setTextColor(COLOR1);
		mCateText2.setTextColor(COLOR1);
		mCateText3.setTextColor(COLOR1);
		mCateText4.setTextColor(COLOR1);
		mCateText5.setTextColor(COLOR1);

		int checkedId = v.getId();
		final boolean o;
		if (mCurTabId < checkedId)
			o = true;
		else
			o = false;
		if (o)
			mTabHost.getCurrentView().startAnimation(left_out);
		else
			mTabHost.getCurrentView().startAnimation(right_out);
		switch (checkedId) {
		case R.id.channel1:
			mTabHost.setCurrentTabByTag(TAB_TAG_PERSON);
			mBut1.setImageResource(R.drawable.icon_1p);
			mCateText1.setTextColor(COLOR2);
			break;
		case R.id.channel2:
			mTabHost.setCurrentTabByTag(TAB_TAG_FRIEND);
			mBut2.setImageResource(R.drawable.icon_2p);
			mCateText2.setTextColor(COLOR2);
			break;
		case R.id.channel3:
			mTabHost.setCurrentTabByTag(TAB_TAG_ACTIVE);
			mBut3.setImageResource(R.drawable.icon_3p);
			mCateText3.setTextColor(COLOR2);
			break;
		case R.id.channel4:
			mTabHost.setCurrentTabByTag(TAB_TAG_AREA);
			mBut4.setImageResource(R.drawable.icon_4p);
			mCateText4.setTextColor(COLOR2);
			break;
		case R.id.channel5:
			mTabHost.setCurrentTabByTag(TAB_TAG_SETTING);
			mBut5.setImageResource(R.drawable.icon_5p);
			mCateText5.setTextColor(COLOR2);
			break;
		default:
			break;
		}

		if (o)
			mTabHost.getCurrentView().startAnimation(left_in);
		else
			mTabHost.getCurrentView().startAnimation(right_in);
		mCurTabId = checkedId;

	}

	@Override
	public boolean dispatchKeyEvent(KeyEvent event) {
		if (event.getKeyCode() == KeyEvent.KEYCODE_BACK
				&& event.getAction() == KeyEvent.ACTION_DOWN
				&& event.getRepeatCount() == 0) {
			if (menu_display) {
				menuWindow.dismiss();
				menu_display = false;
			} else {
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, Exit.class);
				startActivity(intent);
			}
		} else if (event.getKeyCode() == KeyEvent.KEYCODE_MENU
				&& event.getAction() == KeyEvent.ACTION_DOWN) {

			if (!menu_display) {
				inflater = (LayoutInflater) this
						.getSystemService(LAYOUT_INFLATER_SERVICE);
				layout = inflater.inflate(R.layout.main_menu, null);
				menuWindow = new PopupWindow(layout, LayoutParams.FILL_PARENT,
						LayoutParams.WRAP_CONTENT);
				menuWindow.showAtLocation(
						this.findViewById(R.id.main_linearlayout),
						Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);

				menu_btn = (LinearLayout) layout.findViewById(R.id.menu_btn);
				menu_btn.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View v) {
						// 还没想好，待定！
						// Intent intent = new Intent();
						// intent.setClass(,);
						// startActivity(intent);
						menuWindow.dismiss(); // 响应点击事件之后关闭Menu

					}
				});
				menu_display = true;
			} else {
				menuWindow.dismiss();
				menu_display = false;
			}
			return false;

		}

		return false;
	}


    
}
