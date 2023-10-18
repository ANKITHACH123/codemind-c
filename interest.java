/*import java.io.*;
class interest
{
   public static void main(String args[])throws Exception
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int p,t,r;
	float i;
	p=Integer.parseInt(br.readLine());
	t=Integer.parseInt(br.readLine());
	r=Integer.parseInt(br.readLine());
	i=(float)(p*t*r)/100;
	System.out.println(i);
	}
} 

import java.util.*;
class Netsalary
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int BS,HRA,DA,TA,PF,PT,GS,NS;
	BS=sc.nextInt();
	HRA=sc.nextInt();
	DA=sc.nextInt();
	TA=sc.nextInt();
	PF=sc.nextInt();
	PT=sc.nextInt();
	GS=BS+HRA+DA+TA;
	NS=GS-(PF+PT);
	System.out.println(NS);
	sc.close();	
	}
}

import java.util.*;
class Employee
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   int empid;
	   String ename,desg,company;
	   float salary;
	   char gender;
	   empid=sc.nextInt();
	   sc.nextLine();
	   ename=sc.nextLine();
	   gender=sc.nextLine().charAt(0);
	   desg=sc.nextLine();
	   salary=sc.nextFloat();
	   sc.nextLine();
	   company=sc.nextLine();
	   System.out.println(empid);
	   System.out.println(ename);
	   System.out.println(gender);
	   System.out.println(desg);
	   System.out.println(salary);
	   System.out.println(company);
	   sc.close();

	}
}

import java.util.*;
class Student
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int rollno;
	String name, branch;
	char gender;
	rollno=sc.nextInt();
	sc.nextLine();
	name=sc.nextLine();
	branch=sc.nextLine();
	gender=sc.nextLine().charAt(0);

	System.out.println("the student details are:");

	System.out.println(rollno);
	System.out.println(name);
	System.out.println(branch);
	System.out.println(gender);

   }   

}

class Commandline1
{
  public static void main(String args[])
  {
	//System.out.println(args[0]);
        //System.out.println(args[1]);
        //System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
        
        int sum=0;
	for(int i=0;i<args.length;i++)
	   //  System.out.println("args["+i+"] = "+args[i]);
           sum+=Integer.parseInt(args[i]);
        System.out.println(sum);
   
  }
} 

class bitwise
{
	public static void main(String args[])
	{
		 int a=6,b=5;
		 System.out.println();
	}
}

import java.util.*;
class ter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int age;
		age=sc.nextInt();
		String res=age>=18?"eligiible":"not eligible";
		System.out.println(res);
	}
}

import java.util.*;
class operators
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		sc.nextLine();
		b=sc.nextInt();
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(true && true);
	}
}

import java.util.*;
class vowel
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		ch=sc.nextInt();
		switch(ch)
		{
			case 3:
			case 4:
			case 5:
				System.out.println("SUMMER");
				break;
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("RAINY");
				break;
			case 1:
			case 2:
			case 10:
			case 11:
			case 12:	
				System.out.println("WINTER");
				break;
			default:
				System.out.println("Enter a Valid month");
				break;
		}
		/*if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println(ch+" is a vowel");
		}
		else
		{
			System.out.println(ch+" is consonant");
		}
		sc.close();
	}
}

import java.util.*;
import java.lang.*;
class quad
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		float d,x1,x2;
		a=sc.nextInt();
		sc.nextLine();
		b=sc.nextInt();
		sc.nextLine();
		c=sc.nextInt();
		d=((b*b)-(4*a*c));
		if(d>0)
		{
			x1=(float)(-b+Math.sqrt(d))/(2*a);
			x2=(float)(-b-Math.sqrt(d))/(2*a);
			System.out.println(x1+" "+x2);
		}
		sc.close();
	}
}

import java.util.*;
class tri
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		sc.nextLine();
		b=sc.nextInt();
		sc.nextLine();
		c=sc.nextInt();
		sc.nextLine();
		if((a==b) && (b==c) && (c==a)){
			System.out.println("Equilateral");
		}
		else if((a==b) || (b==c) || (c==a)){
			System.out.println("Isoceles");
		}
		else{
			System.out.println("Scalene");
		}
		sc.close();
	}
}

import java.util.*;
class prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		for(int i=2;i<=100;i++)
		{
			int c=0; 
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c+=1;
				}
			}
			if(c==2)
			{
				System.out.println(i);
			}
		}
		sc.close();
	}
}

import java.util.*;
class fib
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=0,b=1;
		int c,n;
		int sum=0;
		n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			if(c%2==0)
			{
				sum+=c;
			}
			a=b;
			b=c;
			//System.out.println(c);
		}
		System.out.println(sum);
	}
}

import java.util.*;
class Box
{
	double l,b,h,area,vol;
	public Box()
	{
		l=b=h=1;
	}
	public Box(double d)
	{
		l=b=h=d;
	}
	public Box(double length,double breadth,double height)
	{
		l=length;
		b=breadth;
		h=height;
	}
	public double calarea()
	{
		return l*b;
	}
	public double calvol()
	{
		return l*b*h;
	}
	public void info()
	{
		System.out.println(l+" "+b+" "+h);
		System.out.println("Area= "+calarea());
		System.out.println("volume= "+calvol());
	}
}
class Mainclass
{
	public static void main(String args[])
	{
		Box b1=new Box();
		b1.info();
		Box b2=new Box(2);
		b2.info();
		Box b3=new Box(4,5,6);
		b3.info();
	}
}


import java.util.*;
class Box
{
	double l,b,h,area,vol;
	public Box()
	{
		l=b=h=1;
	}
	public Box(double d)
	{
		l=b=h=d;
	}
	public Box(double l,double b,double h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public double calarea()
	{
		return l*b;
	}
	public double calvol()
	{
		return l*b*h;
	}
	public void info()
	{
		System.out.println(l+" "+b+" "+h);
		System.out.println("Area= "+calarea());
		System.out.println("volume= "+calvol());
	}
}
class Mainclass
{
	public static void main(String args[])
	{
		Box b1=new Box();
		b1.info();
		Box b2=new Box(2);
		b2.info();
		Box b3=new Box(4,5,6);
		b3.info();
	}
}

import java.util.*;
class Employee
{
	int empid;
	String name;
	double sal;
	static int c=0;
	static double tot_sal=0;
	static String org="AEC";
	public Employee(int empid,String name,double sal)
	{
		this.empid=empid;
		this.name=name;
		this.sal=sal;
		Employee.c++;
		Employee.tot_sal+=sal;
	}
	public void info()
	{
		System.out.println(empid);
		System.out.println(name);
		System.out.println(sal);
		System.out.println(Employee.org);
	}
	public static  void tot_info()
	{
		System.out.println(Employee.c);
		System.out.println(Employee.tot_sal);
	}
	public static void main(String args[])
	{

		Employee e1=new Employee(101,"Ankitha",80000);
		e1.info();
		Employee e2=new Employee(102,"roshini",80);
		e2.info();
		tot_info();
	}
}

import java.util.*;
class Employee
{
	int empid;
	String name;
	double sal;
	static int c=0;
	static double tot_sal=0;
	static String org="AEC";
	public Employee(int empid,String name,double sal)
	{
		this.empid=empid;
		this.name=name;
		this.sal=sal;
		Employee.c++;
		Employee.tot_sal+=sal;
	}
	public void info()
	{
		System.out.println(empid);
		System.out.println(name);
		System.out.println(sal);
		System.out.println(Employee.org);
	}
	public static  void tot_info()
	{
		System.out.println(Employee.c);
		System.out.println(Employee.tot_sal);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int eid;
		String name;
		double sal;
		Employee emp[]=new Employee[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter employee "+i+"Details");
			eid=sc.nextInt();
			sc.nextLine();
			name=sc.nextLine();
			sal=sc.nextDouble();
			emp[i]=new Employee(eid,name,sal);		
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter employee "+i+"Details");
			emp[i].info();
		}
		tot_info();
	}
}

import java.util.*;
class Account
{
	String accno,cname;
	double bal;
	public Account(String accno,String cname,double bal)
	{
		this.accno=accno;
		this.cname=cname;
		this.bal=bal;
	}
	public String getacno()
	{
		return accno;
	}
	public double getbal()
	{
		return bal;
	}
}
class Bank
{
	static String bname="union bank";
	Account cust[]=new Account[2];
	int i=0;
	public void addc(Account a)
	{
		cust[i]=a;
		i++;
	}
	public void deposit(String accno,double amt)
	{
		for(int j=0;j<i;j++)
		{
			if(acno.equals(cust[j].getacno()))
			{
				cust[j].bal=cust[j].bal+amt;
				break;
			}
		}
		if(j==i)
		{
			System.out.println("Invalid Account Number");
		}
	}
	public void wihdraw(String accno,double amt)
	{
		int j;
		for(int j=0;j<i;j++)
		{
			if(acno.equals(cust[j].getacno()))
			{
				cust[j].bal=cust[j].bal-amt;
				break;
			}
		}
		if(j==i)
		{
			System.out.println("Invalid Account Number");
		}
	}
	public void transfer(String saccno,String raccno,double amt)
	{
		int p=1,q=1,j;
		for(int j=0;j<i;j++)
		{
			if(saccno.equals(cust[j].getacno()))
			{
				p=j;
				break;
			}
		}
		for(int j=0;j<i;j++)
		{
			if(raccno.equals(cust[j].getacno()))
			{
				q=j;
				break;
			}
		}
		if(p!=-1 && q!=-1)
		{
			cust[p].bal=cust[p].bal-amt;
			cust[q].bal=cust[q].bal+amt;
		}
		else
		{
			System.out.println("Invalid Account");
		}
	}
	public void display(String accno)
	{
		int j;
		for(j=0;j<i;j++)
		{
			if(accno.equals(cust[i].getacno()))
			{
				cust[j].displayAccount();
				break;
			}
		}
	}
	public void allc()
	{

	}
	public static void main(String args[])
	{
		Account a;
		Bank b=new Bank();
		Scanner sc=new Scanner(System.in);
		String accno,cname,accno1;
		double amt;
		int ch;
		while(true)
		{
			System.oout.println("1.Add Account\n2.deposit\n3.withdraw\n4.Transfer\n5.display\n6.listcustomers\n7.exit");
			System.out.println("Enter your Choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				accno=sc.nextLine();
				cname=sc.nextLine();
				amt=sc.nextDouble();
				a=new Acount(accno,cname,bal);
				b.addc(a);
				break;
			case 2:
				accno=sc.nextLine();
				amt=nextDouble();
				sc.nextLine();
				b.deposit(accno,amt);
				break;
			case 3:
				accno=sc.nextLine();
				amt=nextDouble();
				sc.nextLine();
				b.withdraw(accno,amt);
				break;
			case 4:
				accno=sc.nextLine();
				accno1=sc.nextLine();
				amt=sc.nextDouble();
				sc.nextLine();
				b.transfer(accno,accno1,bal);
				break;
			case 5:
				accno=sc.nextLine();
				b.display(accno);
				break;
			case 6:
				b.allc();
				break;
			case 7:
				System.exit(0);	
			}
		}
	}
}

class mol
{
	public void swap(int x,int y)
	{
		int temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping"+x+" "+y);
	}
	public void swap(char ch1,char ch2)
	{
		char temp=ch1;
		ch1=ch2;
		ch2=temp;
		System.out.println("After swapping"+ch1+" "+ch2);
	}
	public void swap(double d1,double d2)
	{
		do uble temp=d1;
		d1=d2;
		d2=temp;
		System.out.println("After swapping"+d1+" "+d2);
	}
	public static void main(String args[])
	{
		mol m=new mol();
		m.swap(10,20);
		m.swap('A','B');
		m.swap(2.3,4.3);
	}
}

import java.util.*;
class parent
{
	int x=10;
	public void display1()
	{
		System.out.println(x);
	}
}
class child extends parent
{
	int y=20;
	public void display2()
	{
		System.out.println(y);
	}
}
class Singlelevel{
	public static void main(String args[])
	{
		parent p=new parent();
		p.display1();
		child c=new child();
		c.display1();
		c.display2();
		//p.display2();
	}
}

import java.util.*;
class parent
{
	int x=10;
	public void display1()
	{
		System.out.println(x);
	}
}
class child extends parent
{
	int y=20;
	public void display2()
	{
		System.out.println(y);
	}
}
class child2 extends child
{
	int z=34;
	public void dsiplay3()
	{
		System.out.println(z);
	}
}
class Multilevel{
	public static void main(String args[])
	{
		parent p=new parent();
		p.display1();
		child c=new child();
		c.display1();
		c.display2();
		child2 c1=new child2();
		c1.display1();
		c1.display2();
		c1.dsiplay3();
		//p.display2();
	}
}

import java.util.*;
class parent
{
	int x=10;
	public void display1()
	{
		System.out.println(x);
	}
}
class child extends parent
{
	int y=20;
	public void display2()
	{
		System.out.println(y);
	}
}
class child2 extends parent
{
	int z=24;
	public void display3()
	{
		System.out.println(z);
	}
}
class Hielevel{
	public static void main(String args[])
	{
		parent p=new parent();
		p.display1();
		child c=new child();
		c.display1();
		c.display2();
		child2 c1=new child2();
		c1.display1();
		c1.display3();
		//p.display2();
	}
}

//Methodoverriding
import java.util.*;
class parent
{
	public void display()
	{
		System.out.println("Welcome to THUB");
	}
}
class child extends parent
{
	public void display()
	{
		System.out.println("Hlwww");
	}
}
class mainclass{
	public static void main(String args[])
	{
		parent p=new parent();
		p.display();
		child c=new child();
		c.display();
	}
}

class Animal{
	public void eat()
	{
		System.out.println("Eating food");
	}
}
class herbi extends Animal{
	public void eat()
	{
		System.out.println("Only plants");
	}
}
class carni extends Animal{
	public void eat()
	{
		System.out.println("Only Meat");
	}
}
class Omni extends Animal{
	public void eat()
	{
		System.out.println("Both plants and Meat");
	}
}
class Mainclass{
	public static void main(String args[])
	{
		Animal a=new Animal();
		a.eat();
		herbi h=new herbi();
		h.eat();
		carni c=new carni();
		c.eat();
		Omni o=new Omni();
		o.eat();
	}
}

//access immediate parent class members
//super.variablename
class A{
	int x=10;
	public void show()
	{
		System.out.println(x);
	}
}
class B extends A{
	int x=20;
	public void display()
	{
		System.out.println(x);
		System.out.println(super.x);
	}
}
class Mainclass{
	public static void main(String args[])
	{
		A a=new A();
		a.show();
		B b=new B();
		b.display();
	} 
}

class parent{
	public void show()
	{
		System.out.println("Darling");
	}
}
class child extends parent{
	public void show()
	{
		//super.show();
		System.out.println("Bahubali");
	}
}
class Mainclass{
	public static void main(String args[])
	{
		child c=new child();
		c.show();
	}
}
class A{
	public A()
	{
		
		System.out.println("Hlwww");
		//this("THUB");
	}
	public A(String name)
	{
		this();
		System.out.println("HII"  +name);
	}
}
class Mainclass{
	public static void main(String args[])
	{
		A a=new A("Ankitha");
	}
}

class A{
	public A()
	{
		System.out.println("A");
	}
}
class B extends A{
	public B()
	{
		System.out.println("B");
	}
}
class Mainclass{
	public static void main(String[] args) {
		B b=new B();
	}
}

class A{
	int x;
	public A(int x)
	{
		this.x=x;
	}
	public void display()
	{
		System.out.println(x);
	}
}
class B extends A{
	int y;
	public B(int x,int y)
	{
		super(x);
		this.y=y;
	}
	public void display()
	{
		System.out.println(x+" "+y);
	}
}
class C extends B{
	int z;
	public C(int x,int y,int z)
	{
		super(x,y);
		this.z=z;
	}
	public void display()
	{
		System.out.println(x+" "+y+" "+z);
	}
}
class Mainclass{
	public static void main(String args[])
	{
		C c=new C(10,20,30);
		c.display();
		B b=new B(10,20);
		b.display();
		A a=new A(10);
		a.display();
	}
}

abstract class parent{
	public abstract void m1();
	public void m2()
	{
		System.out.println("Non abstract Method");
	}
}
abstract class child extends parent{
	public void m3(){
		System.out.println("Hlwww");
	}
}
class child1 extends child{
	public void m1()
	{
		System.out.println("M1 method from parent class");
	}
	public static void main(String args[])
	{
		child1 c=new child1();
		c.m1();
		c.m2();
		c.m3();
	}
}

abstract class Animal{
	public abstract void makesound();
	public void eat()
	{
		System.out.println("I am eating");
	}
}
class Dog extends Animal{
	public void makesound()
	{
		System.out.println("Bow.. Bow..");
	}
}
class Cat extends Animal{
	public void makesound()
	{
		System.out.println("Meow.. Meow..");
	}
}
class Mainclass{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.eat();
		d.makesound();
		Cat c=new Cat();
		c.eat();
		c.makesound();
	}
}

abstract class parent{
	public void m1()
	{
		System.out.println("M1 method from parent");
	}
	public void m2()
	{
		System.out.println("M2 method from parent");
	}
	abstract public void m3();
}
class child extends parent
{
	public void m2()
	{
		System.out.println("M2 method from child");
	}
	public void m3()
	{
		System.out.println("M3 method from child");
	}
}
class Mainclass{
	public static void main(String args[])
	{
		parent c=new child();
		c.m1();
		c.m2();
		c.m3();
	}
}

abstract class vehicle{
	public abstract int get_no_wheels();
	public abstract int seating_capacity();
}
class Bike extends vehicle{
	public int get_no_wheels()
	{
		return 2;
	}
	public int seating_capacity()
	{
		return 2;
	}
}
class Auto extends vehicle{
	public int get_no_wheels()
	{
		return 3;
	}
	public int seating_capacity()
	{
		return 4;
	}
}
class car extends vehicle{
	public int get_no_wheels()
	{
		return 4;
	}
	public int seating_capacity()
	{
		return 5;
	}
}
class Mainclass{
	public static void main(String args[])
	{
		vehicle v;
		int w,c;
		v=new Bike();
		w=v.get_no_wheels();
		c=v.seating_capacity();
		System.out.println(w);
		System.out.println(c);
		v=new Auto();
		w=v.get_no_wheels();
		c=v.seating_capacity();
		System.out.println(w);
		System.out.println(c);
		v=new car();
		w=v.get_no_wheels();
		c=v.seating_capacity();
		System.out.println(w);
		System.out.println(c);
	}
}

abstract class shape{
	public abstract void get_input();
	public abstract void calarea();
	public void showarea();
}
class Rectangle extends shape{
	public void get_input()
	{
		
	}
}

import java.util.*;
class variablelength{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x[][]=new int[3][];
		x[0]=new int[4];
		x[1]=new int[3];
		x[2]=new int[3];
		for(int i=0;i<x.length;i++)
			System.out.println(x[i].length);
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				x[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.println(x[i][j]+" ");
			}
			System.out.println();
		}
	}
}

// Anonymous array
class sample{
	public static int sum(int arr[])
	{
		int s=0;
		for(int i=0;i<arr.length;i++)
		{
			s+=arr[i];
		}
		return s;
	}
	public static void main(String args[])
	{
		int result=sum(new int[]{10,20,30});
		System.out.println(result);
		System.out.println(sum(new int[]{40,50,60}));
	}
}

//Inner class
class outer{
	class inner{
		public void one()
		{

			System.out.println("HOii");
		}
	}
	public static void main(String args[])
	{
		new outer().new inner().one();
	}
}

//String Handling::
class String1{
	public static void main(String args[])
	{
		String s1="ANKI";
		String s2="ANKI";
		System.out.println(s1==s2);
	}
}

import java.util.*;
class String3{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		/*System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.concat("(A)"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.indexOf('A'));
		System.out.println(s1.Split(s1,","));
		char ch[]=s1.toCharArray();
		int c=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
				c+=1;
		}
		
		String s1=sc.nextLine();
		int l=0,u=0,d=0,s=0,sum=0;
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isAlphabetic(s1.charAt(i)))
			{
				if(Character.isupperCase(s1.charAt(i)))
					u++;
				else
					
			}
		}
	}
}

import java.util.*;
class palindrome{
	public static boolean ispalindrome(String s)
	{
		int i,n;
		n=s.length();
		char ch[]=s.toCharArray();
		for (i=0;i<n/2;i++ ) {
			if(ch[i]!=ch[n-i-1])
				return false;
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1;
		s1=sc.nextLine();
		s1=s1.toLowerCase();
		if(ispalindrome(s1))
			System.out.println("yes");
		else
			System.out.println("No");
	}
}

import java.util.*;
class in{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		s1=sc.nextLine();
		s2=sc.nextLine();
		int res=s1.indexOf(s2);
		System.out.println(res);
	}
}
import java.util.*;
class sub{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		//s1=sc.nextLine();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<=s1.length();j++)
			{
				System.out.println(substring(i,j));
			}
		}
	}
}

class Demo{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("hellosdfghjpiuytrewzxcvbnm");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		sb.reverse();
		StringBuffer sb1=new StringBuffer("Technical");
		sb1.setCharAt(4,'M');
		System.out.println(sb1.charAt(5));
		System.out.println(sb1);
		StringBuffer sb2=new StringBuffer("Aditya");
		sb2.append(" Engg. college");
		System.out.println(sb2);
	}
}

interface Int1{
	public abstract void m1();
	void m2();
}
class Dev1 implements Int1{
	public void m1()
	{
		System.out.println("Hello");
	}
	public void m2()
	{
		System.out.println("Hiii");
	}
}
class Dev2 extends Dev1{
	public void m3()
	{
		System.out.println("boiiii");
	}
}
class Mainclass{
	public static void main(String args[])
	{
		Dev2 d=new Dev2();
		d.m1();
		d.m2();
		d.m3();
	}
}

interface factorial{
	int fact(int n);
}
class Dev1 implements factorial{
	public int fact(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
			f*=i;
		return f;
	}
	public void hmm(){
		System.out.println("PK");
	}
}
class Dev2 implements factorial{
	public int fact(int n)
	{
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
	}
	public void hmm(){
		System.out.println("Prabhas");
	}
}
class Mainclass{
	public static void main(String args[])
	{
		Dev1 d=new Dev1();
		System.out.println(d.fact(5));
		d.hmm();
		Dev2 d2=new Dev2();
		System.out.println(d2.fact(4));
		d2.hmm();
	}
}

interface vehicle{
	void changegear(int g);
	void speed(int s);
	void applybrake(int b);
}
class Bike implements vehicle{
	int gear,speed=20;
	public void changegear(int g)
	{
		gear=g;
	}
	public void speed(int s)
	{
		speed+=s;
	}
	public void applybrake(int b)
	{
		speed-=b;
	}
	public void show()
	{
		System.out.println("speed"+speed+"gear"+gear+"");
	}
}
class Mainclass{
	public static void main(String args[])
	{
		Bike b=new Bike();
		b.changegear(3);
		b.speed(70);
		b.show();
		b.applybrake(30);
		b.show();
	}
}

interface animal
{
	void eat();
	void sound();
	void running();
}
class Dog implements animal{
	public void eat()
	{
		System.out.println("Meat");
	}
	public void sound()
	{
		System.out.println("Bow Bow");
	}
	public void running()
	{
		System.out.println("Running faster");
	}
}
class Tiger implements animal{
	public void eat()
	{
		System.out.println("Meat");
	}
	public void sound()
	{
		System.out.println("Roar");
	}
	public void running()
	{
		System.out.println("super fast");
	}
}
class Mainclass{
	public static void main(String args[])
	{
		animal a;
		a=new Dog();
		a.eat();
		a.sound();
		a.running();

		a=new Tiger();
		a.eat();
		a.sound();
		a.running();
	}
}

interface I1
{
	void m1();
	void m2();
}
interface I2
{
	void m2();
	void m3();
}
class Rosh implements I1,I2
{
	public void m1()
	{
		System.out.println("M1 method");
	}
	public void m2()
	{
		System.out.println("M2 method");
	}
	public void m3()
	{
		System.out.println("M3 method");
	}
}
class Mainclass{
	public static void main(String args[])
	{
		I1 i1=new Rosh();
		i1.m1();
		i1.m2();
		I2 i2=new Rosh();
		i2.m2();
		i2.m3();
	}
}

import java.util.*;
interface InternalMarks{
	void getInternal();
	void showInternal();
}
interface ExternalMarks{
	void getExternal();
	void showExternal();
}
interface Marks extends InternalMarks,ExternalMarks{
	void showtotal();
}
class LabMarks implements Marks
{
	int s1_i,s2_i,s3_i,s1_e,s2_e,s3_e,tot_i,tot_e;
	Scanner sc=new Scanner(System.in);
	public void getInternal()
	{
		System.out.println("Enter 3 marks Internal:");
		s1_i=sc.nextInt();
		s2_i=sc.nextInt();
		s3_i=sc.nextInt();
	}
	public void getExternal()
	{
		System.out.println("Enter 3 marks External:");
		s1_e=sc.nextInt();
		s2_e=sc.nextInt();
		s3_e=sc.nextInt();
	}
	public void showInternal()
	{
		System.ot.println("sub1 : "+s1_i+"sub2 : "+s2_i+"sub3 : "+s3_i);
	}
	public void showExternal()
	{
		System.ot.println("sub1 : "+s1_e+"sub2 : "+s2_e+"sub3 : "+s3_e);
	}
	public void showtotal()
	{
		System.out.println("Total marks: ");

	}
}
interface I1
{
	void m1();
	void m2();
	static void m4()
	{
		System.out.println("M4 method");
	}
	default void m3()
	{
		System.out.println("Default method");
	} 
}
class Service1 implements I1
{
	public void m1()
	{
		System.out.println("m1 method");
	}
	public void m2()
	{
		System.out.println("M2 method");
	}
}
class Service2 implements I1
{
	public void m1()
	{
		System.out.println("m1 method");
	}
	public void m2()
	{
		System.out.println("M2 method");
	}
	public void m3()
	{
		System.out.println("Own ones");
	}
}
class Mainclass{
	public static void main(String args[])
	{
		I1 i=new Service1();
		i.m1();
		i.m2();
		i.m3();
		I1.m4();
		I1 i1=new Service2();
		i1.m1();
		i1.m2();
		i1.m3();
		I1.m4();
	}
}

import java.util.Stack;
class hello{
	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.push(5);
		s1.push(10);
		s1.push(20);
		System.out.println(s1);	
	}
}

import java.util.Arrays;
class pckg{
	public static void main(String args[])
	{
		int x[]={10,2,30,40,50};
		System.out.println("Before Sorting");
		for(int ele:x)
			System.out.println(ele+" ");
		Arrays.sort(x);
		System.out.println("Affter Sorting");
		for(int ele:x)
			System.out.println(ele+" ");
	}
}

package aec.edu.in;
public class interest
{
	public static void main(String args[])
	{
		System.out.println("hello");
	}
}
 
package mypack.testpack;
class Compare{
	public int greater(int x,int y,int z)
	{
		if(x>y && x>z)
		return x;
		else if(y>x && y>z)
		return y;
		else
		return z;
	}
	public int lesser(int x,int y,int z)
	{
		if(x<y && x<z)
		return x;
		else if(y<x && y<z)
		return y;
		else
		return z;
	}
}


import java.util.Scanner;
import mypack.testpack.Compare;
class interest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Compare c=new Compare();
		int m,n,o;
		m=sc.nextInt();
		n=sc.nextInt();
		o=sc.nextInt();
		System.out.println(c.greater(m,n,o));
		System.out.println(c.lesser(m,n,o));
	}
}

package aec.cse;
class Stringpractice{
	public String rev(String s)
	{
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			s1=s.charAt(i)+s1;
		}
		return s;
	}
	public boolean pal(String s)
	{
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			s1=s.charAt(i)+s1;
		}
		if(s==s1)
		{
			return true;
		}
		else{
			return false;
		}
	}
	public String vow (String s)
	{
		String vowel="AEIOUaeiou";
		String re=" ";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(vowel.contains(ch+""))
			re=re+ch;
		}
		return re;
	}
}

import aec.cse;
import java.util.Scanner;
public class interest{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Stringpractice r=new Stringpractice();
		String input=sc.nextLine();
		System.out.println(r.rev(input));
		System.out.println(r.pal(input));
		System.out.println(r.vow(input));
	}
}

class privatedemo{
	private int age=18;
	private String name="Roshini";
	double salary=1;
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

}
class Sample{
	public static void main(String args[])
	{
		privatedemo p=new privatedemo();
		System.out.println(p.getAge());
		System.out.println(p.getName());
		System.out.println(p.salary);
	}
}

class Ex
{
	public static void main(String args[])
	{
		int x=10,y=0,z;
		System.out.println(x+" "+y);
		try
		{
			z=(x+y);
		}
		catch(Exception e)
		{
			z=x/2;
			System.out.println("Exception handled");
		}
		System.out.println(z);
		System.out.println("Done");
	}
}

class Ex1
{
	public static void main(String args[])
	{
		
		try
		{
			int age=Integer.parseInt(args[0]);
			System.out.println(age);
		}
		catch(Exception e)
		{
			System.out.println("Age should be an integer");
		}
		System.out.println("Done");
	}
}

class Ex2{
	public static void main(String args[])
	{
		int x[]={10,20,30,40};
		try{
			for(int i=0;i<=x.length;i++)
				System.out.println(x[i]);
		}
		catch(Exception e)
		{
			System.out.println("Index value crosses its range");
		}
		System.out.println("Done");
	}
}

class Exceptions
{
	public static void main(String args[])
	{
		int x=10,y,z=0;
		try{
			x=Integer.parseInt(args[0]);
			y=Integer.parseInt(args[1]);
			z=x/y;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("y value should be non zero");
			z=x/2;
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Input should be numbers only");
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Min no.of inputs");
		}
		catch(Exception e)
		{
			System.out.println("GHello");
		}
		System.out.println("Done");
	}
} 


import java.sql.*;
class db{
	public static void main(String args[])
	{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:://localhost:3306/Demo","root","Daddy@1088");
			if(con!=null)
				System.out.println("Connected");
			else
				System.out.println("Not connected");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

import java.util.*;
class HelloWorld
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num,m,rem,sum=0,r,c;
        num=sc.nextInt();
        m=num;
        c=(int)Math.log10(num)+1;
        while(num>0)
        {
            r=num%10;
            sum=sum+(int)Math.pow(r,c);
            num=num/10;
        }
        if(sum==m)
        {
            System.out.println("h");
        }
        else{
            System.out.println("N");
        }
    }
}

class m1
{
	public void method one()
	{
		System.out.println("no argument");
	}
	public void method one(int x,int y)
	{
		System.out.println(x+y);
	}
	public static void main(int x)
	{
		System.out.println(x);
	}
	public static void main(double d)
	{
		System.out.println(d);
	}
	public static void main(String args[])
	{
		method m1=new method();
		m1.methodone();
		m1.methodone(2,3);
		m1.methodone(3);
		m1.methodone(3.14);
	}
}


*/

class m1{
	public static void main(String args[]){
		System.out.println("hii");
	}
}













	
