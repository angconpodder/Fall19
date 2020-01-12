package fileDirectory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExceLReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("D:\\Java Work\\Fall2019\\ClassEight\\data\\someFile.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fi);
		
		int RowNum = wb.getSheet("Data").getLastRowNum();
		
		for(int i=0; i<= RowNum; i++){
			System.out.println(wb.getSheet("Data").getRow(i).getCell(4));
		}

	}

}
