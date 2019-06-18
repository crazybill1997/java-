package String;
/**
 * 使用了 regionMatches() 方法测试两个字符串中的一段区域是否相等
 * @author 李若冰
 * first_str.regionMatches(11, second_str, 12, 9) 表示将 first_str 字符串从第11个字符"M"开始和
 * second_str 字符串的第12个字符"M"开始逐个比较，共比较 9 对字符，由于字符串区分大小写，所以结果为false。
 * 如果设置第一个参数为 true ，则表示忽略大小写区别，所以返回 true。
 */

public class Main08 {
	public static void main(String[] args) {
			String F_str = "Welcome to Microsoft";
			String S_str = "I work with microsoft";
			boolean match1 = F_str.regionMatches(11, S_str, 12, 9);
			boolean match2 = F_str.regionMatches(true, 11, S_str, 12, 9); //第一个参数 true 表示忽略大小写区别
			System.out.println("不忽略大小写："+match1);
			System.out.println("忽略大小写："+match2);
	}
}
