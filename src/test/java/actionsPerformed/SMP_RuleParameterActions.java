package actionsPerformed;

public class SMP_RuleParameterActions {

    public static void ruleparameters() throws InterruptedException {

        pageobjects.SMP_RuleParameters.SMPadmin.click();
        Thread.sleep(3000);
        pageobjects.SMP_RuleParameters.rulep.click();

    }

    public static void addoffer(String value,String description, String enddate ) throws InterruptedException {
        pageobjects.SMP_RuleParameters.create.click();
        pageobjects.SMP_RuleParameters.value.sendKeys(value);
        pageobjects.SMP_RuleParameters.description.sendKeys(description);
        pageobjects.SMP_RuleParameters.enddt.sendKeys(enddate);

    }
    public static void Add() {
        pageobjects.SMP_RuleParameters.add.click();
    }
}
