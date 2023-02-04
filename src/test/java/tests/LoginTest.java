package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTest{
    public static void main(String[] args)throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","E://Downloads//chromedriver_win32//chromedriver.exe");

        //block the pop up
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notification");


        //open kalyan jewellers web Page
        WebDriver driver= new ChromeDriver();

        // maximize the given window
        driver.manage().window().maximize();

        //open kalyan url
        driver.get("https://www.candere.com/");
        driver.findElement(By.className("actions-custom")).click();
        Thread.sleep(500);

        //open Login
        driver.findElement(By.id("customer-popup-sign-in")).click();
        Thread.sleep(2000);

        //enter details
        driver.findElement(By.id("email-login-one")).sendKeys("pranaliyewale7775@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.id("send2-login-one")).click();
        Thread.sleep(5000);



    }

}