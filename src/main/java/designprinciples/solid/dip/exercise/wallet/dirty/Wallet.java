package designprinciples.solid.dip.exercise.wallet.dirty;

public class Wallet {
    private DebitCard debitCard;

    public Wallet(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void doPayment(String order, int amount) {
        debitCard.doTransaction(amount);
    }

}
