import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class SearchFiles {
	
	void searchDisplay() {
		int i = 0;
		int count = 0;
		String user_val = " ";
		String user_conv = " ";
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter the file name to be searched:");
		System.out.println("(Hint: Use '%' for wild card search)");
		
		while (i == 0)
	    {			
	        try
	        {
	        	user_val = sc.nextLine();

	        } 
	        catch (java.util.InputMismatchException e)
	        {
	        	System.out.println("Invalid option entered. Please try again..");
	        }
	        
        	File dir = new File(MainClass.dirPath);
	       	
    		File[] dirContent =dir.listFiles();
    		Arrays.sort(dirContent);
    		
    		user_conv = user_val.replace("%", "(.*)");
    		
    		for (File object:dirContent) {
    			
    			if (object.getName().matches(user_conv)) {
    				if (count == 0) {
    					System.out.println("\nFile search results:");
    				}
    				System.out.println(object.getName());
    				count++;
    			}
    		}
    		
    		if (count == 0) {
    			System.out.println("\n(FNF) No files were found with entered search criteria.");
    		}
    		
        	i++;
	    }
		
		System.out.println("\nPress enter to return to menu.");
		sc.nextLine();
	}

}
