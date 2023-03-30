package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TestCases extends BaseTest{

//ConfigClass.getConfig().FirstName(),ConfigClass.getConfig().LastName(),  ConfigClass.getConfig().password(),ConfigClass.getConfig().confirm()
    @Test
    public void Register(){
        HomePage.getInstance().regClick().RegisterProcess(employee);
        Assert.assertTrue(new MyAccountPage().message().contains("complete"));
    }
    ///////////////////////////////////////////////////////////////////
    @Test(dependsOnMethods = {"Register"})
    public void Log(){
         HomePage.getInstance().LoginClick().LogIn(employee);
        Assert.assertEquals(new HomePage().Text(),"Log out");

    }


/*
*
*
*
* */

    @Test(dependsOnMethods = {"Log"})
    public void Search(){
        HomePage.getInstance().clicksearch(employee).clicktoproductpage();
        Assert.assertTrue(new ProductPage().message().contains("Build"));
    }

/*


*    Compare Case
*

* */

    @Test(dependsOnMethods = {"Search"})
    public void CompareCase(){
       ProductPage.getInstance().CompareProduct();
         SearchPage.getInstance().clickasus();
        ProductPage.getInstance().CompareProduct().RemoveProduct();
        Assert.assertTrue(new ComparePage().Text().contains("items"));



    }

}
