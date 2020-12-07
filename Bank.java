import java.lang.*;

public class Bank implements CustomerOperations, EmployeeOperations {
    public static Customer customers[] = new Customer[500];
    public static Employee employees[] = new Employee[100];

    public void setCustomer(Customer customers[]) {
        this.customers = customers;
    }

    public Customer[] getCustomer() {
        return customers;
    }

    public void insertCustomer(Customer c) {
        int flag = 0;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = c;
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Customer Inserted");
        } else {
            System.out.println("Cannot Insert");
        }
    }

    public void showAllCustomers() {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                System.out.println("**********************************");
                System.out.println("Customer Name: " + customers[i].getName());
                System.out.println("Customer NID: " + customers[i].getNid());
                System.out.println("----------------------------------");
                customers[i].showAllAccounts();
                System.out.println("----------------------------------");
            }
        }
    }

    public Customer getCustomer(int nid) {
        Customer c = null;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                if (customers[i].getNid() == nid) {
                    c = customers[i];

                    break;
                }
            }
        }
        if (c != null) {
            System.out.println("Customer Found");
        } else {
            System.out.println("Customer Not Found");
        }
        return c;
    }

    public void removeCustomer(int nid) {
        getCustomer(nid);
        int flag = 0;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == getCustomer(nid)) {
                customers[i] = null;
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Customer Removed");
        } else {
            System.out.println("Cannot Remove");
        }
    }

    public void insertEmployee(Employee e) {
        int flag = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = e;
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Employee Inserted");
        } else {
            System.out.println("Cannot Insert");
        }
    }

    public void showAllEmployees() {
        System.out.println("//////////////////////////////////");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("Employee Name: " + employees[i].getName());
                System.out.println("Employee ID: " + employees[i].getEmpId());
                System.out.println("Salary: " + employees[i].getSalary());
                System.out.println();
            }
        }
        System.out.println("//////////////////////////////////");
    }

    public Employee getEmployee(int empId) {
        Employee e = null;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getEmpId() == empId) {
                    e = employees[i];
                    break;
                }
            }
        }
        if (e != null) {
            System.out.println("Employee Found");
        } else {
            System.out.println("Employee Not Found");
        }
        return e;
    }

    public void removeEmployee(int empId) {
        getEmployee(empId);
        int flag = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == getEmployee(empId)) {
                employees[i] = null;
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Employee Removed");
        } else {
            System.out.println("Cannot Remove");
        }
    }
}
