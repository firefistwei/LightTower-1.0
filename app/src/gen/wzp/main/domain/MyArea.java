package gen.wzp.main.domain;

public class MyArea {

	private int uid; // ´´½¨Õß
	private int gid;
	private String gname;
	private int gpic;
	private int max_member;
	private String gmember;

	public MyArea() {
	}

	public MyArea(int uid, int gid, String gname, int gpic, int max_member,
			String gmember) {
		super();
		this.uid = uid;
		this.gid = gid;
		this.gname = gname;
		this.gpic = gpic;
		this.max_member = max_member;
		this.gmember = gmember;
	}

	public int getGpic() {
		return gpic;
	}

	public void setGpic(int gpic) {
		this.gpic = gpic;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public int getMax_member() {
		return max_member;
	}

	public void setMax_member(int max_member) {
		this.max_member = max_member;
	}

	public String getGmember() {
		return gmember;
	}

	public void setGmember(String gmember) {
		this.gmember = gmember;
	}

	@Override
	public String toString() {
		return "MyArea [uid=" + uid + ", gid=" + gid + ", gname=" + gname
				+ ", max_member=" + max_member + ", gmember=" + gmember + "]";
	}

}
