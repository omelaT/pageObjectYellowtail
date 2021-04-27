import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HWL4Case11 {

    WebDriver driver;

    @BeforeEach
    public void before() {
        System.setProperty("webdriver.chrome.driver", "src/test/resourses/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterEach
    public void after() {
        driver.quit();
    }

    @Test
    public void selectSeveralWines() throws InterruptedException {
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
        //Click on Menu button
        MainPAgeAfterPruveYear.clickOnMenuButton();
        //   Thread.sleep(2000);


        // Navigate to “Cocktails” page

      MainPAgeAfterPruveYear.clickOnCoctailsMenu();
    //    Thread.sleep(2000);
        CoctailsPage coctailsPage = new CoctailsPage(driver);

        //  Select “Red wine cocktails”
        //1 click toggle .toggle
        CoctailsPage.clickTogle();

        //[data-value="red"] dropdown click
        CoctailsPage.clickOnDropdownRedWine();
    //    Thread.sleep(1000);

       // Select “Sparkling wine cocktails”
        //[data-value="red"] dropdown click
        CoctailsPage.clickkDropdownSparclingWine();
   //     Thread.sleep(3000);

        //close dropdown
       CoctailsPage.closeDropdown();
   //    Thread.sleep(3000);

        //4. Verify that “Multiple” word is displayed in “Type” dropdown
        //aria-label="Type - select to access the drop down menu of wine types"
        CoctailsPage.verifyMultipleTextDisplayedInDropdown();

        //5. Verify that 18 recipes are displayed
       CoctailsPage.verifyNumberOfCoctailDisplayed();
}
}