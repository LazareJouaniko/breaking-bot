package GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

import FUNCTION.Cop_Item;
import FUNCTION.Load_Delay;
import FUNCTION.Load_Item;
import FUNCTION.Load_Shipping;
import FUNCTION.Select_Country;
/*import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.NativeInterfaceAppletHandler;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
//import chrriis.dj.nativeswing.swtimpl.components.core.NativeWebBrowser;*/


public class Frame extends JFrame implements ActionListener{
	public static Select_Country coutryid ;
public static Panel_Interface pan ;
//public static JWebBrowser netpan ;
public static Browser browser = new Browser();
public static BrowserView nav = new BrowserView(browser);
	ImageIcon ico = new ImageIcon(this.getClass().getResource("/res/ico.png/"));
public Frame() {
//NativeInterface.initialize();;


	
	//déclaration panel
	Panel_Interface pan = new Panel_Interface();
	 //JWebBrowser netpan = new JWebBrowser();
	 //NativeInterfaceAppletHandler.start(this);
	// NativeInterface.open();
	
//	 netpan.setBarsVisible(false);
//	netpan.navigate("http://www.supremenewyork.com/shop/all");
	//JPanel netpan = new JPanel();
	//pann.setVisible(true);
	//netpan.add(pann);
	//netpan.setVisible(true);

	//ajout layout
	this.setLayout(new BorderLayout());
	//ajout panels
	this.add(pan,BorderLayout.WEST);
	this.add(nav);
	browser.loadURL("http://www.supremenewyork.com/shop/all");
	//this.add(netpan);
	//définition de la fenetre
	
	this.setTitle("BreakingBot");
	this.setSize(1300,700);
	this.setIconImage(ico.getImage());
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.addWindowListener(new WindowAdapter(){
    	 public void windowClosing(WindowEvent e){
    		 System.out.println("Aurevoir");
    			Calendar cal = Calendar.getInstance();

    	 }
    });
    
	this.setVisible(true);
	 pan.Cop.addActionListener(this);
	 Load_Delay ld = new Load_Delay();
	 Load_Item ldi = new Load_Item();
	 Load_Shipping lds = new Load_Shipping();
}
@Override
public void actionPerformed(ActionEvent arg0) {
	if(arg0.getSource() == pan.Cop){
		System.out.println("ok");
		Cop_Item cop = new Cop_Item();
	}
	
	
}
}
