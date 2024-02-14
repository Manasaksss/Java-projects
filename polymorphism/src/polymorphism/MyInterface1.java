package polymorphism;

public interface MyInterface1{
      public static final  int X = 10;
       public abstract void foo();
        public default void bar() {
        	System.out.println("bar()");
        }

        public static void print() {
        	System.out.println("print()");
        }
}
