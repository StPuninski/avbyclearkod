package tests;

import org.testng.annotations.Test;
import pages.AvByPage;
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

    @Test

    public void changeSettingProfile(){
        AvByPage id2 = loginPage
                .openPage()
                .login(user);
    }
}
