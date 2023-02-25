package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends ActionHelper {

    private static final By Gender= By.xpath("//input[@id='gender-male']");
    private static final By fName=By.xpath("//input[@id='FirstName']");
    private static final By lName=By.xpath("//input[@id='LastName']");
    private static final By Email=By.xpath("//input[@id='Email']");
    private static final By Password=By.xpath("//input[@id='Password']");
    private static final By ConfirmPassword=By.xpath("//input[@id='ConfirmPassword']");
    private static final By Submit=By.xpath("//input[@id='register-button']");

    public MyAccountPage RegisterProcess(String firstname,String lastname,String email,String password,String confirmpassword){
        perform(Gender, WebElement::isDisplayed,WebElement::click);
        perform(fName,WebElement::isDisplayed, e->e.sendKeys(firstname));
        perform(lName,WebElement::isDisplayed, e->e.sendKeys(lastname));
        perform(Email,WebElement::isDisplayed, e->e.sendKeys(email));
        perform(Password,WebElement::isDisplayed, e->e.sendKeys(password));
        perform(ConfirmPassword,WebElement::isDisplayed, e->e.sendKeys(confirmpassword));
        perform(Submit,WebElement::isDisplayed, WebElement::click);
//       click(Gender);
//       type(fName,firstname);
//       type(lName,lastname);
//       type(Email,email);
//       type(Password,password);
//       type(ConfirmPassword,confirmpassword);
//       click(Submit);
        return new MyAccountPage();
    }



}
