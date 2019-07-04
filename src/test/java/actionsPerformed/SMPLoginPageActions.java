package actionsPerformed;
import GlobalActions.Screenshots;
import helpers.Environment;
import org.openqa.selenium.support.PageFactory;
import pageobjects.SMPLoginPage;

import java.io.IOException;
import java.util.Base64;
import java.util.concurrent.TimeUnit;

public class SMPLoginPageActions extends Environment {

    public static void Login_SMP(String username,String password) throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMPLoginPage.class);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMPLoginPage.username.sendKeys(username);
       // String decryptedpassword;
        byte[] decryptedPasswordBytes=Base64.getDecoder().decode(password);
        String decryptedpassword=new String(decryptedPasswordBytes);
        SMPLoginPage.password.sendKeys(decryptedpassword);
        SMPLoginPage.submit.click();
        Thread.sleep(4000);

    }
}
