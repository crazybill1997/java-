package String;
/**
 * 通过两种方式创建字符串，并测试其性能
 *
 */

public class Main09 {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		for(int i = 0;i<100000;i++) {
		String str = "hello";
		String str1 = "hello";
		String str2 = "hello";
		}
		long endTime = System.nanoTime();
		System.out.println("使用String直接创建需要："+(endTime - startTime)+"纳秒");
		
		long startTime1 = System.nanoTime();
		for(int i=0;i<100000;i++){
	         String s3 = new String("hello");
	         String s4 = new String("hello");
	    }
	    long endTime1 = System.nanoTime();
	    System.out.println("通过 String 对象创建字符串" + " : " + (endTime1 - startTime1)+ " 纳秒");
	    
	    long startTime2 = System.nanoTime();
	    for(int i=0;i<10000;i++) {
	    	StringBuffer sb = new StringBuffer("hello");
	    }
	    long endTime2 = System.nanoTime();
	    System.out.println(endTime2 - startTime2);
	}
}
