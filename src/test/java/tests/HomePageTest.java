package tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

public class HomePageTest extends WebTestBase {

    HomePage homepage;
    MouseHoverPage mousehoverpage;
    Bangle_WindowHandel bangle_windowHandel;
    SubscibePage subscibePage;
    AxixBankPage axixbankpage;

    public HomePageTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homepage=new HomePage();
        mousehoverpage=new MouseHoverPage();
        bangle_windowHandel=new Bangle_WindowHandel();
        subscibePage=new SubscibePage();
        axixbankpage =new AxixBankPage();
    }
    @Test
    public void verifyMouseHoverFunction(){
            SoftAssert softAssert = new SoftAssert();
            mousehoverpage.mouseHover();
            softAssert.assertAll();
        }

    @Test
    public void verifySearchingFunction(){
        SoftAssert softassert=new SoftAssert();
        homepage.search(prop.getProperty("product"));
        softassert.assertAll();
    }

    @Test
    public void verifyWindowHandlesFunction()throws InterruptedException{
        bangle_windowHandel.windowHandleMethod();
    }

    @Test
    public void verifyAlertHandleFunction() throws InterruptedException{
        subscibePage.closeAd();
        subscibePage.alertMethod(prop.getProperty("email"),prop.getProperty("phone"));

    }
    @Test
    public void verifyCookiesMethods(){
        axixbankpage.getcookiesMethod();
        axixbankpage.addcookiesMethod("facebook","Here is Customize Cookie...");
    }

    @AfterMethod
    public void afterMethod(){

        driver.close();
    }
}