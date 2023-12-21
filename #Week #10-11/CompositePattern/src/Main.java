public class Main {
    public static void main(String[] args) {


        //leaf emplooyes

        Developer developer1 = new Developer("Bekir Faruk Arabacı");
        Developer developer2 = new Developer("Mehmet Ali Sivri");
        Manager manager = new Manager("Bora Aslan");
        //

        //composite department
        Department developmentDepartment = new Department("Software Development");
        developmentDepartment.addEmployee(developer1);
        developmentDepartment.addEmployee(developer2);
        developmentDepartment.addEmployee(manager);

        developmentDepartment.showDetails();
    }
}