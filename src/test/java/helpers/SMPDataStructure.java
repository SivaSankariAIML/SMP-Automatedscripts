package helpers;

import java.util.HashMap;
import java.util.List;

public class SMPDataStructure {
    MSExcel e;
    List<HashMap<String,String>> tabOfferTextReal =null;
    List<HashMap<String,String>> tabOffersReal =null;
    List<HashMap<String,String>> tabServiceGroupList =null;
    List<HashMap<String,String>> tabBundle =null;
    List<HashMap<String,String>> tabBundleConfig =null;
    List<HashMap<String,String>> tabServiceGroupText =null;
    List<HashMap<String,String>> tabLanguageNotification =null;


    public SMPDataStructure(String spreadsheetPath){
        e = new MSExcel(spreadsheetPath);
        e.setTabName("SERVICEGROUPLIST");
        //tabServiceGroupList = e.readSpreadsheet();
        e.setTabName("BUNDLE");
        //tabBundle = e.readSpreadsheet();
        e.setTabName("BUNDLECONFIG");
        //tabBundleConfig = e.readSpreadsheet();
        e.setTabName("OFFERS REAL");
        tabOffersReal = e.readSpreadsheet();
        e.setTabName("OFFER TEXT REAL");
        tabOfferTextReal = e.readSpreadsheet();
        e.setTabName("SERVICEGROUP TEXT");
        tabServiceGroupText = e.readSpreadsheet();
        e.setTabName("LANGUAGE NOTIFICATION");
        tabLanguageNotification = e.readSpreadsheet();
    }

    public String decode(String value, String tab, String key, String reference){
        String decodedValue="";
        List<HashMap<String,String>> searchTab=null;
        try{
            switch (tab) {
                case "OFFERS REAL":
                    searchTab = tabOffersReal;
                    break;
                case "OFFER TEXT REAL":
                    searchTab = tabOfferTextReal;
                    break;
            }
            for(int i=0; i<searchTab.size();i++){
                if(searchTab.get(i).get(key).equalsIgnoreCase(value)){
                    decodedValue = searchTab.get(i).get(reference);
                    System.out.println("Decoded value of [ "+value+" ] from tab[ "+tab+"\\"+key+" ] is : " + decodedValue);
                }
            }
            return decodedValue;
        }catch(Exception e){
            System.out.println("Couldn't decode ......");
            return null;
        }
    }

    // Constants
    public HashMap<String,String> notificationType = new HashMap<String, String>() {
        {
            put("1","Welcome Activation");
            put("2","Subscription State");
            put("3","Replen With Charge");
            put("4","Replen Charge Fail");
            put("5","Subscribe With Chg");
            put("6","Credit Expiry Warn");
            put("7","Account Expiry Warn");
            put("8","Recharge");
            put("9","Expended Partition");
            put("10","Generic");
            put("11","Low Bal Partition");
            put("12","Balance Enquiry");
            put("13","Notification Mgmt");
            put("15","Subscription No Fee");
            put("16"," Periodic Charge Warn");
            put("17","Subscribe Chg Fail");
            put("18","Replenish No Fee");
            put("19","Periodic Luaq Warn");
            put("20","Luaq Subscription");
            put("21","Luaq Repaid");
            put("22","Luaq Repaid Penalty");
            put("23","Final Replen Fail");
            put("24","Not Qualified Warn");
            put("25","Qualified Warn");
            put("26","SPID Change");
            put("27","Joined Account Low Balance");
            put("28","Joined Account Expended");
            put("29","Joined Account Replenishment");
            put("1000","SMS Unrecognized");
            put("1002","Bal Enq Sys Unavail");
            put("1003","Not Mgmt Sys Unavail");
        }
    };
    public HashMap<String,String> serviceType = new HashMap<String, String>() {
        {
            put("-1","Unspecified");
            put("0","Purchase");
            put("1","Bonus");
            put("2","Extended Friends");
            put("3","Joined Account");
        }
    };
}
