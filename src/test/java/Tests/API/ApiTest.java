package Tests.API;

import Api.ApiConfigClass;
import Api.ApiReqres;
import Api.MapBody;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class ApiTest {




    @Test
    public void getListUsers(){
        Response res= ApiReqres.getUsers(ApiConfigClass.getConfig().ListUsersEndPoint());
        Assertions.assertThat(res.statusCode()).isEqualTo(200);
    }


    @Test
    public void getSingleUser(){
        Response res= ApiReqres.getUsers(ApiConfigClass.getConfig().SingleUser());
        Assertions.assertThat(res.statusCode()).isEqualTo(200);
        Assertions.assertThat(res.body().jsonPath().get("data.last_name").equals("Weaver"))
                .isNotNull()
                .withFailMessage(()->"This Is Not Correct Name");
    }


    @Test
    public void getSingleUserNotFound(){
        Response res= ApiReqres.getUsers(ApiConfigClass.getConfig().SingleUserNotFound());
        Assertions.assertThat(res.statusCode()).isEqualTo(404);


    }

    @Test
    public void getSingleResources(){
        Response res= ApiReqres.getUsers(ApiConfigClass.getConfig().SingleResources());
        Assertions.assertThat(res.statusCode()).isEqualTo(200);
        Assertions.assertThat(res.body().jsonPath().get("data.name").equals("fuchsia rose"));

    }


    @Test
    public void PostUsersApi(){

        Response res=ApiReqres.PostUsers(ApiConfigClass.getConfig().ListUsersEndPoint(),MapBody.Body());
        Assertions.assertThat(res.statusCode()).isEqualTo(201);
        Assertions.assertThat(res.body().jsonPath().get("name").equals("mohamed"));
    }
}
