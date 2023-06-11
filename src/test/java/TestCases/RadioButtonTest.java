package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.BasePage;
import Pages.RadioButtonPage;


public class RadioButtonTest extends BasePage {
    private RadioButtonPage radioButtonDemo;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        radioButtonDemo = new RadioButtonPage(driver);
    }

    @Test
    public void SelectMaleButton() throws InterruptedException{
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnFirstMale();
        radioButtonDemo.clickOnFirstGetValue();
        Assert.assertTrue(driver.getPageSource().contains("Radio button 'Male' is checked"));
    }
    @Test
    public void SelectFemaleButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnFirstFemale();
        radioButtonDemo.clickOnFirstGetValue();
        Assert.assertTrue(driver.getPageSource().contains("Radio button 'Female' is checked"));
    }
    @Test
    public void SelectSecondMaleButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnSecondMale();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(driver.getPageSource().contains("Male"));
    }
    @Test
    public void SelectSecondFemaleButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnSecondFemale();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(driver.getPageSource().contains("Female"));
    }
    @Test
    public void SelectOtherButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnOther();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(driver.getPageSource().contains("Other"));
    }
    @Test
    public void SelectFirstAgeButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnFirstAge();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(driver.getPageSource().contains("0-5"));
    }
    @Test
    public void SelectSecondAgeButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnSecondAge();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(driver.getPageSource().contains("5 - 15"));
    }
    @Test
    public void SelectThirdAgeButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnThirdAge();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(driver.getPageSource().contains("15 - 50"));
    }
    @Test
    public void SelectSecondMaleAndFirstAgeButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnSecondMale();
        radioButtonDemo.clickOnFirstAge();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(radioButtonDemo.isSecondMaleSelected());
        Assert.assertTrue(radioButtonDemo.isFirstAgeSelected());
    }

    @Test
    public void SelectSecondFemaleAndFirstAgeButton() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnSecondFemale();
        radioButtonDemo.clickOnFirstAge();
        radioButtonDemo.clickOnSecondGetValue();
        Assert.assertTrue(radioButtonDemo.isSecondMaleSelected());
        Assert.assertTrue(radioButtonDemo.isFirstAgeSelected());

}
}