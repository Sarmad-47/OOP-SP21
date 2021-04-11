
package lab7_ac3;


public class PointRunner {
    public static void main(String[] args) {
       Line line1=new Line(new Point(4,8),new Point(15,25));
       System.out.printf("The length of the line 1 is : %.2f", line1.Length()).println();
        
               
       Line line2= new Line(new Point(7,12),new Point(-11,-6));
     System.out.printf("The length of the line 2 is : %.2f", line2.Length()).println();
        
    }
    
}
