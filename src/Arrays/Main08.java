package Arrays;

import java.util.Arrays;

/**
 * 
 * 通过 Java Util 类的 Arrays.fill(arrayname,value) 方法和Arrays.fill(arrayname ,starting index ,ending index ,value) 方法向数组中填充元素
 * Arrays.fill(arrayname ,starting index ,ending index ,value)
 * 填充数应该是，大于等于 startindex(startindex <= index)，小于 endindex(endindex > index)。
 * startindex开始数     endindex结束位置
 */
public class Main08 {
	public static void main(String[] args) {
		int[] a = new int[6];
		Arrays.fill(a, 100);
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Arrays.fill(a, 3, 6, 50);
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Arrays.fill(a, 1, 4, 30);
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");  //填充数，将原数改变为现在的数字,而不改变结构
		}
	}
}
