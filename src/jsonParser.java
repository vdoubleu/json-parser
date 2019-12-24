
import java.io.FileReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class jsonParser {	
    public static void main(String[] ignored) throws Exception {
    	int count = 1;
    	int increment = 5000;
    	
    	int end = 20000;  
    	
        URL url;
        
        Gson gson = new Gson();
    	
    	
    	for(; count < end; count += increment){
    		url = new URL("https://api.vexdb.io/v1/get_matches?limit_start=" + count);
    		InputStreamReader reader = new InputStreamReader(url.openStream());
    		Match m = gson.fromJson(reader, Match.class);
    		
    		for(int i = 0; i < m.size; i++){
    			URL r1URL = new URL("https://api.vexdb.io/v1/get_rankings?team=" + m.getRed1(i));
    			URL r2URL = new URL("https://api.vexdb.io/v1/get_rankings?team=" + m.getRed2(i));
    			URL b1URL = new URL("https://api.vexdb.io/v1/get_rankings?team=" + m.getBlue1(i));
    			URL b2URL = new URL("https://api.vexdb.io/v1/get_rankings?team=" + m.getBlue2(i));
    			
    			Ranking r1 = gson.fromJson(new InputStreamReader(r1URL.openStream()), Ranking.class);
    			Ranking r2 = gson.fromJson(new InputStreamReader(r2URL.openStream()), Ranking.class);
    			Ranking b1 = gson.fromJson(new InputStreamReader(b1URL.openStream()), Ranking.class);
    			Ranking b2 = gson.fromJson(new InputStreamReader(b2URL.openStream()), Ranking.class);
    			
    			
    			
    		}
    		//System.out.println(m.getBlue1());
    		
    		
    	}
    	
    	System.out.println("done");
    	

    	/*

        url = new URL("https://en.wikipedia.org/w/api.php?action=query&format=json&titles=Bla_Bla_Bla&prop=extracts&explaintext");
      InputStreamReader reader = new InputStreamReader(url.openStream());
      Test info = gson.fromJson(reader, Test.class);
        
      	//System.out.println(reader);
        System.out.println(info.a);
        */
        
        //Gson gson = new Gson();
        
       // String dataIn = "{\"a\" : \"hello\", \"b\" : {\"b1\" : \"test\"}}";
       // System.out.println(dataIn);
        
        //Test info = gson.fromJson(dataIn, Test.class);
        
        //System.out.println(info.a);
        //InnerObj I = new InnerObj("hi", 10);
        
        //TestObj t = new TestObj("jo", 3, I, "yup", 69);
  
        //String jsonOut = gson.toJson(t);
        //System.out.println(jsonOut);
        
        //String m = "{\"status\":1,\"size\":1,\"result\":[{\"sku\":\"RE-VRC-19-8207\",\"division\":\"Division 1\",\"round\":2,\"instance\":1,\"matchnum\":1,\"field\":\"Main Field\",\"red1\":\"56847A\",\"red2\":\"98626A\",\"red3\":\"\",\"redsit\":\"\",\"blue1\":\"98626B\",\"blue2\":\"10622D\",\"blue3\":\"\",\"bluesit\":\"\",\"redscore\":6,\"bluescore\":19,\"scored\":1,\"scheduled\":\"2019-10-26T16:00:00+00:00\"}]}";
        
        //Match test2 = gson.fromJson(m, Match.class);
        
        //System.out.println(test2.result.get(0).red2);
    }
    
}
