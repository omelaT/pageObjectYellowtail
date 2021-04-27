import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WeiboComMainPage {
    static WebDriver driver;

    public WeiboComMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
     public static void verifyWeiboComIsOpened(){
         Assertions.assertTrue(driver.getCurrentUrl().contains("yellowtailChina"));
     }

}
