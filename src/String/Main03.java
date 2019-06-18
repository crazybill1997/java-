package String;
/**
 * 以下实例演示了如何使用 Java 的反转函数 reverse() 将字符串反转
 * @author 李若冰
 *和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
 */

public class Main03 {
	public static void main(String[] args) {
		String str = "I like sing dance and play basketball!";
		String strover = new StringBuffer(str).reverse().toString();
		System.out.println(strover);
	}
}
