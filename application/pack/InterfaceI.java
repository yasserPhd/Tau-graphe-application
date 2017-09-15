package pack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class InterfaceI {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=113,24
	 */
	private final JLabel lblIChangedThis = DefaultComponentFactory.getInstance().createTitle("I changed this title");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceI window = new InterfaceI();
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
	public InterfaceI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null); 
		
		JLabel yasser = new JLabel("this is just a test");
		yasser.setBounds(118, 36, 97, 16);
		frame.add(yasser);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(235, 5, 4, 15);
		frame.getContentPane().add(textArea);
		
		JButton btnOk = new JButton("     Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnOk.setBounds(59, 117, 97, 25);
		frame.getContentPane().add(btnOk);
		
		JTextArea txtrThisIsJust = new JTextArea();
		txtrThisIsJust.setText("this is just an area to fill");
		txtrThisIsJust.setBounds(36, 72, 203, 15);
		frame.getContentPane().add(txtrThisIsJust);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(176, 203, 13, -180);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(56, 191, 159, 25);
		frame.getContentPane().add(separator_1);
		
		JSlider slider = new JSlider();
		slider.setBounds(36, 190, 200, 26);
		frame.getContentPane().add(slider);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(430, 229, 2, -209);
		frame.getContentPane().add(scrollPane);
	}
}
