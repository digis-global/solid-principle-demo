package lsp.v1;

public class EmployeeManager {
    void calculateSalary() {
        Employee employee1 = new PermanantEmployee(1, "Kaal Maks");
        employee1.calculateBonus(10000);

        Employee employee2 = new TemporaryEmployee(1, "Lenin");
        employee1.calculateBonus(2000);

    }
}
