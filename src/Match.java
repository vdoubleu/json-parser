import java.util.*;

public class Match {
	int status;
	int size;
	List<Result> result;
	
	public class Result{
		String red1;
		String red2;
		String blue1;
		String blue2;
		int redscore;
		int bluescore;
	}
	
	public String getRed1(int i){return this.result.get(i).red1;}
	public String getRed2(int i){return this.result.get(i).red2;}
	public String getBlue1(int i){return this.result.get(i).blue1;}
	public String getBlue2(int i){return this.result.get(i).blue2;}
	
	public int getRedScore(int i){return this.result.get(i).redscore;}
	public int getBlueScore(int i){return this.result.get(i).bluescore;}
}
