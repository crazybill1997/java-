package Arrays;
/**
 * 
 * 使用sort()方法对Java数组进行排序，及如何使用 binarySearch() 方法来查找数组中的元素
 *
 */
import java.util.Arrays;

public class Main01 {
	public static void main(String[] args) {
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Arrays.sort(array);
		printArray("排序后的数组为", array);
		int index = Arrays.binarySearch(array, 2);
		System.out.println("元素2在第 " + index + "个位置");
	}

	private static void printArray(String string, int[] array) {
		// TODO Auto-generated method stub
//		System.out.println(string+ ": [length: " + array.length + "]");
//		for(int i = 0;i<array.length;i++) {
//			if(i!=0)
//			System.out.print(",");
//			System.out.print(array[i]);
//		}
//		System.out.println();
		for(int i : array) {
			System.out.println(i + " ");
		}
	}
}
