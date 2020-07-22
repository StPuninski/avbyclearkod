package tests;

import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import pages.AvByPage;
import pages.LoginPage;
import pages.SearchAutoPage;
import utils.CapabilitiesGenerator;

public class BaseTest {
    WebDriver driver;
    LoginPage loginPage;
    SearchAutoPage searchAutoPage;
    AvByPage avByPage;

    User user = new User("poltosik_92@mail.ru", "poltosik");


    @BeforeMethod
    public void setUp(ITestContext context) {
        driver = new ChromeDriver(CapabilitiesGenerator.getChromeOptions());
        loginPage = new LoginPage(driver) {
            @Override
            public void login(ChromeOptions chromeOptions) {

            }
        };}
}