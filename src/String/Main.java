package String;
/**
 * 以下实例中我们通过字符串函数 substring() 函数来删除字符串中的一个字符，我们将功能封装在 removeCharAt 函数中。
 * @author 李若冰
 *substring(int a, int b)表示保留从a开始到b的字符，但不包括b的字符
 *substring(int a)表示删除a之前的所有字符，a表示起始位置
 *
 */
public class Main {
	public static void main(String[] args) {
		String str = "I love sing dance and paly basketball";
		String str2 = str.substring(2, 5);
//		System.out.println(str.substring(3));
//		System.out.println(str2);
		System.out.println(str.indexOf("o"));//字符串索引，由0开始
		
		String str3 = removeCharAt(str, 3);
		System.out.println(str.length());
		System.out.println(str3);
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(0, 3));
	}
	
	public static String removeCharAt(String str, int pos) {
		
		return str.substring(0, pos)+str.substring(pos+1);
	}
}
