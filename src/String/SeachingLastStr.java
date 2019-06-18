package String;
/**
 * 以下实例中我们通过字符串函数 strOrig.lastIndexOf(Stringname) 来查找子字符串 Stringname 在 strOrig 出现的位置
 */
import java.util.*;

public class SeachingLastStr {
	public static void main(String[] args) {
		String str = "I am Lee, I like sing, dance and basketball";
		System.out.println(str+" 的总长度是："+str.length());
		System.out.print("请输入你要查找的字符串：");
		Scanner cin = new Scanner(System.in);
		String input = cin.nextLine();
		int lastIndex = str.lastIndexOf(input);
		if(lastIndex == -1) {
			System.out.println("未找到相应字符串"+input);
		}else {
			System.out.println(input+"最后出现的位置是："+lastIndex);
		}
	}
}
