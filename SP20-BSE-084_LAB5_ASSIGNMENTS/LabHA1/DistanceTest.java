package labactivites;



public class DistanceTest {

    public static void main(String[] args) {
        Distance d1=new Distance();
        Distance d2=new Distance(12,7);
        Distance d3 = new Distance();
        d3 = d3.Add(d2);
        System.out.println(d1.toString());
        System.out.println(d2.toString());
         System.out.println(d3.toString());
         
        
        
    }

}
