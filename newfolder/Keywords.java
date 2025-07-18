package Wipro_selenium;
import java.util.Scanner;

public class Keywords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt(),sum=a+b;
		System.out.println("Sum :"+sum);
		sc.close();
	}

	
}
