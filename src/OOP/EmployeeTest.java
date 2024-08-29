package OOP;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Kabita", 20,"IT",5000);

        Manager manager = new Manager("Alice", 45,"IT", 67000.00);

        System.out.println("Employee Info");
        employee.displayEmployeeInfo();
        System.out.println("------------");


        System.out.println("Manager Info");
        manager.displayEmployeeInfo();
        System.out.println("------------");

        employee.raiseSalary(10);
        manager.raiseSalary(10);


        System.out.println("updated employeeinfo");
        employee.displayEmployeeInfo();
        System.out.println("------------");


        System.out.println("updated managerinfo");
        manager.displayEmployeeInfo();
        System.out.println("------------");

    }
}
