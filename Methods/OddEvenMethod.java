class OddEvenMethod
{
	public static void main(String[] args) 

	{
		int[] numbers = {1,2,3,4,5,6,7};
		for(int num : numbers)
		{

        evenOdd(num);

		/*evenOdd(1);
		evenOdd(2);
		evenOdd(3);
		evenOdd(4);
		evenOdd(5);
		evenOdd(6);
		evenOdd(7);
		evenOdd(8);*/
	}

}
    public static void evenOdd(int num)

    {
    	if (num % 2 == 0)

    	{
    		System.out.println(num + "- Even Number");
    	}

    	else

    	{
          System.out.println(num +  "- Odd Number");
    	}
    }
}