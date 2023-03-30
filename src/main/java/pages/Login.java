package pages;

import DataPojo.Data;
import DataPojo.EmailGenerate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends ActionHelper {

    private static final By Email=By.xpath("//input[@id='Email']");
    private static final By password=By.xpath("//input[@id='Password']");
    private static final By button=By.xpath("//input[@value='Log in']");

    public HomePage LogIn(Data data){
        perform(Email,WebElement::isDisplayed,e->e.sendKeys(EmailGenerate.Email()));
        perform(password,WebElement::isDisplayed,e->e.sendKeys(data.getPassword()));
        perform(button, WebElement::isDisplayed,WebElement::click);
//    type(Email,email);
//    type(password,thpass);
//    click(button);

        return new HomePage();
    }

}
