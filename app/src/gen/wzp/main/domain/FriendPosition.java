package gen.wzp.main.domain;

public class FriendPosition {

	private int uid;
	private double longitude;
	private double latitude;
	private int flag_position;

	public FriendPosition() {
	}

	public FriendPosition(int uid, double longitude, double latitude,
			int flag_position) {
		super();
		this.uid = uid;
		this.longitude = longitude;
		this.latitude = latitude;
		this.flag_position = flag_position;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public int getFlag_position() {
		return flag_position;
	}

	public void setFlag_position(int flag_position) {
		this.flag_position = flag_position;
	}

	@Override
	public String toString() {
		return "FriendPosition [uid=" + uid + ", longitude=" + longitude
				+ ", latitude=" + latitude + ", flag_position=" + flag_position
				+ "]";
	}

}
