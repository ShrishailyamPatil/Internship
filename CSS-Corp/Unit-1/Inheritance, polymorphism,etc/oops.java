


import java.util.Scanner;
class Person
{ 
	Scanner s=new Scanner (System.in);
	String name;
	int birthdate;
	String emailid;
	double contactno;
	
	Person()
	{
		name="";
		birthdate=0;
		emailid="";
		contactno=0;
	} 
	void accept()
	{
		System.out.println("\n Enter the details:");
		System.out.println(" the name :");
		 name=s.next();
		System.out.println(" the birth date :");
		 birthdate=s.nextInt();
		System.out.println("the email id :");
		emailid=s.next();
		if(emailid.indexOf("@")==-1)
		{
			System.out.println("enter correct emaiid:");
			emailid=s.next();
		}
		
			int n=0;
		System.out.println("the contact no :");
		 contactno=s.nextDouble();
		 while(contactno!=0)
		 {
			 contactno=contactno/10;
			 n++;
		 }
		 if(n!=10)
		 {
			 System.out.println("enter the correct  contact no :");
			 contactno=s.nextDouble();
		 }
	}
	
	void display()
	{
		System.out.println("\n The details are:");
		System.out.println(" the name is:"+name);
		System.out.println(" the birth date is:"+birthdate);
		System.out.println("the email id is:"+emailid);
		System.out.println("the contact no is:"+contactno);
		
		
	}
}
class Employee extends Person
{
	
	int employeeid,basicsalary;
	char grade;
	int HRA,DA,TA,grosssalary;
	
	
Employee()
{
	super();
	employeeid=0;
	grade=0;
}

void accept()
{
	super.accept();
	
	System.out.println("Enter employee id:");
	employeeid=s.nextInt();

	System.out.println("Enter grade:");
	grade=s.next().charAt(0);
	
}
void calculate_salary()
{
	if(grade=='A')
	{
		basicsalary=8000;
		TA=2000;
   }
	else if(grade=='B')
	{
		basicsalary=7000;
		TA=1500;
	}
	else if(grade=='C')
	{
		basicsalary=6000;
		TA=1000;
	}
	else if(grade=='D')
	{
		basicsalary=5000;
		TA=500;
	}
	else
	{
		System.out.println("Grade entered is invalid");
	}
	
	HRA=(20*basicsalary)/100;
	DA=(50*basicsalary)/100;
	grosssalary=basicsalary+HRA+DA+TA;
}
void display()
{
	super.display();
	System.out.println("employee id is:"+employeeid);
	System.out.println("grade is:"+grade);
	System.out.println("basic salary is:"+basicsalary);
	System.out.println("TA is:"+TA);
	System.out.println("HRA is:"+HRA);
	System.out.println("DA is:"+DA);	
	System.out.println("gross salary is:"+grosssalary);
	
}
void display(Employee e[],char Grade,int size,int i)
{
	if(grade==Grade)
	{
		System.out.println("the information of employees who have "+grade+" grade is");
		System.out.println(" the name is:"+name);
		System.out.println(" the birth date is:"+birthdate);
		System.out.println("the email id is:"+emailid);
		System.out.println("the contact no is:"+contactno);
		System.out.println("employee id is:"+employeeid);
		System.out.println("grade is:"+grade);
		System.out.println("basic salary is:"+basicsalary);
		System.out.println("TA is:"+TA);
		System.out.println("HRA is:"+HRA);
		System.out.println("DA is:"+DA);	
		System.out.println("gross salary is:"+grosssalary);
     }
}
}

