package Q4.A4;
		import org.springframework.context.ApplicationContext;
		import org.springframework.context.support.ClassPathXmlApplicationContext;

		public class DrawingApp {
		    public static void main(String[] args) {
		        // Load the Spring configuration
		        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

		        // Get the shape beans using dependency injection
		        Shape shape=(Shape)context.getBean("rectangle");
		        shape.draw();
		    }
		}


