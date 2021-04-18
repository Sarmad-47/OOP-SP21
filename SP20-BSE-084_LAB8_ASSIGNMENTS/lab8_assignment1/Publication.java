
package lab8_assignment1;


public class Publication {
    private String title;
    private double price;
    



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

 
    public double getPrice() {
        return price;
    }

   
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void Display(){
        System.out.println("Title = "+title+"\n"+"Price = $"+price);
    }
    
}
