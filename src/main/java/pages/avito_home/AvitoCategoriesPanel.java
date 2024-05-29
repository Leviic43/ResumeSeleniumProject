package pages.avito_home;
import io.qameta.allure.internal.shadowed.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.base.BasePage;
import constants.Parameters;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;


public class AvitoCategoriesPanel extends BasePage {
    public AvitoCategoriesPanel(WebDriver driver) {
        super(driver);
    }
    Actions actions = new Actions(driver);

    private WebElement categoriesLocator = driver.findElement(By.xpath("//div[starts-with(@class, 'top-rubricator-buttonText')]"));
    private final By transportCategory = By.xpath("//p[contains(text(), 'Транспорт')]");
    private final By truckCategory = By.xpath("//span[contains(text(), 'Грузовики')]");

    public AvitoCategoriesPanel() {

    }


    public AvitoCategoriesPanel categories(){
        categoriesLocator.click();
        return this;
    }

    public AvitoCategoriesPanel transportCategory(){

        WebElement transpCategory = driver.findElement(transportCategory);
        actions.moveToElement(transpCategory);
        return this;
    }

    public AvitoCategoriesPanel pickTrucksCategory () {
        WebElement trucks = driver.findElement(truckCategory);
        trucks.click();
        return this;
    }
}
