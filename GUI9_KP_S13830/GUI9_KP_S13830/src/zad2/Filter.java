package zad2;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

public class Filter implements FileFilter{
	
	private ArrayList<String> list = new ArrayList<String>();
	
	@Override
	public boolean accept(File pathname) {
		for(String extension: list){
			if(pathname.getName().toLowerCase().endsWith(extension))
				return true;
		}
		return false;
	}
	
	public void addExtension(String extension){
		list.add(extension);
	}
	
	public void removeExtension(String extension){
		list.remove(extension);
	}
}
