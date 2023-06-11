package TestCases;
import Pages.SimpleFormDemoPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.BasePage;

public class SimpleFormDemoTestCases extends BasePage {
    private SimpleFormDemoPage simpleFormPage;

    @BeforeMethod
    public void setUp(){
        super.setUp();
        simpleFormPage = new SimpleFormDemoPage(driver);
    }
    @Test
    public void writeTextThenClickOnTheGetCheckedValueButton() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("Test");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("Test"));
    }

    @Test
    public void writeTextAndNumbersThenClickOnTheGetCheckedValueButton() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("Test123");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("Test123"));
    }

    @Test
    public void writeNumbersThenClickOnTheGetCheckedValueButton() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("123");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("123"));
    }

    @Test
    public void writeSpecialCharactersThenClickOnTheGetCheckedValueButton() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("!?.,");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("!?.,"));
    }

    @Test
    public void writeTextNumbersAndSpecialCharactersThenClickOnTheGetCheckedValueButton() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("Test123!");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("Test123!"));
}


}
