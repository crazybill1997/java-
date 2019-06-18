package Arrays;

import java.util.ArrayList;
import java.util.Collections;


/**
 * 使用 Collections.reverse(ArrayList) 将数组进行反转
 *
 */

public class Main04 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println("反转前排序："+a);
		Collections.reverse(a);
		System.out.println("反转后排序："+a);
	}
}
