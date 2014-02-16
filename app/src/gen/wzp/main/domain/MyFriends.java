package gen.wzp.main.domain;

public class MyFriends {

	private int uid;
	private int friendlevel;
	private int friend_id;
	private String tinyname;
    private int flag_timelight; //Ê±¹â×´Ì¬ 0 1
	
	public MyFriends() {

	}

	public MyFriends(int uid, int friendlevel, int friend_id, String tinyname,
			int flag_timelight) {
		super();
		this.uid = uid;
		this.friendlevel = friendlevel;
		this.friend_id = friend_id;
		this.tinyname = tinyname;
		this.flag_timelight = flag_timelight;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getFriendlevel() {
		return friendlevel;
	}

	public void setFriendlevel(int friendlevel) {
		this.friendlevel = friendlevel;
	}

	public int getFriend_id() {
		return friend_id;
	}

	public void setFriend_id(int friend_id) {
		this.friend_id = friend_id;
	}

	public String getTinyname() {
		return tinyname;
	}

	public void setTinyname(String tinyname) {
		this.tinyname = tinyname;
	}
	

	public int getFlag_timelight() {
		return flag_timelight;
	}

	public void setFlag_timelight(int flag_timelight) {
		this.flag_timelight = flag_timelight;
	}

	@Override
	public String toString() {
		return "MyFriends [uid=" + uid + ", friendlevel=" + friendlevel
				+ ", friend_id=" + friend_id + "]";
	}

}
