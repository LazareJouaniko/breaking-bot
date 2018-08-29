package FUNCTION;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import GUI.Main;

public class Save_Shipping {
	//déclaration objet
	 FileWriter name;
	 FileWriter email;
	 FileWriter tel;
	 FileWriter adress;
	 FileWriter city;
	 FileWriter postcode;
	 FileWriter country;
	 FileWriter paiement;
	 FileWriter cardnumber;
	 FileWriter cardmonth;
	 FileWriter cardyear;
	 FileWriter cvv;
	 BufferedWriter out1;
	 BufferedWriter out2;
	 BufferedWriter out3;
	 BufferedWriter out4;
	 BufferedWriter out5;
	 BufferedWriter out6;
	 BufferedWriter out7;
	 BufferedWriter out8;
	 BufferedWriter out9;
	 BufferedWriter out10;
	 BufferedWriter out11;
	 BufferedWriter out12;
public Save_Shipping() {
	try {
		//déclaration contenu text dans variabke
	String names =  Main.f.pan.shippan.getName();
	String emails =  Main.f.pan.shippan.getEmai();
	String tels =  Main.f.pan.shippan.getTel();
	String adresss =  Main.f.pan.shippan.getAdress();
	String citys =  Main.f.pan.shippan.getCity();
	String postcodes =  Main.f.pan.shippan.getPostcode();
	String countrys =  Main.f.pan.shippan.getCountry();
	String paiements =  Main.f.pan.shippan.getPaiement();
	String cardnumbers =  Main.f.pan.shippan.getCardnumber();
	String cardmonths =  Main.f.pan.shippan.getCardmonth();
	String cardyears =  Main.f.pan.shippan.getCardyear();
	String cvvs =  Main.f.pan.shippan.getCvv();
	
	 // Create file
    name = new FileWriter("name.txt");
    out1 = new BufferedWriter(name);
    out1.write(names);
	
    email = new FileWriter("email.txt");
    out2 = new BufferedWriter(email);
    out2.write(emails);

    tel = new FileWriter("tel.txt");
	out3 = new BufferedWriter(tel);
    out3.write(tels);
	
    adress = new FileWriter("adress.txt");
    out4 = new BufferedWriter(adress);
    out4.write(adresss);
    
    city = new FileWriter("city.txt");
    out5 = new BufferedWriter(city);
    out5.write(citys);
	
    postcode = new FileWriter("postcode.txt");
    out6 = new BufferedWriter(postcode);
    out6.write(postcodes);

    country = new FileWriter("country.txt");
	out7 = new BufferedWriter(country);
    out7.write(countrys);
	
    paiement = new FileWriter("paiement.txt");
    out8 = new BufferedWriter(paiement);
    out8.write(paiements);
    
    cardnumber = new FileWriter("cardnumber.txt");
    out9 = new BufferedWriter(cardnumber);
    out9.write(cardnumbers);
	
    cardmonth = new FileWriter("cardmonth.txt");
    out10 = new BufferedWriter(cardmonth);
    out10.write(cardmonths);

    cardyear = new FileWriter("cardyear.txt");
	out11 = new BufferedWriter(cardyear);
    out11.write(cardyears);
	
    cvv = new FileWriter("cvv.txt");
    out12 = new BufferedWriter(cvv);
    out12.write(cvvs);
    
    //fermeture des écritures
    
    out1.close();
    out2.close();
    out3.close();
    out4.close();
    out5.close();
    out6.close();
    out7.close();
    out8.close();
    out9.close();
    out10.close();
    out11.close();
    out12.close();

	}catch(IOException e) {
		e.printStackTrace();
	}
	
}
}
