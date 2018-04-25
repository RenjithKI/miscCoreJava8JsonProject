package GENERICSSrelated;
import java.util.List;

public interface EmployeeService {

    public void addEmployee(Employee employee);

    public List listEmployeess();

    public Employee getEmployee(int empid);

    public void deleteEmployee(Employee employee);
}
