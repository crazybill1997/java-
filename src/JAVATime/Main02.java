package JAVATime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * yyyy：年
MM：月
dd：日
hh：1~12小时制(1-12)
HH：24小时制(0-23)
mm：分
ss：秒
S：毫秒
E：星期几
D：一年中的第几天
F：一月中的第几个星期(会把这个月总共过的天数除以7)
w：一年中的第几个星期
W：一月中的第几星期(会根据实际情况来算)
a：上下午标识
k：和HH差不多，表示一天24小时制(1-24)
K：和hh差不多，表示一天12小时制(0-11)
z：表示时区
 *
 */

public class Main02 {
	public static void main(String[] args) {
		Date date = new Date();// 获取当前时间 
		SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间 
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记  
        
        System.out.println("现在时间：" + sdf.format(date)); // 输出已经格式化的现在时间（24小时制） 
        
        //使用 SimpleDateFormat 类的 format() 方法将时间戳转换成时间。
        //这里三种方法均可。第二种里面是先把 long 转换成 string 再转换成 long。
        /*String sd = sdf.format(Long.parseLong(String.valueOf(timeStamp)));
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        String sd = sdf.format(timeStamp);*/
	}
}
