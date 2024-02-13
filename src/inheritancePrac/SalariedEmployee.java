package inheritancePrac;

public class SalariedEmployee extends Employee{

    private int weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, int weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public void printInfo(){
        super.printInfo();
        System.out.printf(", Weekly Salary: $%d", this.weeklySalary);
    }
}
