package File.io;

import java.io.File;
import java.io.FileWriter;

public class Files_Method {
	//we are overriding existing data with the new data
	public static void main(String[] args) throws Exception {
		File f=new File("basava.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		FileWriter fw=new FileWriter(f);
		fw.write("basavaraj761@gmail.com");
		fw.write("\n");
		char[] ch= {'a','b','c','D'};
	
		fw.write(ch);
		fw.write("\n");
		fw.write(100);
		fw.write("\n");
		fw.write("All is well"+"\n");
		fw.flush();
		fw.close();
	}

}
