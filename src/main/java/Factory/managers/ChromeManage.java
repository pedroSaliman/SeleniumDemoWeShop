package Factory.managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class ChromeManage {
private  ChromeManage(){}
    public static WebDriver getChrome(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
