package actions;

import org.testng.Assert;
import pageObj.MobileElements;

/*
 * This class has been created to perform the step by step
 * to complete the verification of the contact list option
 */
public class VerifyContacList {

    public static void action(){
        System.out.println("Starting TC3");
        MobileElements.launchApp();
        MobileElements.searchFrMOpt().click();
        MobileElements.waitApp();
        MobileElements.searchContacList().click();
        Assert.assertTrue(MobileElements.checkContactList(),"Contac List is not loading");
        System.out.println(MobileElements.getContact());
        MobileElements.waitApp();
        MobileElements.closeApp();
    }
}
