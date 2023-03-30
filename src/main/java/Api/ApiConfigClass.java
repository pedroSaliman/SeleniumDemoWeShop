package Api;

import org.aeonbits.owner.ConfigCache;

public class ApiConfigClass {
    private ApiConfigClass(){};
    public static ApiConfig getConfig(){
        return ConfigCache.getOrCreate(ApiConfig.class);
    }
}
