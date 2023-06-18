// Java program for simple calculator
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;


public class BasicCalculator
 {
    public static void main(String[] args)
	 {
		
		double num1, num2;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		num1 = obj.nextDouble();
		num2 = obj.nextDouble();
		System.out.println("Enter the operator (+,-,*,/,%):");
		char op = obj.next().charAt(0);
		double o = 0;
		switch (op)
		{
		case '+':
			o = num1 + num2;
			break;
		case '-':
			o = num1 - num2;
			break;
		case '*':
			o = num1 * num2;
			break;
     	case '/':
			o = num1 / num2;
			break;
		case '%':
            o=num1 % num2;
            break;			
		default:
			System.out.println("You enter wrong input");
		}
		System.out.println("The final result:");
		System.out.println();
		System.out.println(num1 + " " + op + " " + num2
						+ " = " + o);
	}
}
