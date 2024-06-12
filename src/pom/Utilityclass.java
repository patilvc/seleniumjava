package pom;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utilityclass  extends BaseClass {

	
	FileInputStream  File;
	Sheet sh;
	
	public void testdata() throws EncryptedDocumentException, IOException {
		
		 File = new FileInputStream("C:\\Users\\admin\\git\\repository2\\studyjava\\TestData\\Book2.xlsx");

		 sh = WorkbookFactory.create(File).getSheet("Sheet1");

	}
	
}
