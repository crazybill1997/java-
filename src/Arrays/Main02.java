package Arrays;

import java.util.Arrays;

/**
 * 使用sort()方法对Java数组进行排序，及如何使用 insertElement () 方法向数组插入元素
 * 在数组中添加元素，需要改变数组长度
 * 
 */

public class Main02 {
	public static void main(String[] args) {
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Arrays.sort(array);
		printArray("排序后",array);
		int index = Arrays.binarySearch(array, 1);
		System.out.println("元素1在（负数为不存在）" +index + " 的位置");
		
		int newIndex = -index -1;
		array = insertElement(array, 1 ,newIndex);
		printArray("插入后", array);
	}

	private static int[] insertElement(int array[], int element, int index) {
		// TODO Auto-generated method stub
		int length = array.length;
		int destination[] = new int[length+1];
		System.arraycopy(array, 0, destination, 0, index);
		destination[index] = element;
		System.arraycopy(array, index, destination, index+ 1, length - index);
		return destination;
	}

	private static void printArray(String string, int[] array) {
		// TODO Auto-generated method stub
		System.out.println(string+ ": [length: " + array.length + "]");
		for(int i = 0;i<array.length;i++) {
			if(i!=0)
			System.out.print(",");
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
