import java.util.Scanner;
class Student
{
	public static void main(String args[])
	{
		int i,j;
		int[][] marks = new int[3][5];
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<3; i++)
		{
			System.out.println("Enter "+(i+1)+" Student marks");
			for(j=0; j<5; j++)
			{
				System.out.println("Subject "+(j+1)+" marks: ");
				marks[i][j] = sc.nextInt();
			}
		}
		System.out.println("Report card");
		for(i=0; i<3; i++)
		{
			System.out.print("Student-"+(i+1)+": ");
			for(j=0; j<5; j++)
			{
				System.out.print("\t"+marks[i][j]);
			}
			System.out.println("\n");
		}
	}
}