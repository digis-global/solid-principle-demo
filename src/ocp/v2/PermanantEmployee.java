package ocp.v2;

public class PermanantEmployee  extends Employee{

    public PermanantEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    int calculateBonus(int salary) {
        return salary/7;
    }
}
