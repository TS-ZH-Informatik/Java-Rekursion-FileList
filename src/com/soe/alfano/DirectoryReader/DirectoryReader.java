package com.soe.alfano.DirectoryReader;

import java.io.File;

public class DirectoryReader {

	String filename;
	File file = null;
	String[] files;
	DirectoryReader dr = null;
	
	public DirectoryReader (String filename){
		this.filename = filename;
		this.file = new File(filename);
		if(file.isDirectory()){
			System.out.println("Directory: "+file.getName());
			this.scanDirectory();
		}
		else 
			System.out.println(file.getName());
	}
	
	
	private boolean scanDirectory(){
		files = this.file.list();
		for(String s : files){
			File f = new File(filename+"/"+s);
			if(f.isDirectory()){
				dr = new DirectoryReader(filename+"/"+s);				
			}
			System.out.println("File: "+f.getName());
		}
		return true;
	}
	
}
