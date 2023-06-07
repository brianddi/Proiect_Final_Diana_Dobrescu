package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage extends BasePage{
    public RadioButtonPage(WebDriver driver){
        super(driver);

    }
    By CloseWindow = By.id("exit_popup_close");
    public void CloseWindow(){driver.findElement(CloseWindow).click();}
    By RadioButtonDemo = By.xpath("//*[@id=\"__next\"]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[1]/a");
    public void RadioButtonDemo(){driver.findElement(RadioButtonDemo).click();}
    By radioButton = By.xpath("//*[@id=\"__next\"]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[1]/a");
    public void radioButton(){driver.findElement(radioButton).click();}

}