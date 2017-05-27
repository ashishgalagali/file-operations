package FileOperations;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Copies all files from the source directory to destination directory
 * Created by ashish on 15/5/17.
 */
public class CopyFiles {

	public static void main(String[] args) {

		String scrDirectoryPath = "/home/ashish/Documents/src";
		String destDirectoryPath = "/home/ashish/Documents/dest";
		File dir = new File(scrDirectoryPath);
		File[] directoryListing = dir.listFiles();
		for (File image : directoryListing) {
			try {
				System.out.println("copying: " + image.getName());
				FileUtils.copyFile(image, new File(destDirectoryPath + "/" + image.getName()));
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
