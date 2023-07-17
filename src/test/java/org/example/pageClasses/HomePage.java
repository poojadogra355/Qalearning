package org.example.pageClasses;

import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePage extends BasePage {
    static WebElement element = null;
    //find locator
    //private static String LOGO = "//img[contains(@class,'img-size-unknown')][1]";
    private final static String ContactUs_Link = "//ul[contains(@class,'top-main-menu')]//span[(text()='Contact us')]";

    //find element

    private static WebElement contact_Us_Link(WebDriver driver) {
        element = driver.findElement(By.xpath(ContactUs_Link));
        return element;
    }


    //Define Methods
    public static void clickContactUsLink(WebDriver driver) {
        element = contact_Us_Link(driver);
        if (element.isEnabled()) {
            System.out.println("Element:" + element + "found and enable");
            clickWhenReady(driver, element, 3000);
        } else {
            System.out.println("Element" + element + "is not enable");
        }

    }
}