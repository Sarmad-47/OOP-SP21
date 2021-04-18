
package lab8_assignment1;


public class Book extends Publication {
    private int pages;
    


  
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    @Override
    public void Display(){
        super.Display();
        System.out.println("Pages = "+pages);
    }
}
