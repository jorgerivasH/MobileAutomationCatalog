package actions;

import org.testng.Assert;
import pageObj.MobileElements;

/*
 * This class has been created to perform the step by step
 * to complete the verification of the Theme option
 */
public class VerifyTheme {

    public static void action(){
        System.out.println("Starting TC2");
        MobileElements.launchApp();
        MobileElements.searchFrMOpt().click();
        System.out.println("Click on Framework 7 Material 1.4.0 option performed");
        MobileElements.waitApp();
        MobileElements.scrollDown();
        MobileElements.scrollDown();
        MobileElements.scrollDown();
        MobileElements.searchColorThem().click();
        System.out.println("Click on Themes option");
        Assert.assertTrue(MobileElements.checkColor(),"theme view is not loading");
        MobileElements.searchColorOpt().click();
        System.out.println("The Color Theme was changed to black");
        MobileElements.closeApp();
    }
}
