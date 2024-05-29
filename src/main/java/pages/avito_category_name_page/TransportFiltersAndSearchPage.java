package pages.avito_category_name_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TransportFiltersAndSearchPage extends BasePage {


    public TransportFiltersAndSearchPage(WebDriver driver) {
        super(driver);
    }


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));


    private final By bodyTypeFind = By.xpath("//input[contains(@data-marker, 'params[110705]/multiselect-outline-input')]");
    private final By brandTypeFind = By.xpath("//input[contains(@data-marker, 'params[110599]/multiselect')]");
    private final By searchWithFiltersButton = By.xpath("//button[@data-marker='search-filters/submit-button']");
    JavascriptExecutor executor = (JavascriptExecutor)driver;

    public TransportFiltersAndSearchPage selectBunkerBodyType(){
        By bunkerTruck = By.xpath("//div[text() = 'Бункер']");
        WebElement typeSelector = driver.findElement((bodyTypeFind));
        typeSelector.sendKeys("Бун");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement selectType = driver.findElement((bunkerTruck));
        selectType.click();
        executor.executeScript("arguments[0].scrollIntoView(true);", typeSelector);
        return this;
    }

    public TransportFiltersAndSearchPage selectKamazBrandType (){
        By kamaz = By.xpath("//div[text() = 'КАМАЗ']");
        WebElement brandSelector = driver.findElement(brandTypeFind);
        brandSelector.click();
        brandSelector.sendKeys("Кам");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement selectBrand = driver.findElement(kamaz);
        selectBrand.click();
        executor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(searchWithFiltersButton));
        return this;
    }
    public TransportFiltersAndSearchPage searchButtonClick(){
        WebElement searchButton = driver.findElement(searchWithFiltersButton);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement((searchWithFiltersButton)).click();
        return this;
    }
}
