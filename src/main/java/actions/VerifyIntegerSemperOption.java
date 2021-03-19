package actions;



import org.testng.Assert;
import pageObj.MobileElements;

/*
 * This class has been created to perform the step by step
 * to complete the verification of the Integer semper option
 */
public class VerifyIntegerSemperOption {

    public static void action(){
        System.out.println("Starting TC1");
        MobileElements.searchFrMOpt().click();
        System.out.println("Click on Framework 7 Material 1.4.0 option performed");
        MobileElements.waitApp();
        MobileElements.searchAccordOpt().click();
        System.out.println("Click on Accordion option performed");
        MobileElements.searchIntSemOpt().click();
        System.out.println("Click on Integer semper option performed");
        Assert.assertTrue(MobileElements.checkIntSem(),"List view accordion is not loading");
        MobileElements.closeApp();
    }
}
