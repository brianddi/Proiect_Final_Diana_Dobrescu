package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginButtonPage extends BasePage{
    public LoginButtonPage(WebDriver driver){
        super(driver);
        driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div/div[2]/div/div/div[2]/a[1]")).click();

        driver.findElement(By.id("email")).sendKeys("andreea.di.anna@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123!@#qwe");
        //driver.findElement(By.cssSelector("#app > div.userservice_section.bg-white > div > div > div > div.bg-white.xxxl\\:px-106.xxl\\:px-93.md\\:px-80.px-40.xxxl\\:py-50.xxl\\:py-44.py-38.login_part.shadow-md > div > form > div.w-full.custom__border.mt-20 > div > div > span")).click();
        driver.findElement(By.id("login-button")).click();



    }
    By clickLogin = By.xpath("/html/body/div[1]/header/nav/div/div/div[2]/div/div/div[2]/a[1]");
    public WebElement Login(){return driver.findElement(clickLogin);}
    public WebElement Error(){return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/form/div[1]/p"));}

}