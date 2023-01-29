package designprinciples.solid.lsp.exercise.bankaccount.dirty;

import java.math.BigDecimal;

public abstract class Account {

    protected abstract void deposit(BigDecimal amount);

    protected abstract void withdraw(BigDecimal amount);
}
