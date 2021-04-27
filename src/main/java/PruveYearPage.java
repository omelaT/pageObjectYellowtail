

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PruveYearPage {
    static WebDriver driver;

    public PruveYearPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
//@FindBy(css ="[for=\"confirm\"]" )
//private WebElement checkbox;


    public static void checkboxIsDisplayed(){
        WebElement checkbox = driver.findElement(By.cssSelector("[for=\"confirm\"]"));
        Assertions.assertTrue(checkbox.isDisplayed());
    }
    public static void legalTextDispalyed(){
        WebElement text = driver.findElement(By.cssSelector("[for=\"confirm\"]"));
        Assertions.assertTrue(text.getText().contains("I am of legal drinking age in"));
    }
    public static void dropdownIsDisplayed(){
        WebElement select = driver.findElement(By.cssSelector(".agegate-selector-options"));
        Assertions.assertTrue(select.isDisplayed());
    }
    public static void welcomeButtonDisplayedAndEnabled(){
        WebElement welcomeButton = driver.findElement(By.cssSelector("[value=\"Welcome\"]"));
        Assertions.assertTrue(welcomeButton.isDisplayed());
        Assertions.assertFalse(welcomeButton.isEnabled());
    }
    public static void clickOnCheckbox() {
        WebElement checkboxClick = driver.findElement(By.cssSelector("[for=\"confirm\"]"));
        checkboxClick.click();
    }
    public static void selectEuropeFromDropdown(){
        Select select = new Select(driver.findElement(By.cssSelector(".agegate-selector-options"))) ;
        select.selectByVisibleText("Europe");
    }
    public static void pressWelcomeButton(){
        WebElement welcomeButton = driver.findElement(By.cssSelector("[value=\"Welcome\"]"));
        welcomeButton.click();
    }

}
