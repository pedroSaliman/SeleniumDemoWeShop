package Tests.API;

import Api.ApiConfigClass;
import Api.ApiReqres;
import Api.BaseApiRequest;
import Api.PojoBuilder;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class InstantFakeApi {

    @Test
    public void Post(){
        PojoBuilder pojo=PojoBuilder.builder().setName("mohamed").setAirline(255).setNumber(2).build();
        Response res= ApiReqres.PostInstant(BaseApiRequest.Base_instant,BaseApiRequest.Base_instantPost,pojo);
        Assertions.assertThat(res.statusCode()).isEqualTo(200);
    }

    @Test
    public void Get(){

        Response res= ApiReqres.getUsers(BaseApiRequest.Base_instant,BaseApiRequest.Get_Instant_User);
        Assertions.assertThat(res.statusCode()).isEqualTo(200);
    }
}
