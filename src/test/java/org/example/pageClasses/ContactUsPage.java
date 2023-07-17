package org.example.pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
public class ContactUsPage {


    static WebDriver driver;
    public static WebElement element = null;

    //find locators

    private static String YOUR_NAME = "name";
    private static String YOUR_EMAIL = "email";

    private static String YOUR_SUBJECT = "subject";
    private static String YOUR_MESSAGE = "//textarea[@id='message']";
    private static String SEND = "//div[contains(@class,'model-properties')]//button[@type='submit']";

    private static String MSGCONFIRMATION = "//li[contains(@class,'info')]";



    //find elements
    private static WebElement yourName(WebDriver driver) {
        element = driver.findElement(By.id(YOUR_NAME));
        return element;
    }

    private static WebElement yourEmail(WebDriver driver) {
        element = driver.findElement(By.id(YOUR_EMAIL));
        return element;
    }

    private static WebElement yourSubject(WebDriver driver) {
        element = driver.findElement(By.id(YOUR_SUBJECT));
        return element;
    }

    private static WebElement yourMessage(WebDriver driver) {
        element = driver.findElement(By.xpath(YOUR_MESSAGE));
        return element;
    }

    private static WebElement sendButton(WebDriver driver) {

        element = driver.findElement(By.xpath(SEND));
        return element;
    }

    private static WebElement msgConfirmation(WebDriver driver) {

        element = driver.findElement(By.xpath(MSGCONFIRMATION));
        return element;




    }


    //Define Methods
    public static void enterName(WebDriver driver, String name) {
        element = yourName(driver);
        element.sendKeys(name);
        System.out.println("Your name is :" + name);
    }

    public static void enterEmail(WebDriver driver, String email) {
        element = yourEmail(driver);
        element.sendKeys(email);
        System.out.println("Your Email is :" + email);
    }

    public static void enterSubject(WebDriver driver, String subject) {
        element = yourSubject(driver);
        element.sendKeys(subject);
        System.out.println("Your Subject is :" + subject);
    }

    public static void enterMessage(WebDriver driver, String message) {
        element = yourMessage(driver);
        element.sendKeys(message);
        System.out.println("Your Message is :" + message);
    }

    public static void ClickSendButton(WebDriver driver) {
        element = sendButton(driver);
        element.click();
        System.out.println("Save button clicked:");
    }

    public static void showMessage(WebDriver driver) {
        element=msgConfirmation(driver);

        System.out.println("Message:" + element + "is there");
    }

}