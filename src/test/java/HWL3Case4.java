import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HWL3Case4 {
    WebDriver driver;

    @BeforeEach
    public void before() {
        System.setProperty("webdriver.chrome.driver", "src/test/resourses/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }

    @AfterEach
    public void after() {
        driver.quit();
    }

    @Test
    public void menuButtonLogic() throws InterruptedException {
        driver.get("https://www.yellowtailwine.com");
        //precondition
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



        //2. Click on Menu button
        MainPAgeAfterPruveYear.clickOnMenuButton();

    //  WebElement explisitWait = (new WebDriverWait(driver, Duration.ofSeconds(4))).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[href*=\"wines\"]")));
       Thread.sleep(2000);

//Verify that header with all needed links is appeared
        MainPAgeAfterPruveYear.linkWineonHeaderIsDesplayed();

        MainPAgeAfterPruveYear.linkStoresOnHeaderIsDesplayed();

        MainPAgeAfterPruveYear.linkCoctailsOnHeaderIsDesplayed();

        MainPAgeAfterPruveYear.linkOurStoryOnHeaderIsDesplayed();

        MainPAgeAfterPruveYear.linkFaqsOnHeaderIsDesplayed();

        MainPAgeAfterPruveYear.linkContactsOnHeaderIsDesplayed();

        //  4. Click on [yellow tail]
       MainPAgeAfterPruveYear.clickOnYellowTailLogo();

        //  5. Verify that Menu button is visible
       MainPAgeAfterPruveYear.menuButtonIsVisible();
    }
}




