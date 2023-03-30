package Api;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BaseApiRequest {
    private BaseApiRequest(){}
    protected final static String Base_Url= ApiConfigClass.getConfig().ApiBaseUrl();
    protected final static String Base_Url_List_User= ApiConfigClass.getConfig().ListUsersEndPoint();
    protected final static String Base_Url_User= ApiConfigClass.getConfig().SingleUser();



    public static RequestSpecification getDefaultRequest(){

        return     RestAssured.given().baseUri(Base_Url).log().all();
    }
}
