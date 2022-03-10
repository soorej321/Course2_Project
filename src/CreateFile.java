import java.util.Scanner;
import java.io.*;

public class CreateFile {
	
	void addfile() {
		int i = 0;
		String user_val = " ";

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter the file name to be created:");
		
		
		while (i == 0)
	    {			
	        try{user_val = sc.nextLine();} 
	        catch (java.util.InputMismatchException e)
	        {System.out.println("Invalid option entered. Please try again..");}
	      
	        File newfile = new File(MainClass.dirPath + "\\" + user_val );
	        
	        try {
	        	if (user_val.trim() == "" ) {
	        		System.out.println("No file name entered");	        		
	        	} else if (newfile.exists()) {
	            	System.out.println("File already exists");
	            } else if(newfile.createNewFile()) {
	            	System.out.println("File Created");	
	            } else {
	            	System.out.println("Error in creating file. Verify name.");
	            }
	        } catch (IOException ioe) {
	            System.out.println("Error while creating file.");
	            System.out.println(ioe);
	        }
	        
	        System.out.println("\nPress enter to return to menu.");
	        sc.nextLine();
	        
	        i++;
	        
	    }
	}

}
