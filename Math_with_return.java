//write a program to calculate Addition of two number by useing method with arguments between class.
class Addition
{
	static int sum()
	{
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
		
}



class Math_with_return
{
	public static void main(String[] args)
	{
		int x=Addition.sum();
		System.out.println(x);
	}
		
}