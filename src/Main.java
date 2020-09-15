import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		//getting the string num from the user, passing it in as a int and converting that to a decimal
		int decimalNum = Integer.parseInt(input.nextLine());
		
		System.out.println("Your number in binary is: " + Main.fromDecToBinary(decimalNum));
		System.out.println("Your number in octal is: " + Main.decimalToOctal(decimalNum));
		System.out.println("Your number in decimal is: " + Main.decimalToDecimal(decimalNum));
		System.out.println("Your number in hexidecimal is: " + Main.decimalToHex(decimalNum));
	}
	
	public static String fromDecToBinary(int decimal)
	{
		String binary = "";
		//converting the decimal into an int and then dividing by two every time the loop happens
		for(int i = decimal; i > 0; i = i/2)
		{
			//finding the reminder
			int modulo = i%2;
			if(modulo == 1)
			{
				//adding to the binary in the correct order
				binary = "1" + binary;
			}
			else
			{
				//more adding to the binary
				binary = "0" + binary;
			}
		}
		return binary;
	}
	
	public static String decimalToOctal(int decimal)
	{
		String octal = "";
		//converting the decimal into an int and then dividing by two every time the loop happens
		while(decimal != 0)
		{
			//finding the reminder
			int modulo = decimal%8;
			octal = modulo + octal;
			decimal = decimal /8;
		}
		return octal;
	}
	
	public static String decimalToDecimal(int decimal)
	{
		String decimalReturn = "";
		//converting the decimal into an int and then dividing by two every time the loop happens
		while(decimal != 0)
		{
			//finding the reminder
			int modulo = decimal%10;
			decimalReturn = modulo + decimalReturn;
			decimal = decimal /10;
		}
		return decimalReturn;
		
	}
	
	public static String decimalToHex(int decimal)
	{
		String answer = ""; 
		String map = "0123456789ABCDEF";
		
		while(decimal != 0)
		{
			answer = map.charAt(decimal%16) + answer;
			decimal = decimal/16;
		}
		return answer;
	}
}


