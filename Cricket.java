import java.util.Scanner;
public class Cricket
{
	Scanner input;
	String[][] players={{"Sikhar Dhawan","Opener"},{"Rohit Sharma","Opener"}
						,{"Virat Kohli","First Down"},{"Ajinkya Rahade","Second Down"}
						,{"Suresh Raina","Third Down"},{"Yuvraj Singh","Fourth Down"}
						,{"Hardik Pandya","Fifth Down"},{"M.S. Dhoni","Sixth Down"}
						,{"Ravindra Jadeja","Seventh Down"},{"B. Kumar","Eighth Down"}
						,{"Ashish Nehra","Ninth Down"}};
	int[][] score;
	int over,ball,run;
	boolean strike;
	
	public Cricket()
	{
		input = new Scanner(System.in);
		score = new int[11][2];
		strike = false;
	}
	public void playGame()
	{
		for(over = 1; over <= 5; over++)
		{
			for(ball = 1; ball <= 6; ball++)
			{
				run = input.nextInt();
				switch(run)
				{
					case 2:
					case 4:
					case 6:
						score[index1][0][]
					case 1:
					case 3:
						
					case 7:
						
					default:
						System.out.println("Dot ball try again");
						ball--;
						break;
				}
			}
		}
	}
}