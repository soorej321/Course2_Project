public class MainClass {

	public static String dirPath = " ";

	
	public static void main(String[] args) {
		
		int user_option = -1;
				
		MenuDisplay menu = new MenuDisplay();
		UserInput getval = new UserInput();
		
		menu.menuHead();
		getval.setDir();
		
			
		do {
			
			menu.menuHead();
			menu.mainMenuOption();		

            user_option = getval.usrinpint(0,2);
			
			if (user_option == 1) {
				
				DirContents dirCont = new DirContents();
				dirCont.dirContents();				
				
			} else if (user_option == 2) {
				
				FileOperations fileOps = new FileOperations();
				fileOps.FileMenu();
				
			} 
			
		} while (user_option != 0);		

		System.out.println("Application Terminated.");

	}
}
