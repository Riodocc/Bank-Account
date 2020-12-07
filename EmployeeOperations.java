import java.lang.*;

interface EmployeeOperations
{
    void insertEmployee(Employee e);
    void removeEmployee(int empId);
    Employee getEmployee(int empId);
    void showAllEmployees();
}
