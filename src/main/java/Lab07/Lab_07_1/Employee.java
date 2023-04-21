package Lab07.Lab_07_1;

public class Employee {
    private String name;
    // employeetype = 1: Full-time employee; = 2: Contract employee
    private int employeetype =1;

    public Employee() {
    }

    public Employee(String name, int employeetype) {
        this.name = name;
        if(employeetype !=1 && employeetype !=2){
            throw new IllegalArgumentException("ERR | Invalid type for EmployeeType. (1-Full-time; 2-Contract");
        }
        this.employeetype = employeetype;
    }
    public int getEtEmployeeSalary(){
        return 0;
    }
}
