package Q4.A4;
public class Rectangle implements Shape {
    @Override
    public void draw() {
        for(int i=0;i<=6;i++) {
        	for(int j=0;j<5;j++) {
        		System.out.print("# ");
        	}
        	System.out.println();
        }
    }
}
