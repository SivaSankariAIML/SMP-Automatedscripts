package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMP_Services_page {

    @FindBy(how = How.XPATH,using = "/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/a/img")
    public static WebElement Createnew;

    @FindBy(how = How.XPATH,using = "/html/body/form/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/input")
    public static WebElement services_name;

    @FindBy(how = How.XPATH,using = "/html/body/form/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td[2]/textarea")
    public static WebElement services_description;

    @FindBy(how = How.XPATH,using = "/html/body/form/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[6]/td[2]/input")
    public static WebElement services_syntaxon;

    @FindBy(how = How.XPATH,using = "/html/body/form/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[7]/td[2]/input")
    public static WebElement services_syntaxoff;

    @FindBy(how = How.XPATH,using = "/html/body/form/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[11]/td/div/input[2]")
    public static WebElement services_Add;

    @FindBy(how = How.XPATH,using = "/html/body/form/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[11]/td/div/input[1]")
    public static WebElement services_Modify;

//*[@id="OK_button"]

    @FindBy(how = How.XPATH,using = "//*[@id=\"OK_button\"]")
    public static WebElement Modify_ok;

}
