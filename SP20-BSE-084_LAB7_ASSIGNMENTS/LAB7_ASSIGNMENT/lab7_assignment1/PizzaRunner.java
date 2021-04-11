
package lab7_assignment1;

public class PizzaRunner {


    public static void main(String[] args) {
       Pizza pizza1=new Pizza("Large",1,1,2);
        System.out.println(pizza1.getDescription());
        System.out.println("The total cost is: $"+pizza1.calcCost());
        
        
        Pizza pizza2= new Pizza();
        pizza2.setPizzasize("Medium");
        pizza2.setCheesetoppings(2);
        pizza2.setPepperoniToppings(4);
        pizza2.setHamtoppings(2);
       // System.out.println(pizza2.getDescription());
       // System.out.println("The total cost is: $"+pizza2.calcCost());
        System.out.println("\n");
        PizzaOrder order=new PizzaOrder();
        order.calTotal();
    }
    
}
