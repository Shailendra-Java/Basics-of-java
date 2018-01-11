public class Dog
{
	private int weight;
	private String name;
	public Dog(String n)
	{
		name = n;
	}
	public int getWeight()
	{
		return weight;
	}
	public void setWeight(int newWeight)
	{
		if(newWeight>0)
		{
			weight = newWeight;
		}
	}
	public String getName()
	{
		return name;
	}
	public static void main(String args[])
	{
		Dog d = new Dog("German Shephard");
		d.setWeight(45);
		System.out.println("Name = "+d.getName());
		System.out.println("Weight = "+d.getWeight());
	}
}