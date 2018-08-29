package FUNCTION;
import java.awt.*;
import java.util.List;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.teamdev.jxbrowser.chromium.dom.By;
import com.teamdev.jxbrowser.chromium.dom.DOMDocument;
import com.teamdev.jxbrowser.chromium.dom.DOMElement;
import com.teamdev.jxbrowser.chromium.dom.DOMOptionElement;
import com.teamdev.jxbrowser.chromium.dom.DOMSelectElement;

import GUI.Main;
//import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

public class Item_Url {
public Item_Url() throws IOException {
	
	String cat = new String(Main.f.pan.itempan.getItemcategorie());
	String item = Main.f.pan.itempan.getItemname();
	item = item.replaceAll(" ", "");
	String color = Main.f.pan.itempan.getItemcolor();
	color = color.replaceAll(" ", "");
	String art2 = new String();
	String article = new String ();
	Document doc = Jsoup.connect("http://www.supremenewyork.com/shop/all/"+cat).get();
	System.out.print(doc.toString());
	//ajout liste article dans variable

	article = doc.getElementsByTag("article").toString();
	art2 = article.replaceAll("\\W","");
	art2 = art2.replaceAll("article", "");
	art2 = art2.replaceAll("div", "\n");
	art2 = art2.replaceAll("class", "\n");
	art2 = art2.replaceAll("inner", "");
	art2 = art2.replaceAll("style", "");
	art2 = art2.replaceAll("href", "");
	art2 = art2.replaceAll("sold", "");
	art2 = art2.replaceAll("out", "");
	art2 = art2.replaceAll("jackets", "");
	art2 = art2.replaceAll("shirts", "");
	art2 = art2.replaceAll("tops/sweaters", "");
	art2 = art2.replaceAll("sweatshirts", "");
	art2 = art2.replaceAll("pants", "");
	art2 = art2.replaceAll("shorts", "");
	art2 = art2.replaceAll("t-shirts", "");
	art2 = art2.replaceAll("hats", "");	
	art2 = art2.replaceAll("bags", "");
	art2 = art2.replaceAll("accessories", "");
	art2 = art2.replaceAll("skate", "");
	art2 = art2.replaceAll("h1pa", "");
	art2 = art2.replaceAll("namelinkshop", "");
	


        System.out.println(art2.indexOf(item));
        System.out.println(art2.indexOf(color));

        art2 = art2.substring(art2.indexOf(item)+0);
        article = art2.substring(art2.indexOf(item), art2.indexOf(color));


        article = article.substring(article.length()-18);
    	String url1, url2,url = new String();
    	int nbr = article.length()/2;
    	url1 = article.substring(0, +nbr);
    	url2 = article.substring(article.length()-nbr);
    	url = url1+'/'+url2;
    	

    	Document doc2 = Jsoup.connect("http://www.supremenewyork.com/shop/"+cat+"/"+url).get();
String Cop_Item_Url = new String("http://www.supremenewyork.com/shop/"+cat+"/"+url);

    	System.out.print("\nhttp://www.supremenewyork.com/shop/"+cat+"/"+url);
    	Main.f.browser.loadURL(Cop_Item_Url);
    try {
    	//delay avant ajout panier 
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} DOMDocument document = Main.f.browser.getDocument();
 
    DOMSelectElement select = (DOMSelectElement) document.findElement(By.name("size"));
    int sizeint = 0;
if(Main.f.pan.itempan.getItemsize() == "M") {
    	sizeint = 0;
    }
else if(Main.f.pan.itempan.getItemsize() == "Large") {
	sizeint = 1;
}
else if(Main.f.pan.itempan.getItemsize() == "XLarge") {
	sizeint = 2;
}
    selectOptionByIndex(select,sizeint);
  
   
     
    
       // DOMDocument document = Main.f.browser.getDocument();
        DOMElement link = document.findElement(By.name("commit"));
        if (link != null) {
            link.click();
     
        }
        try {
        	//temps avant passage en caisse
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Main.f.browser.loadURL("https://www.supremenewyork.com/checkout");

    	//autofill 
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	DOMDocument document2 = Main.f.browser.getDocument();
    	
    	DOMElement link2 =  document2.findElement(By.name("order[billing_name]"));
    	link2.setAttribute("value",Main.f.pan.shippan.getName());
    	 link2 =  document2.findElement(By.name("order[email]"));
    	link2.setAttribute("value",Main.f.pan.shippan.getEmai());
   	 link2 =  document2.findElement(By.name("order[tel]"));
   	link2.setAttribute("value",Main.f.pan.shippan.getTel());
 	 link2 =  document2.findElement(By.name("order[billing_address]"));
  	link2.setAttribute("value",Main.f.pan.shippan.getAdress());
	 link2 =  document2.findElement(By.name("order[billing_city]"));
	  	link2.setAttribute("value",Main.f.pan.shippan.getCity());
	 link2 =  document2.findElement(By.name("order[billing_zip]"));
	  	link2.setAttribute("value",Main.f.pan.shippan.getPostcode());

	  	DOMDocument document3 = Main.f.browser.getDocument();
	  	 
	    DOMSelectElement select2 = (DOMSelectElement) document3.findElement(By.name("order[billing_country]"));
		Main.f.coutryid	= new Select_Country();
		  	//System.out.println(Main.f.coutryid.getId());
		  	 selectOptionByIndex(select2,Main.f.coutryid.getId());
  
   
}
private static void selectOptionByIndex(DOMSelectElement select, int index) {
    List<DOMOptionElement> options = select.getOptions();
    options.get(index).setSelected(true);
}
}
