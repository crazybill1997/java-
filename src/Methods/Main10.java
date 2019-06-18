package Methods;
/**
 * 
 * Java 创建枚举类型要使用 enum 关键字，隐含了所创建的类型都是 java.lang.Enum 类的子类 
 */

enum Car{
	兰博基尼,法拉利,奥迪,五菱宏光;
}

public class Main10 {
	public static void main(String[] args) {
		Car c;
		c = Car.五菱宏光;
		switch(c) {
		case 五菱宏光:
			System.out.println("昨晚我输给了一辆五菱宏光，他是用惯性漂移过弯");
			break;
		case 兰博基尼:
			System.out.println("Lamborghini");
			break;
		case 奥迪:
			System.out.println("你确定要开奥迪吗");
			break;
		case 法拉利:
			System.out.println("Ferrari！！！");
			break;
		default:
			System.out.println("吊毛别做梦了");
		}
	}
}
