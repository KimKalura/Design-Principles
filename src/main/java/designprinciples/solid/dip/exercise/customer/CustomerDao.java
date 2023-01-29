package designprinciples.solid.dip.exercise.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CustomerDao implements Dao<Customer> {

    Map<Integer, Customer > customerDB;

    public CustomerDao(Map<Integer, Customer> customerDB) {
        this.customerDB = customerDB;
    }

    @Override
    public Optional<Customer> findById(int id){
        return Optional.ofNullable(customerDB.get(id));
    }

    @Override
    public List<Customer> findAll(){
        return new ArrayList<>(customerDB.values());
    }
}
