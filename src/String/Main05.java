package String;

import java.util.StringTokenizer;

/**
 * 以下实例使用了 split(string) 方法通过指定分隔符将字符串分割为数组
 * @author 李若冰
 *
 */

public class Main05 {
	public static void main(String[] args) {
		String str = "I .like .sing .dance .and .play .basketball";
		String[] temp;
		temp = str.split("\\ .");//“.”在这里需要转义，作为转义字符,不写\\没有效果
		for(String i:temp) {
			System.out.println(i);
		}
		
		System.out.println();
		//在本例子中用到 String 类的 split 方法，其实在字符串分割时可以调用 StringTokenizer，
		//实例化一个 StringTokenizer 的对象，通过 hasMoreTokens() 与 nextToken()进行判断并打印分割后的子字符串
		 String str1="www .runoob .com"; 
	        // 实例化对象，并指向以 . 对 str 进行分割
		 System.out.println("------按逗号来排------");
	        StringTokenizer str2=new StringTokenizer(str1, ".");//nextToken声明的返回值类型是String
	        // 对 str2 遍历并打印子字符串； 
	        while(str2.hasMoreTokens()){ 
	            System.out.println(str2.nextToken()); 
	        }
	        System.out.println();
	        System.out.println("-----按空格来排------");
	        StringTokenizer str3 = new StringTokenizer(str1);
	        while(str3.hasMoreElements()) {
	        	System.out.println(str3.nextElement());//nextElement声明的返回值类型是Object
	        }
	}
}
