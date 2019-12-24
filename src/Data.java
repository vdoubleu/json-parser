import java.util.*;

public class Data {
	int size;
	ArrayList<MatchTeamData> matchteam;
	
	public class MatchTeamData{
		int redscore;
		int bluescore;
		
		Rank red1ranking;
		Rank red2ranking;
		Rank blue1ranking;
		Rank blue2ranking;
		
		public class Rank{
			int rank;
			int wins;
			int losses;
			int ties;
			int wp;
			int ap;
			int sp;
			int trsp;
			int max_score;
			double opr;
			double dpr;
			double ccwm;
		}
	}
}
