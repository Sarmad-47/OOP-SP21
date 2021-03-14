
package lab4ha2;


public class Account {
    private double balance;
    private int AccountNumber;
    public Account(){
        balance=35000;
        AccountNumber=1098765432;
    }
    public Account(int Account, double bal){ 
        AccountNumber=Account;
        balance=bal;
    }
    public void withdrawCash(double amountleft){
        setBalance(getBalance() - amountleft);
        
    }
    public void depoistCash(double amountadd){
        setBalance(getBalance() + amountadd);
        
    }
    public void display(){
        System.out.println("Account number= " + getAccountNumber() + "  Balance=  "+ getBalance());
    }

    
    public double getBalance() {
        return balance;
    }

    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public int getAccountNumber() {
        return AccountNumber;
    }

    
    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }
}


