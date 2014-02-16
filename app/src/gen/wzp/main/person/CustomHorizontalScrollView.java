package gen.wzp.main.person;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;

public class CustomHorizontalScrollView extends HorizontalScrollView{

	private GestureDetector mGestureDetector;
	View.OnTouchListener mGestureListener;
	
	public CustomHorizontalScrollView(Context context,AttributeSet attrs) {
		super(context,attrs);
		mGestureDetector = new GestureDetector(new XScrollDetector());
		setFadingEdgeLength(0);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		return super.onInterceptTouchEvent(ev) &&
				mGestureDetector.onTouchEvent(ev);
	}
	
	class XScrollDetector extends SimpleOnGestureListener {

		@Override
		public boolean onScroll(MotionEvent e1, MotionEvent e2,
				float distanceX, float distanceY) {
			if(Math.abs(distanceX)>Math.abs(distanceY)){
				return true;
			}
			return false;
		}
		
	}
	

}
