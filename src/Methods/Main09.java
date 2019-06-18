package Methods;
/**
 * Java 中的标签是为循环设计的，是为了在多重循环中方便的使用break 和coutinue 。
 * 以下实例当在循环中使用 break 或 continue 循环时跳到指定的标签处
 *
 */

public class Main09 {
	public static void main(String[] args) {
		String strSearch = "This is the string in which you have to search for a substring.";
        String substring = "is";
        boolean found = false; //默认true
        int max = strSearch.length() - substring.length();
        testlbl:
        	for(int i = 0;i<=max;i++) {
        		int j = i;
        		int k = 0;
        		int length = substring.length();
        		while(length-- != 0) {
        			if(strSearch.charAt(j++) != substring.charAt(k++)) {
        				continue testlbl;  //跳转到标签处再来一遍
        			}
        		}
        		found = true;
        		break ;
        	}
        if(found) {
        	System.out.println("发现子字符串");
        }else {
        	System.out.println("无");
        }
	}
}
