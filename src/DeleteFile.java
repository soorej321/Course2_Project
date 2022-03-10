import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteFile {
	
	void delF() {
		int i = 0;
		int count = 0;
		String user_val = " ";
		String user_conv = " ";
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter the file name to be deleted:");
		System.out.println("(Hint: You may use '%' as wild card in file name)");
		
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
    					System.out.println("\nThe following files will be deleted:");
    				}
    				System.out.println(object.getName());
    				count++;
    			}
    		}
    		
    		if (count == 0) {
    			System.out.println("\n(FNF) No files were found with entered deletion criteria.");
    		}else {
    			System.out.println("\nPlease confirm if you want to delete(Y/N)");
    			user_val = sc.nextLine();
    			
    			if (user_val.equalsIgnoreCase("y")) {
    				
    				for (File object:dirContent) {
    	    			
    	    			if (object.getName().matches(user_conv)) {
    	    				object.delete();
    	    			}
    	    		}
    				
    				System.out.println("\nDelete operation completed succesfully.");
    				
    			} else {
    				System.out.println("\nDelete operation cancelled.");
    			}
    		}
    		
        	i++;
	    }
		
		System.out.println("\nPress enter to return to menu.");
		sc.nextLine();
	}


}
