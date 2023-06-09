package TestCases;

import Pages.BasePage;
import Pages.KeyPressPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyPressTestCases extends BasePage {
    private KeyPressPage keyPressPage;



    @BeforeMethod
    public void setUp(){
        super.setUp();
        keyPressPage = new KeyPressPage(driver);}

    @Test
    public void PressAkeyAndseeWhatyouInputted() throws InterruptedException{
        keyPressPage.cLickOnSelenium();
        WebElement searchResult = driver.findElement(By.id("my_field"));
        Assert.assertTrue(searchResult.isDisplayed(),"NUMPAD5"); ;

    }


}
