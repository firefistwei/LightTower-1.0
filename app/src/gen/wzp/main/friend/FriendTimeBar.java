package gen.wzp.main.friend;

import android.graphics.Bitmap;

public class FriendTimeBar {

	private String name;
	private Bitmap head;
	private boolean isBoy = true;

	public FriendTimeBar(String name, Bitmap head, boolean isBoy) {
		super();
		this.name = name;
		this.head = head;
		this.isBoy = isBoy;
	}

	public FriendTimeBar() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bitmap getHead() {
		return head;
	}

	public void setHead(Bitmap head) {
		this.head = head;
	}

	public boolean isBoy() {
		return isBoy;
	}

	public void setBoy(boolean isBoy) {
		this.isBoy = isBoy;
	}
}
