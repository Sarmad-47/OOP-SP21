package lab6_a1;

public class Calculator {

  public static double num1;
  public static double num2;
 
  public static void Sum(){
      double sum=num1+num2;
      System.out.println("Sum is: "+sum);
  }
  public static void  Multiply(){
      double multiply=num1*num2;
      System.out.println("Multiplication of two numbers is: "+multiply);
  }
  public static void Divide() {
      double divide=num1 / num2;
      System.out.println("The division of two numbers is: "+divide);
  } 
  public static void Modulus (){
      double modulus=num1 % num2;
      System.out.println("The modulus of two numbers is: "+modulus);
  } 
  public static void Sin (){
      double number1=Math.sin(num1);
       double number2=Math.sin(num2);
       System.out.println("Sin of number1: "+number1+"\n"+"Sin of number2: "+number2);
  } 
  public static void Cos(){
      double number1=Math.cos(num1);
       double number2=Math.cos(num2);
       System.out.println("Cos of number1: "+number1+"\n"+"Cos of number2: "+number2);
  } 
  public static void Tan (){
      double number1=Math.tan(num1);
       double number2=Math.tan(num2);
       System.out.println("Tan of number1: "+number1+"\n"+"Tan of number2: "+number2);
  } 
}
