package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utils.Utility;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class WebTestBase {
    public static WebDriver driver;
    public Properties prop;

    public WebTestBase(){
        try{
            FileInputStream fi =new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/properties/config.properties");
            prop=new Properties();
            prop.load(fi);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void initialization(){
        String browserName=prop.getProperty("browser");
        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
            driver=new ChromeDriver();
        }else if(browserName.equals("firefox")){
            System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
            driver=new FirefoxDriver();
        }else if(browserName.equals("edge")){
            System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
            driver=new EdgeDriver();
        }else if(browserName.equals("io")){
            System.setProperty("webdriver.io.driver",System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
            driver=new InternetExplorerDriver();
        }else{
            System.out.println("Please select correct browser name");
        }
        driver.navigate().to(prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utility.PAGE_LOAD_TIMEOUT));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utility.IMPLICITLY_WAIT));
        driver.manage().deleteAllCookies();
    }
}


