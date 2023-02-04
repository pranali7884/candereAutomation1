package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void moveToElement(WebDriver driver, WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element)
                .perform();
    }
}
