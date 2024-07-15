package file.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args) throws IOException {
		
		try {
			File file=new File("abc.txt");
			FileReader filereader=new FileReader(file);
			FileReader fr=new FileReader(file);
			BufferedReader bfr=new BufferedReader(fr);
			String line;
			while((line=bfr.readLine())!=null) {
				System.out.println(line);
			}
			bfr.close();
} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		

	}

}
