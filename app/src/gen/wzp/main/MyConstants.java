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
			String.valueOf(DaveHead), "第二名就意味着你是头号输家。", "最近确实太忙了，忙，忙，忙！", 1, 10);

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
		DaveTask.add(new MyTask(10001,1,R.drawable.time_book,"写论文","20","40%"));
		DaveTask.add(new MyTask(10001,2,R.drawable.time_internet,"写程序","20","20%"));
		DaveTask.add(new MyTask(10001,3,R.drawable.time_study,"记单词","100","5%"));
		DaveTask.add(new MyTask(10001,4,R.drawable.time_sports,"锻炼身体","12","50%"));
		DaveTask.add(new MyTask(10001,5,R.drawable.time_work,"研究算法","30","10%"));
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
				R.drawable.random_head1 + "", "永远不要说你已经尽力了", "开始长跑，有谁一起？", 3,
				60));
		dFriendsInfo.add(new UserInfo(10102, 1, "Mary", R.drawable.random_head2
				+ "", "世界会向那些有目标和远见的人让路。", "时间太快了，要考试了，忙啊忙。", 3, 60));
		dFriendsInfo.add(new UserInfo(10103, 1, "Tom", R.drawable.random_head3
				+ "", "实现自己既定的目标，必须能耐得住寂寞单干。", "想睡觉。", 3, 60));
		dFriendsInfo
				.add(new UserInfo(10104, 1, "Jack", R.drawable.random_head4
						+ "", "为了不让生活留下遗憾和后悔，我们应该尽可能抓住一切改变生活的机会。",
						"计划一下下周做什么吧", 3, 60));
		dFriendsInfo.add(new UserInfo(10105, 1, "Robort",
				R.drawable.random_head5 + "", "无论你觉得自己多么的不幸，永远有人比你更加不幸。",
				"这么好的天气可不能浪费了。", 3, 60));
		dFriendsInfo.add(new UserInfo(10106, 1, "Mindy",
				R.drawable.random_head6 + "", "无论你觉得自己多么的了不起，也永远有人比你更强。",
				"去爬山，求组队。", 3, 60));
		dFriendsInfo.add(new UserInfo(10107, 1, "Judy", R.drawable.random_head7
				+ "", "打击与挫败是成功的踏脚石，而不是绊脚石。", "最近过的很平淡嘛。", 3, 60));
		dFriendsInfo.add(new UserInfo(10108, 1, "Amy", R.drawable.random_head8
				+ "", "从来不跌倒不算光彩，每次跌倒后能再站起来，才是最大的荣耀。", "饿了就要吃。", 3, 60));
		dFriendsInfo.add(new UserInfo(10109, 1, "George",
				R.drawable.random_head9 + "", "失败只有一种，那就是半途而废。",
				"连续通了两天宵了，还没做完。", 3, 60));
		dFriendsInfo.add(new UserInfo(10110, 1, "John",
				R.drawable.random_head10 + "", "相信就是强大，怀疑只会抑制能力，而信仰就是力量。",
				"论文还没看完，我好慢呀。", 3, 60));
		dFriendsInfo.add(new UserInfo(10111, 1, "Mark",
				R.drawable.random_head11 + "", "有压力，但不会被压垮；迷茫，但永不绝望。",
				"最近课好多，作业也是。", 3, 60));
		dFriendsInfo.add(new UserInfo(10112, 1, "Vivi",
				R.drawable.random_head12 + "", "旁观者的姓名永远爬不到比赛的计分板上。", "听老板的话。",
				3, 60));
		dFriendsInfo.add(new UserInfo(10113, 1, "Wendy",
				R.drawable.random_head13 + "", "人必须相信自己，这是成功的秘诀。", "我回来了", 3,
				60));
		dFriendsInfo.add(new UserInfo(10114, 1, "Justin",
				R.drawable.random_head14 + "", "行动说明一切。", "New World，New Day.",
				3, 60));
		dFriendsInfo.add(new UserInfo(10115, 1, "Croff",
				R.drawable.random_head15 + "", "信念在。", "闲的无聊，欢迎打扰。", 3, 60));

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
		timeTaskChinese.add("睡觉");
		timeTaskName.add("time_book");
		timeTaskChinese.add("看书");
		timeTaskName.add("time_break");
		timeTaskChinese.add("休息");
		timeTaskName.add("time_byyou");
		timeTaskChinese.add("自定义");
		timeTaskName.add("time_class");
		timeTaskChinese.add("上课");
		timeTaskName.add("time_date");
		timeTaskChinese.add("约会");
		timeTaskName.add("time_eat");
		timeTaskChinese.add("吃饭");
		timeTaskName.add("time_internet");
		timeTaskChinese.add("上网");
		timeTaskName.add("time_outside");
		timeTaskChinese.add("外出");
		timeTaskName.add("time_party");
		timeTaskChinese.add("聚会");
		timeTaskName.add("time_play");
		timeTaskChinese.add("娱乐");
		timeTaskName.add("time_shopping");
		timeTaskChinese.add("购物");
		timeTaskName.add("time_sports");
		timeTaskChinese.add("运动");
		timeTaskName.add("time_stayup");
		timeTaskChinese.add("熬夜");
		timeTaskName.add("time_study");
		timeTaskChinese.add("自习");
		timeTaskName.add("time_wash");
		timeTaskChinese.add("洗衣");
		timeTaskName.add("time_work");
		timeTaskChinese.add("工作");
	}

}
