
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
    	//int count = 1;
    	  /*
        URL url;
         
        
        Gson gson = new Gson();
        
        url = new URL("https://en.wikipedia.org/w/api.php?action=query&format=json&titles=Bla_Bla_Bla&prop=extracts&explaintext");
      InputStreamReader reader = new InputStreamReader(url.openStream());
      Test info = gson.fromJson(reader, Test.class);
        
      	//System.out.println(reader);
        System.out.println(info.a);
        */
        
        Gson gson = new Gson();
        
       // String dataIn = "{\"a\" : \"hello\", \"b\" : {\"b1\" : \"test\"}}";
       // System.out.println(dataIn);
        
        //Test info = gson.fromJson(dataIn, Test.class);
        
        //System.out.println(info.a);
        InnerObj I = new InnerObj("hi", 10);
        
        TestObj t = new TestObj("jo", 3, I);
  
        String jsonOut = gson.toJson(t);
        System.out.println(jsonOut);
        
        
        TestObj test2 = gson.fromJson(jsonOut, TestObj.class);
        
        System.out.println(test2.a3.b2);
    }
    
}
