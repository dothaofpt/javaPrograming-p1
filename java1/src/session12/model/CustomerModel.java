package session12.model;

import session12.entity.Entity;
import java.util.ArrayList;
import java.util.List;

public class CustomerModel<T extends Entity<Integer>> {
    private List<T> customers = new ArrayList<>();

    public void addCustomer(T customer) {
        customers.add(customer);
    }

    public List<T> getAllCustomers() {
        return customers;
    }
}
