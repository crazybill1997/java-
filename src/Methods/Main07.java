package Methods;

import java.util.ArrayList;
import java.util.Vector;

/**
 * nstanceof 是 Java 的一个二元操作符，类似于 ==，>，< 等操作符。
 * instanceof 是 Java 的保留关键字。它的作用是测试它左边的对象是否是它右边的类的实例，返回 boolean 的数据类型。
 *在编译状态中，class可以是object对象的父类，自身类，子类。在这三种情况下Java编译时不会报错。
在运行转态中，class可以是object对象的父类，自身类，不能是子类。在前两种情况下result的结果为true，
最后一种为false。但是class为子类时编译不会报错。运行结果为false。
 */

public class Main07 {
	public static void main(String[] args) {
		Object o = new Object();
		displayObjectClass(o);
		Object a = new Vector();  //将子类转为父类的操作即为向上转型
		displayObjectClass(a);
	}
	public static void displayObjectClass(Object o) {
		if(o instanceof Vector) {
			System.out.println("对象是 java.util.Vector 类的实例");
		}
		else if(o instanceof ArrayList) {
			System.out.println("对象是 java.util.ArrayList 类的实例");
		}else {
			System.out.println("对象是"+o.getClass()+"类的实例");
		}
	}
}
