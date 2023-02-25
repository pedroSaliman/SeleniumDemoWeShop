package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Consumer;
import java.util.function.Predicate;

public  class ActionHelper {
    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        ActionHelper.driver = driver;
    }


    protected static void perform(By element, Predicate<WebElement> predicate, Consumer<WebElement> elementConsumer){
        elementConsumer.accept(find(element));
    }


    protected static void performwait(Consumer<WebDriverWait> elementConsumer){
        elementConsumer.accept(new WebDriverWait(driver,Duration.ofSeconds(10)));
    }



    protected static WebElement find(By locator) {
        return driver.findElement(locator);
    }
///////////////// ckick
//    protected void click(By locator) {
//        find(locator).click();
//    }
//    ///////// type method
//    protected void type(By locator,String val) {
//        find(locator).sendKeys(val);
//    }

////////////////////Get Text
    protected String getText(By locator) {
        String text = find(locator).getText();
        System.out.println("Text: " + text);
        return text;
    }

    /////////////// PressEnter
//protected void clickandpressenter(By locator)
//
//{
//    find(locator).sendKeys(Keys.ENTER);
//}
////////////////Select By index Method///////////////
protected static void select(Consumer<Select> select,By locator) {
    select.accept(new Select(find(locator)));
//      Select sel= new Select(find(locator));
//      sel.selectByIndex(number);
//}

}
}
