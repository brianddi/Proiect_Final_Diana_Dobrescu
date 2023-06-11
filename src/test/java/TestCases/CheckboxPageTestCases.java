package TestCases;

import Pages.BasePage;
import Pages.CheckboxPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxPageTestCases extends BasePage {
    private CheckboxPage checkboxPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        checkboxPage = new CheckboxPage(driver);
    }
    @Test
    public void clickOnTheSingleCheckboxCheckmark() throws InterruptedException {
        checkboxPage.GetTxtAge();
        var text = driver.findElement(By.id("txtAge"));
        Assert.assertEquals(text.getText(), "Checked");
    }
    @Test
    public void clickOnButtonCheckAll() throws InterruptedException {
        checkboxPage.clickOnTheCheckAllButton();
        var checkbutton = driver.findElement(By.xpath("//*[@id=\"isAgeSelected\"]"));
        Assert.assertEquals(checkbutton.isSelected(), true);
    }
    @Test
    public void clickOnTheFirstCheckboxOption() throws InterruptedException {
        checkboxPage.clickOnTheFirstCheckboxOption();
        var checkbutton = driver.findElement(By.id("ex1-check1"));
        Assert.assertEquals(checkbutton.isSelected(), true);
    }
    @Test
    public void clickOnTheSecondCheckboxOption() throws InterruptedException {
        checkboxPage.clickOnTheSecondCheckboxOption();
        var checkbutton = driver.findElement(By.id("ex1-check2"));
        Assert.assertEquals(checkbutton.isSelected(), true);
    }
    @Test
    public void clickOnTheThirdCheckboxOption() throws InterruptedException {
        checkboxPage.clickOnTheThirdCheckboxOption();
        var checkbutton = driver.findElement(By.id("ex1-check3"));
        Assert.assertEquals(checkbutton.isSelected(), true);
    }
    @Test
    public void clickOnTheFourthCheckboxOption() throws InterruptedException {
        checkboxPage.clickOnTheFourthCheckboxOption();
        var checkbutton = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[4]/input"));
        Assert.assertEquals(checkbutton.isSelected(), true);
    }
}