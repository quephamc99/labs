package Lab07.Lab_07_1;

import java.util.Arrays;
import java.util.List;

public class EmployeeController {
    public static void main(String[] args) {
        Employee fulltimeEpmloyee_1 = new FulltimeEmployee("FE1",1);
        Employee fulltimeEpmloyee_2 = new FulltimeEmployee("FE2",1);
        Employee fulltimeEpmloyee_3 = new FulltimeEmployee("FE3",1);
        Employee contractEmployee_1 = new ContractEmployee("C1",2);
        Employee contractEmployee_2 = new ContractEmployee("C2",2);
        EmployeeController controller = new EmployeeController();
        controller.CalculateTotalSalaryOfAll(Arrays.asList(fulltimeEpmloyee_1, fulltimeEpmloyee_2, fulltimeEpmloyee_3,contractEmployee_1, contractEmployee_2));
    }

    public void CalculateTotalSalaryOfAll(List<Employee> employeeList){
        int total =0;
        for (Employee employee : employeeList) {
            total = total+ employee.getEtEmployeeSalary();
        }
        System.out.println(total);
    }
}
