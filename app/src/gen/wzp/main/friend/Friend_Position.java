package gen.wzp.main.friend;

import gen.wzp.main.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class Friend_Position extends Fragment {

	private static final String TAG = "Friend_Position";

	private ImageView imageView = null;
	private AnimationDrawable anim = null;

	public List<NearbyFriends> nearbyFriends = null;

	public class NearbyFriends {
		public int uid;
		public int head_pic;
		public String name;
		public int distance;

		public NearbyFriends(int uid, int head_pic, String name, int distance) {
			this.uid = uid;
			this.head_pic = head_pic;
			this.name = name;
			this.distance = distance;
		}
	}

	Context context = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.d(TAG, "TestFragment-----onCreate");

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.d(TAG, "TestFragment-----onCreateView");

		View view = inflater
				.inflate(R.layout.friend_position, container, false);
		imageView = (ImageView) view
				.findViewById(R.id.friend_position_anim_image);
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
		context = getActivity();
		initImageAnim();

		initData();
		initNearbyFriends();

	}

	public void initImageAnim() {
		// imageView = (ImageView) view.findViewById(R.id.active_anim_image);
		Object obj = imageView.getBackground();
		anim = (AnimationDrawable) obj;
		anim.stop();
		anim.start();
	}

	private void initData() {
		nearbyFriends = new ArrayList<NearbyFriends>();
		nearbyFriends.add(new NearbyFriends(10111, R.drawable.random_head11,
				"Mark", 200));
		nearbyFriends.add(new NearbyFriends(10106, R.drawable.random_head6,
				"Mindy", 200));
		nearbyFriends.add(new NearbyFriends(10104, R.drawable.random_head4,
				"Jack", 500));
	}

	private void initNearbyFriends() {
		LinearLayout mLayout = (LinearLayout) getView().findViewById(
				R.id.friend_nearby_layout);
		mLayout.removeAllViews();

		LayoutInflater mInflater = LayoutInflater.from(mLayout.getContext());

		for (int i = 0; i < nearbyFriends.size(); i++) {
			View mView = mInflater.inflate(R.layout.friend_position_nearby,
					null);

			Bitmap bmp = BitmapFactory.decodeResource(getActivity()
					.getResources(), nearbyFriends.get(i).head_pic);
			((ImageView) mView.findViewById(R.id.friend_nearby_img1))
					.setImageBitmap(bmp);
			((TextView) mView.findViewById(R.id.friend_nearby_text1))
					.setText(nearbyFriends.get(i).name);
			((TextView) mView.findViewById(R.id.friend_nearby_text2))
					.setText(nearbyFriends.get(i).distance + "米以内");

			RelativeLayout clickLayout = (RelativeLayout) mView
					.findViewById(R.id.friend_position_nearby_click_layout);
			clickLayout.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					Intent intent = new Intent(getActivity(),
							PositionView.class);
					startActivity(intent);
				}
			});

			mLayout.addView(mView, i);

		}

	}

	// ////////////////////////////////////////////////////////////////////////////
	public void start_searching(View v) { // 图
		Intent intent = new Intent(getActivity(), PositionView.class);
		getActivity().startActivity(intent);

	}

	public void btn_start_position(View v) { // 按钮
		Intent intent = new Intent(getActivity(), PositionView.class);
		getActivity().startActivity(intent);
	}
}
