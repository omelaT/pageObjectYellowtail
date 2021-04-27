import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CoctailsPage {
    static WebDriver driver;

    public CoctailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public static void clickTogle(){
        WebElement toggle = driver.findElement(By.cssSelector(".toggle"));
        toggle.click();
    }
    public static void clickOnDropdownRedWine(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('[data-value=\"red\"]',':before').click();");
    }
    public static void closeDropdown(){
        WebElement toggle1 = driver.findElement(By.cssSelector(".toggle"));
        toggle1.click();
    }
    public static void verifySevenCoctailsDisplayed(){
        int count = driver.findElements(By.cssSelector("[class=\"tile recipe-tile\"]")).size();
        System.out.println(count);
        Assertions.assertEquals(7,count);
    }
   public static void  scrollToRussberryRoseCoctailAndClick(){
       WebElement raspberryRose = driver.findElement(By.cssSelector("[alt=\"Raspberry Rose\"]"));
// Javascript executor
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", raspberryRose);
       raspberryRose.click();
     }

     public static void clickkDropdownSparclingWine(){
         JavascriptExecutor js1 = (JavascriptExecutor) driver;
         js1.executeScript("document.querySelector('[data-value=\"bubbles\"]',':before').click();");

     }
     public static void verifyMultipleTextDisplayedInDropdown(){
         WebElement categoryMultiple = driver.findElement(By.cssSelector("[aria-label*=\"Type \"]"));
         Assertions.assertTrue(categoryMultiple.getText().contains("Multiple"));
     }

     public static void verifyNumberOfCoctailDisplayed() {
         int count = driver.findElements(By.cssSelector("[class=\"tile recipe-tile\"]")).size();
         System.out.println(count);
         Assertions.assertEquals(18,count);
     }

}
