package designprinciples.solid.isp.exercise.dirty;

import java.util.ArrayList;
import java.util.List;

public class BankPayment implements Payment {

    @Override
    public void initiatePayments() {
        // ...
    }

    @Override
    public Object status() {
        // ...
        return new Object();
    }

    @Override
    public List<Object> getPayments() {
        // ...
        return new ArrayList<>();
    }

    @Override
    public void intiateLoanSettlement() {
        throw new UnsupportedOperationException("This is not a loan payment");
    }

    @Override
    public void initiateRePayment() {
        throw new UnsupportedOperationException("This is not a loan payment");
    }
}
