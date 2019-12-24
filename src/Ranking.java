import java.util.*;

public class Ranking {
	String status;
	int size;
	List<Result> result;
	
	public class Result{
		String sku;
		int rank;
		String team;
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
