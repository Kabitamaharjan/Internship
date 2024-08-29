package OOP;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, int age, String department, double salary) {
        super(name, age, department, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calculateTotalSalary(){
       return getSalary() + bonus;
    }

    @Override
    public double raiseSalary(double percentage) {
       // super.raiseSalary(percentage);//default constructor ho
        bonus = getSalary() +(percentage/100);
        return percentage;
    }

    @Override
    public void displayEmployeeInfo() {
        System.out.println("Name:" + getName());
        System.out.println("Salary:" +getSalary());
        System.out.println("Bonus:" + bonus);
        System.out.println("Totalsalary: " + calculateTotalSalary());
    }
}
