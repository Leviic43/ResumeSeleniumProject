package pages.avito_home;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import pages.base.BasePage;

import java.time.Duration;

public class AvitoHomePage extends BasePage {


    public AvitoHomePage(WebDriver driver) {
        super(driver);
    }

    private final By autoButton = By.xpath("//*[@data-marker='visual-rubricator/image-Авто']");
    private final By realtyButton = By.xpath("//*[@data-marker='visual-rubricator/image-Недвижимость']");
    private final By workButton = By.xpath("//*[@data-marker='visual-rubricator/image-Работа']");
    private final By clothesButton = By.xpath("//*[@data-marker='visual-rubricator/image-Одежда, обувь, аксессуары']");
    private final By hobbyButton = By.xpath("//*[@data-marker='visual-rubricator/image-Хобби и отдых']");
    private final By animalsButton = By.xpath("//*[@data-marker='visual-rubricator/image-Животные']");
    private final By businessButton = By.xpath("//*[starts-with(@data-marker,'visual-rubricator/image-Готовый бизнес и')]");
    private final By servicesButton = By.xpath("//*[@data-marker='visual-rubricator/image-Услуги']");
    private final By sparePartsButton = By.xpath("//*[@data-marker='visual-rubricator/image-Запчасти']");
    private final By electronicsButton = By.xpath("//*[@data-marker='visual-rubricator/image-Электроника']");
    private final By forHomeButton = By.xpath("//*[@data-marker='visual-rubricator/image-Для дома и дачи']");
    private final By forKidsButton = By.xpath("//*[@data-marker='visual-rubricator/image-Товары для детей']");
    private final By travelButton = By.xpath("//*[@data-marker='visual-rubricator/image-Путешествия']");
    private final By healthButton = By.xpath("//*[@data-marker='visual-rubricator/image-Красота и здоровье']");
    private final By findField = By.xpath("//input[@data-marker='search-form/suggest']");
    private final By findButton = By.xpath("//button[contains(., 'Найти')]");
    private final By regionMoscow = By.xpath("//span[@data-attribute-tag='block']//span[text()='Москва']");
    private final By regionButton = By.xpath("//span[@class]//span[@data-attribute-tag='block']");
    private final By clearRegion = By.xpath("//button[@data-marker='popup-location/region/clearButton']");
    private final By findRegionField = By.xpath("//input[@data-marker='popup-location/region/search-input']");
    private final By moscowInSelector = By.xpath("(//strong[text()='Москва'])[1]");
    private final By acceptChanges = By.xpath("//button[@data-marker='popup-location/save-button']");




