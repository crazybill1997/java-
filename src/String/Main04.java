package String;
/**
 * 以下实例使用了 String 类的 indexOf() 方法在字符串中查找子字符串出现的位置，如果存在返回字符串出现的位置（第一位为0），如果不存在返回 -1
 * @author 李若冰
 *此程序存在弊端，只能找出出现的第一次的位置，只能判断子字符串是否存在
 */
import java.util.*;

public class Main04 {
	public static void main(String[] args) {
		String str = "I like sing dance and play basketball!";
		System.out.println("请输入你要查找的字符串：");
		Scanner cin = new Scanner(System.in);
		String n = cin.nextLine();
		int indexStr = str.indexOf(n);
		
		if(indexStr == -1) {
			System.out.println("你要查找的不存在");
		}else {
			System.out.println("他出现在第 "+indexStr+" 的位置");
		}
	}
}
