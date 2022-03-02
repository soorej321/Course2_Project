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
	            if(newfile.createNewFile()) {
	            	System.out.println("File Created");	
	            } else {
	            	System.out.println("File already exists");
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
