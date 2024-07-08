package File.io;

import java.io.FileWriter;

public class Append_to_file {

	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("basava.txt",true);
		fw.write("\n");
		fw.write("basava");
		fw.flush();
		fw.close();

	}

}
