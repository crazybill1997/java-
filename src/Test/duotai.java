package Test;

class Animal{
	String name = "dongwu";
	Integer weight = 0;
	public void getName() {
		System.out.println(getClass().toString()+": "+name);
	}
	
	public void getWeight() {
		System.out.println(getClass().toString()+": "+weight);
	}
}

class Cat extends Animal{
//	String name;
	int weight;
	Cat(){
	name = "cat";
	weight = 20;
	}
	public void getName() {
		System.out.println(getClass().toString()+": "+name);
	}
//	public void getWeight() {
//		System.out.println(weight);
//	}
	
}
public class duotai {
	public static void main(String[] args) {
		Animal cat = new Cat(); //有覆盖，调用了子类方法；预期为cat ,子类实例化（向上转型）
		cat.getName();
		cat.getWeight();
		System.out.println(cat.name); //都是父类自己的变量值，因为父类name在cat类中被赋值了，所以变了
		System.out.println(cat.weight);
	}
}
