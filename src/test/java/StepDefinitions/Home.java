package StepDefinitions;

import Pages.HomePage;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Home {
    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);
    @Given("IMDb ana sayfasi acilir")
    public void ımdbAnaSayfasiAcilir() {
    }

    @When("Menu butonuna tiklanir")
    public void menuButonunaTiklanir() {
        homePage.menu();
    }

    @When("Award & Events basliginin altinda bulunan Oscars butonuna tiklanir")
    public void awardEventsBasligininAltindaBulunanOscarsButonunaTiklanir() {
        homePage.oscars();
    }
}
