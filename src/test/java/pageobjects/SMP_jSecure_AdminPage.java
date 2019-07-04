package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMP_jSecure_AdminPage {

    @FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr[1]/td/table/tbody/tr[3]/td[1]/table[2]/tbody/tr/td/ul/li[1]/a")
    public static WebElement Addusers;

    @FindBy(how = How.XPATH, using = "/html/body/form[1]/table/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")
    public static WebElement Firstname;

    @FindBy(how = How.XPATH, using = "/html/body/form[1]/table/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input")
    public static WebElement Lastname;

    @FindBy(how = How.XPATH, using = "/html/body/form[1]/table/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[2]/input")
    public static WebElement Username;

    @FindBy(how = How.XPATH, using = "/html/body/form[1]/table/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td[2]/input")
    public static WebElement Password;

    @FindBy(how = How.XPATH, using = "/html/body/form[1]/table/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[6]/td[2]/input")
    public static WebElement verifypassword;

    @FindBy(how = How.XPATH, using = "/html/body/form[1]/table/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[8]/td[2]/select")
    public static WebElement Grouplist;

    @FindBy(how = How.XPATH, using = "//*[@id=\"api_user_cbox\"]")
    public static WebElement APIcheckbox;

    @FindBy(how = How.XPATH, using = "/html/body/form[1]/table/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[12]/td/input[2]")
    public static WebElement Addbutton;

    @FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr[1]/td/table/tbody/tr[3]/td[1]/table[2]/tbody/tr/td/ul/li[2]/a")
    public static WebElement View_Modify_Delete;

    @FindBy(how = How.XPATH, using = "/html/body/form/table/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/p[1]/input[2]")
    public static WebElement wildcardsearch;

    @FindBy(how = How.XPATH, using = "/html/body/form[1]/table/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[12]/td/input[2]")
    public static WebElement Modifybutton;



}
