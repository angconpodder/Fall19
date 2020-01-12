package fileDirectory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UniqueNames {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyyyy_HHmmss");  
	    Date date = new Date();  
	    String dateTime = formatter.format(date);  
	    
	    String[] myArray= dateTime.split("_");
	    
	    String dateStamp = myArray[0];
	    String timeStamp = myArray[1];
	    
		
		File file = new File("C:\\FAll2019\\" + dateStamp);
		if (!file.exists()) {
			if (file.mkdir()) {
				writeFile("C:\\FAll2019\\" + dateStamp + "\\log_"+dateTime+".txt", "hello this is my text");
			}
		}  
		else {
				writeFile("C:\\FAll2019\\" + dateStamp + "\\log_"+dateTime+".txt", "hello this is my text");
		}
		

	}
	
	
	public static void writeFile(String path, String name) throws IOException{
		File f = new File(path);
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(name);
		bw.newLine();
		bw.write(name);
		
		bw.close();
	}
	

}
