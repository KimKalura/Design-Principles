package designprinciples.solid.isp.exercise.refactored;

import java.util.ArrayList;
import java.util.List;

public class LoanPayment implements Loan {

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
