package File.io;

import java.io.File;

public class create_folder {

	public static void main(String[] args) throws Exception {
		File f=new File("durga1234");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
		//to create inside a specific folder
		File f1=new File("durga1234","xxx.txt");
		f1.createNewFile();
		System.out.println(f1.exists());
	

	}

}
