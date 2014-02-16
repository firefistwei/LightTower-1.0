package gen.wzp.main.friend;

import gen.wzp.main.MyConstants;
import gen.wzp.main.R;
import gen.wzp.main.domain.MyTime;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Friend_TimeState extends Fragment {

	private static final String TAG = "Friend_TimeState";

	private SyncHorizontalScrollView scrollView_0;
	private SyncHorizontalScrollView scrollView_1;

	public static List<ArrayList<MyTime>> friendsTime = null;

	// private ListView mListView;
	// private TimeBarAdapter mAdapter;
	// private List<FriendTimeBar> mList = new ArrayList<FriendTimeBar> ();

	private List<FriendTimeBar> barList;
	private Context context;
	private LayoutInflater mInflater;

	public static LinearLayout myLayout = null; // 加载好友的 timestatebar

	public List<SyncHorizontalScrollView> scrollList;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.d(TAG, "TestFragment-----onCreate");

		barList = new ArrayList<FriendTimeBar>();
		scrollList = new ArrayList<SyncHorizontalScrollView>();

		scrollView_0 = new SyncHorizontalScrollView(FriendLight.instance);
		scrollView_1 = new SyncHorizontalScrollView(FriendLight.instance);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.d(TAG, "TestFragment-----onCreateView");
		View view = inflater.inflate(R.layout.friend_timestate, container,
				false);
		context = getActivity();

		myLayout = (LinearLayout) view.findViewById(R.id.layout_time_list);
		myLayout.removeAllViews();

		mInflater = LayoutInflater.from(myLayout.getContext());

		scrollView_0 = (SyncHorizontalScrollView) view
				.findViewById(R.id.horizontal_scroll_0);
		scrollView_1 = (SyncHorizontalScrollView) view
				.findViewById(R.id.horizontal_scroll_1);

		return view;
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.d(TAG, "TestFragment-----onDestroy");
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		initData();

		initTimeListView();

		for (int i = scrollList.size() - 1; i > 0; i--) {
			scrollList.get(i - 1).setScrollView(scrollList.get(i));
		}
		scrollView_1.setScrollView(scrollList.get(0));
		// 1号 跟着 0号动 ,或者说 0控制1
		scrollView_0.setScrollView(scrollView_1);

	}

	private void initData() {
		Resources res = getResources();
		Bitmap bmp2 = BitmapFactory
				.decodeResource(res, R.drawable.random_head2);
		Bitmap bmp3 = BitmapFactory
				.decodeResource(res, R.drawable.random_head3);
		Bitmap bmp4 = BitmapFactory
				.decodeResource(res, R.drawable.random_head4);
		Bitmap bmp6 = BitmapFactory
				.decodeResource(res, R.drawable.random_head6);
		Bitmap bmp7 = BitmapFactory
				.decodeResource(res, R.drawable.random_head7);
		Bitmap bmp9 = BitmapFactory
				.decodeResource(res, R.drawable.random_head9);
		Bitmap bmp10 = BitmapFactory.decodeResource(res,
				R.drawable.random_head10);
		Bitmap bmp12 = BitmapFactory.decodeResource(res,
				R.drawable.random_head12);
		Bitmap bmp13 = BitmapFactory.decodeResource(res,
				R.drawable.random_head13);

		barList.clear();

		barList.add(new FriendTimeBar("Mary", bmp2, false));
		barList.add(new FriendTimeBar("Tom", bmp3, true));
		barList.add(new FriendTimeBar("Jack", bmp4, true));
		barList.add(new FriendTimeBar("Mindy", bmp6, false));
		barList.add(new FriendTimeBar("Judy", bmp7, false));
		barList.add(new FriendTimeBar("George", bmp9, true));
		barList.add(new FriendTimeBar("John", bmp10, true));
		barList.add(new FriendTimeBar("Vivi", bmp12, false));
		barList.add(new FriendTimeBar("Wendy", bmp13, false));

		// //////////////////FriendsTime
		friendsTime = new ArrayList<ArrayList<MyTime>>();
		friendsTime = MyConstants.ddFriendsTime;

	}

	private void initTimeListView() {
		myLayout = (LinearLayout) getView().findViewById(R.id.layout_time_list);
		myLayout.removeAllViews();

		for (int i = 0; i < barList.size(); i++) {
			FriendTimeBar bar = barList.get(i);
			if (bar.isBoy()) {
				View mView = mInflater.inflate(R.layout.friend_timebar_boy,
						null);
				((ImageView) mView.findViewById(R.id.img_friend_boyhead))
						.setImageBitmap(bar.getHead());
				((TextView) mView.findViewById(R.id.tv_friend_boyname))
						.setText(bar.getName());

				SyncHorizontalScrollView syncScrollView = ((SyncHorizontalScrollView) mView
						.findViewById(R.id.scroll_friend_boy));
				syncScrollView.setBackgroundColor(Color.argb(255, 30, 144, 255));
				scrollList.add(syncScrollView);
				
				myLayout.addView(mView, i);

				initTimeBar(i, mView);

			} else {
				View mView = mInflater.inflate(R.layout.friend_timebar_girl,
						null);
				((ImageView) mView.findViewById(R.id.img_friend_girlhead))
						.setImageBitmap(bar.getHead());
				((TextView) mView.findViewById(R.id.tv_friend_girlname))
						.setText(bar.getName());

				SyncHorizontalScrollView syncScrollView = ((SyncHorizontalScrollView) mView
						.findViewById(R.id.scroll_friend_girl));
				syncScrollView.setBackgroundColor(Color.argb(255, 255, 99, 71));
				scrollList.add(syncScrollView);

				myLayout.addView(mView, i);

				initTimeBar(i, mView);
			}
		}

	}

	private void initTimeBar(int i, View view) { // i 表示传入的
		// ArrayList<MyTime>() 在最外层ArrayList的下标
		RelativeLayout mLayout = null;
		if (barList.get(i).isBoy()) {
			mLayout = (RelativeLayout) view
					.findViewById(R.id.friend_timebar_layout_boy);
		} else {
			mLayout = (RelativeLayout) view
					.findViewById(R.id.friend_timebar_layout_girl);
		}

		LayoutInflater mInflater = LayoutInflater.from(mLayout.getContext());

		for (int j = 0; j < friendsTime.get(i).size(); j++) {

			MyTime hisTime = null;
			ImageView mImage = null;
			View mBarView = null;
			if (barList.get(i).isBoy()) {
				mBarView = mInflater.inflate(R.layout.time_block_blue, null);

				hisTime = friendsTime.get(i).get(j);
				Bitmap bmp = BitmapFactory.decodeResource(getActivity()
						.getResources(), hisTime.getTimepic_id());
				mImage = (ImageView) mBarView
						.findViewById(R.id.block_blue_image);
				mImage.setImageBitmap(bmp);

			} else {
				mBarView = mInflater.inflate(R.layout.time_block_red, null);

				hisTime = friendsTime.get(i).get(j);
				Bitmap bmp = BitmapFactory.decodeResource(getActivity()
						.getResources(), hisTime.getTimepic_id());
				mImage = (ImageView) mBarView
						.findViewById(R.id.block_red_image);
				mImage.setImageBitmap(bmp);
			}
			String timeStr = hisTime.getTimevalue();
			int startTime = Integer.valueOf(timeStr.substring(0,
					timeStr.indexOf(':')))
					* 60
					+ Integer.valueOf(timeStr.substring(
							timeStr.indexOf(':') + 1, timeStr.indexOf('~')));
			int endTime = Integer.valueOf(timeStr.substring(
					timeStr.indexOf('~') + 1, timeStr.lastIndexOf(':')))
					* 60
					+ Integer.valueOf(timeStr.substring(
							timeStr.lastIndexOf(':') + 1, timeStr.length()));
			int timeLength = (int) (((endTime - startTime) / 6.0) * 5);

			RelativeLayout.LayoutParams mLayoutParams = new RelativeLayout.LayoutParams(
					timeLength, 50);

			// / ############# 确实是个问题，实际值是设置的一半，暂时不清楚为什么
			mLayoutParams.leftMargin = (int) (startTime / 6.0 * 5) * 2;
			mLayoutParams.topMargin = 29 * 2;
			mLayoutParams.addRule(RelativeLayout.CENTER_IN_PARENT);

			mImage.setPadding(5, 5, 5, 5);

			if (barList.get(i).isBoy()) {
				mImage.setBackgroundColor(Color.argb(255, 30, 144, 255));// 道奇蓝
			} else {
				mImage.setBackgroundColor(Color.argb(255, 255, 99, 71)); //番茄红
			}
			mImage.setLayoutParams(mLayoutParams);

			mLayout.addView(mBarView, j);
 
		}
	}

}