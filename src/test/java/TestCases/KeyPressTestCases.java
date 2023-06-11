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
    public void PressEnterAndCheckThatTheMessageReturnedIsCorrect() throws InterruptedException{
        driver.findElement(By.linkText("Key Press")).click();
        keyPressPage.clickOnField();

        WebElement resultElement = driver.findElement(By.id("result"));
        String actualResultText = resultElement.getText();
        String expectedResultText = "You entered: ENTER";

        Assert.assertEquals(actualResultText, expectedResultText, "Entered text is incorrect");

    }


}
