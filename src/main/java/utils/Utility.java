package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.swing.*;
import java.time.Duration;
import java.util.*;

public class Utility {
    public static final long PAGE_LOAD_TIMEOUT=40;
    public static final long IMPLICITLY_WAIT=40;

    public static void waitUntilElementClickable(WebDriver driver, WebElement element){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(IMPLICITLY_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void scrollDown(WebDriver driver, WebElement element) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
    }
    public static void selectValue(List<WebElement> list,String value)throws InterruptedException{

        for(WebElement e:list){
            System.out.println( e.getText());
            if(e.getText().equalsIgnoreCase(value)){
                e.click();
                break;
            }
            Thread.sleep(5000);
        }
    }
    public static void getwindowHandle(WebDriver driver)throws InterruptedException{
        String parentWindowID=driver.getWindowHandle();
        Set<String> Window =driver.getWindowHandles();

        for(String w: Window) {
            if(!parentWindowID.contentEquals(w)) {
                driver.switchTo().window(w);
            }
            Thread.sleep(4000);
        }
    }
    public static void alertmethod(WebDriver driver) throws InterruptedException{

        Alert alert = driver.switchTo().alert();
        Thread.sleep(4000);
        alert.accept();
    }
    public static void fetchingCookies(WebDriver driver){
        System.out.println("-----------------------------getCookies--------------------");
        Set<Cookie> cookies =driver.manage().getCookies();

        for(Cookie c:cookies){
            System.out.println(c);
        }
    }
    public static void addCokkies(WebDriver driver,String key,String value){
        Cookie addcookie= new Cookie(key,value);
        driver.manage().addCookie(addcookie);

        System.out.println("------------------------- AddCookies------------------------");
        Set<Cookie> cookies1 =driver.manage().getCookies();
        for(Cookie c:cookies1){
            System.out.println(c);
        }

        System.out.println("------------------------- DeleteCookies------------------------");
        driver.manage().deleteCookie(addcookie);
        Set<Cookie> cookies2 =driver.manage().getCookies();
        for(Cookie c:cookies2){
            System.out.println(c);
        }
    }
    public static void iFameHandle(List<WebElement> element)throws InterruptedException{
        System.out.println(element.size());
        for (WebElement e : element) {
            System.out.println(e);
        }

        Thread.sleep(4000);
    }
    public static void mouseHover(WebDriver driver, WebElement element){
        Actions action=new Actions(driver);
        action.moveToElement(element);
        action.build();
        action.perform();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    }

}

