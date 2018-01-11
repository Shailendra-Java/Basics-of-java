class StringOccurance
{
	public static void main(String a[])
	{
		String input = "this is a simple paragraph that is meant to be nice and "
			+"easy to type which is why there will be mommas no periods or any "
			+"capital letters so i guess this means that it cannot really be "
			+"considered a paragraph but just a series of run on sentences "
			+"this should help you get faster at typing as im trying not "
			+" to use too many difficult words in it although i "
			+" think that i might start";
		int index = input.indexOf(" is ");
		int count = 0;
		while (index != -1) 
		{
			count++;
			input = input.substring(index + 1);
			index = input.indexOf(" is ");
		}
		System.out.println("No of *is* in the input is : " + count);
	}
}