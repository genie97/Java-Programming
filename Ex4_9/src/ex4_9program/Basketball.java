package ex4_9program;

public class Basketball {
	private String FirstTeam = "Cats", SecondTeam = "Dogs";
	private int FirstTeamScore = 0, SecondTeamScore = 0;
	private String WinTeam;

	public void SetScore(char team, int score) 
	{
		if (team == 'a') 
		{
			if (score > 0) 
			{
				if (score == 1)
				{
					FirstTeamScore++;
				}
				else if (score == 2)
				{
					FirstTeamScore = FirstTeamScore + score;
				}
				else if (score == 3)
				{
					FirstTeamScore = FirstTeamScore + score;
				}
				else
				{
					System.out.println("Type the wrong scroe");
				}
			} 
			else
			{
				System.out.println("Type the wrong scroe");
			}
		}
		if (team == 'b') {
			if (score > 0) {
				if (score == 1)
				{
					SecondTeamScore++;
				}
				else if (score == 2)
				{
					SecondTeamScore = SecondTeamScore + score;
				}
				else if (score == 3)
				{
					SecondTeamScore = SecondTeamScore + score;
				}
				else
				{
					System.out.println("Type the wrong scroe");
				}
			} 
			else
			{
				System.out.println("Type the wrong scroe");
			}
		}
	}
	public void setWinningTeam(){
		if(FirstTeamScore>SecondTeamScore)
			WinTeam=FirstTeam+" are winning";
		else if(FirstTeamScore==SecondTeamScore)
			WinTeam="Two teams are Same Score";
		else
			WinTeam=SecondTeam+" are winning";
	}
	public int GetFirstScore(){
		return FirstTeamScore;
	}
	public int GetSecondScore(){
		return SecondTeamScore;
	}
	public String GetFristName(){
		return FirstTeam;
	}
	public String GetSecondName(){
		return SecondTeam;
	}
	public String GetWinTeamName(){
		return WinTeam;
	}
}
