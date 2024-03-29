package pages;

import DataPojo.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HomePage extends ActionHelper {
    public static HomePage getInstance(){
        return new HomePage();
    }
    private static final By RegisterButton=By.xpath("//a[normalize-space()='Register']");
    private static final By Searchbar=By.xpath("//input[@id='small-searchterms']");
    private static final By LoginButton=By.xpath("//a[normalize-space()='Log in']");
    private static final By LogoutButton=By.xpath("//a[normalize-space()='Log out']");
    private static final By acountButtonText=By.xpath("//a[normalize-space()='Log out']");
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    public String Text(){
        return getText(acountButtonText);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    /////////////Register Click Button///////////////////
    public RegisterPage regClick(){
        perform(RegisterButton, WebElement::isDisplayed,WebElement::click);
      //  click(RegisterButton);
        return new RegisterPage();
    }
    //////////////Search///////
    public SearchPage clicksearch(Data data){
        perform(Searchbar,WebElement::isDisplayed,w->w.sendKeys(data.getProduct()));
        perform(Searchbar,WebElement::isDisplayed,w->w.sendKeys(Keys.ENTER));

       // type(Searchbar,product);
        //clickandpressenter(Searchbar);

        return new SearchPage();
    }
    ///////////////////////////////////////////
    public Login LoginClick(){
        perform(LogoutButton,WebElement::isDisplayed,WebElement::click);
        perform(LoginButton,WebElement::isDisplayed,WebElement::click);

//        click(LogoutButton);
//        click(LoginButton);

        return new Login();
    }

}
