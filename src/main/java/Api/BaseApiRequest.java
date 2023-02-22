package Api;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BaseApiRequest {
    private BaseApiRequest(){}
    private final static String Base_Url= ApiConfigClass.getConfig().ApiBaseUrl();

    public static RequestSpecification getDefaultRequest(){

        return     RestAssured.given().baseUri(Base_Url).log().all();
    }
}
