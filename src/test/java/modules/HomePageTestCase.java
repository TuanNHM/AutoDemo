package modules;

import objects.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import supports.CommonFunctions;

public class HomePageTestCase {
    private static WebDriver driver;
    HomePage homePage = new HomePage(driver);

    @BeforeTest
    public static void setup(){
        driver = CommonFunctions.getBrowser("Chrome");
        CommonFunctions.visit(driver, "http://qa.demovn.kootoro.com/");
    }

    @Test
    public void loginSuccessful() throws InterruptedException {
        homePage.clickLogin();
        Thread.sleep(5000);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
