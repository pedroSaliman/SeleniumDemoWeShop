package Api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static io.restassured.RestAssured.given;

public class RequestBuilderWithJava8 {
    private RequestBuilderWithJava8() {}
    //For people who know how to use Java8 can use this class instead of RequestBuilder


    private static Map<HttpMethods,Supplier<RequestSpecification>> MAP = new HashMap<>();

    private static Supplier<RequestSpecification> GET = ()-> given().log().all().baseUri(BaseApiRequest.Base_Url);
    private static Supplier<RequestSpecification> POST = ()-> given()
            .log()
            .all()
            .baseUri(ApiConfigClass.getConfig().ApiBaseUrl())
            .contentType(ContentType.JSON)
            .body(MapBody.Body());
    static {
        MAP.put(HttpMethods.GET, GET);
        MAP.put(HttpMethods.POST, POST);
    }




    public static Response getRequest(HttpMethods method) {
        return  MAP.get(method).get().get(BaseApiRequest.Base_Url_List_User);
    }
    public static Response postRequest(HttpMethods method) {
        return  MAP.get(method).get().post(BaseApiRequest.Base_Url_User);
    }

}
