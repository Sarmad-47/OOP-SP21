
package lab7_ac3;

public class Line {
    private Point startPoint;
    private Point endPoint;
    
    
    Line(Point startPoint, Point endPoint){
        this.startPoint= startPoint;
        this.endPoint= endPoint;
    }
    
    public double Length(){
        return Math.sqrt(Math.pow(startPoint.getX()-endPoint.getX(), 2) + Math.pow(startPoint.getY()-endPoint.getY(), 2));
        
    }
}
