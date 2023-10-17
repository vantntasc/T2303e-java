package session7;

public  class VISAAccount extends  BankAccount{
    public static final String CART_TYPE = "VISA";
    public static final int CREDIT_LIMIT  =  100000000;

    @Override
    public void withDraw(int num) {
        System.err.println("WithDrawing from account "+ getAccountNumber() + " , cardType : " + CART_TYPE);
        if(getBalance() + CREDIT_LIMIT > num){
            System.err.println("Not enough money ..");
            return;
        }
        super.setBalance(getBalance() - num);
    }
}
