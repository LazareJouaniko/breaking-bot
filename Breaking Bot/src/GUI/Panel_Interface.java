package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

//import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

public class Panel_Interface extends JPanel{
	//Déclaration des objets graphique
public static	Panel_Shipping shippan = new Panel_Shipping();
public static	Panel_Item itempan = new Panel_Item();
public static	Panel_Delay delaypan = new Panel_Delay();

//public static JWebBrowser webBrowser = new JWebBrowser();
public static         JButton Cop = new JButton("Cop Item");

public Panel_Interface() {

	//déclaration couleur
	 Cop.setBackground(Color.white);
	 Cop.setPreferredSize(new Dimension(140,35));
	  this.setBackground(Color.WHITE);
	  //ajout layout
	this.setLayout(new GridBagLayout());
	GridBagConstraints gc = new GridBagConstraints();
	gc.gridx = 0;
	gc.gridy = 0;
	gc.gridheight = 2;
	gc.gridwidth = 1;
	gc.insets = new Insets(10,10,10,10);
	//ajout composants
	this.add(shippan, gc);
	gc.gridx = 1;
	gc.gridheight = 1;
	this.add(delaypan, gc);
	gc.gridy = 1;
	gc.insets = new Insets(97,0,0,0);
	this.add(itempan, gc);
	gc.insets = new Insets(0,0,0,0);
	gc.gridx = 0;
	gc.gridwidth = 2;
	gc.gridy = 2;
	this.add(Cop,gc);
	
}
}
