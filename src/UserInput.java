import java.io.File;
import java.util.Scanner;

public class UserInput {
	
	public int usrinpint(int a, int b) {
		
		int i=0;
		int user_val = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (i == 0)
	    {			
	        try
	        {
	        	user_val = sc.nextInt();
	        	
	        	if ((user_val < a) || (user_val > b)) {
	        		System.out.println("Invalid option entered. Please try again.. ");
		        	sc.nextLine();
	        	}
	        	else i++;

	        } 
	        catch (java.util.InputMismatchException e)
	        {
	        	System.out.println("Invalid option entered. Please try again.. ");
	        	sc.nextLine();
	        }
	    }
		return user_val;
	}

	void setDir() {		
		int i=0;
		String user_val = " ";
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("*      Welcome to Lockedme.com          *");
		System.out.println("*****************************************");
		System.out.println("Developer-Soorej Balan");
		System.out.println("\n\n Please enter the root directory:");
		while (i == 0)
	    {			
	        try
	        {
	        	user_val = sc1.nextLine();
	        	
	        	File file = new File(user_val);
	            
	            if (file.exists()) {
	            	if(file.canWrite()) {
	            		MainClass.dirPath = user_val;
	            		i++;
	            	} else {
	            		System.out.println("No write access to directory. Please try again"); 
	            	}
	        	} else {
	        		System.out.println("Invalid directory. Please try again.. ");
	        	}

	        } 
	        catch (Exception e)
	        {
	        	System.out.println("Invalid directory. Please try again.. ");
	        }
	    }
	}

}
