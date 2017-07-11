package communication;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class CommunicationFrame extends JFrame {
	public CommunicationFrame()
	{
	    setTitle("通信");//设置名称
	    setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);//设置大小
	    setResizable(false);
	    setLocationRelativeTo(null);
	    
	    CommunicationPanel mPanel = new CommunicationPanel();
	    add(mPanel);
	}
	public static final int DEFAULT_WIDTH = 500;
	public static final int DEFAULT_HEIGHT = 680;
}
