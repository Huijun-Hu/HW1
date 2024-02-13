package inheritancePrac;

public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee() {
        System.out.println("Missing primary employee information");
    }

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void printInfo(){
        System.out.printf("\nFirst Name: %s, Last Name: %s, Social Security #: %s", this.firstName, this.lastName, this.socialSecurityNumber);
    }
}
