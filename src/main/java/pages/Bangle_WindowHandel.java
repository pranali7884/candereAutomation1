package pages;

        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import testbase.WebTestBase;
        import utils.Utility;

public class Bangle_WindowHandel extends WebTestBase {

    @FindBy(xpath = "//a[text()='Contact Us']")
    WebElement contactUs;

    @FindBy(xpath="//a[@class='contact__box contact__box-whatsapp']")
    WebElement whatsApp;


    @FindBy(xpath="/div[@class='close__']")
    WebElement addclosed;

    public Bangle_WindowHandel() {

        PageFactory.initElements(driver, this);
    }
    public void windowHandleMethod()throws InterruptedException{
        Utility.scrollDown(driver,contactUs);
        contactUs.click();
        Utility.scrollDown(driver,whatsApp);
        whatsApp.click();
        Utility.getwindowHandle(driver);

    }
    public void closeAd(){
        Utility.waitUntilElementClickable(driver,addclosed);
        addclosed.click();
    }
}