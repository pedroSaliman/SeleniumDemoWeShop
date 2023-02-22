package Factory;

import org.aeonbits.owner.Config;

@Config.Sources(value = "file:${user.dir}/src/test/java/resources/FrameWorkConfig.properties")
public interface FrameWorkConfig extends Config {
    String url();
    @Key("fname")
    String FirstName();
    @Key("lname")
    String LastName();
    String password();
    String confirm();
    String product();



}
