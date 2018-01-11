import java.util.Scanner;
public class ExamRecord {
	Scanner input;
	String[] name = new String[5];
	float[][] marks = new float[5][6];
	int row,column;
	
	public ExamRecord()
	{
		input = new Scanner(System.in);
	}
	public void getData()
	{
		System.out.println("Enter 5 students record");
		for(row=0; row<5; row++)
		{
			System.out.print("Name\t");
			name[row] = input.next();
			for(column=0; column<4; column++)
			{
				System.out.println("\nEnter "+(column+1)+" subject marks");
				marks[row][column] = input.nextFloat();
			}
		}
	}
	public void calculate()
	{
		for(row=0; row<5; row++)
		{
			for(column=0; column<4; column++)
			{
				marks[row][4] += marks[row][column];
			}
			marks[row][5] = (marks[row][4] * 100)/400;
		}
	}
	public void printData()
	{
		System.out.println("NAME\tPHYSICS\tCHEMISTRY\tENGLISH\tMATHS\tTOTAL\tPercentage\tGRADE\n");
		for(row=0; row<5; row++)
		{
			System.out.print(name[row]);
			for(column=0; column<6; column++)
			{
				System.out.print("\t"+marks[row][column]);
			}
			if(marks[row][5]>85)
				System.out.print("%\tEXCELLENT");
			if(marks[row][5]>65 && marks[row][5]<85)
				System.out.print("%\tVERY GOOD");
			else
				System.out.print("%\tGOOD");
			System.out.println();
		}
	}
	public static void main(String a[])
	{
		ExamRecord er = new ExamRecord();
		er.getData();
		er.calculate();
		er.printData();
	}

}
