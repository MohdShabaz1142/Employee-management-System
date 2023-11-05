package edms;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import customexception.EmployeeNotFoundException;
import customexception.InvalidChoiceException;


public class EmployeeManagementSystemimpl implements EmployeeManagementSystem
{
	Scanner sc= new Scanner(System.in);

	Map<String,Employee> m= new LinkedHashMap<String,Employee>();

	@Override
	public void addemployee()
	{

		System.out.println("accept ename:");
		String name=sc.next();
		System.out.println("accept sal");
		Double sal=sc.nextDouble();

		Employee e= new Employee(name,sal);

		m.put(e.getid(),e );

		System.out.println("employee registered succesfully");
		System.out.println("employee id  is:"+e.getid());
		System.out.println("---------------------------------");
	}
	public void displayemployee()
	{
		System.out.println("enter the employee id:");
		String id=sc.next();
		id=id.toUpperCase();
		
		if(m.containsKey(id))
		{
			System.out.println("employee data found");
			Employee emp = m.get(id);
			System.out.println(emp.getid());
			System.out.println(emp.getname());
			System.out.println(emp.getsal());
		}
		else 
		{
			try
			{
				throw new EmployeeNotFoundException("employee data not found");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}

	}
	public void displayallemployees()
	{
		//checking if map is not equal to empty
		if(!m.isEmpty())
		{
			//if its not empty we convert it to set and extract the keys using keyset()
			Set<String> keys = m.keySet();

			for(String key: keys)
			{
				System.out.println(m.get(key));
			}
		}
		else 
		{
			try
			{
				throw new EmployeeNotFoundException("employee data not present");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	public void removeemployee()
	{
		System.out.println("enter the employee id:");
		String id=sc.next();
		id=id.toUpperCase();

		if(m.containsKey(id))
		{
			m.remove(id);
			System.out.println("Employee removed");
			System.out.println("------------------");
		}
		else 
		{
			try
			{
				throw new EmployeeNotFoundException("employee of this id is not present");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println("--------------");
			}
		}


	}
	public void removeallemployees()
	{
		if(!m.isEmpty())
		{
			m.clear();
			System.out.println("all the employees removed");
			System.out.println("---------------------------");
		}
		else {
			try
			{
				throw new EmployeeNotFoundException("could not find employees records to delete");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println("---------------------------");
			}
		}


	}
	public void updateemployee()
	{
		System.out.println("enter the employee id:");
		String id= sc.next();
		id=id.toUpperCase();

		if(m.containsKey(id))
		{
			Employee emp=m.get(id);

			System.out.println("1.update name\n2.update salary");
			System.out.println("enter the choice to update");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter the updating name");
				String name=sc.next();
				emp.setname(name);
				System.out.println("updated successfully");
				System.out.println("---------------------");
				break;
			case 2:
				System.out.println("enter the updating salary");
				Double sal=sc.nextDouble();
				emp.setsal(sal);
				System.out.println("updated successfully");
				System.out.println("---------------------");
				break;

			default:
				try
				{
					throw new InvalidChoiceException("wrong choice to update");
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}

			}
		}


	}
	public void countemployee()
	{
		System.out.println("the total count of employees is:"+m.size());
	}
	public void sortemployee()
	{ 

	}
	public void employeewithhighestsal()
	{

	}
	public void employeewithlowestsal()
	{

	}


}
