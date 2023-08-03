package Pages;

import Locator.OscarPageLocator;
import Util.ElementHelper;
import org.openqa.selenium.WebDriver;

public class OscarPage extends OscarPageLocator {

    static WebDriver driver;
    static ElementHelper elementHelper;

    public OscarPage(WebDriver driver){
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    private String directorUrl;
    private String writerUrl1;
    private String writerUrl2;
    private String writerUrl3;
    private String starsUrl1;
    private String starsUrl2;
    private String starsUrl3;

    private String searchDricetor;
    private String  searchWriter1;
    private String  searchWriter2;
    private String  searchWriter3;
    private String searchStarsUrl1;
    private String searchStarsUrl2;
    private String searchStarsUrl3;



    public void year() {
        elementHelper.scrollWithAction(scrollYear);
        elementHelper.waitBySeconds(2);
        elementHelper.click(findYear);
        elementHelper.waitBySeconds(2);
        elementHelper.click(click1920s);
        elementHelper.waitBySeconds(2);
        elementHelper.click(click1929);
        elementHelper.waitBySeconds(2);
    }

    public void film() {
        elementHelper.scrollWithAction(scrollFilm);
        elementHelper.click(clickFilm);
        elementHelper.waitBySeconds(2);
    }

    public void director() {
        directorUrl = elementHelper.getUrl(getDirectorUrl,"href");
        System.out.println(directorUrl);
        elementHelper.waitBySeconds(2);
    }

    public void writer() {
        writerUrl1 = elementHelper.getUrl(getWritersUrl1,"href");
        System.out.println(writerUrl1);
        elementHelper.waitBySeconds(2);
        writerUrl2 = elementHelper.getUrl(getWritersUrl2,"href");
        System.out.println(writerUrl2);
        elementHelper.waitBySeconds(2);
        writerUrl3 = elementHelper.getUrl(getWritersUrl3,"href");
        System.out.println(writerUrl3);
        elementHelper.waitBySeconds(2);

    }

    public void stars() {
        starsUrl1 = elementHelper.getUrl(getStarsUrl1,"href");
        System.out.println(starsUrl1);
        elementHelper.waitBySeconds(2);

        starsUrl2 = elementHelper.getUrl(getStarsUrl2,"href");
        System.out.println(writerUrl2);
        elementHelper.waitBySeconds(2);

        starsUrl3 = elementHelper.getUrl(getStarsUrl3,"href");
        System.out.println(writerUrl3);
        elementHelper.waitBySeconds(2);

    }

    public void goHomePage() {
        elementHelper.click(clickIMDb);
        elementHelper.waitBySeconds(2);
        elementHelper.sendKey(searchArea,"The Jazz Singer");
        elementHelper.waitBySeconds(2);
        elementHelper.click(searchClick);
        elementHelper.waitBySeconds(2);
    }

    public void check() {

        searchDricetor = elementHelper.getUrl(getDirectorUrl,"href");
        System.out.println(directorUrl);
        elementHelper.waitBySeconds(2);

        searchWriter1 = elementHelper.getUrl(getWritersUrl1,"href");
        System.out.println(writerUrl1);
        elementHelper.waitBySeconds(2);
        searchWriter2 = elementHelper.getUrl(getWritersUrl2,"href");
        System.out.println(writerUrl2);
        elementHelper.waitBySeconds(2);
        searchWriter3 = elementHelper.getUrl(getWritersUrl3,"href");
        System.out.println(writerUrl3);
        elementHelper.waitBySeconds(2);

        searchStarsUrl1 = elementHelper.getUrl(getStarsUrl1,"href");
        System.out.println(starsUrl1);
        elementHelper.waitBySeconds(2);

        searchStarsUrl2 = elementHelper.getUrl(getStarsUrl2,"href");
        System.out.println(writerUrl2);
        elementHelper.waitBySeconds(2);

        searchStarsUrl3 = elementHelper.getUrl(getStarsUrl3,"href");
        System.out.println(writerUrl3);
        elementHelper.waitBySeconds(2);

        elementHelper.assertionEqual(directorUrl,searchDricetor);
        elementHelper.waitBySeconds(3);
        elementHelper.assertionEqual(writerUrl1,searchWriter1);
        elementHelper.waitBySeconds(3);
        elementHelper.assertionEqual(writerUrl2,searchWriter2);
        elementHelper.waitBySeconds(3);
        elementHelper.assertionEqual(writerUrl3,searchWriter3);
        elementHelper.waitBySeconds(3);
        elementHelper.assertionEqual(starsUrl1,searchStarsUrl1);
        elementHelper.waitBySeconds(3);
        elementHelper.assertionEqual(starsUrl2,searchStarsUrl2);
        elementHelper.waitBySeconds(3);
        elementHelper.assertionEqual(starsUrl3,searchStarsUrl3);
        elementHelper.waitBySeconds(3);



    }
}
