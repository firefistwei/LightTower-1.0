package gen.wzp.main;

import gen.wzp.main.domain.MyFriends;
import gen.wzp.main.domain.MyTask;
import gen.wzp.main.domain.MyTime;
import gen.wzp.main.domain.UserInfo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MyConstants {

	public static String date = null;
	public static String alltime = null;
	static {
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");
		date = dateFormat.format(now);
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yy/MM/dd HH:mm");
		alltime = dateFormat2.format(now);
	}

	public static int DaveHead = R.drawable.random_head0;
	public static UserInfo DaveInfo = new UserInfo(10001, 1, "Dave",
			String.valueOf(DaveHead), "�ڶ�������ζ������ͷ����ҡ�", "���ȷʵ̫æ�ˣ�æ��æ��æ��", 1, 10);

	public static List<MyTime> DaveTime = new ArrayList<MyTime>();
	static {
		DaveTime.add(new MyTime(10001, 1, R.drawable.time_book, "time_book",
				"8:00~10:00"));
		DaveTime.add(new MyTime(10001, 2, R.drawable.time_internet,
				"time_internet", "11:00~12:30"));
		DaveTime.add(new MyTime(10001, 3, R.drawable.time_play, "time_play",
				"13:00~16:30"));
		DaveTime.add(new MyTime(10001, 4, R.drawable.time_date, "time_date",
				"18:00~20:00"));
		DaveTime.add(new MyTime(10001, 5, R.drawable.time_book, "time_book",
				"20:00~23:00"));
		DaveTime.add(new MyTime(10001, 6, R.drawable.time_class, "time_class",
				"32:00~36:00"));
		DaveTime.add(new MyTime(10001, 7, R.drawable.time_eat, "time_eat",
				"36:00~36:30"));
		DaveTime.add(new MyTime(10001, 8, R.drawable.time_break, "time_break",
				"37:00~38:00"));
		DaveTime.add(new MyTime(10001, 9, R.drawable.time_sports,
				"time_sports", "39:00~41:20"));
		DaveTime.add(new MyTime(10001, 10, R.drawable.time_party, "time_party",
				"42:00~46:00"));
	}
	
	public static List<MyTask> DaveTask = new ArrayList<MyTask>();
	static{
		DaveTask.add(new MyTask(10001,1,R.drawable.time_book,"д����","20","40%"));
		DaveTask.add(new MyTask(10001,2,R.drawable.time_internet,"д����","20","20%"));
		DaveTask.add(new MyTask(10001,3,R.drawable.time_study,"�ǵ���","100","5%"));
		DaveTask.add(new MyTask(10001,4,R.drawable.time_sports,"��������","12","50%"));
		DaveTask.add(new MyTask(10001,5,R.drawable.time_work,"�о��㷨","30","10%"));
	}
	

	public static List<MyFriends> DaveFriends = new ArrayList<MyFriends>();
	static {
		DaveFriends.add(new MyFriends(10001, 0, 10101, "Peter", 0));
		DaveFriends.add(new MyFriends(10001, 1, 10102, "Mary", 1));
		DaveFriends.add(new MyFriends(10001, 1, 10103, "Tom", 1));
		DaveFriends.add(new MyFriends(10001, 1, 10104, "Jack", 1));
		DaveFriends.add(new MyFriends(10001, 2, 10105, "Robort", 0));
		DaveFriends.add(new MyFriends(10001, 2, 10106, "Mindy", 1));
		DaveFriends.add(new MyFriends(10001, 2, 10107, "Judy", 1));
		DaveFriends.add(new MyFriends(10001, 3, 10108, "Amy", 0));
		DaveFriends.add(new MyFriends(10001, 3, 10109, "George", 1));
		DaveFriends.add(new MyFriends(10001, 3, 10110, "John", 1));
		DaveFriends.add(new MyFriends(10001, 4, 10111, "Mark", 0));
		DaveFriends.add(new MyFriends(10001, 4, 10112, "Vivi", 1));
		DaveFriends.add(new MyFriends(10001, 4, 10113, "Wendy", 1));
		DaveFriends.add(new MyFriends(10001, 5, 10114, "Justin", 0));
		DaveFriends.add(new MyFriends(10001, 6, 10115, "Croff", 0));
	}

	public static List<UserInfo> dFriendsInfo = new ArrayList<UserInfo>();
	static {
		dFriendsInfo.add(new UserInfo(10101, 1, "Peter",
				R.drawable.random_head1 + "", "��Զ��Ҫ˵���Ѿ�������", "��ʼ���ܣ���˭һ��", 3,
				60));
		dFriendsInfo.add(new UserInfo(10102, 1, "Mary", R.drawable.random_head2
				+ "", "���������Щ��Ŀ���Զ��������·��", "ʱ��̫���ˣ�Ҫ�����ˣ�æ��æ��", 3, 60));
		dFriendsInfo.add(new UserInfo(10103, 1, "Tom", R.drawable.random_head3
				+ "", "ʵ���Լ��ȶ���Ŀ�꣬�������͵�ס��į���ɡ�", "��˯����", 3, 60));
		dFriendsInfo
				.add(new UserInfo(10104, 1, "Jack", R.drawable.random_head4
						+ "", "Ϊ�˲������������ź��ͺ�ڣ�����Ӧ�þ�����ץסһ�иı�����Ļ��ᡣ",
						"�ƻ�һ��������ʲô��", 3, 60));
		dFriendsInfo.add(new UserInfo(10105, 1, "Robort",
				R.drawable.random_head5 + "", "����������Լ���ô�Ĳ��ң���Զ���˱�����Ӳ��ҡ�",
				"��ô�õ������ɲ����˷��ˡ�", 3, 60));
		dFriendsInfo.add(new UserInfo(10106, 1, "Mindy",
				R.drawable.random_head6 + "", "����������Լ���ô���˲���Ҳ��Զ���˱����ǿ��",
				"ȥ��ɽ������ӡ�", 3, 60));
		dFriendsInfo.add(new UserInfo(10107, 1, "Judy", R.drawable.random_head7
				+ "", "��������ǳɹ���̤��ʯ�������ǰ��ʯ��", "������ĺ�ƽ���", 3, 60));
		dFriendsInfo.add(new UserInfo(10108, 1, "Amy", R.drawable.random_head8
				+ "", "���������������ʣ�ÿ�ε���������վ����������������ҫ��", "���˾�Ҫ�ԡ�", 3, 60));
		dFriendsInfo.add(new UserInfo(10109, 1, "George",
				R.drawable.random_head9 + "", "ʧ��ֻ��һ�֣��Ǿ��ǰ�;���ϡ�",
				"����ͨ���������ˣ���û���ꡣ", 3, 60));
		dFriendsInfo.add(new UserInfo(10110, 1, "John",
				R.drawable.random_head10 + "", "���ž���ǿ�󣬻���ֻ����������������������������",
				"���Ļ�û���꣬�Һ���ѽ��", 3, 60));
		dFriendsInfo.add(new UserInfo(10111, 1, "Mark",
				R.drawable.random_head11 + "", "��ѹ���������ᱻѹ�壻��ã��������������",
				"����κö࣬��ҵҲ�ǡ�", 3, 60));
		dFriendsInfo.add(new UserInfo(10112, 1, "Vivi",
				R.drawable.random_head12 + "", "�Թ��ߵ�������Զ�����������ļƷְ��ϡ�", "���ϰ�Ļ���",
				3, 60));
		dFriendsInfo.add(new UserInfo(10113, 1, "Wendy",
				R.drawable.random_head13 + "", "�˱��������Լ������ǳɹ����ؾ���", "�һ�����", 3,
				60));
		dFriendsInfo.add(new UserInfo(10114, 1, "Justin",
				R.drawable.random_head14 + "", "�ж�˵��һ�С�", "New World��New Day.",
				3, 60));
		dFriendsInfo.add(new UserInfo(10115, 1, "Croff",
				R.drawable.random_head15 + "", "�����ڡ�", "�е����ģ���ӭ���š�", 3, 60));

	}

	public static List<ArrayList<MyTime>> ddFriendsTime = new ArrayList<ArrayList<MyTime>>();
	static {

		for (int j = 0; j < 9; j++) {
			ddFriendsTime.add(new ArrayList<MyTime>());
		}
		ddFriendsTime.get(0).add(
				new MyTime(10001, 1, R.drawable.time_book, "time_book",
						"8:00~10:00"));
		ddFriendsTime.get(0).add(
				new MyTime(10001, 2, R.drawable.time_internet, "time_internet",
						"11:00~12:30"));
		ddFriendsTime.get(0).add(
				new MyTime(10001, 3, R.drawable.time_play, "time_play",
						"13:00~16:30"));
		ddFriendsTime.get(0).add(
				new MyTime(10001, 4, R.drawable.time_date, "time_date",
						"18:00~20:00"));
		ddFriendsTime.get(0).add(
				new MyTime(10001, 5, R.drawable.time_book, "time_book",
						"20:00~23:00"));
		ddFriendsTime.get(0).add(
				new MyTime(10001, 6, R.drawable.time_class, "time_class",
						"32:00~36:00"));
		ddFriendsTime.get(0).add(
				new MyTime(10001, 7, R.drawable.time_eat, "time_eat",
						"36:00~37:00"));
		ddFriendsTime.get(0).add(
				new MyTime(10001, 8, R.drawable.time_break, "time_break",
						"37:00~38:00"));
		ddFriendsTime.get(0).add(
				new MyTime(10001, 9, R.drawable.time_sports, "time_sports",
						"39:00~41:20"));
		ddFriendsTime.get(0).add(
				new MyTime(10001, 10, R.drawable.time_party, "time_party",
						"42:00~46:00"));

		ddFriendsTime.get(1).add(
				new MyTime(10001, 1, R.drawable.time_book, "time_book",
						"8:00~10:00"));
		ddFriendsTime.get(1).add(
				new MyTime(10001, 2, R.drawable.time_internet, "time_internet",
						"11:00~12:30"));
		ddFriendsTime.get(1).add(
				new MyTime(10001, 3, R.drawable.time_play, "time_play",
						"13:00~16:30"));
		ddFriendsTime.get(1).add(
				new MyTime(10001, 4, R.drawable.time_date, "time_date",
						"18:00~20:00"));
		ddFriendsTime.get(1).add(
				new MyTime(10001, 5, R.drawable.time_book, "time_book",
						"20:00~23:00"));
		ddFriendsTime.get(1).add(
				new MyTime(10001, 6, R.drawable.time_class, "time_class",
						"32:00~36:00"));
		ddFriendsTime.get(1).add(
				new MyTime(10001, 7, R.drawable.time_eat, "time_eat",
						"36:00~37:00"));
		ddFriendsTime.get(1).add(
				new MyTime(10001, 8, R.drawable.time_break, "time_break",
						"37:00~38:00"));
		ddFriendsTime.get(1).add(
				new MyTime(10001, 9, R.drawable.time_sports, "time_sports",
						"39:00~41:20"));
		ddFriendsTime.get(1).add(
				new MyTime(10001, 10, R.drawable.time_party, "time_party",
						"42:00~46:00"));

		ddFriendsTime.get(2).add(
				new MyTime(10001, 1, R.drawable.time_book, "time_book",
						"8:00~10:00"));
		ddFriendsTime.get(2).add(
				new MyTime(10001, 2, R.drawable.time_internet, "time_internet",
						"11:00~12:30"));
		ddFriendsTime.get(2).add(
				new MyTime(10001, 3, R.drawable.time_play, "time_play",
						"13:00~16:30"));
		ddFriendsTime.get(2).add(
				new MyTime(10001, 4, R.drawable.time_date, "time_date",
						"18:00~20:00"));
		ddFriendsTime.get(2).add(
				new MyTime(10001, 5, R.drawable.time_book, "time_book",
						"20:00~23:00"));
		ddFriendsTime.get(2).add(
				new MyTime(10001, 6, R.drawable.time_class, "time_class",
						"32:00~36:00"));
		ddFriendsTime.get(2).add(
				new MyTime(10001, 7, R.drawable.time_eat, "time_eat",
						"36:00~37:00"));
		ddFriendsTime.get(2).add(
				new MyTime(10001, 8, R.drawable.time_break, "time_break",
						"37:00~38:00"));
		ddFriendsTime.get(2).add(
				new MyTime(10001, 9, R.drawable.time_sports, "time_sports",
						"39:00~41:20"));
		ddFriendsTime.get(2).add(
				new MyTime(10001, 10, R.drawable.time_party, "time_party",
						"42:00~46:00"));

		ddFriendsTime.get(3).add(
				new MyTime(10001, 1, R.drawable.time_book, "time_book",
						"8:00~10:00"));
		ddFriendsTime.get(3).add(
				new MyTime(10001, 2, R.drawable.time_internet, "time_internet",
						"11:00~12:30"));
		ddFriendsTime.get(3).add(
				new MyTime(10001, 3, R.drawable.time_play, "time_play",
						"13:00~16:30"));
		ddFriendsTime.get(3).add(
				new MyTime(10001, 4, R.drawable.time_date, "time_date",
						"18:00~20:00"));
		ddFriendsTime.get(3).add(
				new MyTime(10001, 5, R.drawable.time_book, "time_book",
						"20:00~23:00"));
		ddFriendsTime.get(3).add(
				new MyTime(10001, 6, R.drawable.time_class, "time_class",
						"32:00~36:00"));
		ddFriendsTime.get(3).add(
				new MyTime(10001, 7, R.drawable.time_eat, "time_eat",
						"36:00~37:00"));
		ddFriendsTime.get(3).add(
				new MyTime(10001, 8, R.drawable.time_break, "time_break",
						"37:00~38:00"));
		ddFriendsTime.get(3).add(
				new MyTime(10001, 9, R.drawable.time_sports, "time_sports",
						"39:00~41:20"));
		ddFriendsTime.get(3).add(
				new MyTime(10001, 10, R.drawable.time_party, "time_party",
						"42:00~46:00"));

		ddFriendsTime.get(4).add(
				new MyTime(10001, 1, R.drawable.time_book, "time_book",
						"8:00~10:00"));
		ddFriendsTime.get(4).add(
				new MyTime(10001, 2, R.drawable.time_internet, "time_internet",
						"11:00~12:30"));
		ddFriendsTime.get(4).add(
				new MyTime(10001, 3, R.drawable.time_play, "time_play",
						"13:00~16:30"));
		ddFriendsTime.get(4).add(
				new MyTime(10001, 4, R.drawable.time_date, "time_date",
						"18:00~20:00"));
		ddFriendsTime.get(4).add(
				new MyTime(10001, 5, R.drawable.time_book, "time_book",
						"20:00~23:00"));
		ddFriendsTime.get(4).add(
				new MyTime(10001, 6, R.drawable.time_class, "time_class",
						"32:00~36:00"));
		ddFriendsTime.get(4).add(
				new MyTime(10001, 7, R.drawable.time_eat, "time_eat",
						"36:00~37:00"));
		ddFriendsTime.get(4).add(
				new MyTime(10001, 8, R.drawable.time_break, "time_break",
						"37:00~38:00"));
		ddFriendsTime.get(4).add(
				new MyTime(10001, 9, R.drawable.time_sports, "time_sports",
						"39:00~41:20"));
		ddFriendsTime.get(4).add(
				new MyTime(10001, 10, R.drawable.time_party, "time_party",
						"42:00~46:00"));

		ddFriendsTime.get(5).add(
				new MyTime(10001, 1, R.drawable.time_book, "time_book",
						"8:00~10:00"));
		ddFriendsTime.get(5).add(
				new MyTime(10001, 2, R.drawable.time_internet, "time_internet",
						"11:00~12:30"));
		ddFriendsTime.get(5).add(
				new MyTime(10001, 3, R.drawable.time_play, "time_play",
						"13:00~16:30"));
		ddFriendsTime.get(5).add(
				new MyTime(10001, 4, R.drawable.time_date, "time_date",
						"18:00~20:00"));
		ddFriendsTime.get(5).add(
				new MyTime(10001, 5, R.drawable.time_book, "time_book",
						"20:00~23:00"));
		ddFriendsTime.get(5).add(
				new MyTime(10001, 6, R.drawable.time_class, "time_class",
						"32:00~36:00"));
		ddFriendsTime.get(5).add(
				new MyTime(10001, 7, R.drawable.time_eat, "time_eat",
						"36:00~37:00"));
		ddFriendsTime.get(5).add(
				new MyTime(10001, 8, R.drawable.time_break, "time_break",
						"37:00~38:00"));
		ddFriendsTime.get(5).add(
				new MyTime(10001, 9, R.drawable.time_sports, "time_sports",
						"39:00~41:20"));
		ddFriendsTime.get(5).add(
				new MyTime(10001, 10, R.drawable.time_party, "time_party",
						"42:00~46:00"));

		ddFriendsTime.get(6).add(
				new MyTime(10001, 1, R.drawable.time_book, "time_book",
						"8:00~10:00"));
		ddFriendsTime.get(6).add(
				new MyTime(10001, 2, R.drawable.time_internet, "time_internet",
						"11:00~12:30"));
		ddFriendsTime.get(6).add(
				new MyTime(10001, 3, R.drawable.time_play, "time_play",
						"13:00~16:30"));
		ddFriendsTime.get(6).add(
				new MyTime(10001, 4, R.drawable.time_date, "time_date",
						"18:00~20:00"));
		ddFriendsTime.get(6).add(
				new MyTime(10001, 5, R.drawable.time_book, "time_book",
						"20:00~23:00"));
		ddFriendsTime.get(6).add(
				new MyTime(10001, 6, R.drawable.time_class, "time_class",
						"32:00~36:00"));
		ddFriendsTime.get(6).add(
				new MyTime(10001, 7, R.drawable.time_eat, "time_eat",
						"36:00~37:00"));
		ddFriendsTime.get(6).add(
				new MyTime(10001, 8, R.drawable.time_break, "time_break",
						"37:00~38:00"));
		ddFriendsTime.get(6).add(
				new MyTime(10001, 9, R.drawable.time_sports, "time_sports",
						"39:00~41:20"));
		ddFriendsTime.get(6).add(
				new MyTime(10001, 10, R.drawable.time_party, "time_party",
						"42:00~46:00"));

		ddFriendsTime.get(7).add(
				new MyTime(10001, 1, R.drawable.time_book, "time_book",
						"8:00~10:00"));
		ddFriendsTime.get(7).add(
				new MyTime(10001, 2, R.drawable.time_internet, "time_internet",
						"11:00~12:30"));
		ddFriendsTime.get(7).add(
				new MyTime(10001, 3, R.drawable.time_play, "time_play",
						"13:00~16:30"));
		ddFriendsTime.get(7).add(
				new MyTime(10001, 4, R.drawable.time_date, "time_date",
						"18:00~20:00"));
		ddFriendsTime.get(7).add(
				new MyTime(10001, 5, R.drawable.time_book, "time_book",
						"20:00~23:00"));
		ddFriendsTime.get(7).add(
				new MyTime(10001, 6, R.drawable.time_class, "time_class",
						"32:00~36:00"));
		ddFriendsTime.get(7).add(
				new MyTime(10001, 7, R.drawable.time_eat, "time_eat",
						"36:00~37:00"));
		ddFriendsTime.get(7).add(
				new MyTime(10001, 8, R.drawable.time_break, "time_break",
						"37:00~38:00"));
		ddFriendsTime.get(7).add(
				new MyTime(10001, 9, R.drawable.time_sports, "time_sports",
						"39:00~41:20"));
		ddFriendsTime.get(7).add(
				new MyTime(10001, 10, R.drawable.time_party, "time_party",
						"42:00~46:00"));

		ddFriendsTime.get(8).add(
				new MyTime(10001, 1, R.drawable.time_book, "time_book",
						"8:00~10:00"));
		ddFriendsTime.get(8).add(
				new MyTime(10001, 2, R.drawable.time_internet, "time_internet",
						"11:00~12:30"));
		ddFriendsTime.get(8).add(
				new MyTime(10001, 3, R.drawable.time_play, "time_play",
						"13:00~16:30"));
		ddFriendsTime.get(8).add(
				new MyTime(10001, 4, R.drawable.time_date, "time_date",
						"18:00~20:00"));
		ddFriendsTime.get(8).add(
				new MyTime(10001, 5, R.drawable.time_book, "time_book",
						"20:00~23:00"));
		ddFriendsTime.get(8).add(
				new MyTime(10001, 6, R.drawable.time_class, "time_class",
						"32:00~36:00"));
		ddFriendsTime.get(8).add(
				new MyTime(10001, 7, R.drawable.time_eat, "time_eat",
						"36:00~37:00"));
		ddFriendsTime.get(8).add(
				new MyTime(10001, 8, R.drawable.time_break, "time_break",
						"37:00~38:00"));
		ddFriendsTime.get(8).add(
				new MyTime(10001, 9, R.drawable.time_sports, "time_sports",
						"39:00~41:20"));
		ddFriendsTime.get(8).add(
				new MyTime(10001, 10, R.drawable.time_party, "time_party",
						"42:00~46:00"));
	}

	
	public static List<String> timeTaskName = new ArrayList<String>();
	public static List<String> timeTaskChinese = new ArrayList<String>();
	static {
		timeTaskName.add("time_bed");
		timeTaskChinese.add("˯��");
		timeTaskName.add("time_book");
		timeTaskChinese.add("����");
		timeTaskName.add("time_break");
		timeTaskChinese.add("��Ϣ");
		timeTaskName.add("time_byyou");
		timeTaskChinese.add("�Զ���");
		timeTaskName.add("time_class");
		timeTaskChinese.add("�Ͽ�");
		timeTaskName.add("time_date");
		timeTaskChinese.add("Լ��");
		timeTaskName.add("time_eat");
		timeTaskChinese.add("�Է�");
		timeTaskName.add("time_internet");
		timeTaskChinese.add("����");
		timeTaskName.add("time_outside");
		timeTaskChinese.add("���");
		timeTaskName.add("time_party");
		timeTaskChinese.add("�ۻ�");
		timeTaskName.add("time_play");
		timeTaskChinese.add("����");
		timeTaskName.add("time_shopping");
		timeTaskChinese.add("����");
		timeTaskName.add("time_sports");
		timeTaskChinese.add("�˶�");
		timeTaskName.add("time_stayup");
		timeTaskChinese.add("��ҹ");
		timeTaskName.add("time_study");
		timeTaskChinese.add("��ϰ");
		timeTaskName.add("time_wash");
		timeTaskChinese.add("ϴ��");
		timeTaskName.add("time_work");
		timeTaskChinese.add("����");
	}

}
