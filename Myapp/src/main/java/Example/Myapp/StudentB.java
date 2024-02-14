package Example.Myapp;
public class StudentB implements Displayable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Student B Name: " + name);
    }
}