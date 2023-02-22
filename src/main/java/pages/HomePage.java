package pages;

import org.openqa.selenium.By;

public class HomePage extends ActionHelper {
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
        click(RegisterButton);
        return new RegisterPage();
    }
    //////////////Search///////
    public SearchPage clicksearch(String product){
        type(Searchbar,product);
        clickandpressenter(Searchbar);

        return new SearchPage();
    }
    ///////////////////////////////////////////
    public Login LoginClick(){
click(LogoutButton);
        click(LoginButton);

        return new Login();
    }

}
