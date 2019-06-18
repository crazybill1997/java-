package DaYinShapes;
/**
 * 
 * 打印三角形的第二种方法  下面是打印一个5行的三角形
 *
 */

public class Main03Test {
	 public static void main(String[] args){
	        for(int i=1;i<=5;i++){
	        	//打印第一部分
	        	//即左上空白部分
	            for(int j=5; j>=i; j--)  //等于i 左边会空出一列 空格 同样也可以写成j>i 图形会贴在左边边框
	                System.out.print(" ");
	            //建立第二部分
	            //即左半边三角形，包括中心轴的 * 号
	            for(int j=1; j<=i; j++)
	                System.out.print("*");
	            //建立第三部分
	            //即剩余 * 部分
	            for(int j=1; j<i; j++)
	                System.out.print("*");
	            System.out.println();
	        }
	    }
}
