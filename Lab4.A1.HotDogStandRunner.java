package lab4assignment;

public class HotDogStandRunner {

    public static void main(String[] args) {
        //Stand 1
        HotDogStand dog1 = new HotDogStand(4578, 20);
        System.out.println("Stands ID" + "\t" + "Hot Dogs Sold");
        dog1.justSold();
        dog1.justSold();
        dog1.justSold();
        System.out.println(dog1.getId() + "\t" + "\t" + dog1.getHotdogsold());
        
        //Stand 2 
        HotDogStand dog2 = new HotDogStand(3871, 5); 
        dog2.justSold();
        dog2.justSold();
        System.out.println(dog2.getId() + "\t" + "\t" + dog2.getHotdogsold());
        
        //Stand 3
        HotDogStand dog3 = new HotDogStand(1122, 31);
        dog3.justSold();
        dog3.justSold();
        dog3.justSold();
        dog3.justSold();
        dog3.justSold();
        dog3.justSold();
        System.out.println(dog3.getId() + "\t" + "\t" + dog3.getHotdogsold());
    }

}
