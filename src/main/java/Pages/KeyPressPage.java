package Pages;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressPage extends BasePage {
    public KeyPressPage(WebDriver driver) {
        super(driver);
    }

    By fieldLocator = By.id("my_field");
    public void clickOnField(){driver.findElement(fieldLocator).sendKeys(Keys.ENTER);}
}

