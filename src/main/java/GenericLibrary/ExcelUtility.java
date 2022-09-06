package GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

		public String readDataFromExcel(String path,String sheetName,int rowNo,int cellNo)  {
			File absPath = new File(path);
			Workbook wrkbook=null;
			try {
				FileInputStream fis= new FileInputStream(absPath);
				wrkbook = WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return wrkbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).toString();
		}

	}


