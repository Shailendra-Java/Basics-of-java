class Abc
{
	public void average(float... value)
	{
		float sum = 0;
		float average1 = 0;
		for(float a: value)
		{
			sum += a;
		}
		average1 = sum / (value.length);
		System.out.println("Average of Array = "+average1);
	}
}
class Overriding extends Abc
{
	public void average(float... value)
	{
		float sum = 0;
		float average1 = 0;
		System.out.println("Elements of Array");
		for(float a: value)
		{
			sum += a;
			System.out.print(a+"\t");
		}
		average1 = sum / (value.length);
		System.out.println("\nSum of Array = "+sum);
		System.out.println("Average of Array = "+average1);
		System.out.println("\nCalling super class method\n\n");
		super.average(value);
	}
	public static void main(String a[])
	{
		float[] ar = new float[]{10.5f,20.5f,30.5f,40.5f,50.5f};
		Overriding ov = new Overriding();
		ov.average(ar);
	}
}