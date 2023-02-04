package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.ActionClass;
import utils.Utility;

public class MouseHoverPage extends WebTestBase {

    @FindBy(xpath="//a[text()='Bangles & Bracelets']")
    WebElement clickon;

    @FindBy(xpath="//a[@data-menu='Bangles/Shop by Material/Gold']")
    WebElement mousehover;

    @FindBy(xpath="//a[text()='Gold']")
    WebElement findelement;

    @FindBy(xpath="//div[@class='close__']")
    WebElement addclosed;



    public MouseHoverPage(){
        PageFactory.initElements(driver, this);
    }

    public void mouseHover(){
        Utility.mouseHover(driver,clickon);
    }
    public void closeAd(){
        Utility.waitUntilElementClickable(driver,addclosed);
        addclosed.click();
    }
    public String getFindElement(){

        return findelement.getText();
    }


}
