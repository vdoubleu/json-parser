import java.util.*;

//this is a format that can be read by panda data frames in python
public class DataFrame {
	//match outcome
	List<Integer> redscore;
	List<Integer> bluescore;
	List<Integer> redwin;
	List<Integer> bluewin;
	
	//red1 stats
	List<Integer> r1rank;
	List<Integer> r1wins;
	List<Integer> r1losses;
	List<Integer> r1ties;
	List<Integer> r1wp;
	List<Integer> r1ap;
	List<Integer> r1sp;
	List<Integer> r1trsp;
	List<Integer> r1maxscore;
	List<Double> r1opr;
	List<Double> r1dpr;
	List<Double> r1ccwm;
	
	//red2 stats
	List<Integer> r2rank;
	List<Integer> r2wins;
	List<Integer> r2losses;
	List<Integer> r2ties;
	List<Integer> r2wp;
	List<Integer> r2ap;
	List<Integer> r2sp;
	List<Integer> r2trsp;
	List<Integer> r2maxscore;
	List<Double> r2opr;
	List<Double> r2dpr;
	List<Double> r2ccwm;
	
	//blue1 stats
	List<Integer> b1rank;
	List<Integer> b1wins;
	List<Integer> b1losses;
	List<Integer> b1ties;
	List<Integer> b1wp;
	List<Integer> b1ap;
	List<Integer> b1sp;
	List<Integer> b1trsp;
	List<Integer> b1maxscore;
	List<Double> b1opr;
	List<Double> b1dpr;
	List<Double> b1ccwm;
	
	//blue2 stats
	List<Integer> b2rank;
	List<Integer> b2wins;
	List<Integer> b2losses;
	List<Integer> b2ties;
	List<Integer> b2wp;
	List<Integer> b2ap;
	List<Integer> b2sp;
	List<Integer> b2trsp;
	List<Integer> b2maxscore;
	List<Double> b2opr;
	List<Double> b2dpr;
	List<Double> b2ccwm;
	
	public DataFrame(){
		//match result init
		redscore = new ArrayList<Integer>();
		bluescore = new ArrayList<Integer>();
		redwin = new ArrayList<Integer>();
		bluewin = new ArrayList<Integer>();
		
		//r1 init
		r1rank = new ArrayList<Integer>();
		r1wins = new ArrayList<Integer>();
		r1losses = new ArrayList<Integer>();
		r1ties = new ArrayList<Integer>();
		r1wp = new ArrayList<Integer>();
		r1ap = new ArrayList<Integer>();
		r1sp = new ArrayList<Integer>();
		r1trsp = new ArrayList<Integer>();
		r1maxscore = new ArrayList<Integer>();
		r1opr = new ArrayList<Double>();
		r1dpr = new ArrayList<Double>();
		r1ccwm = new ArrayList<Double>();
		
		//r2 init
		r2rank = new ArrayList<Integer>();
		r2wins = new ArrayList<Integer>();
		r2losses = new ArrayList<Integer>();
		r2ties = new ArrayList<Integer>();
		r2wp = new ArrayList<Integer>();
		r2ap = new ArrayList<Integer>();
		r2sp = new ArrayList<Integer>();
		r2trsp = new ArrayList<Integer>();
		r2maxscore = new ArrayList<Integer>();
		r2opr = new ArrayList<Double>();
		r2dpr = new ArrayList<Double>();
		r2ccwm = new ArrayList<Double>();
		
		//b1 init
		b1rank = new ArrayList<Integer>();
		b1wins = new ArrayList<Integer>();
		b1losses = new ArrayList<Integer>();
		b1ties = new ArrayList<Integer>();
		b1wp = new ArrayList<Integer>();
		b1ap = new ArrayList<Integer>();
		b1sp = new ArrayList<Integer>();
		b1trsp = new ArrayList<Integer>();
		b1maxscore = new ArrayList<Integer>();
		b1opr = new ArrayList<Double>();
		b1dpr = new ArrayList<Double>();
		b1ccwm = new ArrayList<Double>();
		
		//b2 init
		b2rank = new ArrayList<Integer>();
		b2wins = new ArrayList<Integer>();
		b2losses = new ArrayList<Integer>();
		b2ties = new ArrayList<Integer>();
		b2wp = new ArrayList<Integer>();
		b2ap = new ArrayList<Integer>();
		b2sp = new ArrayList<Integer>();
		b2trsp = new ArrayList<Integer>();
		b2maxscore = new ArrayList<Integer>();
		b2opr = new ArrayList<Double>();
		b2dpr = new ArrayList<Double>();
		b2ccwm = new ArrayList<Double>();
	}
	
	public void addRow(int rscore, int bscore, int rwin, int bwin, Rank r1r, Rank r2r, Rank b1r, Rank b2r){
		//add match outcome
		redscore.add(rscore);
		bluescore.add(bscore);
		redwin.add(rwin);
		bluewin.add(bwin);
		
		//add r1
		r1rank.add(r1r.rank);
		r1wins.add(r1r.wins);
		r1losses.add(r1r.losses);
		r1ties.add(r1r.ties);
		r1wp.add(r1r.wp);
		r1ap.add(r1r.ap);
		r1sp.add(r1r.sp);
		r1trsp.add(r1r.trsp);
		r1maxscore.add(r1r.max_score);  
		r1opr.add(r1r.opr); 
		r1dpr.add(r1r.dpr);
		r1ccwm.add(r1r.ccwm);
		
		//add r2
		r2rank.add(r2r.rank);
		r2wins.add(r2r.wins);
		r2losses.add(r2r.losses);
		r2ties.add(r2r.ties);
		r2wp.add(r2r.wp);
		r2ap.add(r2r.ap);
		r2sp.add(r2r.sp);
		r2trsp.add(r2r.trsp);
		r2maxscore.add(r2r.max_score);  
		r2opr.add(r2r.opr); 
		r2dpr.add(r2r.dpr);
		r2ccwm.add(r2r.ccwm);
		
		//add b1
		b1rank.add(b1r.rank);
		b1wins.add(b1r.wins);
		b1losses.add(b1r.losses);
		b1ties.add(b1r.ties);
		b1wp.add(b1r.wp);
		b1ap.add(b1r.ap);
		b1sp.add(b1r.sp);
		b1trsp.add(b1r.trsp);
		b1maxscore.add(b1r.max_score);  
		b1opr.add(b1r.opr); 
		b1dpr.add(b1r.dpr);
		b1ccwm.add(b1r.ccwm);
		
		//add b2
		b2rank.add(b2r.rank);
		b2wins.add(b2r.wins);
		b2losses.add(b2r.losses);
		b2ties.add(b2r.ties);
		b2wp.add(b2r.wp);
		b2ap.add(b2r.ap);
		b2sp.add(b2r.sp);
		b2trsp.add(b2r.trsp);
		b2maxscore.add(b2r.max_score);  
		b2opr.add(b2r.opr); 
		b2dpr.add(b2r.dpr);
		b2ccwm.add(b2r.ccwm);
	}
}