public class Inheritance 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size,i;
		System.out.println("enter the no. of employees:");
		size=sc.nextInt();
		Employee e[]=new Employee[size];

		for(i=0;i<size;i++)
		{
		
		e[i]=new Employee();
		e[i].accept();
		
		}
	
		char Grade;

		 int ch;
			do
			{
				System.out.println("\n1.calculate salary\n2.grade wise info. of employees\n3.Exit\n ");
				System.out.println("Enter the choice:");
				 ch=sc.nextInt();
				 switch(ch)
				 {
				 
				 case 1:
					 for(i=0;i<size;i++)
					 {
						 e[i].calculate_salary();
							e[i].display();
					 }
					 
					 break;
					 
				 case 2:	
					 System.out.println("\nenter the grade:");
						Grade = sc.next().charAt(0);
						for(i=0;i<size;i++)
						{
						if(e[i].grade==Grade)
						{
						e[i].display(e,Grade,size,i);
						}
						}
				break;
				 
				 case 3:
					 System.out.println("EXIT");
				break;
				 }
		}while(ch!=4);
	        
		}
	  }
	
/*OUTPUT:
 * enter the no. of employees:
5

 Enter the details:
 the name :
anjali
 the birth date :
451990
the email id :
anjlgfhj
enter correct emaiid:
anjalimanglekar@gmail.com
the contact no :
34567897654334
enter the correct  contact no :
6785904734
Enter employee id:
6578
Enter grade:
A

 Enter the details:
 the name :
rahul
 the birth date :
671998
the email id :
rahul@gmail.com
the contact no :
7869056478
Enter employee id:
4678
Enter grade:
B

 Enter the details:
 the name :
arnav
 the birth date :
3121996
the email id :
arnav@gmail.com
the contact no :
591994
Enter employee id:
4783
Enter grade:
A

 Enter the details:
 the name :
sayali
 the birth date :
291997
the email id :
sayali@gamil.com
the contact no :
5678032413
Enter employee id:
2345
Enter grade:
D

 Enter the details:
 the name :
priyanka
 the birth date :
711993
the email id :
priyanka@gmail.com
the contact no :
123456789
Enter employee id:
9847
Enter grade:
C

1.calculate salary
2.grade wise info. of employees
3.Exit
 
Enter the choice:
1

 The details are:
 the name is:akshata
 the birth date is:451990
the email id is:akshata@gmail.com
the contact no is:7.65894987E8
employee id is:6578
grade is:A
basic salary is:8000
TA is:2000
HRA is:1600
DA is:4000
gross salary is:15600

 The details are:
 the name is:rahul
 the birth date is:671998
the email id is:rahul@gmail.com
the contact no is:7.869056478E9
employee id is:4678
grade is:B
basic salary is:7000
TA is:1500
HRA is:1400
DA is:3500
gross salary is:13400

 The details are:
 the name is:arnav
 the birth date is:3121996
the email id is:arnav@gmail.com
the contact no is:591994.0
employee id is:4783
grade is:A
basic salary is:8000
TA is:2000
HRA is:1600
DA is:4000
gross salary is:15600

 The details are:
 the name is:sayali
 the birth date is:291997
the email id is:sayali@gamil.com
the contact no is:5.678032413E9
employee id is:2345
grade is:D
basic salary is:5000
TA is:500
HRA is:1000
DA is:2500
gross salary is:9000

 The details are:
 the name is:priyanka
 the birth date is:711993
the email id is:priyanka@gmail.com
the contact no is:1.23456789E8
employee id is:9847
grade is:C
basic salary is:6000
TA is:1000
HRA is:1200
DA is:3000
gross salary is:11200

Enter the choice:
2

enter the grade:
A
the information of employees who have A grade is
 the name is:akshata
 the birth date is:451990
the email id is:akshata@gmail.com
the contact no is:7.65894987E8
employee id is:6578
grade is:A
basic salary is:8000
TA is:2000
HRA is:1600
DA is:4000
gross salary is:15600
the information of employees who have A grade is
 the name is:arnav
 the birth date is:3121996
the email id is:arnav@gmail.com
the contact no is:591994.0
employee id is:4783
grade is:A
basic salary is:8000
TA is:2000
HRA is:1600
DA is:4000
gross salary is:15600
 
Enter the choice:
3
EXIT
 
Enter the choice:
4
*/
