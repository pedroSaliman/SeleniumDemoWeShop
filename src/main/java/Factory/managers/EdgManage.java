package Factory.managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgManage {

    public static WebDriver getEdge(){
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
}
