package Pages;

import Locator.HomePageLocator;
import Util.ElementHelper;
import org.openqa.selenium.WebDriver;

public class HomePage extends HomePageLocator {
    static WebDriver driver;
    static ElementHelper elementHelper;

    public HomePage(WebDriver driver){
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void menu() {

        elementHelper.click(clickMenu);
        elementHelper.waitBySeconds(3);
        elementHelper.click(clickOscars);
        elementHelper.waitBySeconds(3);

    }


    public void oscars() {
    }
}
