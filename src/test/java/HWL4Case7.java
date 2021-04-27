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
import java.util.Set;

public class HWL4Case7 {

    WebDriver driver;


    @BeforeEach
    public void before() {
        System.setProperty("webdriver.chrome.driver", "src/test/resourses/chromedriver");
        driver = new ChromeDriver();
        // timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @AfterEach
    public void after() {
        driver.quit();
    }

    @Test
    public void mainPageGlobalNavLogic() throws InterruptedException {
        driver.get("https://www.yellowtailwine.com");
        Set<String> oldWindowsSet = driver.getWindowHandles();
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
      //  Thread.sleep(2000);

        //Click on Globe icon
        MainPAgeAfterPruveYear.clickOnTheGlobeIcon();

        //Select China
        MainPAgeAfterPruveYear.selectChinaInDropdown();
       // Thread.sleep(10000);


        //. Click on icon ( in white square on screenshot)
      MainPAgeAfterPruveYear.clickOnRedirectIcon();
       // Thread.sleep(11000);

        //Verify that “https://www.weibo.com/yellowtailChina” site is open in new tab
// получаем новый набор дескрипторов, включающий уже и новое окно
        Set<String> newWindowsSet = driver.getWindowHandles();

// получаем дескриптор нового окна
        newWindowsSet.removeAll(oldWindowsSet);
        String newWindowHandle = newWindowsSet.iterator().next();

        driver.switchTo().window(newWindowHandle);
        System.out.println("New window title: " + driver.getTitle());


       WeiboComMainPage weiboComMainPage = new WeiboComMainPage(driver);
       WeiboComMainPage.verifyWeiboComIsOpened();

        driver.close();


    }
}