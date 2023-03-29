package Review12;

import Review12.LowBalanceException;

public class LowBalanceExceptionTester {
    /*
  throw keyword is used to throw the object of an exception class
   */
    public static void main(String[] args) {
        transferBalance(10, 15);//call a method here
    }

    static void transferBalance(double accountBalance, double amountToTransfer) {
//method creation here
        if (amountToTransfer > accountBalance) {
            throw new LowBalanceException("You do not have enough balance");
        }
    }//
}