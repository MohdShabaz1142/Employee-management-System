package edms;

public class Employee 
{
	private String id;
	private String name;
	private double sal;
	//auto generating the id by taking a static counter variable and increasing it
	static int count=100;

	public Employee(String name,double sal)
	{
		this.id="JSP"+count;
		count++;
		this.name=name;
		this.sal=sal;
	}

	public String getid()
	{
		return id;
	}

	public String  getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public Double getsal()
	{
		return sal;
	}
	public void setsal(Double sal)
	{
		this.sal=sal;
	}

	@Override
	public String toString()
	{
		return "emp id:"+id+" employee name"+name+"emp sal:"+sal;
	}

}
