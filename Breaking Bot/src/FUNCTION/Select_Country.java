package FUNCTION;

import GUI.Main;

public class Select_Country {
	private int id_number;
public Select_Country() {
	
	if(Main.f.pan.shippan.getCountry().equals ("UK")) {
		this.setId(0);
	}else if (Main.f.pan.shippan.getCountry().equals ("UK (N. IRELAND)")) {
		this.setId(1);
	}else if (Main.f.pan.shippan.getCountry().equals ("AUSTRIA")) {
		this.setId(3);
	}else if (Main.f.pan.shippan.getCountry().equals ("BELARUS")) {
		this.setId(4);
	}else if (Main.f.pan.shippan.getCountry().equals ("BELGIUM")) {
		this.setId(5);
	}else if (Main.f.pan.shippan.getCountry().equals ("BULGARIA")) {
		this.setId(6);
	}else if (Main.f.pan.shippan.getCountry().equals ("CROATIA")) {
		this.setId(7);
	}else if (Main.f.pan.shippan.getCountry().equals("CZECH REPUBLIC")) {
		this.setId(8);
	}else if (Main.f.pan.shippan.getCountry().equals("DENMARK")) {
		this.setId(9);
	}else if (Main.f.pan.shippan.getCountry().equals ("ESTONIA")) {
		this.setId(10);
	}else if (Main.f.pan.shippan.getCountry().equals("FINLAND")) {
		this.setId(11);
	}else if (Main.f.pan.shippan.getCountry().equals("FRANCE")) {
		this.setId(12);
	}else if (Main.f.pan.shippan.getCountry().equals ("GERMANY")) {
		this.setId(13);
	}else if (Main.f.pan.shippan.getCountry().equals ("GREECE")) {
		this.setId(14);
	}else if (Main.f.pan.shippan.getCountry().equals ("HUNGARY")) {
		this.setId(15);
	}else if (Main.f.pan.shippan.getCountry().equals ("ICELAND")) {
		this.setId(16);
	}else if (Main.f.pan.shippan.getCountry().equals ("IRELAND")) {
		this.setId(17);
	}else if (Main.f.pan.shippan.getCountry().equals ("ITALY")) {
		this.setId(18);
	}else if (Main.f.pan.shippan.getCountry().equals ("LATVIA")) {
		this.setId(19);
	}else if (Main.f.pan.shippan.getCountry().equals ("LITHUANIA")) {
		this.setId(20);
	}else if (Main.f.pan.shippan.getCountry().equals ("LUXEMBOURG")) {
		this.setId(21);
	}else if (Main.f.pan.shippan.getCountry().equals("MONACO")) {
		this.setId(22);
	}else if (Main.f.pan.shippan.getCountry().equals ("NETHERLANDS") ){
		this.setId(23);
	}else if (Main.f.pan.shippan.getCountry().equals("NORWAY")) {
		this.setId(24);
	}else if (Main.f.pan.shippan.getCountry().equals ("POLAND")) {
		this.setId(25);
	}else if (Main.f.pan.shippan.getCountry().equals("PORTUGAL")) {
		this.setId(26);
	}else if (Main.f.pan.shippan.getCountry().equals("ROMANIA")) {
		this.setId(27);
	}else if (Main.f.pan.shippan.getCountry().equals("RUSSIA")) {
		this.setId(28);
	}else if (Main.f.pan.shippan.getCountry().equals ("SLOVAKIA") ){
		this.setId(29);
	}else if (Main.f.pan.shippan.getCountry().equals ("SLOVENIA")) {
		this.setId(30);
	}else if (Main.f.pan.shippan.getCountry().equals ("SPAIN")) {
		this.setId(31);
	}else if (Main.f.pan.shippan.getCountry().equals ("SWEDEN") ){
		this.setId(32);
	}else if (Main.f.pan.shippan.getCountry().equals ("SWITZERLAND")) {
		this.setId(33);
	}else if (Main.f.pan.shippan.getCountry().equals ("TURKEY")) {
		this.setId(34);}
	
	
	} public int getId () {
	return this.id_number;
	
}public void setId (int id_number) {
	this.id_number = id_number;
}
}
