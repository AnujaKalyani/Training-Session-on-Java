package java_9.com;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Test {
	public static void main(String args[]) {
		//using try catch
/*
 		BufferedReader br=null;
 		FileOutputStream fos=null;
 		
 		try {
 			br=new BufferedReader(new InputStreamReader(System.in));
 			System.out.println("Enter Data:");
 			String data=br.readLine();
 			fos=new FileOutputStream("D:/student_info.txt");
 			byte[]b=data.getBytes();
 			fos.write(b);
 			
 		}catch(Exception e){
 			e.printStackTrace();
 		}
 		finally {
 			try {
 				br.close();
 	 			fos.close();
 	 			
 			}catch(Exception e) {
 				e.printStackTrace();
 			}
 		}*/
		//try with resources,in this we can write code which we need to implement only one time

			try(

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			FileOutputStream fos = new FileOutputStream("D:/student_info.txt");

			) {

			System.out.print("Enter Data :");

			String data = br.readLine();

			byte[] b = data.getBytes();

			fos.write(b);

			} catch (Exception e) {

			e.printStackTrace();

			}

			}

			
		
	}


