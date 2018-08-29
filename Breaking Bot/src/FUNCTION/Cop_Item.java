package FUNCTION;

import java.io.IOException;
import java.util.Calendar;

import GUI.Main;

public class Cop_Item {
	int whour;
	int wmin;
	int wsec;
	String interhour = Main.f.pan.delaypan.getHour();
	String intermin = Main.f.pan.delaypan.getMin();
	String intersec = Main.f.pan.delaypan.getSec();
	Calendar calendar = Calendar.getInstance();
	int hour = calendar.get(Calendar.HOUR_OF_DAY);
	int min = calendar.get(Calendar.MINUTE);
	int sec = calendar.get(Calendar.SECOND);
public Cop_Item() {
	//autorun activité , attendre l'heure
                if(Main.f.pan.delaypan.getCheck() == true){
                   	whour = Integer.parseInt(interhour); 
                	wmin = Integer.parseInt(intermin); 
                	wsec = Integer.parseInt(intersec);
                	int timeh = whour-hour; 
                	int timem = wmin-min;
                	int times = wsec-sec;
                	int timef = (timeh*3600+timem*60+times)*1000;
                	System.out.println(timef);
                	try {
						Thread.sleep(timef);
					} catch (InterruptedException e) { e.printStackTrace();
					}
            		}
                
                //Aller dans la catégorie de l'item
                try {
					Item_Url cop = new Item_Url();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
             
         
   
                
             
             }
            
                
              
                
             /*   SearchParams request = new SearchParams(Main.f.pan.itempan.getItemname());
                // Find text from the beginning of the loaded web page.
                SearchResult result = Main.f.netpan.browser.findText(request);
                System.out.println(result.indexOfSelectedMatch() + "/" +
                        result.getNumberOfMatches());
                // Find the same text again from the currently selected match.
                result = Main.f.netpan.browser.findText(request);
                System.out.println(result.indexOfSelectedMatch() + "/" +
                        result.getNumberOfMatches());
               */
        
            

}
