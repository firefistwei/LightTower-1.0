package gen.wzp.main.domain;

public class MyActive {

	private int uid; // 发起者
	private int aid;
	private String aname;
	private String atime;
	private String aposition;
	private String amember; // uid,"，"分隔

	public MyActive() {
	}

	public MyActive(int uid, int aid, String aname, String atime,
			String aposition, String amember) {
		super();
		this.uid = uid;
		this.aid = aid;
		this.aname = aname;
		this.atime = atime;
		this.aposition = aposition;
		this.amember = amember;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAtime() {
		return atime;
	}

	public void setAtime(String atime) {
		this.atime = atime;
	}

	public String getAposition() {
		return aposition;
	}

	public void setAposition(String aposition) {
		this.aposition = aposition;
	}

	public String getAmember() {
		return amember;
	}

	public void setAmember(String amember) {
		this.amember = amember;
	}

	@Override
	public String toString() {
		return "MyActive [uid=" + uid + ", aid=" + aid + ", aname=" + aname
				+ ", atime=" + atime + ", aposition=" + aposition
				+ ", amember=" + amember + "]";
	}

}
