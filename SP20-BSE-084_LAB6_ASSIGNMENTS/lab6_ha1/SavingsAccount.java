
package lab6_ha1;


public class SavingsAccount {
    public static int annual_Interest_Rate;
    private double savings_Balance;
    
    SavingsAccount(double savings_Balance){
        this.savings_Balance=savings_Balance;
    }
    public void MonthlyInterest(){
        double balance=(savings_Balance * annual_Interest_Rate)/12;
        double total_Balance= balance + savings_Balance;
        System.out.println("Balance: "+total_Balance);
    }
    public static void modifyInterestRate(int Interest_Rate){
        annual_Interest_Rate= Interest_Rate;
    }
}
