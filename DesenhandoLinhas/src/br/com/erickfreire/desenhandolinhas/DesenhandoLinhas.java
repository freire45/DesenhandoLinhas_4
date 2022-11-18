package br.com.erickfreire.desenhandolinhas;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DesenhandoLinhas extends JPanel {
	
	public void paintComponent(Graphics g) {
		 int width = getWidth ();
		   int height = getHeight();
		   int contador = 1;
		   int c =0;
		      
		   while(c<250){ 
		   
		       g.drawLine(0,c,c,height);
		       g.drawLine(width,c,c,0);
		       g.drawLine(width-c,0,0,c);
		       g.drawLine(width,c,height - c,height);
		      c+=10; 

		   }
	}

}
