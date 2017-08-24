import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class ScattergoriesDice extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private int clicked;
	private JTextField txtClicks;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScattergoriesDice frame = new ScattergoriesDice();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ScattergoriesDice() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String alphabet = "ABCDEFGHIJKLMNOPRSTW";
				String dice = "";
				Random rnd = new Random();
				int randomLen = 1+rnd.nextInt(1);
				for(int i = 0; i < randomLen;i++){
					char c = alphabet.charAt(rnd.nextInt(20));
					dice+=c;
				}
				if(textField.getForeground() != contentPane.getBackground()){
					textField.setForeground(Color.white);
					txtClicks.setForeground(Color.white);
					textField.setText(dice);
					contentPane.setBackground(new Color((int)Math.random()*256, (int)(Math.random()*256), (int)(Math.random()*256)));
					textField.setBackground(contentPane.getBackground());
					txtClicks.setBackground(contentPane.getBackground());
				}
				clicked++; 
				if(clicked > 0){
					txtClicks.setText("Clicked: " + clicked);
				}
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setText("?");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String alphabet = "ABCDEFGHIJKLMNOPRSTW";
				String dice = "";
				Random rnd = new Random();
				int randomLen = 1+rnd.nextInt(1);
				for(int i = 0; i < randomLen;i++){
					char c = alphabet.charAt(rnd.nextInt(20));
					dice+=c;
				}
				if(textField.getForeground() != contentPane.getBackground()){
					textField.setForeground(Color.white);
					txtClicks.setForeground(Color.white);
					textField.setText(dice);
					contentPane.setBackground(new Color((int)Math.random()*256, (int)(Math.random()*256), (int)(Math.random()*256)));
					textField.setBackground(contentPane.getBackground());
					txtClicks.setBackground(contentPane.getBackground());
				}
				clicked++; 
				if(clicked > 0){
					txtClicks.setText("Clicked: " + clicked);
				}
			}
		});
		textField.setEditable(false);
		textField.setFont(new Font("Calibri", Font.PLAIN, 90));
		textField.setBounds(171, 73, 88, 117);
		textField.setBorder(null);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtClicks = new JTextField();
		txtClicks.setHorizontalAlignment(SwingConstants.CENTER);
		txtClicks.setEditable(false);
		txtClicks.setFont(new Font("Calibri", Font.BOLD, 14));
		txtClicks.setText("Clicks: " + clicked);
		txtClicks.setBounds(272, 217, 124, 32);
		txtClicks.setBorder(null);
		contentPane.add(txtClicks);
		txtClicks.setColumns(10);
	}
}
