import java.util.Scanner;
public class Cricket
{
	Scanner input;
	String[][] players={{"Sikhar Dhawan","Opener"},{"Rohit Sharma","Opener"}
						,{"Virat Kohli","First Down"},{"Mayank Agarwal","Second Down"}
						,{"KL Rahul","Third Down"},{"Vijay Shankar","Fourth Down"}
						,{"Hardik Pandya","Fifth Down"},{"M.S. Dhoni","Sixth Down"}
						,{"Yuzvendra Chahal","Seventh Down"},{"B. Kumar","Eighth Down"}
						,{"Jasprit Bumrah","Ninth Down"}};
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
