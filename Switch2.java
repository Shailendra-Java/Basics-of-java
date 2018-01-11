class Switch2
{
	public static void main(String a[])
	{
		float num1 = Float.parseFloat(a[0]);
		float num2 = Float.parseFloat(a[1]);
		String operation = a[2];
		switch(operation)
		{
			case "+":
				
				System.out.println("Addition = "+(num1+num2));
				break;
			case "-":
				System.out.println("Subtraction = "+(num1-num2));
				break;
			case "x":
				System.out.println("Multiply = "+(num1*num2));
				break;
			case "/":
				System.out.println("Division = "+(num1/num2));
				break;
			default:
				System.out.print("Please enter valid value");
				break;
		}
	}
}