package tests;

import org.testng.annotations.Test;
import pages.SearchAutoPage;

public class AvByTest extends BaseTest{


    @Test

    public void searchAutoAvBy(){
        SearchAutoPage uniqueId = loginPage
                .openPage()
                .login(user)
                .clickSearchAuto()
                .newSearch();
        ;

    }
}
