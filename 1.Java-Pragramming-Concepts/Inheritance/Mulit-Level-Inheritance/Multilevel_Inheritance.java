class PersonOne
{
	void walk()
	{
		System.out.println("Person is walking");
	}
}
class PersonTwo extends PersonOne
{
	void Sit()
	{
		System.out.println("Person is sitting");
	}
}
class PersonThree extends PersonTwo
{
	void speak()
	{
		System.out.println("Person is speaking");
	}
}

class Multilevel_Inheritance
{
	public static void main(String[] args)
	{
		PersonThree p = new PersonThree();
		p.walk();
		p.Sit();
		p.speak();
	}
}