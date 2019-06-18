package Arrays;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * 如何通过循环输出数组  and  迭代器
 * for循环需要自己定义    迭代器则可以适应所有的集合类
 */

public class Main05 {
	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();
		str.add("你好！");
		str.add("世界！");
		str.add("!!!");
		//使用迭代器
		for(
				Iterator<String> iterator = str.iterator();
				iterator.hasNext();
				System.out.print(iterator.next())
				) {}
	}
}
