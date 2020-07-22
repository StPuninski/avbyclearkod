package pages;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public abstract class LoginPage extends BasePage{
    private static final By USERNAME_INPUT = By.id("login");
    private static final By PASSWORD_INPUT = By.id("password");
    private static final By LOGIN_BUTTON = By.cssSelector("div.page main.main div.layout-single div.layout__container div.layout__content.overlay-container div.flyer div.flyer__box div.flyer__body div.flyer__form form:nth-child(1) div.flyer__submit:nth-child(4) button.button.button--action > span.button__text\n");
    private static final By WAIT_LOAD = By.xpath("//div[@class='footer__app']//li[1]//a[1]//span[1]");
    private static final String LOGIN_URL = "https://av.by/login";

    @FindBy(id = "login")
    WebElement userNameInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(css = "div.page main.main div.layout-single div.layout__container div.layout__content.overlay-container div.flyer div.flyer__box div.flyer__body div.flyer__form form:nth-child(1) div.flyer__submit:nth-child(4) button.button.button--action > span.button__text\n")
    WebElement loginButton;
    @FindBy(xpath = "//div[@class='footer__app']//li[1]//a[1]//span[1]")
    WebElement waitLoad;

    public LoginPage(WebDriver driver){
        super(driver);
    }

    @Override
    public LoginPage openPage() {
        driver.get(LOGIN_URL);
        PageFactory.initElements(driver,this);
        isPageOpened();

        return this;
    }

    @Override
    public LoginPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOf(waitLoad));
        return this;
    }

    public AvByPage login(User user){
        userNameInput.sendKeys(user.getUserName());
        passwordInput.sendKeys(user.getPassword());
        loginButton.click();
        return new AvByPage(driver) {
            @Override
            public LoginPage openPage() {
                return null;
            }

            @Override
            public LoginPage isPageOpened() {
                return null;
            }

            @Override
            public void login(ChromeOptions chromeOptions) {

            }
        };
    }

    public abstract void login(ChromeOptions chromeOptions);
}
