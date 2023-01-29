package designprinciples.solid.dip.exercise.customer;

import java.util.List;
import java.util.Optional;

public class CustomerService {
    private Dao<Customer> customerDao;

    public CustomerService(Dao customerDao) {
        this.customerDao = customerDao;
    }


    public Optional<Customer> findById(int id){
        return customerDao.findById(id);
    }


    public List<Customer> findAll(){
        return customerDao.findAll();
    }


}
