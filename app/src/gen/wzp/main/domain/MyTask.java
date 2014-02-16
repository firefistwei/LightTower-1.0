package gen.wzp.main.domain;

public class MyTask {

	private int uid;
	private int tasknum;
	private int taskpic;
	private String taskname;
	private String taskvalue;
	private String percent;// °Ù·Ö±È

	public MyTask() {

	}

	public MyTask(int uid, int tasknum, int taskpic, String taskname,
			String taskvalue, String percent) {
		super();
		this.uid = uid;
		this.tasknum = tasknum;
		this.taskpic = taskpic;
		this.taskname = taskname;
		this.taskvalue = taskvalue;
		this.percent = percent;
	}

	public int getTaskpic() {
		return taskpic;
	}

	public void setTaskpic(int taskpic) {
		this.taskpic = taskpic;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getTasknum() {
		return tasknum;
	}

	public void setTasknum(int tasknum) {
		this.tasknum = tasknum;
	}

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public String getTaskvalue() {
		return taskvalue;
	}

	public void setTaskvalue(String taskvalue) {
		this.taskvalue = taskvalue;
	}

	public String getPercent() {
		return percent;
	}

	public void setPercent(String percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "MyTask [uid=" + uid + ", tasknum=" + tasknum + ", taskname="
				+ taskname + ", taskvalue=" + taskvalue + "]";
	}

}
