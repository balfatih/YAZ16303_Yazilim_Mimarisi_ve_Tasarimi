//leaf class
public class Developer implements Employee{

    private String name;

    public Developer(String name) {
        this.name = name;
    }
    @Override
    public void showDetails() {
        System.out.println("Developer: "+ name);
    }
}
