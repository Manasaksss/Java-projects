package Example.Myapp;
public class StudentA implements Displayable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Student A Name: " + name);
    }
}