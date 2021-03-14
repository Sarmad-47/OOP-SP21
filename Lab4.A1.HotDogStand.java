
package lab4assignment;

public class HotDogStand {
   private int id;
   private int hotdogsold;
   public HotDogStand(int id,int hotdogsold){
       this.id=id;
       this.hotdogsold=hotdogsold;
       
    
}
   public void justSold(){
       hotdogsold++;
   }
    public int getId(){
        return id;
        
    }
    
    public int getHotdogsold(){
        return hotdogsold;
        
    }
}
