import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HWL3Case1 {
    WebDriver driver;

    @BeforeEach
    public void before() {
        System.setProperty("webdriver.chrome.driver", "src/test/resourses/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.yellowtailwine.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }

    @AfterEach
    public void after() {
        driver.quit();
    }

    @Test
    public void verifyLegalTextIsdisplayed() {
        //Verify that “I am of legal drinking age in” is displayed
        PruveYearPage pruveYearPage = new PruveYearPage(driver);
        PruveYearPage.legalTextDispalyed();

    }
    @Test
    public void verifyCheckboxIsdisplayed() {
        // Verify that checkbox before “I am of legal drinking age in” is displayed
        PruveYearPage pruveYearPage = new PruveYearPage(driver);
        PruveYearPage.checkboxIsDisplayed();
    }

    @Test
    public void verifyDropdownIsdisplayed() {
        //Verify that dropdown with Select is displayed
        PruveYearPage pruveYearPage = new PruveYearPage(driver);
        PruveYearPage.dropdownIsDisplayed();

    }
    @Test
    public void verifyWelcomeIsDisplayed() {
        //Verify that “Welcome” button is displayed and is inactive
        PruveYearPage pruveYearPage = new PruveYearPage(driver);
        PruveYearPage.welcomeButtonDisplayedAndEnabled();

    }

}
