package Methods;
/**
 * 
 * 斐波那契数列指的是这样一个数列 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，4181，6765，10946，17711，28657，46368……
 * 特别指出：第0项是0，第1项是第一个1。
 * 这个数列从第三项开始，每一项都等于前两项之和。
 *
 */
import java.util.*;

public class Main04 {
	//第二种解   即调用方法
	public static long Fibonacci(long num) {
		if(num == 0|| num == 1) {
			return num;
		}else {
			return Fibonacci(num-1)+Fibonacci(num-2);
		}
	}
	
	
	
	//第一种解  即不用方法  用数组
	public static void main(String[] args) {
		System.out.println("输入你想输出的位数：");
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		for (int counter = 0; counter <= N; counter++){
            System.out.printf("Fibonacci of %d is: %d\n",
            counter, Fibonacci(counter));}
            System.out.println();
            
		int[] array = new int[N];
		array[0] = array[1] = 1;
		for(int i = 2;i<array.length;i++) {
			array[i] = array[i-1]+array[i-2];
		}
		for(int k:array) {
			System.out.println(k);
		}
	}
}
