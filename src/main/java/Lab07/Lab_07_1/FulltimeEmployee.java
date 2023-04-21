package Lab07.Lab_07_1;

public class FulltimeEmployee extends Employee{
    public FulltimeEmployee(String name, int employeetype) {
        super(name, employeetype);
    }

    @Override
    public int getEtEmployeeSalary() {
        return 50000;
    }
}
