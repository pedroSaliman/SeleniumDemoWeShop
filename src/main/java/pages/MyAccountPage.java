package pages;

import org.openqa.selenium.By;

public class MyAccountPage extends PageBase{
    private static final By Result=By.xpath("//div[@class='result']");
    public String message(){
        return getText(Result);

    }
}
