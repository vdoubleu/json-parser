public class MatchTeamData{
	int redscore;
	int bluescore;
	int redwin;
	int bluewin;
	
	Rank red1ranking;
	Rank red2ranking;
	Rank blue1ranking;
	Rank blue2ranking;

	public MatchTeamData(int rscore, int bscore, Rank r1, Rank r2, Rank b1, Rank b2){
		this.redscore = rscore;
		this.bluescore = bscore;
		this.red1ranking = r1;
		this.red2ranking = r2;
		this.blue1ranking = b1;
		this.blue2ranking = b2;
		
		if(rscore > bscore){
			this.redwin = 1;
			this.bluewin = 0;
		} else if (rscore < bscore){
			this.redwin = 0;
			this.bluewin = 1;
		} else {
			this.redwin = 0;
			this.bluewin = 0;
		}
	}
}