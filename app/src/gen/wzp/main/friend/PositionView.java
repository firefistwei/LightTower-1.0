package gen.wzp.main.friend;

import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;

import android.app.Activity;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;

public class PositionView extends Activity{
	MySurfaceView mySurfaceView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		mySurfaceView = new MySurfaceView(this);
		setContentView(mySurfaceView); 
		
		opeanGPSSettings();

	}


	private void opeanGPSSettings() {
		//获取GPS现在的状态（打开或是关闭状态）
		boolean gpsEnabled = Settings.Secure.isLocationProviderEnabled(
				getContentResolver(), LocationManager.GPS_PROVIDER);
		
		if(!gpsEnabled){
			Settings.Secure.setLocationProviderEnabled(
					getContentResolver(), LocationManager.GPS_PROVIDER, true);
		}
		
	}
	
	
	
}
