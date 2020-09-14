import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("What decimal number would you like to see as a binary number?");
		//getting the string num from the user, passing it in as a int and converting that to a decimal
		double decimalNum = (double)Integer.parseInt(input.nextLine());
		
		System.out.println("Your number in binary is: " + Main.fromDecToBinary(decimalNum));
	}
	
	public static String fromDecToBinary(double decimal)
	{
		String binary = "";
		//converting the decimal into an int and then dividing by two every time the loop happens
		for(int i = (int)decimal; i > 0; i = i/2)
		{
			//finding the reminder
			double modulo = i%2;
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
}

