package ocp.v1;

public class EmployeeManager {
    void calculateSalary() {
        Employee employee1 = new Employee(1, "Kaal Maks", "permanant");
        employee1.calculateBonus(10000);

        Employee employee2 = new Employee(1, "Lenin", "tempary");
        employee1.calculateBonus(2000);
    }
}
