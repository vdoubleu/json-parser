import java.io.FileReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URL;

import java.util.ArrayList;

import com.google.gson.Gson;

public class jsonParser {	
    public static void main(String[] ignored) throws Exception {
    	int count = 1;
    	  
        URL url;
        matchInfo response;
        
        url = new URL("https://api.vexdb.io/v1/get_matches?limit_start=1&limit_number=1");
      InputStreamReader reader = new InputStreamReader(url.openStream());
        /*response = new Gson().fromJson(reader, matchInfo.class);
        
        System.out.println(response.result[0]);
        */
    	
    	Gson gson = new Gson();
    	matchInfo[] myThings = gson.fromJson(reader, matchInfo[].class);
    	
        System.out.println(gson.toJson(myThings));
       
        
    }

    private class matchInfo {
        String size;
        ArrayList<MatchResults> result;
       
    }
    
    private class MatchResults{
    	String red1, red2, blue1, blue2;
    	int redscore, bluescore;
    	
    }
}
