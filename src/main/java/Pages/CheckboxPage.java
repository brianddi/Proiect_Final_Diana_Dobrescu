package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxPage extends BasePage{
    public CheckboxPage(WebDriver driver){
        super(driver);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.id("isAgeSelected")).click();
    }
    By TxtAgeText = By.id("txtAge");
    public WebElement GetTxtAge(){return driver.findElement(TxtAgeText);}

    By SingleCheckbox = By.id("isAgeSelected");
    public void clickOnSingleCheckbox(){ driver.findElement(SingleCheckbox);}

    By FirstCheckboxOption = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[1]/input");
    public void clickOnTheFirstCheckboxOption(){driver.findElement(FirstCheckboxOption).click();}

    By SecondCheckboxOption = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[2]/input");
    public void clickOnTheSecondCheckboxOption(){driver.findElement(SecondCheckboxOption).click();}

    By ThirdCheckboxOption = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[3]/input");
    public void clickOnTheThirdCheckboxOption(){driver.findElement(ThirdCheckboxOption).click();}

    By FourthCheckboxOption = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[4]/input");
    public void clickOnTheFourthCheckboxOption(){driver.findElement(FourthCheckboxOption).click();}

    By CheckAllOption = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[4]/input");
    public void clickOnTheCheckAllButton(){driver.findElement(CheckAllOption).click();}
}