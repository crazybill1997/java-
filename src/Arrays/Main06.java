package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 通过 Collections 类的 Collections.max() 和 Collections.min() 方法来查找数组中的最大和最小值
 * Collections.min(）参数要求含有迭代器方法的集合
 *
 */

public class Main06 {
	public static void main(String[] args) {
		Integer[] nums = new Integer[10];
		for(int i = 0;i<nums.length;i++) {
			nums[i] = (int) (Math.random()*10);
		}
		for(int j:nums) {
			System.out.print(j+" ");
		}
		System.out.println();
		
//		Integer[] num = {1,2,5,4,65,3,7};
		int min = Collections.min(Arrays.asList(nums));
		int max = Collections.max(Arrays.asList(nums));
		System.out.println("最小的数为："+min);
		System.out.println("最大的数为："+max);
	}
		
		//Collections.min(）参数要求含有迭代器方法的集合,源码如下：
		public static <T extends Object & Comparable<? super T>> T min(Collection<? extends T> coll) {
		    Iterator<? extends T> i = coll.iterator();
		    T candidate = i.next();

		        while (i.hasNext()) {
		        T next = i.next();
		        if (next.compareTo(candidate) < 0)
		        candidate = next;
		    }
		    return candidate;
		
	}
}
