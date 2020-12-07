import java.lang.*;

interface CustomerOperations
{
    void insertCustomer(Customer c);
    void removeCustomer(int nid);
    Customer getCustomer(int nid);
    void showAllCustomers();
}
