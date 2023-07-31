import java.util.Scanner;
public class CalculatorBrain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa el primer número: ");
		float num1 = sc.nextFloat();
		System.out.print("Ingresa el segundo número: ");
		float num2 = sc.nextFloat();
		System.out.print("Ingresa la operación (+ - / *): ");
        String operacion = sc.next();
        float res;

		switch(operacion) {
		case "+": 
			res = suma(num1, num2);
			break;
		case "-": 
			res = resta(num1, num2);
			break;
		case "*": 
			res = mult(num1, num2);
			break;
		case "/": 
			res = div(num1, num2);
			break;
		default: 
			res = 0;
			break;
		}
		
		System.out.println(num1 + " " + operacion + " " + num2 + " = " + res);

		

	}//main
	
	public static float suma(float num1, float num2) {
		System.out.println(num1+num2);
		return (num1 + num2);
	}
	
	public static float resta(float num1, float num2) {
		return (num1 - num2);
	}

	public static float mult(float num1, float num2) {
		return (num1 * num2);
	}

	public static float div(float num1, float num2) {
		return (num1 / num2);
	}


}//CalculatorBrain
