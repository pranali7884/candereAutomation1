package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

import java.util.List;


public class AxixBankPage extends WebTestBase {
    @FindBy(xpath="//div[@class='loginClk jsloginClk']")
    WebElement loginbtn;


    @FindBy(xpath="//div[@class='close_button']")
    WebElement closeadclick;

    @FindBy(xpath="//h4[text()='Credit Cards']")
    WebElement click1;

    @FindBy(id="Featured_Cards")
    WebElement checkbox;

    @FindBy(tagName ="iframe")
    List<WebElement> iframe;


    public AxixBankPage() {
        PageFactory.initElements(driver, this);
    }
    public void isDisplayed(){
        System.out.println(loginbtn.isDisplayed());
    }
    public void isEnable(){
        System.out.println(loginbtn.isEnabled());
    }
    public void isSelectMethod(){
       // Utility.scrollDown(driver);
        click1.click();
       // Utility.scrollDown(driver);
        System.out.println(checkbox.isSelected());
    }
    public void closeAd(){
        Utility.waitUntilElementClickable(driver,closeadclick);
        closeadclick.click();
    }
    public void iFrame() throws InterruptedException {
        Utility.iFameHandle(iframe);
    }
    public void getcookiesMethod(){
        Utility.fetchingCookies(driver);
    }
    public void addcookiesMethod(String key,String value){

        Utility.addCokkies(driver,key,value);
    }
}
