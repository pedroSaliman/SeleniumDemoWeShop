package Tests.API;

import Api.HttpMethods;
import Api.RequestBuilderWithJava8;
import io.restassured.response.Response;


import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;


public class ApiWithJava8 {


    @Test
    public void getListUsers(){
        Response r= RequestBuilderWithJava8.getRequest(HttpMethods.GET);
        Assertions.assertThat(r.statusCode()).isEqualTo(200);
    }

    @Test
    public void postSingleUser(){
        Response  r= RequestBuilderWithJava8.postRequest(HttpMethods.POST);
        Assertions.assertThat(r.statusCode()).isEqualTo(201);
        System.out.println(r.peek());
    }



}
