package Tests;

import Factory.ConfigClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TestCases extends BaseTest{


    @Test
    public void Register(){
        new HomePage().regClick().RegisterProcess(ConfigClass.getConfig().FirstName(),ConfigClass.getConfig().LastName(),  email,ConfigClass.getConfig().password(),ConfigClass.getConfig().confirm());
        Assert.assertTrue(new MyAccountPage().message().contains("complete"));
    }
    ///////////////////////////////////////////////////////////////////
    @Test(dependsOnMethods = {"Register"})
    public void Log(){
        new HomePage().LoginClick().LogIn(email, ConfigClass.getConfig().password());
        Assert.assertEquals(new HomePage().Text(),"Log out");

    }


/*
*
*
*
* */

    @Test(dependsOnMethods = {"Log"})
    public void Search(){
        new HomePage().clicksearch(ConfigClass.getConfig().product()).clicktoproductpage();
        Assert.assertTrue(new ProductPage().message().contains("Build"));
    }

/*


*    Compare Case
*

* */

    @Test(dependsOnMethods = {"Search"})
    public void CompareCase(){
       new ProductPage().CompareProduct();
        new SearchPage().clickasus();
        new ProductPage().CompareProduct().RemoveProduct();
        Assert.assertTrue(new ComparePage().Text().contains("items"));



    }

}
