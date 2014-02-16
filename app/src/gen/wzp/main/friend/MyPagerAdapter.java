package gen.wzp.main.friend;

import java.util.List;

import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

public class MyPagerAdapter extends PagerAdapter{

	List<View> viewLists;
	
	public MyPagerAdapter(List<View> lists){
		this.viewLists = lists;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return viewLists.size();
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		// TODO Auto-generated method stub
		return arg0 == arg1;  //官方是这样写的
	}

	@Override
	public void destroyItem(View container, int position, Object object) {
		// TODO Auto-generated method stub
		((ViewPager)container).removeView(viewLists.get(position));
	}

	@Override
	public Object instantiateItem(View container, int position) {
		// TODO Auto-generated method stub
		((ViewPager)container).addView(viewLists.get(position),0);
		return viewLists.get(position);
	}
	
	

}
