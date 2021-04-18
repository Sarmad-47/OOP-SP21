
package lab8_assignment2;


public class Computer {
    private double wordSize;
    private double memorySize;
    private double storageSize;
    private double speed;
    
    Computer(){
        wordSize=0;
        memorySize=0;
        storageSize=0;
        speed=0;
    }
    Computer(double wordSize,double memorySize,double storageSize,double speed){
        this.wordSize=wordSize;
        this.memorySize=memorySize;
        this.storageSize=storageSize;
        this.speed=speed;
        
    }


    public double getWordSize() {
        return wordSize;
    }


    public void setWordSize(double wordSize) {
        this.wordSize = wordSize;
    }

 
    public double getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(double memorySize) {
        this.memorySize = memorySize;
    }


    public double getStorageSize() {
        return storageSize;
    }

   
    public void setStorageSize(double storageSize) {
        this.storageSize = storageSize;
    }


    public double getSpeed() {
        return speed;
    }

  
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    
    @Override
   public String toString(){
       return String.format("Word Size = %f bits \nMemory Size = %f megabytes \nStorage Size = %f megabytes \nSpeed = %f megahertz",wordSize,memorySize,storageSize,speed);
   }
    
}
