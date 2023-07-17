package org.example.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {


     WebDriver driver;

     public static void  clickWhenReady(WebDriver driver, WebElement element,int timeoutMillis){
         WebDriverWait Wait = new WebDriverWait(driver,Duration.ofMillis(timeoutMillis));
         Wait.until(ExpectedConditions.elementToBeClickable(element));
         element.click();
         System.out.println("Element was clicked ");
     }

     }

