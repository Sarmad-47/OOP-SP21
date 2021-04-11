
package lab7_assignment1;


public class Pizza {
    private String pizzasize;
    private int cheesetoppings;
    private int pepperoniToppings;
    private int hamtoppings;
    
    Pizza(){
        
    }
    
    Pizza(String pizzasize,int cheesetoppings, int pepperoniToppings,int hamtoppings){
        this.pizzasize=pizzasize;
        this.cheesetoppings=cheesetoppings;
        this.pepperoniToppings=pepperoniToppings;
        this.hamtoppings=hamtoppings;
    }

    /**
     * @return the pizzasize
     */
    public String getPizzasize() {
        return pizzasize;
    }

    /**
     * @param pizzasize the pizzasize to set
     */
    public void setPizzasize(String pizzasize) {
        this.pizzasize = pizzasize;
    }

    /**
     * @return the cheesetoppings
     */
    public int getCheesetoppings() {
        return cheesetoppings;
    }

    /**
     * @param cheesetoppings the cheesetoppings to set
     */
    public void setCheesetoppings(int cheesetoppings) {
        this.cheesetoppings = cheesetoppings;
    }

    /**
     * @return the pepperoniToppings
     */
    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    /**
     * @param pepperoniToppings the pepperoniToppings to set
     */
    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    /**
     * @return the hamtoppings
     */
    public int getHamtoppings() {
        return hamtoppings;
    }

    /**
     * @param hamtoppings the hamtoppings to set
     */
    public void setHamtoppings(int hamtoppings) {
        this.hamtoppings = hamtoppings;
    }
    
    public double calcCost(){
        double pizza_Cost = 0;
        if(this.pizzasize.equalsIgnoreCase("Small")){
            pizza_Cost= 10 + (this.cheesetoppings*2) + (this.hamtoppings*2) + (this.pepperoniToppings*2); 
        }else if(this.pizzasize.equalsIgnoreCase("Medium")){
            pizza_Cost =12 + (this.cheesetoppings*2) + (this.hamtoppings*2) + (this.pepperoniToppings*2) ;
            
        } else if(this.pizzasize.equalsIgnoreCase("Large")){
              pizza_Cost =14 + (this.cheesetoppings*2) + (this.hamtoppings*2) + (this.pepperoniToppings*2) ;
        }
        
        return pizza_Cost;
    }
    
    public String getDescription(){
        return String.format("Pizza size = %s \nCheese Toppings = %d \nPepperoniToppings = %d \nHam Toppings = %d",pizzasize,cheesetoppings,pepperoniToppings,hamtoppings);
        
    }
}
