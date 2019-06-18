package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 如何使用java替换字符串中的字符呢？(可用正则表达式)或者replace方法
 * @author 李若冰
 *
 */

public class Main02 {
	public static void main(String[] args) {
		//普通的replace
		String str = "1231";
		String str1 = "456";
		System.out.println(str.replace("1", "4"));
		System.out.println(str.replace("12", "56"));
		System.out.println(str.replaceFirst("1", "7"));//替换第一个“1”
		System.out.println(str.replaceAll(str, "1"+str1));
		
		
		//正则表达式
		 String str3="Hello World";
	        String regEx= "[Helo]";  //删除包含Helo的字符
	        String reStr= "";
	        Pattern pattern   =   Pattern.compile(regEx);
	        Matcher matcher   =   pattern.matcher(str3); // 替换 a、b、c、d、H 为空，即删除这几个字母
	        reStr = matcher.replaceAll("q").trim();
	        System.out.println( reStr );
	}
}
