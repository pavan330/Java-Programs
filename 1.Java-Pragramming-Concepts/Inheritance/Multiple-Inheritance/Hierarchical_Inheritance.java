class PersonOne
{
	void walk()
	{
		System.out.println("Person is walking");
	}
}
class Persontwo extends PersonOne
{
	void sit()
	{
		System.out.println("Person is sitting");
	}
}
class PersonThree extends PersonOne
{
	void speak()
	{
		System.out.println("Person is speaking");
	}
}
class Hierarchical_Inheritance
{
	public static void main(String[] args)
	{
		PersonThree p = new PersonThree();
		p.walk();
		//p.sit();
		p.speak();
	}
}