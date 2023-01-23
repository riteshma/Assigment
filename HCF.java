import java.util.Scanner;

class HCFOfNumber {

	public static void main(String[] args) {
		int hcf = 1;//initial assigned value

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number");
		int num1 = scan.nextInt(); //accept number

		System.out.println("Enter second number");
		int num2 = scan.nextInt(); //accept number
		scan.close();
		
		for(int i = 1; i <= num1 && i <= num2; ++i)
		{
			// Checks if i is factor of both integers
			if(num1 % i==0 && num2 % i==0)
				hcf = i;
		}

		System.out.printf("HCF of %d and %d is %d", num1, num2, hcf);

	}

}