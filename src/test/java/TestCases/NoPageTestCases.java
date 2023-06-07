package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NoPageTestCases {

    private WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("web-driver.chrome.driver", "\"C:\\Users\\Toshiba\\Desktop\\Chromedriver winzip_32\\chromedriver.exe\"");
        driver = new ChromeDriver();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    /*@Test(priority = 1)
     public void SingleInputFieldMessage() {
     driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
     driver.findElement(By.id("user-message")).sendKeys("Hello, World!");
     driver.findElement(By.id("showInput")).click();
     Assert.assertTrue(true);
     }

    @Test(priority = 2)
    public void SingleInputFieldIsEmpty() {
    driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
    String expectedTitle = "Hello!";
    String actualTitle = driver.getTitle();
    Assert.assertNotEquals(actualTitle, expectedTitle, "Hello!");
     }

    @Test(priority = 3)
    public void SingleInputFieldWithNumbers() {
    driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
    driver.findElement(By.id("user-message")).sendKeys("13579");
    driver.findElement(By.id("showInput")).click();
    WebElement yourMessage = driver.findElement(By.id("message"));
    Assert.assertTrue(yourMessage.isDisplayed());
     }

    @Test(priority = 4)
    public void SingleInputFieldWithSpecialCharacters() {
    driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
    driver.findElement(By.id("user-message")).sendKeys("!@#$%");
    driver.findElement(By.id("showInput")).click();
    Assert.assertTrue(true);
     }

    @Test(priority = 5)
    public void SearchButtonIsEnabled () {
    driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
    WebElement searchButton = driver.findElement(By.id("showInput"));
    Assert.assertTrue(searchButton.isEnabled(), "Search button is not enabled");
     }

    @Test(priority = 6)
    public void testElementIsNotExistent() {
    driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
    WebElement nonExistentElement;
    try {
    nonExistentElement = driver.findElement(By.id("nonExistentElementId"));
    } catch (org.openqa.selenium.NoSuchElementException e) {
    nonExistentElement = null;
    }
    Assert.assertNull(nonExistentElement, "Element should not be present on the page");
    }

    @Test(priority = 7)
    public void ExpectedTitleVsActualTitle() {
    driver.get("https://www.lambdatest.com/selenium-playground/key-press");
    String expectedTitle = "Selenium Playground | LambdaTest";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle, "Title is not as expected");
     } */






}
