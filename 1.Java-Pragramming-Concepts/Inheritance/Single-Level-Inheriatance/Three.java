class first
{
void one()
{
System.out.print("This is a parent class");
}
}
class Second extends first
{
void two()
{
System.out.print("This is a second class");
}
}

class Three
{
public static void main(String[] args)
{
Second s = new Second();
s.two();
s.one();
}
}



 