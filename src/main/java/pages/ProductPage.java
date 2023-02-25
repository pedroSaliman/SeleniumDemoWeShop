package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPage extends ActionHelper {
    private static final By Result=By.xpath("//h1[normalize-space()='Build your own cheap computer']");
    private static final By TextOfCurrency=By.xpath("//span[text()=' €1548.00 ']");
    private static final By compareLink=By.xpath("//input[@value='Add to compare list']");

    public ComparePage CompareProduct(){
        performwait(e->e.until(d->find(compareLink).isDisplayed()));
        perform(compareLink, WebElement::isDisplayed,WebElement::click);
       // wait(compareLink);
      //  click(compareLink);
        return new ComparePage();
    }
    public ComparePage CompareAnotherProduct(){
        performwait(e->e.until(d->find(compareLink).isDisplayed()));
        perform(compareLink, WebElement::isDisplayed,WebElement::click);

        //wait(compareLink);
     //   click(compareLink);
        return new ComparePage();
    }


    public String Price(){
        return getText(TextOfCurrency);
    }


    public String message(){

        return getText(Result);
    }


}
