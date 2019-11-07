
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
    	  
        URL url;
         
        
        Gson gson = new Gson();
        
        url = new URL("https://api.vexdb.io/v1/get_matches?limit_start=1&limit_number=1");
      InputStreamReader reader = new InputStreamReader(url.openStream());
      MatchInfo info = gson.fromJson(reader, MatchInfo.class);
        
      	//System.out.println(reader);
        System.out.println(info.result.get(0));
        
    	
        
        //matchInfo2
        
    }

    private class MatchInfo {
        String size;
        List result = new ArrayList();
        
    }
    /*
    private class result{
    	String red1;
    	String red2;
    	String blue1;
    	String blue2;
    	int redscore;
    	int bluescore;
    	
    }*/
    

}
