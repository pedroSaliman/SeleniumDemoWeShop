package pages;

import org.openqa.selenium.By;

public class Login extends ActionHelper {

    private static final By Email=By.xpath("//input[@id='Email']");
    private static final By password=By.xpath("//input[@id='Password']");
    private static final By button=By.xpath("//input[@value='Log in']");

    public HomePage LogIn(String email,String thpass){
    type(Email,email);
    type(password,thpass);
    click(button);

        return new HomePage();
    }

}
