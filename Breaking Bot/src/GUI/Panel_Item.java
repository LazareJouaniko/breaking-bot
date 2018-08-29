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

import FUNCTION.Save_Item;

public class Panel_Item extends JPanel implements ActionListener{
	//déclaration objet graphique
	JLabel info = new JLabel("ITEM :");
	JTextField itemname = new JTextField("Item Name");
	String size [] = {"Small","Medium","Large","XLarge"};
	String[] categorie = {"jackets","t-shirts","shirts","tops_sweaters","sweatshirts","pants","shorts","bags","hats","accessories","skate"};
	JComboBox itemsize = new JComboBox(size);
	JComboBox itemcategorie = new JComboBox(categorie);
	JTextField itemcolor = new JTextField("Color");
	JButton save = new JButton("Save Item");
 public Panel_Item() {
	 //définition de couleurs
	  this.setBackground(Color.WHITE);
	  itemcategorie.setBackground(Color.white);
	  itemsize.setBackground(Color.white);
	  save.setBackground(Color.white);
	 //déclaration du layout
	 this.setLayout(new GridBagLayout());
	 GridBagConstraints gc = new GridBagConstraints();
	 gc.gridheight =1;
	 gc.gridwidth = 1;
	 gc.gridx = 0;
	 gc.gridy = 0;
	 //déclaration dimension 
	 Dimension taillepref = new Dimension(140,35);
	 Dimension taillemin = new Dimension(90,25);
	 //déclaration taille pref
	 itemname.setPreferredSize(taillepref);
	 itemcategorie.setPreferredSize(taillepref);
	 itemsize.setPreferredSize(taillepref);
	 itemcolor.setPreferredSize(taillepref);
	 save.setPreferredSize(taillepref);
	 //déclaration taille minimum
	 itemname.setMinimumSize(taillemin);
	 itemcategorie.setMinimumSize(taillemin);
	 itemsize.setMinimumSize(taillemin);
	 itemcolor.setMinimumSize(taillemin);
	 save.setMinimumSize(taillemin);
	 this.add(info, gc);
	 gc.gridy = 1;
	 this.add(itemcategorie,gc);
	 gc.gridy = 2;
	 this.add(itemname, gc);
	 gc.gridy = 3;
	 this.add(itemcolor, gc);
	 gc.gridy = 4;
	 this.add(itemsize, gc);
	 gc.gridy = 5;
	 this.add(save, gc);
	 save.addActionListener(this);
     
 } public String getItemname() {
	 return itemname.getText();
 }public String getItemcategorie() {
	 return itemcategorie.getSelectedItem().toString();
 }public String getItemsize() {
	 return itemsize.getSelectedItem().toString();
 }public String getItemcolor() {
	 return itemcolor.getText();

 }public void setItemname(String i) {
	 this.itemname.setText(i);
 }public void setItemcategorie(String i) {
	 this.itemcategorie.setSelectedItem(i);
 }public void setItemsize(String i) {
	 this.itemsize.setSelectedItem(i);
 }public void setItemcolor(String i) {
	 this.itemcolor.setText(i);
 }
@Override
//action boutton préssé
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == save) {
		System.out.println("save item préssé ! ");
		Save_Item saveitem = new Save_Item();
	}
	
}
}
