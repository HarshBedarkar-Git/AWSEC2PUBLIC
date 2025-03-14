import java.util.*;

public class MyFirstProgram{
public static void main(String args[]){
System.out.println("Hi Java");
int a;
int b;
System.out.println("Enter two number");
Scanner sc = new Scanner(System.in);
a= sc.nextInt();
b=sc.nextInt();

System.out.println("\n Sum of two numbers is "+a+"+"+b+"="+(a+b));
System.out.println("\n Multiplication of two numbers is "+a+"x"+b+"="+(a*b));
System.out.println("\n Subtraction of two mumber is "+a+"-"+b+"="+(a-b));
}
}
