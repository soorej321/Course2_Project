
public class FileOperations {

	void FileMenu() {
		
		MenuDisplay menu = new MenuDisplay();
		UserInput getval = new UserInput();
		
		int user_option = -1;
		
		do {
			
			menu.menuHead();
			menu.fileMenuOption();;		

            user_option = getval.usrinpint(0,3);
			
			if (user_option == 1) {
				CreateFile createF = new CreateFile();
				createF.addfile();				
				
			} else if (user_option == 2) {
				DeleteFile delF = new DeleteFile();
				delF.delF();
				
			} else if (user_option == 3) {
				SearchFiles searchF = new SearchFiles();
				searchF.searchDisplay();
			} 
			
		} while (user_option != 0);		
	}
}
