//write a program to perfrome Addition,substraction,multiplication between class
class Addition
{
	static void sum()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
		
}

class Subtraction
{
	static void diff()
	{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}
		
}

class Multiplication
{
	static void product()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
		
}


class Calculater
{
	public static void main(String[] args)
	{
		Multiplication.product();
		Subtraction.diff();
		Addition.sum();
	}
		
}