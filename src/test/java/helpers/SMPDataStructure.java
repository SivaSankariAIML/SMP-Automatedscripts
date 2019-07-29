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
}
