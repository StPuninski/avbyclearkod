package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class SearchAutoPage extends BasePage {

    private static final String URL = "https://cars.av.by/search/extended?brand_id%5B%5D=&model_id%5B%5D=&year_from=&year_to=&currency=USD&price_from=&price_to=";
    private static final By SEARCH_BUTTON = By.cssSelector(".button button-primary");

    public SearchAutoPage(WebDriver driver) {
        super(driver);
    }

    public SearchAutoPage newSearch(){
        driver.findElement(SEARCH_BUTTON).click();
        return null;
    }

}
