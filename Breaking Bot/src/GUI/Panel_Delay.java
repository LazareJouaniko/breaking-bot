package GUI;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import FUNCTION.Load_Delay;
import FUNCTION.Save_Delay;

public class Panel_Delay extends JPanel implements ActionListener, ItemListener{
	//déclaration object graphique
	JLabel info = new JLabel("DELAY :");
	JTextField delay = new JTextField("delay in ms");
	JTextField Autorunhour = new JTextField("hour");
	JTextField Autorunmin = new JTextField("min");
	JTextField Autorunsec = new JTextField("sec");
	Checkbox check = new Checkbox("Autorun ?");
	JButton save = new JButton ("Save run info");
  public Panel_Delay() {
	  save.setBackground(Color.white);
	  this.setBackground(Color.WHITE);
	  //déclaration du layout
	  this.setLayout(new GridBagLayout());
	  GridBagConstraints gc = new GridBagConstraints();
	  gc.gridheight = 1;
	  gc.gridwidth = 3;
	  gc.gridx = 0;
	  gc.gridy = 0;
	  //déclaration variable dimension
	  Dimension taillepref = new Dimension(120,30);
	  Dimension tailleprefauto = new Dimension(40,30);
	  Dimension taillemin = new Dimension (90,20);
	  Dimension tailleminauto = new Dimension (30,20);
	  //ajout taille préféré
	  delay.setPreferredSize(taillepref);
	  Autorunhour.setPreferredSize(tailleprefauto);
	  Autorunmin.setPreferredSize(tailleprefauto);
	  Autorunsec.setPreferredSize(tailleprefauto);
	  save.setPreferredSize(taillepref);
	  //ajout taille min
	  delay.setMinimumSize(taillemin);
	  save.setMinimumSize(taillemin);
	  Autorunhour.setMinimumSize(tailleminauto);
	  Autorunmin.setMinimumSize(tailleminauto);
	  Autorunsec.setMinimumSize(tailleminauto);
	  //Ajout composant 
	  this.add(info, gc);
	  gc.gridy = 1;
	  this.add(delay,gc);
	  gc.gridy = 2;
	  gc.gridwidth = 1;
	  this.add(Autorunhour, gc);
	  gc.gridx = 1;
	  this.add(Autorunmin, gc);
	  gc.gridx = 2;
	  this.add(Autorunsec, gc);
	  gc.gridwidth = 3;
	  gc.gridx = 0;
	  gc.gridy = 3;
	  this.add(check, gc);
	  gc.gridy = 4;
	  this.add(save, gc);
			 
	  save.addActionListener(this);
	  check.addItemListener(this);
}public String getDelay(){
	  return delay.getText();
}public String getHour(){
	  return Autorunhour.getText();
}public String getMin(){
	  return Autorunmin.getText();
}public String getSec(){
	  return Autorunsec.getText();
}  public Boolean getCheck(){
	  return check.getState();
} public void setHour(String h) {
	this.Autorunhour.setText(h);
} public void setMin(String m) {
	this.Autorunmin.setText(m);
} public void setSec(String s) {
	this.Autorunsec.setText(s);
} public void setCheck(String c) {
	if(c.equals("true") ) {
		this.check.setState(true);
	}else
	this.check.setState(false);
	
} public void setDelay(String d) {
	this.delay.setText(d);
}

@Override
//action boutton préssé
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == save) {
		System.out.println("save autorun préssé");
        Save_Delay savedel = new Save_Delay();
		
	}
	
}
@Override
//action case coché
public void itemStateChanged(ItemEvent e0) {
if(e0.getSource() == check )  {
	if (check.getState() == true) {
		System.out.println("coché  !");
		this.Autorunhour.setEnabled(true);
		this.Autorunmin.setEnabled(true);
		this.Autorunsec.setEnabled(true);
	}else if ( check.getState() == false) {
		this.Autorunhour.setEnabled(false);
		this.Autorunmin.setEnabled(false);
		this.Autorunsec.setEnabled(false);
		System.out.println("non coché");
	}
}
	
}
}
