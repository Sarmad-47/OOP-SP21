package lab4ha2;

public class AccountRunner {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(41000);
        acc.withdrawCash(5000);
        acc.depoistCash(2000);

       double balance =acc.getBalance();
        acc.setAccountNumber(1697745511);
        acc.getAccountNumber();
        acc.display();
        
        Account acc1 = new Account(1697725412, 42000.00);
        acc1.withdrawCash(3000);
        acc1.depoistCash(2000);
        acc1.setBalance(balance);
        acc1.getBalance();
        acc1.display();
           
    }

}
