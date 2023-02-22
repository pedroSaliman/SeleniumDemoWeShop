package pages;

import org.openqa.selenium.By;

public class ComparePage extends ActionHelper {
    private static final By Clear=By.xpath("//a[normalize-space()='Clear list']");
    private static final By Message=By.xpath("//div[@class='page-body']");
    public String Text(){
        wait(Message);
        return getText(Message);
    }

    public void RemoveProduct(){
        wait(Clear);
        click(Clear);
    }
}
