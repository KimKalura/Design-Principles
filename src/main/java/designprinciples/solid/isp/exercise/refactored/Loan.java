package designprinciples.solid.isp.exercise.refactored;

public interface Loan extends Payment{
    void intiateLoanSettlement();
    void initiateRePayment();
}
