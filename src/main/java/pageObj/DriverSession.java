package pageObj;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * This class has been created set up the DesireCapabilities needed for the testing
 * at the moment has been created the configuration capabilities for Android platform
 */
public class DriverSession{

    public static AppiumDriver initializeDriver(){

        //create instance for DesiredCapabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        caps.setCapability("avd", "Pixel");
        caps.setCapability("avdLaunchTimeout", 180000);
        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                + File.separator + "resources" + File.separator + "UiCatalog.apk";
        caps.setCapability(MobileCapabilityType.APP, appUrl);

        //Creating the model to communicate with the Appium server
        URL url = null;
        try {
            url = new URL("http://0.0.0.0:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return new AndroidDriver(url, caps);
    }
}
