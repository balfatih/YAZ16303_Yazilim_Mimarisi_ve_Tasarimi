public class Footballer extends Player implements IPosition {

    private String currentTeam;
    private String position;

    public Footballer(String name,
                      int age,
                      String nationalTeam,
                      String currentTeam,
                      String position) {
        super(name, age, nationalTeam);
        this.currentTeam = currentTeam;
        this.position = position;
    }

    @Override
    public void playerInformation() {

        System.out.println("FOOTBALLER INFORMATION");
        System.out.println("Footballer Name: " +getName());
        System.out.println("Footballer Age: " + super.getAge());
        System.out.println("Footballer National Team: " + super.getNationalTeam());
        System.out.println("Footballer National Team: " + currentTeam);
        System.out.println("Footballer National Team: " + position);
    }

    @Override
    public void setPosition() {
        System.out.println(getName() + " plays as a " + position + " in football.");
        System.out.println("\n");
    }
}
