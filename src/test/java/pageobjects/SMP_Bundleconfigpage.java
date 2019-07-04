package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMP_Bundleconfigpage {

    @FindBy(how = How.XPATH,using = "/html/body/table/tbody/tr[2]/td[4]/table[2]/tbody/tr/td/p/span/a[3]")
    public static WebElement Bundleconfigurations;

    @FindBy(how = How.XPATH,using = "/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/a/img")
    public static WebElement createnew;

    @FindBy(how = How.XPATH,using = "/html/body/form/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td[2]/input")
    public static WebElement bundlename;

    @FindBy(how = How.XPATH,using = "/html/body/form/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[7]/td[2]/textarea")
    public static WebElement bundledescription;

    @FindBy(how = How.XPATH,using = "//*[@id=\"Layer1\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr[2]/td/select")
    public static WebElement services;

    @FindBy(how = How.XPATH,using = "//*[@id=\"Layer1\"]/table/tbody/tr[1]/td[2]/div/input")
    public static WebElement Include;

    @FindBy(how = How.XPATH,using = "//*[@id=\"bundlePartitions\"]/div/span")
    public static WebElement AddPartitions;

    @FindBy(how = How.XPATH,using = "//*[@id=\"partition_table\"]/tbody/tr[2]/td[2]/select")
    public static WebElement SG;

    @FindBy(how = How.XPATH,using = "//*[@id=\"partition_table\"]/tbody/tr[2]/td[3]/select")
    public static WebElement Parttype;

    @FindBy(how = How.XPATH,using = "//*[@id=\"partition_table\"]/tbody/tr[2]/td[4]/select")
    public static WebElement PartAction;

    @FindBy(how = How.XPATH,using = "//*[@id=\"partition_table\"]/tbody/tr[2]/td[5]/div/input")
    public static WebElement Value;

    @FindBy(how = How.XPATH,using = "//*[@id=\"partition_table\"]/tbody/tr[2]/td[6]/div/input")
    public static WebElement LifeSpan;

    @FindBy(how = How.XPATH,using = "/html/body/form/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[13]/td/div/input[2]")
    public static WebElement addbutton;

    @FindBy(how = How.XPATH,using = "/html/body/form/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[13]/td/div/input[1]")
    public static WebElement modifybutton;

    @FindBy(how = How.XPATH,using = "/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr[2]/td[2]/div/a")
    public static WebElement deletebutton;

}
