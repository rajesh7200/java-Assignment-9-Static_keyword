//write a program to calculate area of circle and to perfrome Addition between class.
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

class Circle
{
	static void area()
	{
		int r=10;
		double res=3.142*r*r;
		System.out.println(res);
	}
		
}



class Math
{
	public static void main(String[] args)
	{
		Circle.area();
		Addition.sum();
	}
		
}