import java.util.*;

public class Ranking {
	String status;
	int size;
	List<Result> result;
	
	public int avgRank(){
		int out = 0;
		for(int i = 0; i < size; i++)
			out += result.get(i).rank;
		return size==0? 0:out/size;
	}
	
	public int avgWins(){
		int out = 0;
		for(int i = 0; i < size; i++)
			out += result.get(i).wins;
		return size==0? 0:out/size;
	}
	
	public int avgLosses(){
		int out = 0;
		for(int i = 0; i < size; i++)
			out += result.get(i).losses;
		return size==0? 0:out/size;
	}
	
	public int avgTies(){
		int out = 0;
		for(int i = 0; i < size; i++)
			out += result.get(i).ties;
		return size==0? 0:out/size;
	}
	
	public int avgwp(){
		int out = 0;
		for(int i = 0; i < size; i++)
			out += result.get(i).wp;
		return size==0? 0:out/size;
	}
	
	public int avgap(){
		int out = 0;
		for(int i = 0; i < size; i++)
			out += result.get(i).ap;
		return size==0? 0:out/size;
	}
	
	public int avgsp(){
		int out = 0;
		for(int i = 0; i < size; i++)
			out += result.get(i).sp;
		return size==0? 0:out/size;
	}
	
	public int avgtrsp(){
		int out = 0;
		for(int i = 0; i < size; i++)
			out += result.get(i).trsp;
		return size==0? 0:out/size;
	}
	
	public int avgmscore(){
		int out = 0;
		for(int i = 0; i < size; i++)
			out += result.get(i).max_score;
		return size==0? 0:out/size;
	}
	
	public double avgopr(){
		int out = 0;
		for(int i = 0; i < size; i++)
			out += result.get(i).opr;
		return size==0? 0:out/size;
	}
	
	public double avgdpr(){
		int out = 0;
		for(int i = 0; i < size; i++)
			out += result.get(i).dpr;
		return size==0? 0:out/size;
	}
	
	public double avgccwm(){
		int out = 0;
		for(int i = 0; i < size; i++)
			out += result.get(i).ccwm;
		return size==0? 0:out/size;
	}
}
