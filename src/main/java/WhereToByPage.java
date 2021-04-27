import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhereToByPage {
    static WebDriver driver;

    public WhereToByPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void enterValidDataInYourLocationField(){
        WebElement locationField = driver.findElement(By.cssSelector("[id=\"locationName\"]"));
        locationField.sendKeys("Kiev Street, Merrylands NSW, Australia");
        locationField.sendKeys(Keys.ENTER);
    }
    public static void clickOnSearchButton(){
        WebElement searchButton = driver.findElement(By.cssSelector(".search-submit"));
        searchButton.click();
    }
    public static void verifySearchResultIsDisplayed(){
        WebElement searchResult = driver.findElement(By.cssSelector("[class=\"tile\"]:first-child"));
        Assertions.assertTrue(searchResult.isDisplayed());
    }
}
