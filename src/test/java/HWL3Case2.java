import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HWL3Case2 {
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
    //Welcome page: navigate to main page as European customer
    @Test
    public void navigateAsCustomer() {
        PruveYearPage pruveYearPage = new PruveYearPage(driver);
        // Verify that checkbox before “I am of legal drinking age in” is displayed
//Click on checkbox
        PruveYearPage.clickOnCheckbox();

//Select “Europe” from dropbox
        PruveYearPage.selectEuropeFromDropdown();

//Press “Welcome” button
        PruveYearPage.pressWelcomeButton();

//Main page should be displayed
        MainPAgeAfterPruveYear mainPAgeAfterPruveYear = new MainPAgeAfterPruveYear(driver);
        MainPAgeAfterPruveYear.mainPageIsDisplayedAfterPruveYears();


    }


}
