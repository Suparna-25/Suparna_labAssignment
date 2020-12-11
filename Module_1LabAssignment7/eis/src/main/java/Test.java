
class Shape{
	public static void display(){
		System.out.println("Display Of Shape");
	}
}
class Circle extends Shape{
	public static void display(){
		System.out.println("Display Of Circle");
	}
}
public class Test{
	public static void main(String args[])
	{
		Shape s=new Shape();
		Circle c=new Circle();
		Shape s1=new Circle();
		s.display();  
		c.display();
		s1.display();
	}
}