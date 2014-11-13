package listdir;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;

public class listdir {
	private static File startDir;
	private static int maxDeep = 10;
	private static List<File> Files = new ArrayList<File>();
	
	public static void main(String[] args)
	{
		JFileChooser fch = new JFileChooser();
        fch.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if(fch.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            startDir = fch.getSelectedFile();
        }
		
		
		listfiles(startDir, Files, 0, maxDeep );
		for(int i = 0; i < Files.size(); i++ )
		{
			System.out.println(Files.get(i).toString());
		}
	}
	
	private static void listfiles(File currentFile, List<File> results, int currentDeep, int maxDeep)
	{
		if(currentFile.isFile())
		{
			results.add(currentFile);
			return;
		}
		if(!currentFile.isDirectory())
		{
			return;
		}
		if(maxDeep <= currentDeep)
		{
			System.out.println("Maximale Tiefe erreicht in " + currentFile.toString());
			return;
		}
		File[] childs = currentFile.listFiles();
		for(int i = 0; i < childs.length; i++ )
		{
			listfiles(childs[i], results, currentDeep+1, maxDeep);
		}
		return;
		
	}
	
	
}
