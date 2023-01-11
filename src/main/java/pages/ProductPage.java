package pages;

import org.openqa.selenium.By;

public class ProductPage extends PageBase{
    private static final By Result=By.xpath("//h1[normalize-space()='Build your own cheap computer']");
    private static final By TextOfCurrency=By.xpath("//span[text()=' €1548.00 ']");
    private static final By compareLink=By.xpath("//input[@value='Add to compare list']");

    public ComparePage CompareProduct(){
        wait(compareLink);
        click(compareLink);
        return new ComparePage();
    }
    public ComparePage CompareAnotherProduct(){
        wait(compareLink);
        click(compareLink);
        return new ComparePage();
    }


    public String Price(){
        return getText(TextOfCurrency);
    }


    public String message(){

        return getText(Result);
    }


}
