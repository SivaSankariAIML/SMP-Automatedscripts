package helpers;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MSExcel {
	String fileName="C:\\Automation\\SMP\\Configurations\\testData\\testdata_SMP.xlsx";
	String tabName ="OFFERS TEXT REAL";
	FileInputStream fs;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	//FileOutputStream fos;

	public void setFilename(String filename) {
		this.fileName = filename;
	}
	public MSExcel(String filename){
		setFilename(filename);
	}
	public MSExcel(){
		init();
	}

	public void setTabName(String tabName) {
		this.tabName = tabName;
		init();
	}

	public void init(){
		try{
			this.fs = new FileInputStream(fileName);
			this.workbook = new XSSFWorkbook(fs);
			this.sheet = workbook.getSheet(tabName);
			//this.fos = new FileOutputStream(fileName);
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
	public HashMap<String, String> readCell(int row,int col){
		String cellValue="";
		HashMap<String, String> cellDetails = new HashMap<String, String>();
		XSSFRow currentRow = sheet.getRow(row);
		DataFormatter dataFormatter = new DataFormatter();
		if(currentRow!=null) {
            XSSFCell currentCell = currentRow.getCell(col);
            if (currentCell != null) {
                switch (currentCell.getCellType()) {
                    case XSSFCell.CELL_TYPE_STRING:
                        cellValue = currentCell.getStringCellValue();
		                break;
                    case XSSFCell.CELL_TYPE_NUMERIC:
						cellValue = dataFormatter.formatCellValue(currentCell);
						break;
                    case XSSFCell.CELL_TYPE_BLANK:
                        cellValue = "";
                        break;
                    case XSSFCell.CELL_TYPE_ERROR:
                        cellValue = "";
                        break;
                }
				cellDetails.put("value",cellValue);
				if(currentCell.getCellStyle().getFont().getXSSFColor()!=null) {
					cellDetails.put("fontColor", currentCell.getCellStyle().getFont().getXSSFColor().getARGBHex());
					if(currentCell.getCellStyle().getFillForegroundXSSFColor()!=null)
						cellDetails.put("cellColor", currentCell.getCellStyle().getFillForegroundXSSFColor().getARGBHex());
					else
						cellDetails.put("cellColor","");
				}
				else {
					cellDetails.put("fontColor", "");
					cellDetails.put("cellColor","");
				}
				//return cellDetails;
            }else {
				cellDetails.put("value", null);
				cellDetails.put("fontColor","");
				cellDetails.put("cellColor","");
			}
				return cellDetails; //End of column
		}else
			return null; //End of Row
	}

	public int writeCell(int row, int col, String value){
		try{
			XSSFRow currentRow = sheet.getRow(row);
			if(currentRow!=null) {
				XSSFCell currentCell = currentRow.getCell(col);
				if (currentCell != null) {
					currentCell.setCellType(XSSFCell.CELL_TYPE_STRING);
					currentCell.setCellValue(value);
					//workbook.write(fos);
				}
			}
			return 0;
		}catch(Exception e){
			return -1;
		}
	}
	public List<HashMap<String,String>> readSpreadsheet() {
		List<HashMap<String,String>> spreadsheetData = new ArrayList<>();
		for (int i = 1; this.getLastCol(i) > 0; i++) {
			HashMap<String, String> sheetRow = new HashMap<String, String>();
			//System.out.print("\n::" + i + "::");
			for (int j = 0; j < this.getLastCol(i); j++) {
				sheetRow.put(this.readCell(0, j).get("value"), this.readCell(i, j).get("value"));
			}
			//System.out.print(sheetRow);
			spreadsheetData.add(sheetRow);
		}
		return spreadsheetData;
	}
	public int getLastCol(int row){
        XSSFRow currentRow = sheet.getRow(row);
        if(currentRow!=null)
            return currentRow.getLastCellNum();
        else
            return 0;
    }
	public void close(){
	    try {
            fs.close();
        }catch(Exception e){
	        System.out.println("Error Closing the Excel: " +e.toString());
        }
    }

}
