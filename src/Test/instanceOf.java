package Test;

interface Man{}
class Person1 implements Man{}
class Student extends Person1{}
class Postgraduate extends Student{}
class A{}
public class instanceOf {
	public static void instanceOfTest(Object o) {
		if(o instanceof Student) {
			System.out.println(o.getClass()+"类的实例  是类Student的实例");
		}
		if(o instanceof A) {
			System.out.println(o.getClass()+"类是实例  是类A的实例");
		}
		if (o instanceof Postgraduate) {
			System.out.println(o.getClass() + "类的实例  是类Postgraduate的实例");
		}
		if (o instanceof Person1) {
			System.out.println(o.getClass() + "类的实例  是类Person的实例");
		}
		if (o instanceof Man) {
			System.out.println(o.getClass() + "类的实例  是接口Man的实例");
		}
		if (o instanceof Object) {
			System.out.println(o.getClass() + "类的实例  是类Object的实例");
		}
	}
	public static void main(String[] args) {
		Person1 p = new Person1();
		instanceOfTest(p);
		System.out.println();
		Person1 p1 = new Student();
		instanceOfTest(p1);
		System.out.println();
		instanceOfTest(new A());
		System.out.println();
		System.out.println(p instanceof Student);
		System.out.println(p instanceof Man);
		A a = new A();
		System.out.println(a instanceof A);  //左边a本身是A 的实例 ，也为true
		Student s = new Student();
		System.out.println(s instanceof Person1);
		//在编译状态中，class可以是object对象的父类，自身类，子类。在这三种情况下Java编译时不会报错。
//		在运行转态中，class可以是object对象的父类，自身类，不能是子类。在前两种情况下result的结果为true，
//		最后一种为false。但是class为子类时编译不会报错。运行结果为false。
	}
}
