package MobileTesting;

import actions.VerifyIntegerSemperOption;
import actions.VerifyTheme;
import actions.VerifyContacList;
import org.testng.annotations.Test;

/*
 * This class contain the regression test that is going to be performed for this project
 * I have implemented POM pattern to have more visibility to the development
 */
public class TestCatalog {

    @Test
    public void verifyIntSem(){
        VerifyIntegerSemperOption.action();
    }

    @Test
    public void verifyTheme(){
        VerifyTheme.action();
    }

    @Test
    public void verifyContactList(){
        VerifyContacList.action();
    }
}
