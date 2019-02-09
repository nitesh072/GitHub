package com.mycompany.app;

/**
 * Calculator
 *
 */
import java.util.*;
public class App
{
public  static void main(String[] ar)
{
int a,b;
Scanner sc = new Scanner(System.in);
char c;

do{
System.out.println("Enter ur choice ");
System.out.println("Enter 1 to Multiply");
System.out.println("Enter 2 to exit ");

c= sc.next().charAt(0);

switch(c)
{
 case '1': System.out.println("Enter two nos ");
         a = sc.nextInt();
         b = sc.nextInt();
         System.out.println("Result is  "+ (a*b));
         break;
 case '2': System.exit(0);
         break;

default: System.out.println("Invalid choice ");
         break;
}
}while(c!=2);

}
}

