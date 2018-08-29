package FUNCTION;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import GUI.Main;

public class Load_Shipping {
	File name,email,tel,adress,city,postcode,country,paiement,cardnumber,cardmonth,cardyear,cvv ;
	FileReader namefread,emailfread,telfread,adressfread,cityfread,postcodefread,countryfread,paiementfread,cardnumberfread,cardmonthfread,cardyearfread,cvvfread;
	BufferedReader namebread,emailbread,telbread,adressbread,citybread,postcodebread,countrybread,paiementbread,cardnumberbread,cardmonthbread,cardyearbread,cvvbread;
	public Load_Shipping(){
		try
		{
			name = new File ("name.txt");
			email = new File ("email.txt");
			tel = new File ("tel.txt");
			adress = new File ("adress.txt");
			city = new File ("city.txt");
			postcode = new File ("postcode.txt");
			country = new File ("country.txt");
			paiement = new File ("paiement.txt");
			cardnumber = new File ("cardnumber.txt");
			cardmonth = new File ("cardmonth.txt");
			cardyear = new File ("cardyear.txt");
			cvv = new File ("cvv.txt");
			
			cvvfread = new FileReader (cvv);
			cvvbread = new BufferedReader (cvvfread);
			cardyearfread = new FileReader (cardyear);
			cardyearbread = new BufferedReader (cardyearfread);
			cardmonthfread = new FileReader (cardmonth);
			cardmonthbread = new BufferedReader (cardmonthfread);
			cardnumberfread = new FileReader (cardnumber);
			cardnumberbread = new BufferedReader (cardnumberfread);
			paiementfread = new FileReader (paiement);
			paiementbread = new BufferedReader (paiementfread);
			countryfread = new FileReader (country);
			countrybread = new BufferedReader (countryfread);
			postcodefread = new FileReader (postcode);
			postcodebread = new BufferedReader (postcodefread);
			adressfread = new FileReader (adress);
			adressbread = new BufferedReader (adressfread);
			cityfread = new FileReader (city);
			citybread = new BufferedReader (cityfread);
			telfread = new FileReader (tel);
			telbread = new BufferedReader (telfread);
			namefread = new FileReader (name);
			namebread = new BufferedReader (namefread);
			emailfread = new FileReader (email);
			emailbread = new BufferedReader (emailfread);
			
			 try {String autoname = namebread.readLine(); while (autoname != null){
			        Main.f.pan.shippan.setName(autoname); autoname = namebread.readLine(); }
			       namebread.close(); namefread.close();
			        }catch (IOException exception){}}catch (FileNotFoundException exception){}
		 try {String autoemail = emailbread.readLine(); while (autoemail != null){
		        Main.f.pan.shippan.setEmail(autoemail); autoemail = emailbread.readLine(); }
		      emailbread.close(); emailfread.close();
		        }catch (IOException exception){}
		 try {String autotel = telbread.readLine(); while (autotel != null){
		        Main.f.pan.shippan.setTel(autotel); autotel = telbread.readLine(); }
		    telbread.close();telfread.close();
		        }catch (IOException exception){}
		 try {String autoadress = adressbread.readLine(); while (autoadress != null){
		        Main.f.pan.shippan.setAdress(autoadress); autoadress = adressbread.readLine(); }
		    adressbread.close();adressfread.close();
		        }catch (IOException exception){}
		 try {String autocity = citybread.readLine(); while (autocity != null){
		        Main.f.pan.shippan.setCity(autocity); autocity = citybread.readLine(); }
		   citybread.close();cityfread.close();
		        }catch (IOException exception){}
		 try {String autopostcode = postcodebread.readLine(); while (autopostcode != null){
		        Main.f.pan.shippan.setPostcode(autopostcode); autopostcode =postcodebread.readLine(); }
		 postcodebread.close();postcodefread.close();
		        }catch (IOException exception){}
		 try {String autocountry = countrybread.readLine(); while (autocountry != null){
		        Main.f.pan.shippan.setCountry(autocountry); autocountry = countrybread.readLine(); }
		   countrybread.close();countryfread.close();
		        }catch (IOException exception){}
	 try {String autopaiement = paiementbread.readLine(); while (autopaiement != null){
	        Main.f.pan.shippan.setPaiement(autopaiement); autopaiement = paiementbread.readLine(); }
	    paiementbread.close();paiementfread.close();
	        }catch (IOException exception){}
	 try {String autocardnumber = cardnumberbread.readLine(); while (autocardnumber != null){
	        Main.f.pan.shippan.setCardnumber(autocardnumber); autocardnumber = cardnumberbread.readLine(); }
	  cardnumberbread.close();cardnumberfread.close();
	        }catch (IOException exception){}
	 try {String autocardmonth =cardmonthbread.readLine(); while (autocardmonth != null){
	        Main.f.pan.shippan.setCardmonth(autocardmonth); autocardmonth =cardmonthbread.readLine(); }
	    cardmonthbread.close();cardmonthfread.close();
	        }catch (IOException exception){}
	 try {String autocardyear = cardyearbread.readLine(); while (autocardyear != null){
	        Main.f.pan.shippan.setCardyear(autocardyear); autocardyear =cardyearbread.readLine(); }
	   cardyearbread.close();cardyearfread.close();
	        }catch (IOException exception){}
	 try {String autocvv =cvvbread.readLine(); while (autocvv != null){
	        Main.f.pan.shippan.setCvv(autocvv); autocvv = cvvbread.readLine(); }
	   cvvbread.close();cvvfread.close();
	        }catch (IOException exception){}
}
}
