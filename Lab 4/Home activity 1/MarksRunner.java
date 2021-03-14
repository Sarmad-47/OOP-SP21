
package lab4ha1;


public class MarksRunner {

    
    public static void main(String[] args) {
     Marks m=new Marks();
     m.setMaths(67);
     m.setEnglish(87);
     m.setUrdu(77);   
     System.out.println("English marks: "+m.getEnglish());
     System.out.println("Maths marks: "+m.getMaths());
     System.out.println("Urdu marks: "+m.getUrdu());
     int sum = m.CalculateSum();
     System.out.println("The sum of these marks are = " + sum);
     System.out.println("The percentage of these marks are = "+m.CalculatePercentage(sum));
    }
    
}
