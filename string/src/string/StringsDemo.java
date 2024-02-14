package string;

public class StringsDemo {

	public static void main(String[] args) {
		String str = "abc";
		//str = str.concat("xyz");
		System.out.println(str.concat("xyz"));//abcxyz
				
		System.out.println(str); //abc
		System.out.println(str.isEmpty());//false
		System.out.println(str.hashCode());//an unique integer assign to an object
		System.out.println(str.charAt(0));
		System.out.println("z".codePointAt(0));
		System.out.println("zbc".compareTo("ybc"));
		System.out.println(str.contains("bc"));
		System.out.println(str.replace('c','d'));
		
		String string ="       hello            ";
		System.out.println(string.length());
		System.out.println(string);
		System.out.println(string.trim());
		System.out.println(string.trim().equals( "Hello"));
		String string2 = "world";
		}
}
