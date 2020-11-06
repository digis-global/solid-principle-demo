package lsp.v2;

public class ContractEmployee extends CEmployee {
    public ContractEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    int minimumSalary() {
        return 100;
    }

}
