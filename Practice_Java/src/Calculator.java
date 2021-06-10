import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		
		double num1, num2, ans = 0;
		char op;
		

		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		num1 = read.nextDouble();
		
		System.out.println("Enter Second Number: ");
		num2 = read.nextDouble();
		
		System.out.println("Choose any of the operator '+, - , x, /': ");
		op = read.next().charAt(0);
		
		switch(op) {
		
		case '+': ans = num1 + num2;
		   break;
		
		case '-': ans = num1 - num2;
		   break;
		   
		case 'x': ans = num1 * num2;
		   break;
		
		case '/': ans = num1 / num2;
		   break;
		
		}
		  
		System.out.println("Calculation is shown below: ");
		System.out.println("num1 " + " " + op + " " + "num2 " + "=" + " " + ans);
		
		

	}

}
