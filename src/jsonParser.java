import java.io.*;
import java.net.URL;
import java.nio.file.*;

import com.google.gson.Gson;

public class jsonParser {	
    public static void main(String[] ignored) throws Exception {
    	int count = 1;
    	int increment = 5000;
    	
    	int end = 5000;  
    	
        URL url;
        
        Gson gson = new Gson();
        
        Data outData = new Data();
        DataFrame frame = new DataFrame();
    	
    	
    	for(; count < end; count += increment){//limit number 200, remove during use
    		url = new URL("https://api.vexdb.io/v1/get_matches?limit_number=200&limit_start=" + count);
    		InputStreamReader reader = new InputStreamReader(url.openStream());
    		Match m = gson.fromJson(reader, Match.class);
    		
    		for(int i = 0; i < m.size; i++){
    			System.out.println(i);
    			
    			URL r1URL = new URL("https://api.vexdb.io/v1/get_rankings?team=" + m.getRed1(i));
    			URL r2URL = new URL("https://api.vexdb.io/v1/get_rankings?team=" + m.getRed2(i));
    			URL b1URL = new URL("https://api.vexdb.io/v1/get_rankings?team=" + m.getBlue1(i));
    			URL b2URL = new URL("https://api.vexdb.io/v1/get_rankings?team=" + m.getBlue2(i));
    			
    			Ranking r1 = gson.fromJson(new InputStreamReader(r1URL.openStream()), Ranking.class);
    			Ranking r2 = gson.fromJson(new InputStreamReader(r2URL.openStream()), Ranking.class);
    			Ranking b1 = gson.fromJson(new InputStreamReader(b1URL.openStream()), Ranking.class);
    			Ranking b2 = gson.fromJson(new InputStreamReader(b2URL.openStream()), Ranking.class);
    			
    			outData.size++;
    			outData.matchteam.add(new MatchTeamData(m.getRedScore(i), m.getBlueScore(i), copyReduce(r1), copyReduce(r2), copyReduce(b1), copyReduce(b2)));
    		}  		
    	}
    	
    	//transform into data frame object
    	for(int i = 0; i < outData.size; i++){
    		frame.addRow(outData.matchteam.get(i).redscore, 
    				outData.matchteam.get(i).bluescore, 
    				outData.matchteam.get(i).redwin,
    				outData.matchteam.get(i).bluewin,
    				outData.matchteam.get(i).red1ranking,
    				outData.matchteam.get(i).red2ranking,
    				outData.matchteam.get(i).blue1ranking,
    				outData.matchteam.get(i).blue2ranking);
    	}
    	
    	String outFrame = gson.toJson(frame);
    	System.out.println(outFrame);

    	//over write existing data insert new data
    	writeToFile(outFrame, "./src/data.txt");

    	//*************************************
    	//String outDataStr = gson.toJson(outData);
    	//System.out.println(outDataStr);
    	//*************************************
    	
    	System.out.println("done");
    	
    }
    
    public static Rank copyReduce(Ranking r){
    	Rank rOut = new Rank(r.avgRank(), r.avgWins(), r.avgLosses(), r.avgTies(), r.avgwp(), r.avgap(), r.avgsp(), r.avgtrsp(), r.avgmscore(), r.avgopr(), r.avgdpr(), r.avgccwm());
    	return rOut;
    }
    
    public static void writeToFile(String data, String fileLoc) {
        try {
            Files.write(Paths.get(fileLoc), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
