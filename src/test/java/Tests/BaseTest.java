package Tests;

import Factory.DriverManger;
import Factory.InitDriver;
import Factory.ThreadLocalDriver;
import com.github.javafaker.Faker;
import  Enum.BrowserTypes;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.ActionHelper;

import java.util.Locale;

public class BaseTest {

    Faker faker = new Faker(new Locale("es"));
    String email=faker.internet().safeEmailAddress();

    @BeforeSuite
    public void setup(){
        InitDriver.init();
        new ActionHelper().setDriver(ThreadLocalDriver.getDriver());

    }




    @AfterSuite
    public void TearDown(){
        InitDriver.close();
    }
}
