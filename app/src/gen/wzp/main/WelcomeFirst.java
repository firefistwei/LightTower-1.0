package gen.wzp.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class WelcomeFirst extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.welcome_first);
	}
	
	public void welcome_btn(View v){
		Intent intent = new Intent(WelcomeFirst.this, WelcomeDoor.class);
		startActivity(intent);
		this.finish();
	}

}
