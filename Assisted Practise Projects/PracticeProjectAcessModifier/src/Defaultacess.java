// default acess modifier
class A
{
	void display()
	{
		System.out.println("Default acess modifier ");
	}
}
public class Defaultacess {

	public static void main(String[] args) {
		System.out.println("default access modifier taken");
		A obj= new A();
		obj.display();
	}
}
