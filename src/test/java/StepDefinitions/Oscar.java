package StepDefinitions;

import Pages.OscarPage;
import Util.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import sun.java2d.pipe.DrawImage;

public class Oscar {

    WebDriver driver = DriverFactory.getDriver();
    OscarPage oscarPage = new OscarPage(driver);
    @When("Event History basligi altinda yil secilir.")
    public void eventHistoryBasligiAltindaYilSecilir() {
        oscarPage.year();

    }

    @When("Honory Award basligi altinda The Jazz Singer secilir")
    public void honoryAwardBasligiAltindaTheJazzSingerSecilir() {
        oscarPage.film();
    }

    @When("Director bilgisi kayıt edilir")
    public void directorBilgisiKayıtEdilir() {
        oscarPage.director();
    }

    @When("Writer bilgisi kayit edilir")
    public void writerBilgisiKayitEdilir() {
        oscarPage.writer();
    }

    @When("Stars bilgisi kayit edilir")
    public void starsBilgisiKayitEdilir() {
        oscarPage.stars();
    }

    @When("Ekranin sol üstünde bulunan IMDb butonuna tiklanarak Anasayfaya gidilir")
    public void ekraninSolÜstündeBulunanIMDbButonunaTiklanarakAnasayfayaGidilir() {
        oscarPage.goHomePage();
    }

    @Then("Director, Writer , Stars kayit edilenle ayni olup olmadigi kontrol edilir.")
    public void directorWriterStarsKayitEdilenleAyniOlupOlmadigiKontrolEdilir() {
        oscarPage.check();
    }
}
