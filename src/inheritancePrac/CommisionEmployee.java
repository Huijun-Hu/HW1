package inheritancePrac;

public class CommisionEmployee extends Employee {
    private double commissionRate;
    private int grossSale;

    public CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, int grossSale) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(float commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(int grossSale) {
        this.grossSale = grossSale;
    }

    public void printInfo(){
        super.printInfo();
        System.out.printf(", Commission Rate: %f, Gross Sales: $%d", this.commissionRate *100, this.grossSale);
    }
}
