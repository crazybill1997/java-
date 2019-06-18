package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 使用 remove () 方法来删除数组元素
 *
 */

public class Main11 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		System.out.println(list);
//		list.clear();  //清空数组
		list.remove("1");
		list.remove(1);
		System.out.println(list);
	}
}
