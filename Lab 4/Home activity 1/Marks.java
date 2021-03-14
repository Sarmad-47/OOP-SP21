
package lab4ha1;


public class Marks {
    private int maths,english,urdu;
    public Marks(){
        maths=87;
        english=74;
        urdu=47;
    }
    public Marks(int maths,int english,int urdu){
        this.maths=maths;
        this.english=english;
        this.urdu=urdu;
        
    }

    
    public int getMaths() {
        return maths;
    }

    
    public void setMaths(int maths) {
        this.maths = maths;
    }

    
    public int getEnglish() {
        return english;
    }

   
    public void setEnglish(int english) {
        this.english = english;
    }

   
    public int getUrdu() {
        return urdu;
    }

    public void setUrdu(int urdu) {
        this.urdu = urdu;
    }
    public int CalculateSum() {
        int sum =maths + english + urdu;
        return sum;
    } 
    public double CalculatePercentage(int sum) {
        double percentage =(sum/300.0)*100;
        System.out.println("Sum = "+sum+" percentage "+percentage);
        return  percentage;
    }
    
}
