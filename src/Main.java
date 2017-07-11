import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import communication.CommunicationFrame;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("指挥系统");
		frame.setBounds(10, 10, 600, 440);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		//通信模块
		JMenu communicationMenu = new JMenu("通信");
		menuBar.add(communicationMenu);
		
		JMenuItem communicationItem = new JMenuItem("打开");
		communicationItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CommunicationFrame frame = new CommunicationFrame();
				frame.setVisible(true);
			}
		});
		communicationMenu.add(communicationItem);
		
		//新模块在这里添加
		
		
		ImageIcon background = new ImageIcon("back_1.jpg");
		JLabel label = new JLabel(background);  
        label.setBounds(0, 0, frame.getWidth(), frame.getHeight());  
        JPanel imagePanel = (JPanel) frame.getContentPane();  
        imagePanel.setOpaque(false);  
        frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
	}

}
