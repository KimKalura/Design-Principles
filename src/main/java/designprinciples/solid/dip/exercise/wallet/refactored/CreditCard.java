package designprinciples.solid.dip.exercise.wallet.refactored;

public class CreditCard implements Card{
    public void doTransaction(int amount){
        System.out.println("tx done with CreditCard");
    }
}

