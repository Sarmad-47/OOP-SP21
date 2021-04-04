
package lab6_ha1;


public class SavingsAccountRunner {

   
    public static void main(String[] args) {
      SavingsAccount saver1=new SavingsAccount(2000.00);
      SavingsAccount saver2 = new SavingsAccount(3000.00);
        System.out.println("Total balance with interest rate 3 %");
      saver1.modifyInterestRate(3); 
       saver2.modifyInterestRate(3); 
       saver1.MonthlyInterest();
       saver2.MonthlyInterest();
         System.out.println("Total balance with interest rate 4 %");
        saver1.modifyInterestRate(4); 
       saver2.modifyInterestRate(4); 
       saver1.MonthlyInterest();
       saver2.MonthlyInterest();
        
    
    
    }
    
}
