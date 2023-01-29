package designprinciples.solid.dip.exercise.wallet.refactored;

public class DebitCard implements Card{
    public void doTransaction(int amount){
        System.out.println("tx done with DebitCard");
    }
}
