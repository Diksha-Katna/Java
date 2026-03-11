package LearningJava;
import java.io.File;
/*
1) Create a folder
2) Check if a folder exists
3) Rename a folder
4) Delete a folder
 */
public class FolderOperations {
	//create a folder
		public static void createFolder(String folderPath)
		{
			File folder=new File(folderPath);
				
			if(!folder.exists())
			{
			folder.mkdir();
			System.out.println("Folder created :" +folder.getName());
			}
		}
		
		//check if folder exists
		public static boolean checkFolderExist(String folderPath)
		{
			File folder=new File(folderPath);
			return folder.exists();
		}
		
		//rename a folder
		public static void renameFolder(String oldFolderPath, String newFolderPath)
		{
			File oldFolder=new File(oldFolderPath);
			File newFolder=new File(newFolderPath);
			
			if(oldFolder.exists())
			{
				oldFolder.renameTo(newFolder);
				System.out.println("Folder renamed to: "+newFolder.getName());
			}
		}
		
		//delete folder
		public static void deleteFolder(String folderPath)
		{
			File folder=new File(folderPath);
			
			if(folder.exists())
			{
				for(File file :folder.listFiles())
				{
					file.delete();
				}
				folder.delete();
				System.out.println("Folder deleted :"+folder.getName());
			}
			
		}
		
		
		public static void main(String[] args) {
			
			createFolder("C:\\myfiles");
			
			boolean folderexists=checkFolderExist("C:\\myfiles");
			System.out.println("Folder exists: "+ folderexists);
			
			renameFolder("C:\\myfiles","C:\\myfilesnew");
			
			deleteFolder("C:\\myfilesnew");
		
		}
}
