package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

public class AvByPage extends BasePage {
    private static final By SEARCH  = By.xpath("//button[@id='submit_presearch']");
    private static final String URL = "https://av.by/";
    public AvByPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPage openPage() {
        return null;
    }

    @Override
    public LoginPage isPageOpened() {
        return null;
    }

    public SearchAutoPage clickSearchAuto(){
        isPageOpened();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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
}
//