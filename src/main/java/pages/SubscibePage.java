package pages;

        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import testbase.WebTestBase;
        import utils.Utility;

public class SubscibePage extends WebTestBase {
    @FindBy(xpath="//li[@class='item product product-item']")
    WebElement elementclick;

    @FindBy(xpath="//input[@id='newsletter']")
    WebElement enteremail;

    @FindBy(id="mobile")
    WebElement enterphone;

    @FindBy(xpath="//button[@class='action subscribe primary base_btn btn_md primary_btn']")
    WebElement clcikbtn;

    @FindBy(xpath="//div[@class='close__']")
    WebElement addclosed;

    public SubscibePage() {
        PageFactory.initElements(driver, this);
    }
    public void alertMethod(String email,String phone)throws InterruptedException{
        //Utility.scrollDown(driver);
        enteremail.sendKeys(email);
        enterphone.sendKeys(phone);
        clcikbtn.click();
       // Utility.alertmethod(driver);
    }
    public void closeAd(){
        Utility.waitUntilElementClickable(driver,addclosed);
        addclosed.click();
    }
}
