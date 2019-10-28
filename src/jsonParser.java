import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;

import com.google.gson.Gson;

public class jsonParser {	
    public static void main(String[] ignored) throws Exception {

        URL url = new URL("https://api.vexdb.io/v1/get_awards?team=7682&season=Toss%20Up");
        InputStreamReader reader = new InputStreamReader(url.openStream());
        Info response = new Gson().fromJson(reader, Info.class);
        
        System.out.println(response.status);
        System.out.println(response.size);
 
    }

    private class Info {
        //Map<String, String> status;
        //Map<String, String> args;
        String status;
        String size;
    }
}
