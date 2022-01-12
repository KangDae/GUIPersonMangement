package org.comstudy21.ex06;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Toolkit;


public abstract class MyJFrame extends JFrame{
	
		   protected Container contentPan = null;
		   
		   public MyJFrame() {
		      this("My JFrame",400,300);
		      
		   }
		   public MyJFrame(String title, int w, int h)  {
		      setDefaultCloseOperation(EXIT_ON_CLOSE);
		      setTitle(title);
		      setSize(w, h);
		      
		      settingCenter(w,h);
		      displayLayer();
		      actionEvent();
		   }
		   
		   protected void settingCenter(int w, int h) {
		      Toolkit tk = this.getToolkit().getDefaultToolkit();
		      int scrW = ( int ) tk.getScreenSize().getWidth();
		      int scrH = ( int ) tk.getScreenSize().getHeight();
		      int x = scrW/2 - w/2;
		      int y = scrH/2 - h/2;
		      this.setLocation(x, y);
		   }
		   protected abstract void displayLayer();
		   protected abstract void actionEvent();
		

}
