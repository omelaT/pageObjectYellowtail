import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HWL4Case3 {
    WebDriver driver;

    @BeforeEach
    public void before() {
        System.setProperty("webdriver.chrome.driver", "src/test/resourses/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }

    @AfterEach
    public void after() {
        driver.quit();
    }

    @Test
    public void requirenmentElementsDisplayedOnMainPage() throws InterruptedException {
        driver.get("https://www.yellowtailwine.com");
        //precondition
        //check checkbox
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

        //1. Navigate to main page - done

        //2. Verify that the following elements are displayed:
        //- menu button
        MainPAgeAfterPruveYear.verifyMenuButtonIsDisplayed();

        //- WELCOME TO THE WORLD OF [Yellow tail]
       MainPAgeAfterPruveYear.verifyWelcomeToTheWorldTextIsDisplayed();

        //- We are passionate about creating great tasting, quality wines for everyone to
       MainPAgeAfterPruveYear.verifyPassionateTextIsDosplayd();

        //enjoy
        MainPAgeAfterPruveYear.verifyEnjoiTextIsDisplayed();

        //- find your wine button
        MainPAgeAfterPruveYear.verifyFindYourWineButtonIsDisplayed();

        //- footer
        MainPAgeAfterPruveYear.verifyFooterIsDisplayed();

    }
}