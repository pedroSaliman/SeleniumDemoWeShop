package Api;

import org.aeonbits.owner.Config;
@Config.Sources(value = "file:${user.dir}/src/test/java/resources/ApiConfig.properties")

public interface ApiConfig extends Config {

    @Key("baseUrl")
    String ApiBaseUrl();

    @Key("list.Users")
    String ListUsersEndPoint();

    @Key("single.user")
    String SingleUser();

    @Key("single.not.found")
    String SingleUserNotFound();

    @Key("single.resources")
    String SingleResources();
    @Key("auth")
    String AuthBasic();
}
