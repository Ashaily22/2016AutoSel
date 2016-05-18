package CommonApi;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Shaily on 4/27/2016.
 */
public class Base {


    public WebDriver driver=null;
    @BeforeMethod
    public void setUp()
    {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to("http://www.cnn.com");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }


    //Helping method
public void clickOnCSS(String locator)
{
    driver.findElement(By.cssSelector(locator)).click();
}
    public void typeOnCSS(String locator,String value)
    {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }


}
