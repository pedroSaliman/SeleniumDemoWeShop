package DataPojo;

import uk.co.jemos.podam.common.PodamStringValue;

@lombok.Data

public final class Data {
    private Data() {
    }

    ;
    private String fname;
    private String lname;
    @PodamStringValue(strValue = "1234567")
    private String password;
    @PodamStringValue(strValue = "Build your own cheap computer")
    private String product;


}
