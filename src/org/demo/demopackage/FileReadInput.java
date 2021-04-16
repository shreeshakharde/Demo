package org.demo.demopackage;
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadInput {

	public static void main(String[] args) throws IOException{
		
		File file=new File("C:\\Users\\ShreeshaK\\Desktop\\test.txt");
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(file);
			System.out.println("Total File size to read(inbytes):" + fis.available());
			int count;
			while((count = fis.read()) != -1)
			{
				System.out.print((char)count);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				if(fis != null)
					fis.close();
			}
			catch(IOException ex){
				
				ex.printStackTrace();
			}
		}

	}

}
