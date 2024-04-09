class ExampleMethod1
{


	public static void main(String [] args)
	{
		System.out.println("main starts");
		ramesh();
		System.out.println("main ends");

	}


	public static void ramesh()
	{
		System.out.println("ramesh starts");
		suresh();
		System.out.println("ramessh ends");
	
	}


    public static void suresh()
    {
    	System.out.println("suresh starts");
    	System.out.println("suresh ends");
    }


    public static void mahesh()
    {
    	System.out.println("mahesh starts");
    	ramesh();
    	System.out.println("mahesh ends");
    }



}