package DaYinShapes;
/**
 * 打印菱形
 *  很巧妙很巧妙！！！！
 */
public class Main01 {
	public static void print(int n) {
		// TODO Auto-generated method stub
		if(n%2 == 0) {
			n++;
		}
		for(int i = 0;i<n/2+1;i++) {
			for(int j=n/2+1;j>i+1;j--) {
				System.out.print(" ");
			}
			for(int j = 0;j<i*2+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n / 2 + 1; i < n; i++) {  //n只会等于单数,所以会循环（n-1）/2次
            for (int j = 0; j < i - n / 2; j++) {
                System.out.print(" "); // 输出菱形左下角空白
            }
            for (int j = 0; j < 2 * n - 1 - 2 * i; j++) {
                System.out.print("*"); // 输出菱形下半部边缘
            }
            System.out.println(); // 换行
        }
	}
	public static void main(String[] args) {
		print(6);
	}
}
