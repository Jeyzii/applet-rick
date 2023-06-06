import java.awt.*;
import javax.swing.*;

public class Pixel extends JApplet{
	public void paint(Graphics p){
		super.paint(p);
		
		//hair
		p.setColor(new Color(185, 239, 235)); 
		p.fillRect(0,0,1000,1000);
		
		

		//skin
		p.setColor(new Color(221, 207, 182 )); 
		p.fillRect(260,180,130,10);
		p.fillRect(240,190,170,10);
		p.fillRect(230,200,190,20);
		p.fillRect(220,220,200,20);
		p.fillRect(210,240,220,230);
		p.fillRect(220,470,200,30);	
		p.fillRect(230,500,180,10);
		p.fillRect(240,510,170,10);
		p.fillRect(250,520,140,10);
		p.fillRect(260,530,100,10);
		
		
		//brows color
		p.setColor(new Color(185, 239, 235)); 
		p.fillRect(230,250,30,10);	p.fillRect(380,250,30,10);
		p.fillRect(240,260,150,10);	
		p.fillRect(280,270,80,10);
		
		//white
		p.setColor(new Color(255, 255, 255));
		//LEFT
		p.fillRect(230,330,70,30);
		p.fillRect(340,330,70,30);
		//RIGHT
		p.fillRect(240,360,50,10);	
		p.fillRect(350,360,50,10);
		
			
		//green
		p.setColor(new Color(160, 244, 146)); 
		p.fillRect(310,470,40,10);
		p.fillRect(320,480,30,10);
		p.fillRect(320,490,20,10);
		p.fillRect(330,500,10,10);		
			
		//right,down
		p.setColor(Color.BLACK);		
		//top side hair
		p.fillRect(230,10,10,80);
		p.fillRect(220,90,10,60);
		p.fillRect(240,20,10,10);
		p.fillRect(250,30,10,10);
		p.fillRect(260,40,10,10);
		p.fillRect(270,50,10,20);
		p.fillRect(280,70,10,10);
		p.fillRect(290,80,10,10);
		p.fillRect(300,90,10,20);
		p.fillRect(310,110,10,10);
		p.fillRect(320,120,10,10);
		p.fillRect(330,130,10,10);
		p.fillRect(340,120,10,10);
		p.fillRect(350,110,10,10);
		p.fillRect(360,100,10,10);
		p.fillRect(370,90,10,10);
		p.fillRect(380,80,10,10);
		p.fillRect(390,70,10,10);
		p.fillRect(400,60,10,10);
		p.fillRect(410,50,10,10);
		p.fillRect(420,40,10,90);
		p.fillRect(430,130,10,40);
		p.fillRect(430,170,20,10);
		
		//right side hair
		p.fillRect(450,160,20,10);
		p.fillRect(470,150,20,10);
		p.fillRect(490,140,20,10);
		p.fillRect(510,130,30,10);
		p.fillRect(530,140,10,40);
		p.fillRect(520,180,10,30);
		p.fillRect(510,210,10,10);
		p.fillRect(500,220,10,20);
		p.fillRect(490,240,10,10);
		p.fillRect(480,250,80,10);
		p.fillRect(540,260,10,10);
		p.fillRect(530,270,10,10);
		p.fillRect(520,280,10,10);
		p.fillRect(500,290,20,10);
		p.fillRect(490,300,10,10);
		p.fillRect(480,310,10,10);
		p.fillRect(470,320,10,10);
		p.fillRect(480,330,10,10);
		p.fillRect(490,340,10,10);
		p.fillRect(500,350,10,10);
		p.fillRect(510,360,10,10);
		p.fillRect(490,370,40,10);
		p.fillRect(480,380,10,20);
		p.fillRect(490,400,10,20);
		p.fillRect(500,420,10,10);
		p.fillRect(470,430,50,10);
		p.fillRect(460,440,10,20);
		p.fillRect(470,460,10,20);
		p.fillRect(460,480,20,10);
		p.fillRect(440,470,20,10);
		p.fillRect(440,460,10,10);
		
		//right side face
		p.fillRect(370,180,20,10);
		p.fillRect(390,190,20,10);
		p.fillRect(410,200,10,20);
		p.fillRect(420,220,10,20);
		p.fillRect(430,240,10,230);
		p.fillRect(420,470,10,30);
		p.fillRect(410,500,10,10);
		p.fillRect(400,510,10,10);
		p.fillRect(380,520,20,10);
		p.fillRect(360,530,20,10);
		
		//brows
		p.fillRect(220,240,10,20);
		p.fillRect(220,260,30,10);
		p.fillRect(240,260,10,20);
		p.fillRect(250,270,30,10);
		p.fillRect(280,280,80,10);
		p.fillRect(360,270,40,10);
		p.fillRect(390,260,30,10);
		p.fillRect(410,240,10,30);
		p.fillRect(220,240,50,10);
		p.fillRect(260,250,30,10);
		p.fillRect(290,260,60,10);
		p.fillRect(350,250,30,10);
		p.fillRect(370,240,40,10);
		
		//left side hair
		p.fillRect(210,150,20,10);
		p.fillRect(160,140,50,10);
		p.fillRect(100,130,60,10);
		p.fillRect(100,130,10,20);
		p.fillRect(110,150,10,20);
		p.fillRect(120,170,10,20);
		p.fillRect(130,190,10,20);
		p.fillRect(140,210,10,10);
		p.fillRect(150,220,10,20);
		p.fillRect(160,240,10,10);
		p.fillRect(70,250,90,10);
		p.fillRect(80,260,10,10);
		p.fillRect(90,270,10,10);
		p.fillRect(100,280,10,10);
		p.fillRect(110,290,20,10);
		p.fillRect(130,300,10,10);
		p.fillRect(140,310,10,10);
		p.fillRect(150,320,10,10);
		p.fillRect(140,330,10,10);
		p.fillRect(130,340,10,10);
		p.fillRect(120,350,10,10);
		p.fillRect(110,360,10,10);
		p.fillRect(110,370,40,10);
		p.fillRect(150,380,10,20);
		p.fillRect(140,400,10,20);
		p.fillRect(130,420,10,10);
		p.fillRect(120,430,50,10);
		p.fillRect(170,440,10,20);
		p.fillRect(160,460,10,20);
		p.fillRect(160,480,20,10);
		p.fillRect(180,470,20,10);
		p.fillRect(190,460,20,10);
		
		//left side face
		p.fillRect(270,170,100,10);
		p.fillRect(250,180,20,10);
		p.fillRect(230,190,20,10);
		p.fillRect(220,200,10,20);
		p.fillRect(210,220,10,20);
		p.fillRect(200,240,10,230);
		p.fillRect(210,470,10,30);
		p.fillRect(220,500,10,10);
		p.fillRect(230,510,10,10);
		p.fillRect(240,520,20,10);
		p.fillRect(260,530,20,10);
		p.fillRect(280,540,80,10);
		
		//left eye
							p.fillRect(240,290,50,10);
		p.fillRect(230,300,10,10);		p.fillRect(290,300,10,10);
							p.fillRect(230,320,70,10);
							p.fillRect(260,330,10,10);	
	p.fillRect(220,310,10,50);				p.fillRect(300,310,10,50);
		p.fillRect(230,360,10,10);		p.fillRect(290,360,10,10);
							p.fillRect(240,370,50,10);
							
	
		//Right eye
							p.fillRect(350,290,50,10);
		p.fillRect(340,300,10,10);		p.fillRect(400,300,10,10);
							p.fillRect(340,320,70,10);
							p.fillRect(370,330,10,10);	
	p.fillRect(330,310,10,50);				p.fillRect(410,310,10,50);
		p.fillRect(340,360,10,10);		p.fillRect(400,360,10,10);
							p.fillRect(350,370,50,10);
							
		//left wrinkles
		p.fillRect(220,380,10,10);
		p.fillRect(230,390,50,10);
		
		//right wrinkles
		p.fillRect(410,380,10,10);
		p.fillRect(360,390,50,10);
		
		//nose
		p.fillRect(300,380,10,50);
		p.fillRect(310,430,20,10);
		p.fillRect(330,380,10,50);
		
		//mouth
		p.fillRect(240,440,10,10);												p.fillRect(390,440,10,10);
		p.fillRect(230,450,10,30);			p.fillRect(250,460,140,10);			p.fillRect(400,450,10,30);
		p.fillRect(240,480,20,10);												p.fillRect(380,480,20,10);
		
		//GREEN PART
		p.fillRect(300,470,10,20);	
		p.fillRect(310,480,10,30);
		p.fillRect(320,500,10,20);	
		p.fillRect(330,510,10,10);
		p.fillRect(340,490,10,20);
		p.fillRect(350,470,10,30);
							
								

	}
	
}