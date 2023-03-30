package DataPojo;


import java.text.SimpleDateFormat;
import java.util.Date;

public class EmailGenerate {

    private EmailGenerate(){};

    public static String Email(){
        String CurrentTime=new SimpleDateFormat("yyyyMMddHHmm").format(new Date());
        String email= "test"+CurrentTime+"@automation.com";
        return email;
    }
}
