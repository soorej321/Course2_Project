import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MenuDisplay {
	
	void menuHead() {
		LocalDateTime now = LocalDateTime.now(); 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		System.out.println("Version-1.00                     "+ dtf.format(now));
		System.out.println("---------------Welcome to Lockedme.com---------------");
		System.out.println("Developer-Soorej Balan");
	}
	
	void mainMenuOption() {
		System.out.println("\n   1. Directory Contents");
		System.out.println("   2. File Operations");
		System.out.println("   0. Exit Application");
		System.out.println("\n Please enter option: ");
	}

	void fileMenuOption() {
		System.out.println("\n   1. Add File(s)");
		System.out.println("   2. Delete File(s)");
		System.out.println("   3. Search File(s)");
		System.out.println("   0. Return to Main Menu");
		System.out.println("\n Please enter option: ");
	}

}
