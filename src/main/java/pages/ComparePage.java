package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ComparePage extends ActionHelper {
    private static final By Clear=By.xpath("//a[normalize-space()='Clear list']");
    private static final By Message=By.xpath("//div[@class='page-body']");
    public String Text(){
        performwait(e->e.until(d->find(Message).isDisplayed()));

      //  wait(Message);
        return getText(Message);
    }

    public void RemoveProduct(){
        performwait(e->e.until(d->find(Clear).isDisplayed()));

      //  wait(Clear);
        perform(Clear, WebElement::isDisplayed,WebElement::click);
      //  click(Clear);
    }
}
