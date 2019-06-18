package Arrays;


import java.util.*;

/**
 * 
 * 通过 List 类的 Arrays.toString () 方法和 List 类的 list.Addall(array1.asList(array2)) 方法将两个数组合并为一个数组
 *    list.addAll(array1.asList(array2))  前提：将两个数组变为链表存储
 *    
 *    如果是向将两个list合并为一个list：list1.addAll(list)
 */

public class Main07 {
	public static void main(String[] args) {
		String[] a = {"I","LO"};
		String[] b = {"VE","U"};
		List list = new ArrayList(Arrays.asList(a));
		List list1 = new ArrayList(Arrays.asList(b));
		list.addAll(list1);
//		boolean arr = list.addAll(Arrays.asList(b));
//		System.out.println(arr);
		Object[] c = list.toArray();
		System.out.println(Arrays.toString(c));
	}
}
