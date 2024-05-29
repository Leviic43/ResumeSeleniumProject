package pages.avito_home;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import java.time.Duration;

public class AvitoHomePageStories extends BasePage {


    public AvitoHomePageStories(WebDriver driver) {
        super(driver);
    }

    private WebElement lisaStory = driver.findElement(By.xpath("//div[text()='Помогаем «ЛизаАлерт»']"));



    public AvitoHomePageStories waitAfterAndBack() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.navigate().back();
        return this;
    }


    public AvitoHomePageStories openLisaStory() {
        lisaStory.click();
        return this;
    }
    public AvitoHomePageStories closeStory () throws InterruptedException {
        Thread.sleep(2000);
        WebElement closeStory = driver.findElement(By.xpath("//button[text()='Закрыть']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        closeStory.click();
        return this;
    }

}
