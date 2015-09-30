package input.model;

public class Thing
{
	private String name;
	private int age;
	private double weight;
	
	public Thing()
	{
		age = 22;
		weight = 150;
		name = "";
	}
	
	public Thing (String name, int age, double weight)
	{
		this.age = age;
		this.name = name;
		this.weight = weight;
		
	}
	
	public String toString()
	{
		String thingInfo = name + "is" + age + " years old and weighs " + weight;
	
		return thingInfo;
	}
}
