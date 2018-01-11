import Dog.New.Dog;
class Home
{
	public void s()
	{
		System.out.println("Method of Home class");
	}
	public static void main(String[]args)
	{
		Home h = new Home();
		h.s();
		Dog d = new Dog();
		d.display(14.4f);
		d.setWeight(50);
		d.getWeight();
	}
}