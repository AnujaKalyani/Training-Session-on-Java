package file.com;

import java.io.File;

public class CreatFile {

	public static void main(String[] args) {
		try {
			File file=new File("abc.txt");
			if(file.createNewFile()) {
				System.out.println("File is created");
			}else {
				System.out.println("File is already exist");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
