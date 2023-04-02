package Tests.API;

import Api.BaseApiRequest;
import Api.HttpMethods;
import Api.RequestBuilderWithJava8;
import io.restassured.response.Response;


import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import static Api.BaseApiRequest.Base_UrlSingleUserNotFound;


public class ApiWithJava8 {


    @Test
    public void getListUsers(){
        Response r= RequestBuilderWithJava8.getRequest(HttpMethods.GET, BaseApiRequest.Base_Url_List_User);
        Assertions.assertThat(r.statusCode()).isEqualTo(200);
    }

    @Test
    public void postSingleUser(){
        Response  r= RequestBuilderWithJava8.postRequest(HttpMethods.POST,BaseApiRequest.Base_Url_User);
        Assertions.assertThat(r.statusCode()).isEqualTo(201);
        System.out.println(r.peek());
    }

    @Test
    public void upUser(){
        Response  r= RequestBuilderWithJava8.putRequest(HttpMethods.PUT,BaseApiRequest.Base_Url_User);
        Assertions.assertThat(r.statusCode()).isEqualTo(200);
        System.out.println(r.peek());
    }
    @Test
public void singleNotFoundUser(){
        Response r = RequestBuilderWithJava8.getRequest(HttpMethods.GET,Base_UrlSingleUserNotFound);
         System.out.println(r.peek());
         Assertions.assertThat(r.statusCode()).isEqualTo(404);


}



@Test
public void Auth(){
    Response r = RequestBuilderWithJava8.AuthRequest(HttpMethods.GET);
    System.out.println(r.peek());
    Assertions.assertThat(r.statusCode()).isEqualTo(200);


}


}
