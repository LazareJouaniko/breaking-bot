package FUNCTION;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import GUI.Main;

public class Save_Delay {
	 FileWriter delay;
	 FileWriter hour;
	 FileWriter min;
	 FileWriter sec;
	 FileWriter autorun;
	 BufferedWriter out1;
	 BufferedWriter out2;
	 BufferedWriter out3;
	 BufferedWriter out4;
	 BufferedWriter out5;
	public Save_Delay() {
	try {
		String delays =  Main.f.pan.delaypan.getDelay();
		String hours =  Main.f.pan.delaypan.getHour();
		String mins =  Main.f.pan.delaypan.getMin();
		String secs =  Main.f.pan.delaypan.getSec();
		Boolean checks =  Main.f.pan.delaypan.getCheck();

	    // Create file
	     delay = new FileWriter("delay.txt");
	     out1 = new BufferedWriter(delay);
	     out1.write(delays);
	 	
	     hour = new FileWriter("hour.txt");
	     out2 = new BufferedWriter(hour);
	     out2.write(hours);
	 
	     min = new FileWriter("min.txt");
	 	out3 = new BufferedWriter(min);
	     out3.write(mins);
	 	
	     sec = new FileWriter("sec.txt");
	     out4 = new BufferedWriter(sec);
	     out4.write(secs);
	
	     autorun = new FileWriter("autorun.txt");
	  	out5 = new BufferedWriter(autorun);
	     out5.write(checks.toString());
	     out1.close();
	     out2.close();
	     out3.close();
	     out4.close();
	     out5.close();
	    } catch (IOException e) {
	      System.err.println("Error: " + e.getMessage());
		}
	    }
}
