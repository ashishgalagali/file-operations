package FileOperations;

import java.io.File;

/**
 * Moves file from source to destination directory
 * Created by ashish on 15/5/17.
 */
public class MoveFile {

	public static void main(String[] args) {
		try {
			String scrDirectoryPath = "/home/ashish/Documents/src";
			String destDirectoryPath = "/home/ashish/Documents/dest";

			File dir = new File(scrDirectoryPath);
			File[] directoryListing = dir.listFiles();
			//Count of number of files to be moved
			int count = 500;
			for (File image : directoryListing) {
				if (count > 0) {
					String name = image.getName();
					if (image.renameTo(new File(destDirectoryPath + "/" + name))) {
						System.out.println(image.getName() + " is moved successful!");
					}
					else {
						System.out.println("File is failed to move!");
					}
				}
				count--;
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
