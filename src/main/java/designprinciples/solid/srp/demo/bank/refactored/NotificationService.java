package designprinciples.solid.srp.demo.bank.refactored;

public class NotificationService{
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
    }
}
