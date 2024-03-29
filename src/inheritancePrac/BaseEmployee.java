package inheritancePrac;

public class BaseEmployee extends Employee {

    private int baseSalary;

    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, int baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void printInfo(){
        super.printInfo();
        System.out.printf(", Base Salary: $%d", this.baseSalary);
    }
}
