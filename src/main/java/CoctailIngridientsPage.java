import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CoctailIngridientsPage {
    static WebDriver driver;

    public CoctailIngridientsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
   public static void  coctailIngridientsPageDisplayed(){
        WebElement ingridientSection = driver.findElement(By.cssSelector("[class=\"recipe-intro\"]"));
        ingridientSection.isDisplayed();
    }
}
