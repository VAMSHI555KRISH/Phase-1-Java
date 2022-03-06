package ComPackages;
//parameterized constructor
class Emp{
	int id;
	String name;

	Emp(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class Parameter {
public static void main(String[] args) {

	Emp emp1=new Emp(516,"Vamshi");
	Emp emp2=new Emp(254,"Shiva");
	emp1.display();
	emp2.display();
		}
}