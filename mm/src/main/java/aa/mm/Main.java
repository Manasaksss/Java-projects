package aa.mm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
	public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        NumberPrinter numberPrinter = context.getBean(NumberPrinter.class);

        System.out.println("Even Numbers:");
        numberPrinter.printEvenNumbers();

        System.out.println("\nOdd Numbers:");
        numberPrinter.printOddNumbers();
    }
}

