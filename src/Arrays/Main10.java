package Arrays;
/**
 * 
 *找到重复的元素
 */

public class Main10 {
	public static void main(String[] args) 
    {
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2, 9, 2};
        findDupicateInArray(my_array);
 
    }
 
    public static void findDupicateInArray(int[] a) {
        int count=0;
        for(int j=0;j<a.length;j++) {  //遍历第一遍
            for(int k =j+1;k<a.length;k++) {  //接着遍历第二遍
                if(a[j]==a[k]) {  //若有相等元素
                    count++;
                }
            }
            if(count==1)
               System.out.println( "重复元素 : " +  a[j] );
            count = 0;   //将count初始化到0
        }
    }
}
