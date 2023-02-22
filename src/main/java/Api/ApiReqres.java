package Api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class ApiReqres {
private ApiReqres(){};

    public static Response getUsers(String List_Users_EndPoint){
        return     BaseApiRequest.getDefaultRequest()

                .get(List_Users_EndPoint);
    }


    public static Response PostUsers(String EndPoint ,Map map){
        return     BaseApiRequest.getDefaultRequest().contentType(ContentType.JSON)
                .body(map)
                .post(EndPoint);
    }

}


