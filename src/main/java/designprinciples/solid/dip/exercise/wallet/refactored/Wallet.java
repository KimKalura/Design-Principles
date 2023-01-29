package designprinciples.solid.dip.exercise.wallet.refactored;

public class Wallet {
    private Card card;

    public Wallet(Card card) {
        this.card = card;
    }

    public void doPayment(String order, int amount) {
        card.doTransaction(amount);
    }

}
