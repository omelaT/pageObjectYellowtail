import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class HWL3Case8 {
    WebDriver driver;

    @BeforeEach
    public void before() {
        System.setProperty("webdriver.chrome.driver", "src/test/resourses/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @AfterEach
    public void after() {
        driver.quit();
    }


    @Test
    public void whereToBy() throws InterruptedException {
        driver.get("https://www.yellowtailwine.com");
        //precondition
        //check checkbox
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

        // Click on Menu button
        MainPAgeAfterPruveYear.clickOnMenuButton();
       // Thread.sleep(2000);

        //where to by page
      MainPAgeAfterPruveYear.clickOnWhereToByMenu();
       // Thread.sleep(2000);

      //  Enter valid data in “Your location” field
        WhereToByPage whereToByPage = new WhereToByPage(driver);
       WhereToByPage.enterValidDataInYourLocationField();

      //  3. Click on Search button
       WhereToByPage.clickOnSearchButton();
      //  Thread.sleep(2000);

      //  4. Verify that the results of search are displayed
       WhereToByPage.verifySearchResultIsDisplayed();

}}
