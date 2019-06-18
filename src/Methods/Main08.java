package Methods;
/**
 *  break 语句可以直接强行退出当前的循环，忽略循环体中任何其他语句和循环条件测试。
 * @author 李若冰
 *
 */

public class Main08 {
	public static void main(String[] args) {
		 int[] intary = { 99,12,22,34,45,67,5678,8990 };
	        int no = 56781;
	        int i = 0;
	        boolean found = false;
	        for ( ; i < intary.length; i++) {
	            if (intary[i] == no) {
	                found = true;
	                break; // break 语句可以直接强行退出当前的循环，忽略循环体中任何其他语句和循环条件测试。
	            }
	            
	        }
	        if (found==true) {
	            System.out.println(no + " 元素的索引位置在: " + "intary["+i+"]");
	        } 
	        else {
	            System.out.println(no + " 元素不在数组中");
	        }
	}
}
