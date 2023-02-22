package Factory.managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class FireManage {
    private FireManage(){};

    public static WebDriver getFire(){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
}
