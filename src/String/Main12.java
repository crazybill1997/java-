package String;
/**
 * 
 * 通过 "+" 操作符和StringBuffer.append() 方法来连接字符串，并比较其性能
 *1. 方法1 加号 “+” 拼接 和 方法2 String contact() 方法 适用于小数据量的操作，代码简洁方便，加号“+” 更符合我们的编码和阅读习惯；

	2. 方法3 StringUtils.join() 方法 适用于将ArrayList转换成字符串，就算90万条数据也只需68ms，可以省掉循环读取ArrayList的代码；

	3. 方法4 StringBuffer append() 方法 和 方法5 StringBuilder append() 方法 其实他们的本质是一样的，都是继承自AbstractStringBuilder，效率最高，大批量的数据处理最好选择这两种方法。

	4. 方法1 加号 “+” 拼接 和 方法2 String contact() 方法 的时间和空间成本都很高（分析在本文末尾），不能用来做批量数据的处理。
	
 *
 *考虑线程安全时使用StringBuffer
 * 	   					String(大姐，出生于JDK1.0时代)          不可变字符序列
 *                      StringBuffer(二姐，出生于JDK1.0时代)    线程安全的可变字符序列
                        StringBuilder(小妹，出生于JDK1.5时代)   非线程安全的可变字符序列
 *
 */


//+"为每个字符串变量赋值，公用一个内值，占用一份内存空间；"StringBuffer"每次新建一个新对象，内存分配新的空间，新分配5000份内存空间；
public class Main12 {
	public static void main(String[] args) {
		 long startTime = System.currentTimeMillis();
	        String[] strArr = new String[500];
	        for(int i=0;i<500;i++){
	            String result = "This is";
	            strArr[i]=String.valueOf(result.hashCode());
	        }
	        long endTime = System.currentTimeMillis();
	        System.out.println("字符串连接" 
	        + " - 使用 + 操作符 : " 
	        + (endTime - startTime)+ " ms");
	        System.out.println(strArr[0]+"\n"+strArr[1]+"\n"+strArr[2]);
	        long startTime1 = System.currentTimeMillis();
	        for(int i=0;i<500;i++){
	            StringBuffer result = new StringBuffer();
	            result.append("This is");
	            strArr[i]=String.valueOf(result.hashCode());
	        }
	        long endTime1 = System.currentTimeMillis();
	        System.out.println("字符串连接" 
	        + " - 使用 StringBuffer : "
	        + (endTime1 - startTime1)+ " ms");
	        System.out.println(strArr[0]+"\n"+strArr[1]+"\n"+strArr[2]);
	}
}
