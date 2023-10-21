package session7;

import session7.exception.NotEnoughMoneyException;

public class JCBBankAccount extends BankAccount {
    public static final String CART_TYPE = "JCB";
    public static final int MIN_BALANCE =  50000;
    @Override
    @Deprecated
    @SuppressWarnings("i don't care")
    public void withDraw(int num) throws NotEnoughMoneyException {
        System.err.println("WithDrawing from account "+ getAccountNumber() + " , cardType : " + CART_TYPE);
        if(num > getBalance() - MIN_BALANCE){
            throw  new NotEnoughMoneyException("Not enought money , accountNumber  :"+ getAccountNumber()
            + " , banlance  : " + getBalance() + " withDraw : " + num + " , timestamp : " + System.currentTimeMillis());
        }
        super.setBalance(getBalance() - num);
    }
}
