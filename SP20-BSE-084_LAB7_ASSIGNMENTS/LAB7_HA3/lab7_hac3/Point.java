
package lab7_ac3;


public class Point {
    private double x;
    private double y;
    
    Point(int x,int y){
        this.x= x;
       this.y= y;
    }

   
    public double getX() {
        return x;
    }


    public void setX(double x) {
        this.x = x;
    }

    
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    public void display(){
        System.out.println("The x cordinate is: "+ x+"\t"+"The y cordinate is: "+y);
    }
}
