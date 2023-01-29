package designprinciples.solid.isp.exercise.dirty;

import java.util.ArrayList;
import java.util.List;

public class LoanPayment implements Payment {

    @Override
    public void initiatePayments() {
        throw new UnsupportedOperationException("This is not a bank payment");
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
        // ...
    }

    @Override
    public void initiateRePayment() {
        // ...
    }
}
