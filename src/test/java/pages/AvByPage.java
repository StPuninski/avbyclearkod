package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

public abstract class AvByPage extends BasePage {
    private static final By SEARCH  = By.xpath("//button[@id='submit_presearch']");
    private static final String URL = "https://av.by/";
    public AvByPage(WebDriver driver) {
        super(driver);
    }
    public SearchAutoPage clickSearchAuto(){
        isPageOpened();
        driver.findElement(SEARCH).click();
                return new SearchAutoPage(driver) {
            @Override
            public LoginPage openPage() {
                return null;
            }

            @Override
            public LoginPage isPageOpened() {
                return null;
            }
        };
    }

    public abstract void login(ChromeOptions chromeOptions);
}
//