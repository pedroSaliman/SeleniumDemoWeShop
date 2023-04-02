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
    private static Supplier<RequestSpecification> DELETE = ()-> given().log().all().baseUri(BaseApiRequest.Base_Url);
    private static Supplier<RequestSpecification> PUT = ()-> given().log().all().baseUri(BaseApiRequest.Base_Url).body(MapBody.Body());

    private static Supplier<RequestSpecification> GET = ()-> given().log().all().baseUri(BaseApiRequest.Base_Url);
    private static Supplier<RequestSpecification> GETAuth = ()-> given().auth().basic("postman","password").log().all().baseUri(BaseApiRequest.Base_Auth);

    private static Supplier<RequestSpecification> POST = ()-> given()
            .log()
            .all()
            .baseUri(ApiConfigClass.getConfig().ApiBaseUrl())
            .contentType(ContentType.JSON)
            .body(MapBody.Body());
    static {
        MAP.put(HttpMethods.GET, GET);
        MAP.put(HttpMethods.POST, POST);
        MAP.put(HttpMethods.DELETE, DELETE);
        MAP.put(HttpMethods.PUT, PUT);
        MAP.put(HttpMethods.GET,GETAuth);

    }


    public static Response deleteRequest(HttpMethods method,String PATH) {
        return  MAP.get(method).get().delete(PATH);
    }
    public static Response AuthRequest(HttpMethods method) {
        return  MAP.get(method).get().get();
    }

    public static Response putRequest(HttpMethods method,String PATH) {
        return  MAP.get(method).get().put(PATH);
    }


    public static Response getRequest(HttpMethods method,String PATH) {
        return  MAP.get(method).get().get(PATH);
    }
    public static Response postRequest(HttpMethods method,String PATH) {
        return  MAP.get(method).get().post(PATH);
    }

}
