package lsp.v2;

public class EmployeeManager {
    void calculateSalary() {
        Employee employee1 = new PermanantEmployee(1, "Kaal Maks");
        employee1.calculateBonus(10000);

        Employee employee2 = new TemporaryEmployee(2, "Lenin");
        employee2.calculateBonus(2000);

        CEmployee employee3 = new ContractEmployee(3, "Lenin");

    }
}
