package designprinciples.solid.dip.exercise.wallet.dirty;

public class Main {

    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        Wallet wallet = new Wallet(debitCard);
        wallet.doPayment("some order", 5000);
    }
}
