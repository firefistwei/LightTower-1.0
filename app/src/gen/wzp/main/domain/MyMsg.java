package gen.wzp.main.domain;

public class MyMsg {

	private int uid;
	private int msg_num;
	private String msg_con;
	private String msg_sender;
	private String msg_time;
	private int msg_readed;

	public MyMsg() {
	}

	public MyMsg(int uid, int msg_num, String msg_con, String msg_sender,
			String msg_time, int msg_readed) {
		super();
		this.uid = uid;
		this.msg_num = msg_num;
		this.msg_con = msg_con;
		this.msg_sender = msg_sender;
		this.msg_time = msg_time;
		this.msg_readed = msg_readed;
	}

	public int getMsg_readed() {
		return msg_readed;
	}

	public void setMsg_readed(int msg_readed) {
		this.msg_readed = msg_readed;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getMsg_num() {
		return msg_num;
	}

	public void setMsg_num(int msg_num) {
		this.msg_num = msg_num;
	}

	public String getMsg_con() {
		return msg_con;
	}

	public void setMsg_con(String msg_con) {
		this.msg_con = msg_con;
	}

	public String getMsg_sender() {
		return msg_sender;
	}

	public void setMsg_sender(String msg_sender) {
		this.msg_sender = msg_sender;
	}

	public String getMsg_time() {
		return msg_time;
	}

	public void setMsg_time(String msg_time) {
		this.msg_time = msg_time;
	}

	@Override
	public String toString() {
		return "MyMsg [uid=" + uid + ", msg_num=" + msg_num + ", msg_con="
				+ msg_con + ", msg_sender=" + msg_sender + ", msg_time="
				+ msg_time + "]";
	}

}
