package communication;
import java.awt.*;
import java.awt.List;
import java.util.*;
import javax.swing.*;
import java.net.Socket;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
 * @author hzf
 *
 */
public class Communication 
{
	public static void main(String[] args)
	{
		CommunicationFrame frame = new CommunicationFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
