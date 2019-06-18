package String;
/**
 * 通过 String.intern() 方法来优化字符串
 * intern()就是将字符串放入常量池
 * 
 */

public class Main10 {
	public static void main(String[] args) {
		String str[] = new String[50000];
		long start = System.currentTimeMillis();
		for(int i = 0;i<50000;i++) {
			str[i] = "s"+i;	
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		
		long startTime0 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            str[i] = "hello";
        }
        long endTime0 = System.currentTimeMillis();
        System.out.println("直接使用字符串： "+ (endTime0 - startTime0)  + " ms" );
        long startTime1 = System.currentTimeMillis();
            for(int i=0;i<50000;i++){
            str[i] = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("使用 new 关键字：" + (endTime1 - startTime1) + " ms");
        long startTime2 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            str[i] = new String("hello");
            str[i] = str[i].intern();          
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("使用字符串对象的 intern() 方法: " 
        + (endTime2 - startTime2)
        + " ms");
	}
}
