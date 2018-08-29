package GUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import FUNCTION.Save_Shipping;

public class Panel_Shipping extends JPanel implements ActionListener{
	//Déclaration des élément graphiques
	JLabel info = new JLabel("SHIPPING :");
	JButton save = new JButton("Save Info");
	JTextField name = new JTextField("Name");
	JTextField email = new JTextField("Email");
	JTextField tel = new JTextField("Tel");
	JTextField adress = new JTextField("Adress");
	JTextField city = new JTextField("City");
	JTextField postcode = new JTextField("Postcode");
	JTextField country = new JTextField("Country");
	String[] paiementlist = {"Visa","American Express","Mastercard","Solo","Paypal"};
	JComboBox paiement = new JComboBox(paiementlist);	
	JTextField cardnumber = new JTextField("Number");
	JTextField cardmonth = new JTextField("month");
	JTextField cardyear = new JTextField("years");
	JTextField cvv = new JTextField("cvv");
	
public Panel_Shipping() {
	//définition des couleurs
	save.setBackground(Color.white);
	paiement.setBackground(Color.white);
	  this.setBackground(Color.WHITE);
	//ajout du layout
this.setLayout(new GridBagLayout());
    //ajout de la contrainte
GridBagConstraints gc = new GridBagConstraints();
gc.gridx = 0;
gc.gridy = 0;
gc.gridheight = 1;
gc.gridwidth = 2;
   //variable des tailles
Dimension taillemonthyears = new Dimension (70,35);
Dimension taillemonthyearsmin = new Dimension (45,30);
Dimension taillepref = new Dimension (140,35);
Dimension taillemin = new Dimension (90,28);
  //ajout taille préféré
name.setPreferredSize(taillepref);
email.setPreferredSize(taillepref);
tel.setPreferredSize(taillepref);
adress.setPreferredSize(taillepref);
city.setPreferredSize(taillepref);
postcode.setPreferredSize(taillepref);
country.setPreferredSize(taillepref);
paiement.setPreferredSize(taillepref);
cardnumber.setPreferredSize(taillepref);
cardmonth.setPreferredSize(taillemonthyears);
cardyear.setPreferredSize(taillemonthyears);
cvv.setPreferredSize(taillepref);
save.setPreferredSize(taillepref);
  //ajout taille minimum
name.setMinimumSize(taillemin);
email.setMinimumSize(taillemin);
tel.setMinimumSize(taillemin);
adress.setMinimumSize(taillemin);
city.setMinimumSize(taillemin);
postcode.setMinimumSize(taillemin);
country.setMinimumSize(taillemin);
paiement.setMinimumSize(taillemin);
cardnumber.setMinimumSize(taillemin);
cardmonth.setMinimumSize(taillemonthyearsmin);
cardyear.setMinimumSize(taillemonthyearsmin);
cvv.setMinimumSize(taillemin);
save.setMinimumSize(taillemin);
   //ajout des compoants
this.add(info, gc);
gc.gridy = 1;
this.add(name, gc);
gc.gridy = 2;
this.add(email, gc);
gc.gridy = 3;
this.add(tel, gc);
gc.gridy = 4;
this.add(adress, gc);
gc.gridy = 5;
this.add(city, gc);
gc.gridy = 6;
this.add(postcode, gc);
gc.gridy = 7;
this.add(country, gc);
gc.gridy = 8;
this.add(paiement, gc);
gc.gridy = 9;
this.add(cardnumber, gc);
gc.gridy = 10;
gc.gridwidth = 1;
this.add(cardmonth, gc);
gc.gridx = 1;
this.add(cardyear, gc);
gc.gridwidth = 2;
gc.gridx = 0;
gc.gridy = 11;
this.add(cvv, gc);
gc.gridy = 12;
this.add(save, gc);
  //ajout des listener
paiement.addActionListener(this);
save.addActionListener(this);
}public String getName() {
	return name.getText();
}public String getEmai() {
	return email.getText();
}public String getTel() {
	return tel.getText();
}public String getAdress() {
	return adress.getText();
}public String getCity() {
	return city.getText();
}public String getPostcode() {
	return postcode.getText();
}public String getCountry() {
	return country.getText();
}public String getPaiement() {
	return  paiement.getSelectedItem().toString();
}public String getCardnumber() {
	return cardnumber.getText();
}public String getCardmonth() {
	return cardmonth.getText();
}public String getCardyear() {
	return cardyear.getText();
}public String getCvv() {
	return cvv.getText();
}public void setName(String n) {
	name.setText(n);
}public void setEmail(String n) {
	email.setText(n);
}
public void setTel(String n) {
	tel.setText(n);
}
public void setAdress(String a) {
	adress.setText(a);
}
public void setCity(String c) {
	city.setText(c);
}
public void setPostcode(String p) {
	postcode.setText(p);
}
public void setCountry(String c) {
	country.setText(c);
}public void setPaiement(String p) {
	paiement.setSelectedItem(p);
}
public void setCardnumber(String c) {
	cardnumber.setText(c);
}
public void setCardmonth(String c) {
	cardmonth.setText(c);
}
public void setCardyear(String c) {
	cardyear.setText(c);
}public void setCvv(String c) {
	cvv.setText(c);
}





@Override
public void actionPerformed(ActionEvent e) {
	//Grisé le paiement carte quand paypal est selectionné 
	if (paiement.getSelectedIndex() == 4) {
		cardmonth.setEnabled(false);
		cardyear.setEnabled(false);
		cardnumber.setEnabled(false);
		cvv.setEnabled(false);
	}else if(paiement.getSelectedIndex() != 4) {
		cardmonth.setEnabled(true);
		cardyear.setEnabled(true);
		cardnumber.setEnabled(true);
		cvv.setEnabled(true);
	}
	//Action click boutton save
	if (e.getSource() == save) {
	System.out.println("save info préssé");
	Save_Shipping saveship = new Save_Shipping();
	}
  
	
}
}
