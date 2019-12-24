
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
	
	public Rank(int r, int w, int l, int t, int Wp, int Ap, int Sp, int Trsp, int m, double O, double D, double C){
		this.rank = r;
		this.wins = w;
		this.losses = l;
		this.ties = t;
		this.wp = Wp;
		this.ap = Ap;
		this.sp = Sp;
		this.trsp = Trsp;
		this.max_score = m;
		this.opr = O;
		this.dpr = D;
		this.ccwm = C;
	}
}