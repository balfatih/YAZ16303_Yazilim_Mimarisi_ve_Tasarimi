public class FootballCoach extends Player {

    private String managedTeam;
    public FootballCoach(String name,
                         int age,
                         String nationalTeam,
                         String managedTeam) {
        super(name, age, nationalTeam);
        this.managedTeam = managedTeam;
    }

    @Override
    public void playerInformation() {
        System.out.println("FOOTBALL COACH INFORMATION");
        System.out.println("Footballer Name: " +getName());
        System.out.println("Footballer Age: " + super.getAge());
        System.out.println("Footballer National Team: " + super.getNationalTeam());
        System.out.println("Footballer National Team: " + managedTeam);
        System.out.println("\n");
    }
}
