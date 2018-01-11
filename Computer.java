public class Computer
{
	public void setState(PowerState ps)
	{
		switch(ps)
		{
			case ON:
				System.out.println("Computer is turn ON");
				break;
			case OFF:
				System.out.println("Computer is turn OFF");
				break;
			case SUSPEND:
				System.out.println("Computer'S power is suspend");
				break;
			default:
				System.out.println("Invalid State");
		}
	}
	public static void main(String ar[])
	{
		Computer comp = new Computer();
		comp.setState(PowerState.ON);
	}
}