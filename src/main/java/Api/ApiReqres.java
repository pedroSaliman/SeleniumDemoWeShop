package Api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class ApiReqres {
private ApiReqres(){};

    public static Response getUsers(String URL,String List_Users_EndPoint){
        return     BaseApiRequest.getDefaultRequest(URL)

                .get(List_Users_EndPoint);
    }


    public static Response PostUsers(String EndPoint ,Map map){
        return     BaseApiRequest.getDefaultRequest(BaseApiRequest.Base_Url).contentType(ContentType.JSON)
                .body(map)
                .post(EndPoint);
    }

    public static Response PostInstant(String URL,String EndPoint ,PojoBuilder pojo){
        return     BaseApiRequest.getDefaultRequest(URL).contentType(ContentType.JSON)
                .body(pojo)
                .post(EndPoint);
    }

}


