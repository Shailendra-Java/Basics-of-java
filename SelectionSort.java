import java.util.Scanner;
class SelectionSort
{
	static int x,y,z,i,first;
	static int[] a;
	Scanner s=new Scanner(System.in);
	public SelectionSort()
	{
		System.out.println("Enter the numer of Indexes of the Array : ");
		i=s.nextInt();
		a=new int[i];
		for(x=0;x<a.length;x++)
		{
			a[x]=s.nextInt();
		}	
		for(x=0;x<a.length;x++)
		{
			System.out.print("  "+a[x]);
		}
		System.out.println();
		System.out.println("Enter your preference : 1.Ascending or 2.Descending");
		z=s.nextInt();
		for(x=0;x<a.length;x++)
		{
			for(y=x+1;y<a.length;y++)
			{
				switch(z)
				{
					case 1:
					{
						if(a[x]>a[y])
						{
							first=a[x];
							a[x]=a[y];
							a[y]=first;
						}break;
					}
					case 2:
					{
						if(a[x]<a[y])
						{
							first=a[x];
							a[x]=a[y];
							a[y]=first;
						}
					}
				}
			}
		}
		for(x=0;x<a.length;x++)
		{
			System.out.print("  "+a[x]);
		}
	}
	public static void main(String ar[])
	{
		SelectionSort ss=new SelectionSort();
		ss.SelectionSort();
	}
}