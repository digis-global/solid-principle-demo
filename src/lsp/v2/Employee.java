package lsp.v2;

public abstract class Employee {

    public Employee(int id, String name) {

    }
    abstract int minimumSalary();

    abstract int calculateBonus(int salary);
}
