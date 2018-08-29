package FUNCTION;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import GUI.Main;

public class Load_Delay {
	File sec,hour,min,delay,autorun ;
	FileReader secfread,hourfread,minfread,delayfread,autorunfread;
	BufferedReader secbread,hourbread,minbread,delaybread,autorunbread;

public Load_Delay() {

	try
	{
	 	 sec = new File ("sec.txt");
	 	 hour = new File("hour.txt");
	 	 min = new File("min.txt");
	 	 delay = new File("delay.txt");
	 	 autorun = new File("autorun.txt");
	     secfread = new FileReader (sec);
	     secbread = new BufferedReader (secfread);
	     hourfread = new FileReader (hour);
	    hourbread = new BufferedReader (hourfread);
	     minfread = new FileReader (min);
	     minbread = new BufferedReader (minfread);
	     delayfread = new FileReader (delay);
	     delaybread = new BufferedReader (delayfread);
	    autorunfread = new FileReader (autorun);
	     autorunbread = new BufferedReader (autorunfread);
	 	 try {String autosec = secbread.readLine(); while (autosec != null){
        Main.f.pan.delaypan.setSec(autosec); autosec = secbread.readLine(); }
        secbread.close(); secfread.close();
        }catch (IOException exception){}}catch (FileNotFoundException exception){}
	 try {String automin = minbread.readLine(); while (automin != null){
	        Main.f.pan.delaypan.setMin(automin); automin = secbread.readLine(); }
	        minbread.close(); minfread.close();
	        }catch (IOException exception){}
	 try {String autohour = hourbread.readLine(); while (autohour != null){
	        Main.f.pan.delaypan.setHour(autohour); autohour = hourbread.readLine(); }
	        hourbread.close(); hourfread.close();
	        }catch (IOException exception){}
	 try {String autodelay = delaybread.readLine(); while (autodelay != null){
	        Main.f.pan.delaypan.setDelay(autodelay); autodelay = delaybread.readLine(); }
	        delaybread.close(); delayfread.close();
	        }catch (IOException exception){}
	 try {String autoautorun = autorunbread.readLine(); while (autoautorun != null){
	        Main.f.pan.delaypan.setCheck(autoautorun); autoautorun = autorunbread.readLine(); }
	        autorunbread.close(); autorunfread.close();
	        }catch (IOException exception){}
}
}



