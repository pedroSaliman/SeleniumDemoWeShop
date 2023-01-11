package Factory;

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

import static Enum.BrowserTypes.CHROME;
import static Enum.BrowserTypes.FIREFOX;
import  Enum.BrowserTypes;
public class DriverManger {
 public   static FrameWorkConfig config;
 public static   WebDriver driver;

    public static WebDriver getDr() {
        return dr.get();
    }

    private static ThreadLocal<WebDriver> dr=new ThreadLocal<>();
 public static void setDriver(WebDriver driverr){
     dr.set(driverr);
 }

 public static   void init(BrowserTypes browser)
 {
config=ConfigFactory.create(FrameWorkConfig.class);
switch (browser){
    case CHROME:
        driver=WebDriverManager.chromedriver().create();
        driver=new ChromeDriver();
        setDriver(driver);
        getDr().get(config.url());
        getDr().manage().window().maximize();
        break;
    case FIREFOX:
        driver=WebDriverManager.firefoxdriver().create();
        driver=new FirefoxDriver();
        setDriver(driver);
        getDr().get(config.url());
        getDr().manage().window().maximize();
        break;
    case EDGE:
        driver=WebDriverManager.edgedriver().create();
        driver=new EdgeDriver();
        setDriver(driver);
        getDr().get(config.url());
        getDr().manage().window().maximize();
    default:
        System.out.println("Please Enter the right browser name");
        break;

}





 }

public static void close(){
     getDr().quit();
}
public static String Screen() throws IOException {
     File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     String path="E:/seleniumprojects/gitendtoend/SeleniumEndToEnd/build/screenshots/image.png";
    FileUtils.copyFile(source,new File(path));
  byte[] images=  IOUtils.toByteArray(new FileInputStream(path));
  return   Base64.getEncoder().encodeToString(images);
}

}
