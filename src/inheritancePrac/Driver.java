package inheritancePrac;

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        ArrayList<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee(
                "Joe", "Jones", "111-11-1111");
        Employee e2 = new HourlyEmployee(
                "Stephanie", "Smith", "222-22-2222", 25, 32);
        Employee e3 = new HourlyEmployee(
                "Mary", "Quinn", "333-33-3333", 19, 47);
        Employee e4 = new CommisionEmployee(
                "Nicole", "Dior", "444-44-4444", 0.15, 50000);
        Employee e5 = new SalariedEmployee(
                "Renwa", "Chanel", "555-55-5555", 1700);
        Employee e6 = new BaseEmployee(
                "Mike", "Davenport", "666-66-6666", 95000);
        Employee e7 = new CommisionEmployee(
                "Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);
        employeeList.add(e7);

        for (Employee e : employeeList){
            e.printInfo();
            System.out.print("\n-----------------------");
        }
    }
}
