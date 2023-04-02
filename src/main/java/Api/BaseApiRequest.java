package Api;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BaseApiRequest {
    private BaseApiRequest(){}
    public final static String Base_Url= ApiConfigClass.getConfig().ApiBaseUrl();
    public final static String Base_Url_List_User= ApiConfigClass.getConfig().ListUsersEndPoint();
    public final static String Base_Url_User= ApiConfigClass.getConfig().SingleUser();
    public final static String Base_UrlSingleUserNotFound= ApiConfigClass.getConfig().SingleUserNotFound();
    public final static String Base_Auth= ApiConfigClass.getConfig().AuthBasic();





    public static RequestSpecification getDefaultRequest(){

        return     RestAssured.given().baseUri(Base_Url).log().all();
    }
}
