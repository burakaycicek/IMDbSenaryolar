package Util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementHelper {

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public ElementHelper(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.actions = new Actions(driver);
    }

    public WebElement presenceElement(By key){
        return
                wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }

    public WebElement findElement(By key){
        WebElement element = presenceElement(key);
        return element;
    }
    public void click (By key){
        findElement(key).click();
    }
    public void sendKey (By key, String text){
        findElement(key).sendKeys(text);
    }
    public void waitBySeconds(long seconds){

        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void select(By key, String text ){
        Select select = new Select(findElement(key));
        select.selectByVisibleText(text);
    }
    public void scrollWithAction (By key){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(key)).build().perform();
    }
    public String getUrl(By key, String href){
        return findElement(key).getAttribute(href);
    }
    public void assertionEqual(String text,String text2){
        try {
            Assert.assertEquals(text,text2);
            System.out.println("Karsilastirma Basarili");

        }catch (Exception e){
            System.out.println("Karsilastirma Basarisiz");
        }
    }
}
