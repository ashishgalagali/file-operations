package FileOperations;

import java.io.File;
import java.io.IOException;

/**
 * Renames the files in a directory
 * Created by ashish on 23/5/17.
 */
public class RenameFiles {

	public static void main(String[] argv) throws IOException {

		String scrDirectoryPath = "/home/ashish/Documents/src";
		File dir = new File(scrDirectoryPath);
		File[] directoryListing = dir.listFiles();
		for (File file : directoryListing) {
			//Mention the new file name
			String newName = file.getName().replace("old", "new");
			file.renameTo(new File("/home/ashish/Documents/src/" + newName));
		}
		System.out.println("Renaming files completed");
	}

}
