import java.util.Scanner;

class PrimeRecursion
{
	static int num;
	static int i = 2;
	static boolean flag = true;

	public static void main(String[] args)

	 {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Number: ");
		num = sc.nextInt();

		isPrime();
		System.out.println(flag? "prime": "not prime");
	}

	public static void isPrime()
	{
		//i++;

		if(i==num)
			return;
		if(num%i == 0)
		{
			flag = false;
			return;
		}

	i++;

		//if(i == num);
		//return;
		isPrime();
	}
}