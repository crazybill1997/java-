package Methods;
/**
 * 
 * 通过重载 MainClass 类的 printArray 方法输出不同类型(整型, 双精度及字符型)的数组
 *
 */

//利用泛型输出三种类型的数组，不然需重载三次方法
public class Main02 {
	public static <T> void printArray(T[] input) {
		for(T element : input) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		 Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
	     Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
	     Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
	     System.out.println("整型");
	     printArray(integerArray);
	     System.out.println("双精度浮点");
	     printArray(doubleArray);
	     System.out.println("字符型");
	     printArray(characterArray);
	}
}
