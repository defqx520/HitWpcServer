package communication;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class CommunicationFrame extends JFrame {
	public CommunicationFrame()
	{
	    setTitle("ͨ��");//��������
	    setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);//���ô�С
	    setResizable(false);
	    setLocationRelativeTo(null);
	    
	    CommunicationPanel mPanel = new CommunicationPanel();
	    add(mPanel);
	}
	public static final int DEFAULT_WIDTH = 500;
	public static final int DEFAULT_HEIGHT = 680;
}
