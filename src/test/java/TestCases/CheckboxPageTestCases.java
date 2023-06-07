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
        Assert.assertEquals(checkbutton.isSelected(),true);
    }

}

