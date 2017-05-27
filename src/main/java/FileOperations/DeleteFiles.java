package FileOperations;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * Deleted the specified files in a directory
 * Created by ashish on 15/5/17.
 */
public class DeleteFiles {

	public static void main(String[] args) {
		String[] filesArr = { "names of files to be deleted" };
		List<String> files = Arrays.asList(filesArr);

		String scrDirectoryPath = "/home/ashish/Documents/dir";

		for (String fileStr : files) {
			File file = new File(scrDirectoryPath + "/" + fileStr);
			System.out.println("deleting File: " + file.getName() + " : " + file.delete());
		}
	}
}
