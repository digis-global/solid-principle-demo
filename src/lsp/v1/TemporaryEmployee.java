package lsp.v1;

public class TemporaryEmployee extends Employee {
    public TemporaryEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    int calculateBonus(int salary) {
        return salary/5;
    }
}
