package gen.wzp.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class WelcomeDoor extends Activity {

	private ImageView imgUp;
	private ImageView imgDown;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.welcome_door);

		imgUp = (ImageView) findViewById(R.id.welcome_up);
		imgDown = (ImageView) findViewById(R.id.welcome_down);
		
		initAnim();
		
		new Handler().postDelayed(new Runnable(){
			@Override
			public void run(){
				Intent intent = new Intent (WelcomeDoor.this,MainActivity.class);			
				startActivity(intent);			
				WelcomeDoor.this.finish();
			}
		}, 2000);
	}

	private void initAnim() {

		AnimationSet anim = new AnimationSet(true);
		TranslateAnimation mTrans = new TranslateAnimation(
				Animation.RELATIVE_TO_SELF, 0f, Animation.RELATIVE_TO_SELF,
				0f, Animation.RELATIVE_TO_SELF, 0f,
				Animation.RELATIVE_TO_SELF, -1f);
		mTrans.setDuration(2000);
		anim.addAnimation(mTrans);
		anim.setFillAfter(true);
		imgUp.startAnimation(anim);
		
		AnimationSet anim2 = new AnimationSet(true);
		TranslateAnimation mTrans2 = new TranslateAnimation(
				Animation.RELATIVE_TO_SELF, 0f, Animation.RELATIVE_TO_SELF,
				0f, Animation.RELATIVE_TO_SELF, 0f,
				Animation.RELATIVE_TO_SELF, +1f);
		mTrans2.setDuration(2000);
		anim2.addAnimation(mTrans2);
		anim2.setFillAfter(true);
		imgDown.startAnimation(anim2);

		
	}

}
