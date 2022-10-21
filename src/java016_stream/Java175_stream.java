package java016_stream;

import java.io.File;

public class Java175_stream {

	public static void main(String[] args) {
		File file = new File("src/java016_stream/a");
		deleteFileList(file);

	}// end main()

	// src\java016_stream\a
	// src\java016_stream\a\b
	// src\java016_stream\a\b\c
	public static void deleteFileList(File srcFile) {
		File[] fileAll = srcFile.listFiles();
		System.out.println(fileAll.length);
		if (fileAll.length != 0) {

			for (File file : fileAll) {
				System.out.println(file);
				deleteFileList(file);
			}
		}
		System.out.println("Remove File: " + srcFile.getPath());
		srcFile.delete();
	}// end deleteFileList()

}// end class
