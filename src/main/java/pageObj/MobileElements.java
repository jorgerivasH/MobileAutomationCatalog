package pageObj;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/*
 * This class has been created to locate the mobile elements needed for the testing
 * and I have created some methods that I am going to implement as Utils methods in future
 */
public class MobileElements{

    //Locators for the mobile elements
    public static AppiumDriver driver = DriverSession.initializeDriver();
    public static String FrameworkLocator = "Framework7 Material 1.4.0";
    public static String AccordionLocator = "Accordion ";
    public static String IntSempLocator = "//android.webkit.WebView[@content-desc='Framework7 Material 1.4.0 | UI Framework Catalog']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ListView[1]/android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View[1]";
    public static String IntTextLocator = "//android.webkit.WebView[@content-desc='Framework7 Material 1.4.0 | UI Framework Catalog']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ListView[1]/android.view.View[2]/android.view.View[2]";
    public static String ContactListLocator = "//android.view.View[@content-desc='Contacts List ']";
    public static String ContactLocator = "//android.view.View[@content-desc='Alexander']";
    public static String ColorThemeLocator = "//android.view.View[@content-desc='Forms ']";
    public static String ColorLocator = "//android.webkit.WebView[@content-desc='Framework7 Material 1.4.0 | UI Framework Catalog']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[25]";

    // This method locates the 'Framework 7 Material 1.4.0' mobile element
    public static MobileElement searchFrMOpt() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        MobileElement frmatopt = (MobileElement) driver.findElementByAccessibilityId(FrameworkLocator);
        System.out.println("The Framework 7 Material 1.4.0 option was found");
        return frmatopt;
    }

    // This method locates the 'Accordion' mobile element
    public static MobileElement searchAccordOpt() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        MobileElement accordopt = (MobileElement) driver.findElementByAccessibilityId(AccordionLocator);
        System.out.println("The Accordion option was found");
        return accordopt;
    }

    // This method locates the 'Integer Semper' mobile element
    public static MobileElement searchIntSemOpt() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        MobileElement intSemOpt = (MobileElement) driver.findElementByXPath(IntSempLocator);
        System.out.println("The Integer Semper option was found");
        return intSemOpt;
    }

    // This method locates the description information within of Integer Semper section
    public static boolean checkIntSem() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Boolean elemApp = false;
        MobileElement textIntSem = (MobileElement) driver.findElementByXPath(IntSempLocator);
        elemApp = true;
        return elemApp;
    }

    // This method locates the 'Contact List' mobile element
    public static MobileElement searchContacList() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        MobileElement SelectCont = (MobileElement) driver.findElementByXPath(ContactListLocator);
        System.out.println("The Contact List option was found");
        return SelectCont;
    }

    // This method check if the 'Contact List' mobile element appears
    public static boolean checkContactList() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Boolean elemApp = false;
        MobileElement SelectCont = (MobileElement) driver.findElementByXPath(ContactListLocator);
        System.out.println("The Contact List option was found");
        elemApp = true;
        return elemApp;
    }


    // This method locates the 'contact information' mobile element
    public static String getContact() {
        String sourceText;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MobileElement getContact = (MobileElement) driver.findElementByXPath(ContactLocator);
        sourceText = getContact.getText();
        System.out.println("The contact information is " + getContact.getText());
        return sourceText;
    }

    // This method locates the 'Color Themes' mobile element
    public static MobileElement searchColorThem() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        MobileElement colorTheOpt = (MobileElement) driver.findElementByXPath(ColorThemeLocator);
        System.out.println("The Color Themes option was found");
        return colorTheOpt;
    }

    // This method locates the 'Black Color' mobile element
    public static MobileElement searchColorOpt() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        MobileElement colorOpt = (MobileElement) driver.findElementByXPath(ColorLocator);
        System.out.println("The Color option was found");
        return colorOpt;
    }

    // This method check if the 'Black Color' mobile element appears
    public static boolean checkColor() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Boolean elemApp = false;
        MobileElement themeColor = (MobileElement) driver.findElementByXPath(ColorLocator);
        elemApp = true;
        return elemApp;
    }

    /*
    The following methods will be implemented in the Utils class...
    This methods perform 'scroll down' on the application
     */
    public static void scrollDown() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Dimension dimension = driver.manage().window().getSize();
        int scrollStart = (int) (dimension.getHeight() * 0.9);
        int scrollEnd = (int) (dimension.getHeight() * 0.1);

        new TouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release().perform();
        new TouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release().perform();
        System.out.println("ScrollDown was performed");
    }

    // This method closes the Application
    public static void closeApp(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.closeApp();
        System.out.println("App was closed");
    }

    // This method launch the Application
    public static void launchApp(){
        driver.launchApp();
        System.out.println("App was launch");
    }

    // This method freeze the application for some seconds
    public static void waitApp(){
        System.out.println("Waiting app");
        WebDriverWait w = new WebDriverWait(driver,10);
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@content-desc='BACK TO CATALOG']")));
    }
}