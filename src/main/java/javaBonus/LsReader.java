package javaBonus;

import java.io.File;
import java.io.IOException;

public class LsReader {

	public void dir(String path) {
		File dir = new File(path);
		File[] fileList = dir.listFiles();

		for (int i = 0; i < fileList.length; i++) {

			File file = fileList[i];
			System.out.print(file.getName());
			if(file.length() < 1024) {
				System.out.println("\t" + file.length() + "B");//size				
			}else if(file.length() < 1048576) {
				System.out.println("\t" + file.length()/1024 + "KB");//size								
			}else if(file.length() < 1073741824) {
				System.out.println("\t" + file.length()/1048576 + "MB");//size												
			}else {
				System.out.println("\t" + file.length()/1073741824 + "GB");//size
			}

		}
		
//		for(int j = fileList.length - 1; j >= 0; j--) {//reverse
//			File file = fileList[j];
//			System.out.print(file.getName());
//			System.out.println("\t" + file.length() + "byte");
//		}
	}
}
