package gen.wzp.main.friend;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import gen.wzp.main.MyConstants;
import gen.wzp.main.R;
import gen.wzp.main.domain.MyFriends;
import gen.wzp.main.domain.UserInfo;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;

public class Friend_HotDegree extends Fragment {

	private static final String TAG = "Friend_HotDegree";

	ExpandableListView mExpandableListView;
	int[] tags = new int[] { 0, 0, 0, 0, 0, 0, 0 };
	String[] groups = new String[] { "新添好友", "一级好友", "二级好友", "三级好友", "四级好友",
			"五级好友", "黑名单" };

	View thisView;

	List<ArrayList<MyFriends>> groupsList = new ArrayList<ArrayList<MyFriends>>();
	ArrayList<MyFriends> childsList = new ArrayList<MyFriends>();

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
		View view = inflater.inflate(R.layout.friend_hotdegree, container,
				false);
		mExpandableListView = (ExpandableListView) view
				.findViewById(R.id.cate_expandableLv);
		thisView = view;
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
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);

		initFriendsList();

		mExpandableListView.setGroupIndicator(null); // 去掉前面烦人的小圆圈
		mExpandableListView
				.setDescendantFocusability(ExpandableListView.FOCUS_AFTER_DESCENDANTS);
		MyListAdapter adapter = new MyListAdapter();

		mExpandableListView.setAdapter(adapter);
		mExpandableListView
				.setOnGroupExpandListener(new OnGroupExpandListener() {

					@Override
					public void onGroupExpand(int groupPosition) {
						tags[groupPosition] = 1;
					}
				});
		mExpandableListView
				.setOnGroupCollapseListener(new OnGroupCollapseListener() {

					@Override
					public void onGroupCollapse(int groupPosition) {
						tags[groupPosition] = 0;

					}
				});

		mExpandableListView.setOnChildClickListener(new OnChildClickListener() {

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
             v.setBackgroundColor(Color.rgb( 120, 172, 4));
				return false;
			}

		});

	}

	private void initFriendsList() {
		for (int j = 0; j < 7; j++) {
			groupsList.add(new ArrayList<MyFriends>());
		}

		for (int i = 0; i < MyConstants.DaveFriends.size(); i++) {
			switch (MyConstants.DaveFriends.get(i).getFriendlevel()) {
			case 0:
				groupsList.get(0).add(MyConstants.DaveFriends.get(i));
				break;
			case 1:
				groupsList.get(1).add(MyConstants.DaveFriends.get(i));
				break;
			case 2:
				groupsList.get(2).add(MyConstants.DaveFriends.get(i));
				break;
			case 3:
				groupsList.get(3).add(MyConstants.DaveFriends.get(i));
				break;
			case 4:
				groupsList.get(4).add(MyConstants.DaveFriends.get(i));
				break;
			case 5:
				groupsList.get(5).add(MyConstants.DaveFriends.get(i));
				break;
			case 6:
				groupsList.get(6).add(MyConstants.DaveFriends.get(i));
				break;
			case 7:
				groupsList.get(7).add(MyConstants.DaveFriends.get(i));
				break;
			default:
				break;
			}
		}

	}

	class MyListAdapter extends BaseExpandableListAdapter {

		public MyListAdapter() {
			
		}

		@Override
		public int getGroupCount() {
			// TODO Auto-generated method stub
			return groupsList.size();
		}

		@Override
		public int getChildrenCount(int groupPosition) {
			// TODO Auto-generated method stub
			return groupsList.get(groupPosition).size();
		}

		@Override
		public Object getGroup(int groupPosition) {
			// TODO Auto-generated method stub
			return groupsList.get(groupPosition);
		}

		@Override
		public Object getChild(int groupPosition, int childPosition) {
			// TODO Auto-generated method stub
			return groupsList.get(groupPosition).get(childPosition);
		}

		@Override
		public long getGroupId(int groupPosition) {
			// TODO Auto-generated method stub
			return groupPosition;
		}

		@Override
		public long getChildId(int groupPosition, int childPosition) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean hasStableIds() {
			// TODO Auto-generated method stub
			return true;
		}

		class GroupHolder {
			ImageView img;
			TextView title;
			TextView size_num;
		}

		@Override
		public View getGroupView(int arg0, boolean arg1, View arg2,
				ViewGroup arg3) {
			// TODO Auto-generated method stub
			GroupHolder groupHolder;
			if (arg2 == null) {
				arg2 = LayoutInflater.from(getActivity()).inflate(
						R.layout.list_group_item, null);
				groupHolder = new GroupHolder();
				groupHolder.img = (ImageView) arg2
						.findViewById(R.id.groups_img);
				groupHolder.title = (TextView) arg2
						.findViewById(R.id.groups_title);
				groupHolder.size_num = (TextView) arg2
						.findViewById(R.id.groups_size_num);
				arg2.setTag(groupHolder);
			} else {
				groupHolder = (GroupHolder) arg2.getTag();
			}
			if (tags[arg0] == 0) {
				groupHolder.img.setImageResource(R.drawable.group_indicator0);
			} else {
				groupHolder.img.setImageResource(R.drawable.group_indicator1);
			}
			groupHolder.title.setText(groups[arg0]);
			groupHolder.size_num.setText(groupsList.get(arg0).size() + "");

			return arg2;
		}

		/*
		 * @Override public View getGroupView(int groupPosition, boolean
		 * isExpanded, View convertView, ViewGroup parent) { GroupHolder
		 * groupHolder; groupHolder = new GroupHolder(); if (convertView ==
		 * null) { convertView = LayoutInflater.from(Category_Activity.this)
		 * .inflate(R.layout.list_group_item, null);
		 * 
		 * groupHolder.img = (ImageView)
		 * convertView.findViewById(R.id.groups_img); groupHolder.title =
		 * (TextView) convertView.findViewById(R.id.groups_title);
		 * convertView.setTag(groupHolder); } if (tags[groupPosition] == 0) {
		 * groupHolder.img.setImageResource(R.drawable.list_indecator_button); }
		 * else {
		 * groupHolder.img.setImageResource(R.drawable.list_indecator_button_down
		 * ); } groupHolder.title.setText(groups[groupPosition]);
		 * 
		 * return convertView; }
		 */

		class ChildHolder {
			ImageView img;
			TextView name, timewords, personwords;
			ImageView light;
		}

		@Override
		public View getChildView(int groupPosition, int childPosition,
				boolean isLastChild, View convertView, ViewGroup parent) {
			ChildHolder childHolder;
			int pos = 0;  //确定 dFriendsInfo 的下标
			for(int i=0; i<groupPosition;i++){
				pos = pos + groupsList.get(i).size();
			}
			    pos = pos + childPosition;
			

			if (convertView == null) {
				convertView = LayoutInflater.from(getActivity()).inflate(
						R.layout.list_child_item, null);

				childHolder = new ChildHolder();
				childHolder.img = (ImageView) convertView
						.findViewById(R.id.child_img1);
				childHolder.name = (TextView) convertView
						.findViewById(R.id.child_tv1);
				childHolder.timewords = (TextView) convertView
						.findViewById(R.id.child_tv2);
				childHolder.personwords = (TextView) convertView
						.findViewById(R.id.child_tv3);
				childHolder.light = (ImageView) convertView
						.findViewById(R.id.child_img2);
				convertView.setTag(childHolder);
			} else {
				childHolder = (ChildHolder) convertView.getTag();
			}

			childHolder.img.setImageResource(Integer
					.valueOf(MyConstants.dFriendsInfo.get(pos).getHead()));
			childHolder.name.setText(groupsList.get(groupPosition)
					.get(childPosition).getTinyname());
			childHolder.timewords.setText(MyConstants.dFriendsInfo.get(pos)
					.getTimewords());
			childHolder.personwords.setText("【个性签名】"
					+ MyConstants.dFriendsInfo.get(pos).getPersonwords());
            if(groupsList.get(groupPosition).get(childPosition).getFlag_timelight()==1){
            	childHolder.light.setImageResource(R.drawable.light_2);
            }else{
            	childHolder.light.setImageResource(R.drawable.light_0);
            }
			
			
			return convertView;
		}

		@Override
		public boolean isChildSelectable(int groupPosition, int childPosition) {
			// TODO Auto-generated method stub
			return true;
		}

	}

}
