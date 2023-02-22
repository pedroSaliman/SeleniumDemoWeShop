package Api;

import java.util.HashMap;
import java.util.Map;

public class MapBody {
    private MapBody(){};
    public  static Map Body(){
        Map<String,String> map = new HashMap<>();
        map.put("name","mohamed");
        map.put("job","tester");
        return map;
    }
}
