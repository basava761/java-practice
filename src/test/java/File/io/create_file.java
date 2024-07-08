package File.io;

import java.io.File;

public class create_file {
	
	public static void main(String[] args) throws Exception {
		File f=new File("zbc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println(f.list());
		f.delete();
	}	
		

}
