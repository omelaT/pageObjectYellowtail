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

public class HWL4Case10 {
    WebDriver driver;

    @BeforeEach
    public void before() {
        System.setProperty("webdriver.chrome.driver", "src/test/resourses/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
    }

    @AfterEach
    public void after() {
        driver.quit();
    }

    @Test
    public void navigateToCocktailRecipePage() throws InterruptedException {
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
       Thread.sleep(2000);

        //2. Scroll to “RASPBERRY ROSÉ” recipe   [alt="Raspberry Rose"]
        //3. Click on “RASPBERRY ROSÉ” recipe
        CoctailsPage coctailsPage = new CoctailsPage(driver);
        CoctailsPage.scrollToRussberryRoseCoctailAndClick();

        CoctailIngridientsPage coctailIngridientsPage = new CoctailIngridientsPage(driver);
        CoctailsPage.scrollToRussberryRoseCoctailAndClick();


        //4. Verify that new page is displayed: - ingredients section is displayed
       CoctailIngridientsPage.coctailIngridientsPageDisplayed();

    }
}