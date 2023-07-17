package org.example.testclasses;

import org.example.pageClasses.ContactUsPage;
import org.example.pageClasses.HomePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class POMDemoTest {
    static WebDriver driver;
    static String baseurl;
    @BeforeAll
    public static void setup() {
        driver = new ChromeDriver();
        baseurl = "https://demostore.x-cart.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    }


    @Test
    public void test() throws InterruptedException {
        driver.get(baseurl);
        //String Message="Message has been sent";
        // Methods/Actions taken on the Home Page
        HomePage.clickContactUsLink(driver);
        Thread.sleep(2000);

        // Actions taken on the Contact Us Page
        ContactUsPage.enterName(driver, "pooja");
        ContactUsPage.enterEmail(driver, "poojadogr355@gmail.com");
        ContactUsPage.enterSubject(driver, "QA");
        ContactUsPage.enterMessage(driver, "Be Kind");
        ContactUsPage.ClickSendButton(driver);
        ContactUsPage.showMessage(driver);
    }

    @AfterAll
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
    }


}


