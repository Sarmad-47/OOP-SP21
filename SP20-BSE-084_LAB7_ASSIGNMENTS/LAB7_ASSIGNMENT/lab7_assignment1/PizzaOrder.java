package lab7_assignment1;

public class PizzaOrder {

    private Pizza pizza1, pizza2, pizza3;

    PizzaOrder() {

        this.pizza1 = new Pizza("small", 2, 4, 5);
        this.pizza2 = new Pizza("Medium", 1, 1, 2);
        this.pizza3 = new Pizza("large", 1, 5, 1);
    }

  public void calTotal() {
        double sum = pizza1.calcCost() + pizza2.calcCost()+ pizza3.calcCost();
        System.out.println(pizza1.getDescription());
        System.out.println(pizza2.getDescription());
        System.out.println(pizza3.getDescription());
        System.out.println("There are total 3 pizza");
        System.out.println("Total sum is: " + " $" + sum);
    }
}
