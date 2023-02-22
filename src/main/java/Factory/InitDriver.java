package Factory;

import org.openqa.selenium.WebDriver;
import  Enum.BrowserTypes;

public class InitDriver {
    static WebDriver driver=null;
    public static void init(){


        driver=  DriverManger.getDriver(BrowserTypes.EDGE);
        ThreadLocalDriver.setDriver(driver);
        ThreadLocalDriver.getDriver().get(ConfigClass.getConfig().url());
        ThreadLocalDriver.getDriver().manage().window().maximize();


    }
    public static void close(){
        ThreadLocalDriver.getDriver().quit();
        ThreadLocalDriver.unload();
    }
}
