package Q2.A2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Displayable displayable = (Displayable) context.getBean("even");
        System.out.println("EVEN:");
        displayable.display();
        
        System.out.println("\n");
        
        Displayable displayable2 = (Displayable) context.getBean("odd");
        System.out.println("ODD:");
        displayable2.display();
	}

}