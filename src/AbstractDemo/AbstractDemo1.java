package AbstractDemo;

class AbstractDemo1
{
	public static void main(String[] arggs)
	{
	Circle c=new Circle(5.0);
	System.out.println(c.calculateArea());
	c.setColor("red");

	Square s=new Square(4.0,4.0);
	System.out.println(s.calculateArea());
	s.setColor("black");
	}
}
