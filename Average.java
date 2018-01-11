class Average
{
	public static void main(String a[])
	{
		int[] ar = new int[10];
		ar[0] = 10; ar[1] = 20; ar[2] = 30;
		ar[3] = 40; ar[4] = 50; ar[5] = 60;
		ar[6] = 70; ar[7] = 80; ar[8] = 90;
		ar[9] = 100;
		//OR
		// ar[10] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		int avg = 0;
		for(int x: ar)
		{
			sum = sum+x;
		}
		avg = sum / ar.length;
		System.out.println("Average = "+avg);
	}
}