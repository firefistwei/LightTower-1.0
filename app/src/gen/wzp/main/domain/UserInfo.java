package gen.wzp.main.domain;

public class UserInfo {

	private int uid;
	private int sex;
	private String name;
	private String head;
	private String personwords;
	private String timewords;
	private int score;
	private int level;

	public UserInfo() {

	}

	public UserInfo(int uid,int sex, String name, String head,String personwords, String timewords,
			int score, int level) {
		super();
		this.uid = uid;
		this.sex = sex;
		this.name = name;
		this.head = head;
		this.personwords = personwords;
		this.timewords = timewords;
		this.score = score;
		this.level = level;
	}

	
	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonwords() {
		return personwords;
	}

	public void setPersonwords(String personwords) {
		this.personwords = personwords;
	}

	public String getTimewords() {
		return timewords;
	}

	public void setTimewords(String timewords) {
		this.timewords = timewords;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "UserInfo [uid=" + uid + ", name=" + name + ", personwords="
				+ personwords + ", timewords=" + timewords + ", score=" + score
				+ ", level=" + level + "]";
	}

}
