import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class DirContents {

	void dirContents() {
		File dir = new File(MainClass.dirPath);
		File[] dirContent =dir.listFiles();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		Arrays.sort(dirContent);
		
		System.out.println("\nContents of directory - " + MainClass.dirPath);
		
		for (File object:dirContent) {
			System.out.println(object.getName());
		}
		
		System.out.println("\nPress enter to return to menu.");
		sc.nextLine();
		
	}
	
	
}
