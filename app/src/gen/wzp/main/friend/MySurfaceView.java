package gen.wzp.main.friend;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;

import gen.wzp.main.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

import android.util.Log;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;


public class MySurfaceView extends SurfaceView implements
		SurfaceHolder.Callback, Runnable {

	private Context context;
	private Resources res;
	private Canvas canvas;
	private Paint paint;
	private Bitmap bg;
	private SurfaceHolder sfh;
	private int ScreenH, ScreenW;
	private int CenterX, CenterY;
	private Thread thread;

	int cursorAngle;

	public LocationClient mLocationClient = null; ////baidu api
	public MyLocationListener myListener = new MyLocationListener();
	String locationData ="";
	

	public MySurfaceView(Context context) {
		super(context);
		this.context = context;
		this.setKeepScreenOn(true);
		res = this.getResources();
		sfh = this.getHolder();
		sfh.addCallback(this);

		thread = new Thread(this);

		paint = new Paint();
		paint.setColor(Color.GREEN);
		paint.setAntiAlias(true);

		bg = BitmapFactory.decodeResource(res, R.drawable.radium);

		cursorAngle = 0;

		
		initLocation();
		getLocation();

	}
	
	/**
	 * location part
	 */
	private void getLocation() {
		setLocationOption();  //�Զ�����
		mLocationClient.start();
		
		if (mLocationClient != null){
			setLocationOption();
			mLocationClient.requestLocation();	
		}				
		else 
			Log.d("boot", "locClient is null or not started");
	}
	
	private void setLocationOption() {
		LocationClientOption option = new LocationClientOption();
		option.setOpenGps(true);				//��gps
		option.setCoorType("bd09ll");		//������������
		option.setAddrType("all");		//���õ�ַ��Ϣ��������Ϊ��all��ʱ�е�ַ��Ϣ��Ĭ���޵�ַ��Ϣ
		option.setScanSpan(5000);	//���ö�λģʽ��С��1����һ�ζ�λ;���ڵ���1����ʱ��λ
		mLocationClient.setLocOption(option);
		
	}

	private void initLocation() {
		mLocationClient = new LocationClient(context);
	    mLocationClient.registerLocationListener(myListener);
		
	}

	/**
	 * ��������������λ�õ�ʱ�򣬸�ʽ�����ַ������������Ļ��
	 */
    public class MyLocationListener implements BDLocationListener {

		@Override
		public void onReceiveLocation(BDLocation location) {
			if(location ==null)
				return;
			StringBuffer sb = new StringBuffer(256);
			sb.append("ʱ��: ");
			sb.append(location.getTime());
			sb.append("\nγ�ȣ�  ");
			sb.append(location.getLatitude());
			sb.append("\n���ȣ�  ");
			sb.append(location.getLongitude());
			sb.append("\n�뾶��  ");
			sb.append(location.getRadius());
			
			if (location.getLocType() == BDLocation.TypeGpsLocation){
				sb.append("\n�ٶ� : ");
				sb.append(location.getSpeed());
				sb.append("\n������ : ");
				sb.append(location.getSatelliteNumber());
			} else if (location.getLocType() == BDLocation.TypeNetWorkLocation){
				sb.append("\n��"); //ʡ
				sb.append(location.getProvince());
				sb.append("\n��");//��
				sb.append(location.getCity());
				sb.append("\n��"); //��/��
				sb.append(location.getDistrict());
				sb.append("\n�����ַ: ");
				sb.append(location.getAddrStr());
				sb.append("\nsdk version : ");
				sb.append(mLocationClient.getVersion());
			}
			locationData = sb.toString();
			
		}

		@Override
		public void onReceivePoi(BDLocation position) {
	
			
		}
    	
    }


	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		ScreenH = this.getHeight();
		ScreenW = this.getWidth();
		CenterX = ScreenW / 2;
		CenterY = ScreenH / 2;

		thread.start();

	}

	public void run() {
		while (true) {
			draw();
			cursorAngle += 10;
			if (cursorAngle == 360) {
				cursorAngle = 0;
			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void draw() {
		try {
			canvas = sfh.lockCanvas();

			canvas.drawColor(Color.BLACK);

			paint.setAlpha(122);
			canvas.drawBitmap(bg, CenterX - bg.getWidth() / 2,
					CenterY - bg.getHeight() / 2, paint);

			double Angle = Math.toRadians(cursorAngle);

			Paint paint1 = new Paint();
			paint1.setAntiAlias(true);
			paint1.setStrokeWidth(2);
			paint1.setColor(0x4497ff47); // 0xdd52d11f
			canvas.drawLine(CenterX, CenterY,
					CenterX + (int) (250 * Math.cos(Angle)), CenterY
							+ (int) (250 * Math.sin(Angle)), paint1);

			RectF oval = new RectF(CenterX - 250, CenterY - 250, CenterX + 250,
					CenterY + 250);

			Paint paint2 = new Paint();
			paint2.setColor(0x4497ff47);

			canvas.drawArc(oval, cursorAngle, (float) (-30), true, paint2);

			// ///////////////// draw location part
			if (locationData != "") {
				Paint paintLoc = new Paint();
				paintLoc.setTextSize(16);
				paintLoc.setColor(0x4497ff47);
				canvas.drawText(locationData, 32, 32, paintLoc);
				
			}

		} catch (Exception e) {

		} finally {
			if (canvas != null)
				sfh.unlockCanvasAndPost(canvas);
		}
	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void surfaceDestroyed(SurfaceHolder holder) {
		mLocationClient.stop();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {

		// if(keyCode == KeyEvent.KEYCODE_BACK){
		// Intent intent = new Intent(FriendLight.instance,FriendLight.class);
		// FriendLight.instance.startActivity(intent);
		//
		//
		// }

		return false;
	}

}
