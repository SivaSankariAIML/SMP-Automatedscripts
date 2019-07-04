package actionsPerformed;

import org.openqa.selenium.support.ui.Select;

public class SMP_ActionsetActions {

    public static void actionset() throws InterruptedException {

        pageobjects.SMP_Actionsetspage.Acset.click();
        Thread.sleep(3000);
    }

    public static void createactions(String id, String description, String action,  String planid,String offer, String category, String response, String sessionactid, String startdate, String enddate  ) throws InterruptedException {

        pageobjects.SMP_Actionsetspage.acsid.sendKeys(id);
        pageobjects.SMP_Actionsetspage.acsid.sendKeys(description);


        if (action.equalsIgnoreCase("Subscribe Offer")){
            new Select(pageobjects.SMP_Actionsetspage.action).selectByVisibleText("Subscribe Offer");
            System.out.println("Subscribe Offer");
            new Select(pageobjects.SMP_Actionsetspage.offer).selectByVisibleText(offer);
            System.out.println(offer);
        }

        if (action.equalsIgnoreCase("Immediate Unsubscribe")){
            new Select(pageobjects.SMP_Actionsetspage.action).selectByVisibleText("Immediate Unsubscribe");
            System.out.println("Immediate Unsubscribe");
            new Select(pageobjects.SMP_Actionsetspage.offer).selectByVisibleText(offer);
            System.out.println(offer);
        }

        if (action.equalsIgnoreCase("Unsubscribe Offer")){
            new Select(pageobjects.SMP_Actionsetspage.action).selectByVisibleText("Unsubscribe Offer");

            System.out.println("Unsubscribe Offer");
            new Select(pageobjects.SMP_Actionsetspage.offer).selectByVisibleText(offer);
            System.out.println(offer);
        }

        if (action.equalsIgnoreCase("Change Subscription")){
            new Select(pageobjects.SMP_Actionsetspage.action).selectByVisibleText("Change Subscription");
            System.out.println("Change Subscription");
            new Select(pageobjects.SMP_Actionsetspage.offer).selectByVisibleText(offer);
            System.out.println(offer);
            new Select(pageobjects.SMP_Actionsetspage.category).selectByVisibleText(category);
            System.out.println(category);
        }

        if (action.equalsIgnoreCase("Set Rate Plan")){
            new Select(pageobjects.SMP_Actionsetspage.action).selectByVisibleText("Set Rate Plan");
            System.out.println("Set Rate Plan");
            new Select(pageobjects.SMP_Actionsetspage.plan).selectByVisibleText(planid);
            System.out.println(planid);

        }

        if (action.equalsIgnoreCase("Set Post Code")){
            new Select(pageobjects.SMP_Actionsetspage.action).selectByVisibleText("Set Post Code");
            System.out.println("Set Post Code");

        }

        if (action.equalsIgnoreCase("Store Session Data")){
            new Select(pageobjects.SMP_Actionsetspage.action).selectByVisibleText("Store Session Data");
            System.out.println("Store Session Data");
            new Select(pageobjects.SMP_Actionsetspage.sacsid).selectByVisibleText(sessionactid);
            System.out.println(sessionactid);
        }
        if (action.equalsIgnoreCase("Respond")){
            new Select(pageobjects.SMP_Actionsetspage.action).selectByVisibleText("Respond");
            System.out.println("Respond");
            new Select(pageobjects.SMP_Actionsetspage.offer).selectByVisibleText(offer);
            System.out.println(offer);
            new Select(pageobjects.SMP_Actionsetspage.category).selectByVisibleText(category);
            System.out.println(category);
            new Select(pageobjects.SMP_Actionsetspage.plan).selectByVisibleText(planid);
            System.out.println(planid);
            new Select(pageobjects.SMP_Actionsetspage.response).selectByVisibleText(response);
            System.out.println(response);

        }
        if (action.equalsIgnoreCase("Write Details to File")){
            new Select(pageobjects.SMP_Actionsetspage.action).selectByVisibleText("Write Details to File");

            System.out.println("Write Details to File");
            new Select(pageobjects.SMP_Actionsetspage.offer).selectByVisibleText(offer);
            System.out.println(offer);
            new Select(pageobjects.SMP_Actionsetspage.category).selectByVisibleText(category);
            System.out.println(category);
            new Select(pageobjects.SMP_Actionsetspage.plan).selectByVisibleText(planid);
            System.out.println(planid);
        }
        if (action.equalsIgnoreCase("Continue to Next Rule")){
            new Select(pageobjects.SMP_Actionsetspage.action).selectByVisibleText("Continue to Next Rule");
            System.out.println("Continue to Next Rule");

        }

        pageobjects.SMP_Actionsetspage.startdt.sendKeys(startdate);
        pageobjects.SMP_Actionsetspage.enddt.sendKeys(enddate);

    }

    public static void add() {
        pageobjects.SMP_Actionsetspage.add.click();
    }
}
