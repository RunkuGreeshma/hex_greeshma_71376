import java.util.*;

class Emp
{
	String name;
	int age;
	int salary;
	String designation;
	Scanner sc=new Scanner(System.in);
	
	System.out.print('Name:");
	name=sc.next();

	System.out.print('Desig:");
	desig=sc.next();
	}
}

class Clerk extends Emp
{
	Clerk()
	{
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+sal);
		System.out.println("Desig: "+desig);
	}
}
		
class Dev extends Emp
{
	Dev()
	{
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+sal);
		System.out.println("Desig: "+desig);
	}
}

class Manager extends Emp
{
	Manager()
	{
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+sal);
		System.out.println("Desig: "+desig);
	}
}

class Tester extends Emp
{
	Tester()
	{
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+sal);
		System.out.println("Desig: "+desig);
	}
}

class demo10
{
	public static void main(String args[])
	{
		Scannersc=new Scanner(System.in);
		
		System.out.print("Choice: ");
		int ch=sc.next();
		if(ch==1)
			{
				Clerk c=new Clerk()
				c.display();
			}
		if(ch==2)
			{
				Dev d=new Dev()
				c.display();
			}
		if(ch==3)
			{
				Manager e=new Manager()
				c.display();
			}
		if(ch==4)
			{
				Tester t=new Tester()
				c.display();
			}
		if(ch!=5)
		System.out.println("exit");
	}
}





