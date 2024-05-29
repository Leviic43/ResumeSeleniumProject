package tests.searchapartment;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.avito_category_name_page.TransportCategoriesPage;
import pages.avito_category_name_page.TransportFiltersAndSearchPage;
import pages.avito_home.AvitoCategoriesPanel;
import pages.avito_home.AvitoHomePage;
import pages.avito_home.AvitoHomePageStories;
import tests.base.BaseTest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

import static constants.URLs.AVITO_HOME_PAGE;

public class PageTests extends BaseTest {

    @Test(priority = 1)
    public void openAutoPage() {
        page.open(AVITO_HOME_PAGE);
        new AvitoHomePage(driver).enterAutoPage().waitAfterAndBack();
    }

    @Test(priority = 2)
    public void openRealtyPage() {
        page.open(AVITO_HOME_PAGE);
        new AvitoHomePage(driver).enterRealtyPage().waitAfterAndBack();
    }

    @Test(priority = 3)
    public void openLisaStory() throws InterruptedException {
        page.open(AVITO_HOME_PAGE);
        new AvitoHomePageStories(driver).openLisaStory().closeStory();
    }

    @Test(priority = 4)
    public void typeMessage() {
        page.open(AVITO_HOME_PAGE);
        new AvitoHomePage(driver).typeMessage("Куплю гаражик!").searchButtonClick();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.navigate().back();
    }

    @Test(priority = 5)
    public void kamazBunkerTypeFind() {
        page.open(AVITO_HOME_PAGE);
        new AvitoCategoriesPanel(driver).categories().transportCategory().pickTrucksCategory();
        new TransportFiltersAndSearchPage(driver).selectBunkerBodyType().selectKamazBrandType().searchButtonClick();
    }

    @Test(priority = 6)
    public void twoHundredLetters() {
        page.open(AVITO_HOME_PAGE);
        AvitoHomePage avitoHomePage = new AvitoHomePage(driver);
        for (int i = 0; i < 40; i++) {
            avitoHomePage.typeMessage("Спам");
        }
        avitoHomePage.searchButtonClick();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.navigate().back();
    }

    @Test(priority = 7)
    public void isButtonsDisplayed() {
        page.open(AVITO_HOME_PAGE);
        AvitoHomePage avitoHomePage = new AvitoHomePage(driver);
        avitoHomePage.isAllButtonsDisplayed();
    }

    @Test(priority = 8)
    public void expectedCars() {
        page.open(AVITO_HOME_PAGE);
        new AvitoHomePage(driver).changeRegion().enterAutoPage();
        ArrayList<String> actualCars = new TransportCategoriesPage(driver).getAndSortBrands();
        System.out.println(Arrays.toString(actualCars.toArray()));
        Assert.assertEquals(28, actualCars.size());
    }
}