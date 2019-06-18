package Methods;
/**
 * 	重载（Overloading）的定义：如果有两个方法的方法名相同，但参数不一致，哪么可以说一个方法是另一个方法的重载。 具体说明如下：

   	方法名相同
	方法的参数类型，参数个不一样
	方法的返回类型可以不相同
	方法的修饰符可以不相同
	main 方法也可以被重载
 *
 */
class Myclass{
	int height;
	Myclass(){
		System.out.println("无参构造器");
		height = 4;
	}
	Myclass(int i){
		System.out.print("有参构造器");
		System.out.println("房子高度为 "+i+" 米");
		height = i;
	}
	void info() {
		System.out.println("房子高度为 "+height+" 米");
	}
	void info(String s) {
		System.out.println(s+" 房子高度为 "+height+" 米");
	}
}
public class Main01 {
	public static void main(String[] args) {
		Myclass m = new Myclass(3);	
		m.info();
		m.info("重载方法");
		new Myclass();
		System.out.println();
		Myclass t = new Myclass();
		t.info();
		t.info("重载");
		new Myclass();
	}
}
