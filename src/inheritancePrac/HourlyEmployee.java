package inheritancePrac;

public class HourlyEmployee extends Employee{

    private int wage;
    private int workHours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, int wage, int workHours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.workHours = workHours;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public void printInfo(){
        super.printInfo();
        System.out.printf(", Wage: $%d, Hours Worked: %d", this.wage, this.workHours);
    }
}
