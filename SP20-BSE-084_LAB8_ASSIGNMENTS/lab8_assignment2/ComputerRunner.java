
package lab8_assignment2;


public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer=new Computer(64,1600,24000,30);
        System.out.println("Computer details");
        System.out.println(computer);
        System.out.println("\n\n");
        System.out.println("Laptop details");
        Laptop laptop =new Laptop(64,3500,30000,20,16,8,8,4.5);
        System.out.println(laptop);
        
     
        
    }
    
}
