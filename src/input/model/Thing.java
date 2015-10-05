package input.model;

public class Thing
{
	private String name;
	private int age;
	private double weight;
	private int beep;
/**
 * Sets default values if there are none declared.
 */
	public Thing()

	{
		age = 22;
		weight = 150;
		name = "";
	}
		/**
	 * Changes information to user input.
	 * @param name sets it to user inputs name
	 * @param age sets it to user inputs age
	 * @param weight sets it to user inputs weight
	 */
	public Thing (String name, int age, double weight)
	{
		this.age = age;
		this.name = name;
		this.weight = weight;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	/**
	 * Returns the user input info as a string in a pop up window, which describes the Thing and its data members.
	 */
	public String toString()
	{
		String thingInfo = name + "is" + age + " years old and weighs " + weight;
	
		return thingInfo;
	}
}

