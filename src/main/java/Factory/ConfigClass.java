package Factory;
import org.aeonbits.owner.ConfigCache;
/*
*
*  FOR OWNER LIBRARY
* */
public final class ConfigClass {

    private ConfigClass(){};
public static FrameWorkConfig getConfig(){
    return ConfigCache.getOrCreate(FrameWorkConfig.class);
}

}
