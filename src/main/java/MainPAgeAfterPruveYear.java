import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MainPAgeAfterPruveYear {
    static WebDriver driver;

    public MainPAgeAfterPruveYear(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public static void mainPageIsDisplayedAfterPruveYears(){
        Assertions.assertTrue(driver.getCurrentUrl().contains("https://www.yellowtailwine.com/"));
    }
    public static void clickOnMenuButton(){
        WebElement menuButton = driver.findElement(By.cssSelector(".fa.fa-bars"));
        menuButton.click();
    }
    public static void linkWineonHeaderIsDesplayed(){
        WebElement wineLink = driver.findElement(By.cssSelector("[href*=\"wines\"]"));
        Assertions.assertTrue(wineLink.isDisplayed());
    }
    public static void linkStoresOnHeaderIsDesplayed(){
        WebElement whereToBue = driver.findElement(By.cssSelector("[href*=\"stores\"]"));
        Assertions.assertTrue(whereToBue.isDisplayed());
    }
    public static void linkCoctailsOnHeaderIsDesplayed(){
        WebElement coctails = driver.findElement(By.cssSelector("[href*=\"cocktails\"]"));
        Assertions.assertTrue(coctails.isDisplayed());

    }
    public static void linkOurStoryOnHeaderIsDesplayed(){
        WebElement ourStory = driver.findElement(By.cssSelector("[href*=\"our-story\"]"));
        Assertions.assertTrue(ourStory.isDisplayed());

    }
    public static void linkFaqsOnHeaderIsDesplayed(){

        WebElement faqs = driver.findElement(By.cssSelector("[href*=\"faqs\"]"));
        Assertions.assertTrue(faqs.isDisplayed());

    }
    public static void linkContactsOnHeaderIsDesplayed(){
        WebElement contact = driver.findElement(By.cssSelector("[href*=\"contact\"]"));
        Assertions.assertTrue(contact.isDisplayed());
    }

    public static void clickOnYellowTailLogo(){
        WebElement logo = driver.findElement(By.cssSelector("[class=\"yt-logo\"] img[src*=\"logo-yellowtail-white.svg\"]"));
        logo.click();
    }
    public static void menuButtonIsVisible(){
        WebElement menuButton1 = driver.findElement(By.cssSelector(".fa.fa-bars"));
        Assertions.assertTrue(menuButton1.isDisplayed());

    }
    public static void clickOnWhereToByMenu(){
        WebElement whereToBymenu = driver.findElement(By.cssSelector("[href*=\"stores\"]"));
        whereToBymenu.click();
    }
    public static void verifyMenuButtonIsDisplayed(){
        WebElement menuButton = driver.findElement(By.cssSelector(".fa.fa-bars"));
        Assertions.assertTrue(menuButton.isDisplayed());
    }
    public static void verifyWelcomeToTheWorldTextIsDisplayed(){
        WebElement titleOnMainPage = driver.findElement(By.cssSelector("[class = \"content animation-screen -one\"] h2"));
        Assertions.assertTrue(titleOnMainPage.isDisplayed());
    }
    public static void verifyPassionateTextIsDosplayd(){
        WebElement passionateText = driver.findElement(By.cssSelector("[class=\"content animation-screen -one\"] p"));
        Assertions.assertTrue(passionateText.isDisplayed());
    }
    public static void verifyEnjoiTextIsDisplayed(){
        WebElement enjoyText = driver.findElement(By.cssSelector("[class=\"content animation-screen -one\"] p"));
        Assertions.assertTrue(enjoyText.isDisplayed());
    }
    public static void verifyFindYourWineButtonIsDisplayed(){
        WebElement findYourWineButton = driver.findElement(By.cssSelector("[class=\"content animation-screen -one\"]> a"));
        Assertions.assertTrue(findYourWineButton.isDisplayed());
    }
    public static void verifyFooterIsDisplayed(){
        WebElement footer = driver.findElement(By.cssSelector(".primary-footer"));
        Assertions.assertTrue(footer.isDisplayed());
    }
    public static void clickOnTheGlobeIcon(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('.fa.fa-globe.fa-lg',':before').click();");
    }
    public static void selectChinaInDropdown(){
        WebElement chinaButton = driver.findElement(By.cssSelector("[data-key=\"CN\"]"));
        chinaButton.click();
    }
    public static void  verifyTheLanguageIsChanged(){
        WebElement findYourWineButton = driver.findElement(By.cssSelector("[class=\"sgg-comp-button-inner\"]"));
        Assertions.assertTrue(findYourWineButton.getText().contains("发现适合你的酒"));
     }

    public static void   clickOnRedirectIcon(){
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("document.querySelector('.fa.fa-weibo',':before').click();");
    }

    public static void clickOnCoctailsMenu(){
        WebElement coctails = driver.findElement(By.cssSelector("[href*=\"cocktails\"]"));
        coctails.click();
    }

}
