package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

        public class SingleWindowPopUpModalTestCases {
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


            @Test(priority = 1)
            public void followOnTwitter() {
                driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
                WebElement twitterButton = driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div[1]/div/div[1]/a"));

                twitterButton.click();

                String mainWindowHandle = driver.getWindowHandle();
                for (String handle : driver.getWindowHandles()) {
                    if (!handle.equals(mainWindowHandle)) {
                        driver.switchTo().window(handle);
                    }
                }
                driver.close();
            }

            @Test(priority = 2)
            public void likeUsOnFacebook() {
                driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
                WebElement facebookButton = driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div[1]/div/div[2]/a"));

                facebookButton.click();

                String mainWindowHandle = driver.getWindowHandle();
                for (String handle : driver.getWindowHandles()) {
                    if (!handle.equals(mainWindowHandle)) {
                        driver.switchTo().window(handle);
                    }
                }

                driver.close();
            }

            @Test(priority = 3)
            public void followUsOnLinkedin() {
                driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
                WebElement linkedinButton = driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div[1]/div/div[3]/a"));

                linkedinButton.click();

                // Get the window handles
                String mainWindowHandle = driver.getWindowHandle();
                for (String handle : driver.getWindowHandles()) {
                    if (!handle.equals(mainWindowHandle)) {
                       driver.switchTo().window(handle);
                    }
                }

                driver.close();
            }
            }

