package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class SearchAutoPage extends BasePage {

    private static final String URL = "https://cars.av.by/search/extended?brand_id%5B%5D=&model_id%5B%5D=&year_from=&year_to=&currency=USD&price_from=&price_to=";
    private static final By SEARCH_BUTTON = By.xpath("//a[@class='button button-primary button-block js-submit-search-link']");

    public SearchAutoPage(WebDriver driver) {
        super(driver);
    }

    public SearchAutoPage newSearch(){
        try {
            Thread.sleep(5000        );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(SEARCH_BUTTON).click();
        return this;
    }
//    public SearchAutoPage SearchYourAuto(){
//        Нужно ввести запрос поиска
//    }
}
