package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver){
        // Wait for element is loaded, define timeWaitForElement as below
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 60);
        PageFactory.initElements(factory,this);
    }

    @FindBy(xpath = ".//li[@class='animate-delay-1']")
    public WebElement loginButton;

    @FindBy erfg4rgtrheyhyjeyt

    //-----------------------------------------------------------------------------

    public void clickLogin(){
        loginButton.click();
    }
}
