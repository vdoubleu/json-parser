import java.io.InputStreamReader;
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
        response = new Gson().fromJson(reader, matchInfo.class);
        
        System.out.println(response.size);
        
        
        System.out.println(response.result);
        
        /*
    	do{
    		url = new URL("https://api.vexdb.io/v1/get_matches?limit_start=" + count + "&limit_number=1");
            InputStreamReader reader = new InputStreamReader(url.openStream());
            response = new Gson().fromJson(reader, matchInfo.class);
            
    		count++;
    	}while(response.size != "0");*/
    }

    private class matchInfo {
        String size;
        ArrayList<matchResults> result;
    }
    
    private class matchResults{
    	String red1, red2, blue1, blue2;
    	int redscore, bluescore;
    	
    }
}
