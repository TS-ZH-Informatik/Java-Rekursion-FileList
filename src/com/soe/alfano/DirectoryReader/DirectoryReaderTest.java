package com.soe.alfano.DirectoryReader;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DirectoryReaderTest {

	public static void main(String[] args){
		JFileChooser chooser = new JFileChooser();
		
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.setCurrentDirectory(new File("/Users/Sam/"));
		String dir ="" ;
		if(chooser.showDialog(chooser,"Open") == JFileChooser.APPROVE_OPTION )
		{
			dir = chooser.getCurrentDirectory().toString();
			System.out.println(dir);
			DirectoryReader dr = new DirectoryReader(dir);
		}
	}
}
