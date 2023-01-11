package pages;

import org.openqa.selenium.By;

public class SearchPage extends PageBase{
    private static final By desktp=By.xpath("//a[normalize-space()='Build your own cheap computer']");
    private static final By usedphone=By.xpath("//a[normalize-space()='Used phone']");
    private static final  By elct=By.xpath("//li[@class='inactive']//a[normalize-space()='Electronics']");
    private static final  By cellphone=By.xpath("//a[@title='Show products in category Cell phones'][normalize-space()='Cell phones']");
    public ProductPage clicktoproductpage(){
        click(desktp);
        return new ProductPage();
    }
    public ProductPage clickasus(){
click(elct);

click(cellphone);
click(usedphone);
        return new ProductPage();
    }
}
