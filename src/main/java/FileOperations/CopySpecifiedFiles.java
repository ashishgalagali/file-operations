package FileOperations;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Copies specified files from source to destination directory
 * Created by ashish on 16/5/17.
 */
public class CopySpecifiedFiles {

	public static void main(String[] args) {
		String[] filesArr = { "names of files which need to be copied" };

		List<String> files = Arrays.asList(filesArr);
		String scrDirectoryPath = "/home/ashish/Documents/scr";
		String destDirectoryPath = "/home/ashish/Documents/dest";
		for (String file : files) {
			try {
				System.out.println("copying: " + file);
				FileUtils.copyFile(new File(scrDirectoryPath + "/" + file), new File(destDirectoryPath + "/" + file));
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
