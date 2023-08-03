package Locator;

import org.openqa.selenium.By;

public class OscarPageLocator {

    public By scrollYear = By.id("event-history-edition-0");
    public By findYear = By.xpath("//li[@class='ipc-tab-arrow ipc-tab-arrow--visible ipc-tab-arrow--right']");
    public By click1920s = By.xpath("//li[@class='ipc-tab ipc-tab--on-base ipc-tab--active']");
    public By click1929 = By.xpath("//a[@id='event-history-edition-0']");
    public By scrollFilm = By.xpath("//button[@class='btn primary large']");
    public By clickFilm = By.xpath("(//div[@class='event-widgets__primary-nominees'])[37]");
    public By getDirectorUrl = By.xpath("(//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[1]");
    public By getWritersUrl1 = By.xpath("(//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[2]");
    public By getWritersUrl2 = By.xpath("(//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[3]");
    public By getWritersUrl3 = By.xpath("(//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[4]");
    public By getStarsUrl1 = By.xpath("(//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[5]");
    public By getStarsUrl2 = By.xpath("(//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[6]");
    public By getStarsUrl3 = By.xpath("(//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[7]");
    public By clickIMDb = By.id("home_img_holder");
    public By searchArea = By.xpath("//input[@class='imdb-header-search__input searchTypeahead__input react-autosuggest__input']");
    public By searchClick = By.id("react-autowhatever-navSuggestionSearch--item-2");

}
