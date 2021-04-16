package org.demo.demopackage;
import java.io.*;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\ShreeshaK\\Desktop\\file1.txt");
		FileInputStream fis = null;
		FileOutputStream fout = null;
		try {
			fis = new FileInputStream(file);
			fout = new FileOutputStream("C:\\Users\\ShreeshaK\\Desktop\\file2.txt");
			int count;
			while((count = fis.read()) != -1)
			{
				fout.write(count);
			}
            System.out.println("File Copied Sucessfully");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		fis.close();
		fout.close();
	}

}
