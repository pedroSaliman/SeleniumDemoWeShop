package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TestCases extends BaseTest{


    @Test
    public void Register(){
        new HomePage().regClick().RegisterProcess(config.fname(),config.lname(),  email,config.password(),config.confirm());
        Assert.assertTrue(new MyAccountPage().message().contains("complete"));
    }
    ///////////////////////////////////////////////////////////////////
    @Test(dependsOnMethods = {"Register"})
    public void Log(){
        new HomePage().LoginClick().LogIn(email, config.password());
        Assert.assertEquals(new HomePage().Text(),"Log out");

    }

    ///////////////////////////////////////////////////////////////////////////





/////////////////////////////////////////////////

    @Test(dependsOnMethods = {"Log"})
    public void Search(){
        new HomePage().clicksearch(config.product()).clicktoproductpage();
        Assert.assertTrue(new ProductPage().message().contains("Build"));
    }

    //////////////////////////////////////////////////////////
    @Test(dependsOnMethods = {"Search"})
    public void CompareCase(){
       new ProductPage().CompareProduct();
        new SearchPage().clickasus();
        new ProductPage().CompareProduct().RemoveProduct();
        Assert.assertTrue(new ComparePage().Text().contains("items"));



    }

}
