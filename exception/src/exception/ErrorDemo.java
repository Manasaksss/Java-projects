package exception;

public class ErrorDemo {

	public static void main(String[] args) {//MAIN IS A METHOD
		System.out.println("INDISE FOO");
		foo();
	}
	public static void foo(){//MAIN IS A METHOD
		System.out.println("INDISE FOO");
		bar();
	}
	public static void bar(){//MAIN IS A METHOD
		System.out.println("INDISE bar");
		foo();
	}

}
