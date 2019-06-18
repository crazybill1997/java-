package DaYinShapes;
/**
 * 
 * 打印三角形,即为菱形的一半
 *
 */
import java.util.*;

public class Main03 {
	public static void main(String[] args) {
		System.out.print("输入N的值打印底为N的三角形  N = ");
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		if(N%2==0) {
			N = N+1;
		}
		for(int i = 0;i<N/2+1;i++) {
			for(int j = N/2+1;j>i+1;j--) {
				System.out.print(" ");
			}
			
			for(int j = 0;j<i*2+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
