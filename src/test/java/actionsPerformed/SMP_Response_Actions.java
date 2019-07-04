package actionsPerformed;

import org.openqa.selenium.support.ui.Select;
import pageobjects.SMP_Responses;

public class SMP_Response_Actions {


    public static void responses() throws InterruptedException {
        pageobjects.SMP_Responses.response.click();
        Thread.sleep(3000);
    }

    public static void addresponse(String responsetype, String responseid, String description,  String spid,String plan, String Language ) throws InterruptedException {

        if (responsetype.equalsIgnoreCase("SMS")){

            SMP_Responses.Createresponse.click();
            Thread.sleep(4000);
            SMP_Responses.smsrespid.sendKeys(responseid);
        }

        else if (responsetype.equalsIgnoreCase("IVR")){

            SMP_Responses.IVR.click();
            SMP_Responses.Createresponse.click();
            Thread.sleep(4000);
            SMP_Responses.webrespid.sendKeys(responseid);
        }

        else if (responsetype.equalsIgnoreCase("Web")){

            SMP_Responses.Web.click();
            SMP_Responses.Createresponse.click();
            Thread.sleep(4000);
            SMP_Responses.webrespid.sendKeys(responseid);

        }

        SMP_Responses.description.sendKeys(description);

        if (spid.equalsIgnoreCase("O2 Online")){
            new Select(SMP_Responses.spid).selectByVisibleText("O2 Online");
            System.out.println("O2 Online");

        }else if (spid.equalsIgnoreCase("tesco Mobile")) {
            new Select(SMP_Responses.spid).selectByVisibleText("Tesco Mobile");
            System.out.println("Tesco Mobile");

        }else if (spid.equalsIgnoreCase("O2 UK")) {
            new Select(SMP_Responses.spid).selectByVisibleText("O2 UK");
            System.out.println("O2 UK");

        }else if (spid.equalsIgnoreCase("Brite & Postpay")) {
            new Select(SMP_Responses.spid).selectByVisibleText("Brite & Postpay");
            System.out.println("Brite & Postpay");


            if (plan.equalsIgnoreCase("BRITE ORIGINAL FBF")){
                new Select(SMP_Responses.spid).selectByVisibleText("BRITE ORIGINAL FBF");
                System.out.println("BRITE ORIGINAL FBF");

            }else if(plan.equalsIgnoreCase("BRITE TALKALOT FBF")) {

                new Select(SMP_Responses.plan).selectByVisibleText("BRITE TALKALOT FBF");
                System.out.println("BRITE TALKALOT FBF");

            }else if(plan.equalsIgnoreCase("BROADWAY CHILD")) {

                new Select(SMP_Responses.plan).selectByVisibleText("BROADWAY CHILD");
                System.out.println("BROADWAY CHILD");
            }
            if (Language.equalsIgnoreCase("O2UK & Online")){
                new Select(SMP_Responses.language).selectByVisibleText("O2UK & Online");
                System.out.println("O2UK & Online");
            }
            else if(Language.equalsIgnoreCase("Tesco")) {

                new Select(SMP_Responses.language).selectByVisibleText("Tesco");
                System.out.println("Tesco");
            }

        }

    }
    public static void Add() {

        pageobjects.SMP_Responses.add.click();
    }
}



