
package lab8_assignment1;


public class Tape extends Publication{
    private int time;
    
   
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    
    @Override
    public void Display(){
        super.Display();
        System.out.println("Time = "+time+" minutes");
    }
    
}
