package FUNCTION;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import GUI.Main;

public class Load_Item {
	File itemcategorie,itemname,itemcolor,itemsize ;
	FileReader itemcategoriefread,itemnamefread,itemcolorfread,itemsizefread;
	BufferedReader itemcategoriebread,itemnamebread,itemcolorbread,itemsizebread;
	public Load_Item() {
		try
		{
			itemcategorie = new File ("itemcategorie.txt");
			itemname = new File("itemname.txt");
			itemcolor = new File("itemcolor.txt");
			itemsize = new File("itemsize.txt");
			itemcategoriefread = new FileReader (itemcategorie);
			itemcategoriebread = new BufferedReader (itemcategoriefread);
		     itemnamefread = new FileReader (itemname);
		     itemnamebread = new BufferedReader (itemnamefread);
		    itemcolorfread = new FileReader (itemcolor);
		    itemcolorbread = new BufferedReader (itemcolorfread);
		     itemsizefread = new FileReader (itemsize);
		     itemsizebread = new BufferedReader (itemsizefread);
		     
			 try {String autocategorie = itemcategoriebread.readLine(); while (autocategorie != null){
			        Main.f.pan.itempan.setItemcategorie(autocategorie); autocategorie = itemcategoriebread.readLine(); }
			       itemcategoriebread.close(); itemcategoriefread.close();
			        }catch (IOException exception){}}catch (FileNotFoundException exception){}
	    
				 try {String autoname = itemnamebread.readLine(); while (autoname != null){
				        Main.f.pan.itempan.setItemname(autoname); autoname = itemnamebread.readLine(); }
				       itemnamebread.close(); itemnamefread.close();
				        }catch (IOException exception){}
	 try {String autocolor = itemcolorbread.readLine(); while (autocolor != null){
	        Main.f.pan.itempan.setItemcolor(autocolor); autocolor = itemcolorbread.readLine(); }
	       itemcolorbread.close(); itemcolorfread.close();
	        }catch (IOException exception){}
	 try {String autosize = itemsizebread.readLine(); while (autosize != null){
	        Main.f.pan.itempan.setItemsize(autosize); autosize = itemsizebread.readLine(); }
	       itemsizebread.close(); itemsizefread.close();
	        }catch (IOException exception){}

	}


}
