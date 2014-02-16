package gen.wzp.main.domain;

public class MyTime {

	private int uid;
	private int timenum;
	private int timepic_id;
	private String timename;
	private String timevalue;

	public MyTime() {
	}

	public MyTime(int uid, int timenum, int timepic_id, String timename,
			String timevalue) {
		super();
		this.uid = uid;
		this.timenum = timenum;
		this.timepic_id = timepic_id;
		this.timename = timename;
		this.timevalue = timevalue;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getTimenum() {
		return timenum;
	}

	public void setTimenum(int timenum) {
		this.timenum = timenum;
	}

	public int getTimepic_id() {
		return timepic_id;
	}

	public void setTimepic_id(int timepic_id) {
		this.timepic_id = timepic_id;
	}

	public String getTimename() {
		return timename;
	}

	public void setTimename(String timename) {
		this.timename = timename;
	}

	public String getTimevalue() {
		return timevalue;
	}

	public void setTimevalue(String timevalue) {
		this.timevalue = timevalue;
	}

	@Override
	public String toString() {
		return "MyTime [uid=" + uid + ", timenum=" + timenum + ", timepic_id="
				+ timepic_id + ", timename=" + timename + ", timevalue="
				+ timevalue + "]";
	}

}
