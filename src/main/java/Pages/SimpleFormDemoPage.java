package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SimpleFormDemoPage extends BasePage {
    /*super can be used to refer immediate parent class instance variable.
    super can be used to invoke immediate parent class method.
    super() can be used to invoke immediate parent class constructor.*/
    public SimpleFormDemoPage(WebDriver driver){
            super(driver);
        }

        //Locators for Simple Input Field
        By TextField = By.id("user-message");
        By GetCheckedValue = By.id("showInput");

        //Locators for Two Input Fields
        By TwoInputFieldsEnterA = By.id("sum1");
        By TwoInputFieldsEnterB = By.id("sum2");
        By GetValuesButton = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div/div[1]/form/button");


        //Method to click on Single and Two input fiels
        public void selectTextField(String arg1) {
            driver.findElement(TextField).sendKeys(arg1);
        }
        public void clickOnGetCheckedValue(){ driver.findElement(GetCheckedValue).click();}
        public void enterA(){driver.findElement(TwoInputFieldsEnterA).click();}
        public void enterB(){driver.findElement(TwoInputFieldsEnterB).click();}
        public void clickOnGetValuesButton(){driver.findElement(GetValuesButton).click();}


    }
