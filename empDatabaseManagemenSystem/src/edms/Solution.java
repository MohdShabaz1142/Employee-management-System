package edms;
import java.util.Scanner;

import customexception.InvalidChoiceException;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("welcome to employeevDatabase Management System");
		System.out.println("-----------------------------------------------");

		EmployeeManagementSystem emp=new EmployeeManagementSystemimpl();

		//infiniteloop
		while(true)
		{
			System.out.println("1.add employee\n2.display employee\n3.display all employees\n4.remove employee\n5.remove all employees\n6.update employee\n7.count employee\n8.sort employee\n9.employee with highest sal\n10.employee with lowest sal\n11.exit");
			System.out.println("enter the choice:");
			int choice=sc.nextInt();

			switch(choice)
			{
			case 1: emp.addemployee();
			break;
			case 2:emp.displayemployee();
			break;
			case 3:emp.displayallemployees();
			break;
			case 4:emp.removeemployee();
			break;
			case 5:emp.removeallemployees();
			break;
			case 6:emp.updateemployee();
			break;
			case 7:emp.countemployee();
			break;
			case 8:emp.sortemployee();
			break;
			case 9:emp.employeewithhighestsal();
			break;
			case 10: emp.employeewithlowestsal();
			break;
			case 11: System.out.println("thank you");
			System.exit(0);
			break;


			default:
				try 
				{
					throw new InvalidChoiceException("invalid choice");
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}


		}



	}
}
