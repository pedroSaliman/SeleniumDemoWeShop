package Tests;

import Factory.DriverManger;
import Factory.FrameWorkConfig;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  Enum.BrowserTypes;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.PageBase;

import java.util.Locale;

public class BaseTest {

    Faker faker = new Faker(new Locale("es"));
    String email=faker.internet().safeEmailAddress();
    FrameWorkConfig config;
    @BeforeSuite
    public void setup(){


        config=ConfigFactory.create(FrameWorkConfig.class);
        DriverManger.init(BrowserTypes.EDGE);
        new PageBase().setDriver(DriverManger.getDr());

    }




    @AfterSuite
    public void TearDown(){
        DriverManger.getDr().quit();
    }
}
