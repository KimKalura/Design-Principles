package designprinciples.solid.dip.exercise.wallet.refactored;

public class Main {

    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        Wallet wallet = new Wallet(debitCard);
        wallet.doPayment("some order", 5000);
    }
}
