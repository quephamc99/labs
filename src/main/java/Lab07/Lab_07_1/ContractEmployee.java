package Lab07.Lab_07_1;

public class ContractEmployee extends Employee{
    public ContractEmployee(String name, int employeetype) {
        super(name, employeetype);
    }

    @Override
    public int getEtEmployeeSalary() {
        return 40000;
    }
}
