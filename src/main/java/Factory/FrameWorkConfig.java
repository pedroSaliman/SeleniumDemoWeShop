package Factory;

import org.aeonbits.owner.Config;

@Config.Sources(value = "file:E:/seleniumprojects/gitendtoend/SeleniumDemoShop/src/test/java/resources/FrameWorkConfig.properties")
public interface FrameWorkConfig extends Config {
    String url();
    String fname();
    String lname();

    String password();
    String confirm();
    String product();

}
