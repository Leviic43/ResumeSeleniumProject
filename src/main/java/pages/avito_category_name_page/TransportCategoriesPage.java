package pages.avito_category_name_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class TransportCategoriesPage extends BasePage {
    public TransportCategoriesPage(WebDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
    public ArrayList<String> getAndSortBrands(){

        List<WebElement> realCars = driver.findElements(By.xpath("//div[@data-marker='popular-rubricator/links']//div[@data-marker='popular-rubricator/links/row']//a[@data-marker='popular-rubricator/link']"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-marker='popular-rubricator/link' and contains(text(), 'Changan')]")));
        ArrayList<String> realBrands = new ArrayList<>();
        for (WebElement car: realCars){
            String brand = car.getText();
            realBrands.add(brand);
        }
        Collections.sort(realBrands);
        return realBrands;
    }
}
