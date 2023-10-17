package session7;

import session7.exception.NotEnoughMoneyException;

public abstract class BankAccount {
    private int balance;
    private String accountNumber;

    public void deposit(int num){
        // same for all cardType
        this.balance += num;
    }
    // jcb , hybrid : 500, 1000 - visa : free
    public abstract void withDraw(int num) throws NotEnoughMoneyException;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
