package Arrays;

import java.util.*;

/**
 * 使用 removeAll () 方法来计算两个数组的差集
 *
 */

public class Main12 {
	public static void main(String[] args) {
		ArrayList arr1 = new ArrayList();
		arr1.add("1");
		arr1.add("2");
		arr1.add("3");
		List<String> arr2 = new ArrayList<String>();
		arr2.add("2");
		arr1.removeAll(arr2);
		System.out.println(arr1);
		
		 ArrayList objArray = new ArrayList();
	        ArrayList<String> objArray2 = new ArrayList<String>();
	        objArray2.add(0,"common1");
	        objArray2.add(1,"common2");
	        objArray2.add(2,"notcommon");
	        objArray2.add(3,"notcommon1");
	        objArray.add(0,"common1");
	        objArray.add(1,"common2");  //前面的1设置顺序   ，  注意   顺序 ，  这里可以写0，但上面的不能改为1 
	        objArray.add(2,"notcommon2");
	        System.out.println("array1 的元素" +objArray);
	        System.out.println("array2 的元素" +objArray2);
	        objArray.removeAll(objArray2);
	        System.out.println("array1 与 array2 数组差集为："+objArray);
	}
}
