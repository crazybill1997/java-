package String;

public class StringCompareEmp {
	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "Hello World";
		String str3 = "hello world";
		Object objstr = str1;
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareToIgnoreCase(str3));
		System.out.println(str1.compareTo(objstr.toString()));
		
		String n1 = "A";
		String n2 = "a";
		System.out.println(n1.hashCode()-n2.hashCode());
		System.out.println(n2.hashCode());
	}
}
