package gen.wzp.main.person;

import gen.wzp.main.MyConstants;
import gen.wzp.main.R;
import gen.wzp.main.domain.MyTask;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PlanEdit extends Activity{

	public static List<MyTask> personalPlan = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.person_planedit);
		
		initTaskPlanData();
		initTaskPlanView();
	}

	private void initTaskPlanData() {
		personalPlan = new ArrayList<MyTask>();
		personalPlan = MyConstants.DaveTask;
		
	}

	private void initTaskPlanView() {
		LinearLayout mLayout = (LinearLayout) this
				.findViewById(R.id.person_ed_timeplan_layout);
		LayoutInflater mInflater = LayoutInflater.from(mLayout.getContext());
		
		for(int i=0; i<personalPlan.size();i++){
			MyTask myTask = personalPlan.get(i);
			
			View mView = mInflater.inflate(R.layout.person_ed_plan, null);
			
			((ImageView) mView.findViewById(R.id.person_ed_plan_image))
			   .setImageResource(myTask.getTaskpic());
			((TextView) mView.findViewById(R.id.person_ed_plan_text1))
			   .setText(myTask.getTaskname());
			((TextView) mView.findViewById(R.id.person_ed_plan_text2))
			   .setText(myTask.getTaskvalue()+ " hours");
			
			mLayout.addView(mView,i);
			
		}	
	}

	public void person_planedit_back(View v){
		this.finish();
	}
	
	public void person_plan_to_time(View v){
		Intent intent = new Intent(PlanEdit.this, TimeEdit.class);
		startActivity(intent);
		this.finish();	
	}
}
