package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressPage extends BasePage{
    public KeyPressPage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[8]/a")).click();
        driver.findElement(By.id("my_field")).sendKeys("5");
    }
    By WebElementKeyPress1 = By.xpath("\"//*[@id=\\\"__next\\\"]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[8]/a\"");

    public void cLickOnSelenium1(){driver.findElement(WebElementKeyPress1).click();}
    By WebElementKeyPress= By.xpath("//*[@id=\"my_field\"]");
    public void cLickOnSelenium(){driver.findElement(WebElementKeyPress).click();}}
