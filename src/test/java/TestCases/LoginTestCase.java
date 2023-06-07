package TestCases;
import Pages.BasePage;
import Pages.LoginButtonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestCase extends BasePage {
    private LoginButtonPage loginButtonPage;


    @BeforeMethod
    public void setUp() {
        super.setUp();
        loginButtonPage = new LoginButtonPage(driver);

    }


    @Test
    public void clickLogin() throws InterruptedException {

        var error=loginButtonPage.Error();
        Assert.assertFalse(error.isDisplayed());

    }}