    public AvitoHomePage waitAfterAndBack() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.navigate().back();
        return this;
    }

    public AvitoHomePage enterAutoPage() {
        WebElement autoButtonElement = driver.findElement(autoButton);
        autoButtonElement.click();
        return this;
    }

    public AvitoHomePage enterRealtyPage() {
        WebElement realtyButtonElement = driver.findElement(realtyButton);
        realtyButtonElement.click();
        return this;
    }

    public AvitoHomePage typeMessage(String message) {
        WebElement findFieldElement = driver.findElement(findField);
        findFieldElement.click();
        findFieldElement.sendKeys(message);
        return this;
    }

    public AvitoHomePage searchButtonClick() {
        WebElement findButtonElement = driver.findElement(findButton);
        findButtonElement.click();
        return this;
    }

    public AvitoHomePage isAutoButtonDisplayed() {
        WebElement autoButtonElement = driver.findElement(autoButton);
        Boolean autoButtonDisplayed = autoButtonElement.isDisplayed();
        Assert.assertTrue(autoButtonDisplayed, "Element is missing");
        System.out.println("Отображение элемента \"Авто\": " + autoButtonDisplayed);
        return this;
    }

    public AvitoHomePage isRealtyButtonDisplayed() {
        WebElement realtyButtonElement = driver.findElement(realtyButton);
        Boolean realtyButtonDisplayed = realtyButtonElement.isDisplayed();
        Assert.assertTrue(realtyButtonDisplayed, "Element is missing");
        System.out.println("Отображение элемента \"Недвижимость\": " + realtyButtonDisplayed);
        return this;
    }

    public AvitoHomePage isWorkButtonDisplayed() {
        WebElement workButtonElement = driver.findElement(workButton);
        Boolean workButtonDisplayed = workButtonElement.isDisplayed();
        Assert.assertTrue(workButtonDisplayed, "Element is missing");
        System.out.println("Отображение элемента \"Работа\": " + workButtonDisplayed);
        return this;
    }

    public AvitoHomePage isClothesButtonDisplayed() {
        WebElement clothesButtonElement = driver.findElement(clothesButton);
        Boolean clothesButtonDisplayed = clothesButtonElement.isDisplayed();
        Assert.assertTrue(clothesButtonDisplayed, "Element is missing");
        System.out.println("Отображение элемента \"Одежда, обувь, аксессуары\": " + clothesButtonDisplayed);
        return this;
    }

    public AvitoHomePage isHobbyButtonDisplayed() {
        WebElement hobbyButtonElement = driver.findElement(hobbyButton);
        Boolean hobbyButtonDisplayed = hobbyButtonElement.isDisplayed();
        Assert.assertTrue(hobbyButtonDisplayed, "Element is missing");
        System.out.println("Отображение элемента \"Хобби и отдых\": " + hobbyButtonDisplayed);
        return this;
    }

    public AvitoHomePage isAnimalsButtonDisplayed() {
        WebElement animalsButtonElement = driver.findElement(animalsButton);
        Boolean animalsButtonDisplayed = animalsButtonElement.isDisplayed();
        Assert.assertTrue(animalsButtonDisplayed, "Element is missing");
        System.out.println("Отображение элемента \"Животные\": " + animalsButtonDisplayed);
        return this;
    }

    public AvitoHomePage isBusinessButtonDisplayed() {
        WebElement businessButtonElement = driver.findElement(businessButton);
        Boolean businessButtonDisplayed = businessButtonElement.isDisplayed();
        Assert.assertTrue(businessButtonDisplayed, "Element is missing");
        System.out.println("Отображение элемента \"Готовый бизнес и оборудование\": " + businessButtonDisplayed);
        return this;
    }

    public AvitoHomePage isServicesButtonDisplayed() {
        WebElement servicesButtonElement = driver.findElement(servicesButton);
        Boolean servicesButtonDisplayed = servicesButtonElement.isDisplayed();
        Assert.assertTrue(servicesButtonDisplayed, "Element is missing");
        System.out.println("Отображение элемента \"Услуги\": " + servicesButtonDisplayed);
        return this;
    }

    public AvitoHomePage isSparePartsButtonDisplayed() {
        WebElement sparePartsButtonElement = driver.findElement(sparePartsButton);
        Boolean sparePartsButtonDisplayed = sparePartsButtonElement.isDisplayed();
        Assert.assertTrue(sparePartsButtonDisplayed, "Element is missing");
        System.out.println("Отображение элемента \"Запчасти\": " + sparePartsButtonDisplayed);
        return this;
    }

    public AvitoHomePage isElectronicsButtonDisplayed() {
        WebElement electronicsButtonElement = driver.findElement(electronicsButton);
        Boolean electronicsButtonDisplayed = electronicsButtonElement.isDisplayed();
        Assert.assertTrue(electronicsButtonDisplayed, "Element is missing");
        System.out.println("Отображение элемента \"Электроника\": " + electronicsButtonDisplayed);
        return this;
    }

    public AvitoHomePage isForHomeButtonDisplayed() {
        WebElement forHomeButtonElement = driver.findElement(forHomeButton);
        Boolean forHomeButtonDisplayed = forHomeButtonElement.isDisplayed();
        Assert.assertTrue(forHomeButtonDisplayed, "Element is missing");
        System.out.println("Отображение элемента \"Для дома и дачи\": " + forHomeButtonDisplayed);
        return this;
    }

    public AvitoHomePage isForKidsButtonDisplayed() {
        WebElement forKidsButtonElement = driver.findElement(forKidsButton);
        Boolean forKidsButtonDisplayed = forKidsButtonElement.isDisplayed();
        Assert.assertTrue(forKidsButtonDisplayed, "Element is missing");
        System.out.println("Отображение элемента \"Товары для детей\": " + forKidsButtonDisplayed);
        return this;
    }

    public AvitoHomePage isTravelButtonDisplayed() {
        WebElement travelButtonElement = driver.findElement(travelButton);
        Boolean travelButtonDisplayed = travelButtonElement.isDisplayed();
        Assert.assertTrue(travelButtonDisplayed, "Element is missing");
        System.out.println("Отображение элемента \"Путешествия\": " + travelButtonDisplayed);
        return this;
    }


    public AvitoHomePage isHealthButtonDisplayed() {
        WebElement healthButtonElement = driver.findElement(healthButton);
        Boolean healthButtonDisplayed = healthButtonElement.isDisplayed();
        Assert.assertTrue(healthButtonDisplayed, "Element is missing");
        System.out.println("Отображение элемента \"Красота и здоровье\": " + healthButtonDisplayed);
        return this;
    }

    public AvitoHomePage isAllButtonsDisplayed() {
        isAutoButtonDisplayed();
        isRealtyButtonDisplayed();
        isWorkButtonDisplayed();
        isClothesButtonDisplayed();
        isHobbyButtonDisplayed();
        isAnimalsButtonDisplayed();
        isBusinessButtonDisplayed();
        isServicesButtonDisplayed();
        isSparePartsButtonDisplayed();
        isElectronicsButtonDisplayed();
        isForHomeButtonDisplayed();
        isForKidsButtonDisplayed();
        isTravelButtonDisplayed();
        isHealthButtonDisplayed();
        return this;
    }

    public AvitoHomePage changeRegion() {
        try {
           driver.findElement(regionMoscow);
        }
        catch (NoSuchElementException e) {
                driver.findElement(regionButton).click();
                driver.findElement(clearRegion).click();
                driver.findElement(findRegionField).sendKeys("Москва");
                driver.findElement(moscowInSelector).click();
                driver.findElement(acceptChanges).click();
            }
            return this;
        }
    }
