package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class HomePage extends WebTestBase {
    @FindBy(xpath="//input[@id='search']")
    WebElement element;

    @FindBy(xpath="//button[@class='action search button']")
    WebElement search;


    @FindBy(xpath="//div[@class='close__']")
    WebElement addclosed;


    public HomePage() {

        PageFactory.initElements(driver, this);
    }
    public void search(String product){
        element.sendKeys(product);
        search.click();
    }
    public void closeAd(){
        Utility.waitUntilElementClickable(driver,addclosed);
        addclosed.click();
    }

}
