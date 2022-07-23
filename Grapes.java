//use static class between two class
class Apple
{
	static int a=10;
	static void add()
	{ 
	System.out.println("Hey add");
	}
}
class Mango
{
	static void sub()
	{ 
	System.out.println("Hey sub");
	}
}
class Grapes
{
	public static void main(String[] args)
	{
		Apple.add();
		Mango.sub();
		System.out.println(Apple.a);
	}
}