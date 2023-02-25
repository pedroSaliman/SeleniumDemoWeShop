package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage extends ActionHelper {
    private static final By desktp=By.xpath("//a[normalize-space()='Build your own cheap computer']");
    private static final By usedphone=By.xpath("//a[normalize-space()='Used phone']");
    private static final  By elct=By.xpath("//li[@class='inactive']//a[normalize-space()='Electronics']");
    private static final  By cellphone=By.xpath("//a[@title='Show products in category Cell phones'][normalize-space()='Cell phones']");
    public ProductPage clicktoproductpage(){
    //    click(desktp);
        perform(desktp, WebElement::isDisplayed,WebElement::click);
        return new ProductPage();
    }
    public ProductPage clickasus(){
   perform(elct, WebElement::isDisplayed,WebElement::click);

       // click(elct);
       perform(cellphone, WebElement::isDisplayed,WebElement::click);
       perform(usedphone, WebElement::isDisplayed,WebElement::click);

//click(cellphone);
//click(usedphone);
        return new ProductPage();
    }
}
