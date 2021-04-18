package lab8_assignment2;

public class Laptop extends Computer {

   private double length;
    private double width;
    private double height;
    private double weight;
    
    Laptop(){
        super();
        length=0;
        width=0;
        height=0;
        weight=0;
    }
    Laptop(double wordSize,double memorySize,double storageSize,double speed,double length,double width,double height,double weight){
        super(wordSize,memorySize,storageSize,speed);
        this.length=length;
        this.width=width;
        this.height=height;
        this.weight=weight;
        
    }

    
    public double getLength() {
        return length;
    }

  
    public void setLength(double length) {
        this.length = length;
    }

  
    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
    }

   
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

   
    public double getWeight() {
        return weight;
    }

   
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
   @Override
    public String toString(){
        
        return super.toString() + "\n"+ String.format("Length = %f \nWidth = %f \nHeight = %f \nWeight = %f", length,width,height,weight) ;
    }
}
