package FUNCTION;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import GUI.Main;

public class Save_Item {
	 FileWriter itemname;
	 FileWriter itemcategorie;
	 FileWriter itemsize;
	 FileWriter itemcolor;
	 BufferedWriter out1;
	 BufferedWriter out2;
	 BufferedWriter out3;
	 BufferedWriter out4;

public Save_Item() {
	try {
		String itemnames =  Main.f.pan.itempan.getItemname();
		String itemcategories =  Main.f.pan.itempan.getItemcategorie();
		String itemsizes =  Main.f.pan.itempan.getItemsize();
		String itemcolors =  Main.f.pan.itempan.getItemcolor();
		

	    // Create file
	     itemname = new FileWriter("itemname.txt");
	     out1 = new BufferedWriter(itemname);
	     out1.write(itemnames);
	 	
	     itemcategorie = new FileWriter("itemcategorie.txt");
	     out2 = new BufferedWriter(itemcategorie);
	     out2.write(itemcategories);
	 
	     itemsize = new FileWriter("itemsize.txt");
	 	out3 = new BufferedWriter(itemsize);
	     out3.write(itemsizes);
	 	
	     itemcolor = new FileWriter("itemcolor.txt");
	     out4 = new BufferedWriter(itemcolor);
	     out4.write(itemcolors);
	     
	     //fermeture écriture
	     
	     out1.close();
	     out2.close();
	     out3.close();
	     out4.close();
}catch (IOException e) {
	e.printStackTrace();
}
}
}
