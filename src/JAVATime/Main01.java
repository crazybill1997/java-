package JAVATime;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 使用 SimpleDateFormat 类的 format(date) 方法来格式化时间
 *	d               月中的某一天。一位数的日期没有前导零。  
  dd             月中的某一天。一位数的日期有一个前导零。  
  ddd           周中某天的缩写名称，在   AbbreviatedDayNames   中定义。  
  dddd         周中某天的完整名称，在   DayNames   中定义。  
  M               月份数字。一位数的月份没有前导零。  
  MM             月份数字。一位数的月份有一个前导零。  
  MMM           月份的缩写名称，在   AbbreviatedMonthNames   中定义。  
  MMMM         月份的完整名称，在   MonthNames   中定义。  
  y               不包含纪元的年份。不具有前导零。  
  yy             不包含纪元的年份。具有前导零。  
  yyyy         包括纪元的四位数的年份。  
  gg             时期或纪元。  
  h               12   小时制的小时。一位数的小时数没有前导零。  
  hh             12   小时制的小时。一位数的小时数有前导零。  
  H               24   小时制的小时。一位数的小时数没有前导零。  
  HH             24 
 */

public class Main01 {
	public static void main(String[] args) {
		Date date = new Date();
		String strDateFormat = "YYYY-MM-d  HH:mm:ss";
		SimpleDateFormat sim = new SimpleDateFormat(strDateFormat);
		System.out.println(sim.format(date));
	}
}
