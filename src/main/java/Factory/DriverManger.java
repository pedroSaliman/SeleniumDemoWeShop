package Factory;

import Factory.managers.ChromeManage;
import Factory.managers.EdgManage;
import Factory.managers.FireManage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

import static Enum.BrowserTypes.CHROME;
import static Enum.BrowserTypes.FIREFOX;
import  Enum.BrowserTypes;
public class DriverManger {

 public static   WebDriver driver;

/*
*       BEFORE FUNCTIONAL PROGRAMING
*
* */
// public static   void init(BrowserTypes browser)
// {
//
//switch (browser){
//    case CHROME:
//        driver= ChromeManage.getChrome();
//        ThreadLocalDriver.setDriver(driver);
//        ThreadLocalDriver.getDriver().get(ConfigClass.getConfig().url());
//        ThreadLocalDriver.getDriver().manage().window().maximize();
//        break;
//    case FIREFOX:
//        driver= FireManage.getFire();
//        ThreadLocalDriver.setDriver(driver);
//        ThreadLocalDriver.getDriver().get(ConfigClass.getConfig().url());
//        ThreadLocalDriver.getDriver().manage().window().maximize();
//        break;
//    case EDGE:
//        driver= EdgManage.getEdge();
//        ThreadLocalDriver.setDriver(driver);
//        ThreadLocalDriver.getDriver().get(ConfigClass.getConfig().url());
//        ThreadLocalDriver.getDriver().manage().window().maximize();
//    default:
//        System.out.println("Please Enter the right browser name");
//        break;
//}}

    /*
    After
    *
    * */
    private static final Map<BrowserTypes, Supplier<WebDriver>> MAP =
            new EnumMap<>(BrowserTypes.class);

    static {
        MAP.put(BrowserTypes.CHROME, ChromeManage::getChrome);
        MAP.put(BrowserTypes.FIREFOX, FireManage::getFire);
        MAP.put(BrowserTypes.EDGE, EdgManage::getEdge);
    }

    public static WebDriver getDriver(BrowserTypes browserType) {
        return MAP.get(browserType).get();
    }


/*
*
*
*
*
* */


public static String Screen() throws IOException {
     File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     String path="E:/seleniumprojects/gitendtoend/SeleniumEndToEnd/build/screenshots/image.png";
    FileUtils.copyFile(source,new File(path));
  byte[] images=  IOUtils.toByteArray(new FileInputStream(path));
  return   Base64.getEncoder().encodeToString(images);
}

}
