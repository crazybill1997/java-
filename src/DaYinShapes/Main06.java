package DaYinShapes;
/**
 * 
 * 打印矩形
 *
 */

public class Main06 {
	public static void main(String[] args) {
		/*方法一*/
        //外层循环 每次输出一行*
       for (int i = 1; i <= 5; i++) {
           System.out.print("*");     //此句可省略，加上去后矩形会变宽
           //内层循环 每次输出一个*
           for (int j = 1; j <= 5; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
       System.out.println();
       /*方法二*/
       for (int i = 1; i <= 5; i++) {
//         System.out.print("*");     //此句可省略，加上去后矩形会变宽
         //内层循环 每次输出一个*
         for (int j = 1; j <= 5; j++) {
             System.out.print("*");
         }
         System.out.println();
     }
   }
}
