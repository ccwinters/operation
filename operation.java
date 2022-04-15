import java.util.Scanner;
import java.util.InputMismatchException;
/* import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
*/
// import org.junit.jupiter.api.Test;


public class Main {
	
	public String mathFunction (int Number1, int Number2, int Number3) 
	{
		System.out.print("(" + Number1 + ", " + Number2 + ", " + Number3 + "): ");
		
		int sum = Number1 + Number2;
		int difference = Number1 - Number2;
		int product = Number1 * Number2;
		int quotient = 0;
		int modulus = 0;
		try {
			quotient = Number1 / Number2;
			modulus = Number1 % Number2;
		} catch (ArithmeticException e) { System.out.print("Zero cannot be a divisor in division operation nor a denominator in a modulo operation as division by zero is undefined. "); }	
	/*	if (Number2 == 0) {
          throw new ArithmeticException("Zero cannot be a divisor as division by zero is undefined");}
   		else {
	 quotient = Number1 / Number2; } */
/*	   int modulus = 0;
	   try {
			modulus = Number1 % Number2;
		} catch (ArithmeticException e) { System.out.print("Zero cannot be a divisor in modulo operation as division by zero is undefined. "); } */
	
		if (Number3 == sum) {
			System.out.print("+"); }
	    
	    if (Number3 == difference) {
			System.out.print("-"); }
   	 
   	 if (Number3 == product) {
			System.out.print("*"); }
   		
   	if (Number3 == quotient) {
			System.out.print("/"); }
			
		if (Number3 == modulus) {
			System.out.print("%"); }
			
		if (Number3 != sum && Number3 != difference && Number3 != product && Number3 != quotient && Number3 != modulus) { System.out.print("None"); }
		
		System.out.println();
		return "done";
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		
		System.out.println("Initial Tests");
		m.mathFunction(1, 2, 3);
		m.mathFunction(2, 2, 4);
		m.mathFunction(3, -3, -9);
		m.mathFunction(1, 2, -1);
		m.mathFunction(3, 3, 1);
		m.mathFunction(7, 1, 11);
		System.out.print(System.lineSeparator());
		System.out.println("One Tests");
		m.mathFunction(1, 1, 1);
		m.mathFunction(-1, -1, 0);
		m.mathFunction(-1, 1, -1);
		m.mathFunction(1, 1, 0);
		m.mathFunction(-1, 1, 1);
		m.mathFunction(1, 1, -1);
			System.out.print(System.lineSeparator());
		System.out.println("Zero Tests");
		m.mathFunction(0, 2, 0);
		m.mathFunction(0, 3, 3);
		m.mathFunction(3, 3, 0);
		m.mathFunction(0, 5, 10);
		m.mathFunction(4, 4, 0);
		m.mathFunction(0, 0, 0);
		m.mathFunction(1, 0, 1);
		System.out.print(System.lineSeparator());
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
         System.out.print("Enter 3 Numbers: ");
try {
     int num1 = myObj.nextInt();  // Read user input
     int num2 = myObj.nextInt();  // Read user input
     int num3 = myObj.nextInt();  // Read user input
     
    m.mathFunction(num1, num2, num3);
    		} catch (InputMismatchException e) { System.out.print("Invalid input(s). One or more of the first 3 inputs are not integers"); }
    		
	}
}