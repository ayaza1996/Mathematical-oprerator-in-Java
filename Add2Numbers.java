import java.util.Scanner;

public class Add2Numbers {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.println("Enter the first number: ");
    int num1 = input.nextInt();
    System.out.println("Enter the second number: ");
    int num2 = input.nextInt();
    int sum = num1+num2;
    System.out.println();
    System.out.println("Sum: "+sum);
    int multiplication = num1*num2;
    System.out.println("Multiply: "+multiplication);
    int division = num1/num2;
    System.out.println("div: "+division);
    int module = num1%num2;
    System.out.println("modulo: "+module);
    
    
    
  }
}