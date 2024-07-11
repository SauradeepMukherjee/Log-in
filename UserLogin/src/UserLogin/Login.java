package UserLogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import calculator.cali;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField textField;
	protected JLabel passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 0, 64));
		frame.setBounds(100, 100, 835, 526);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 56));
		lblNewLabel.setBounds(225, 68, 379, 75);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(99, 191, 165, 49);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(99, 291, 165, 49);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 31));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(128, 0, 128));
		textField.setBounds(274, 191, 418, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnExit.setBackground(new Color(128, 0, 128));
		btnExit.setBounds(612, 397, 153, 49);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField_1.setText(null);
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnReset.setBackground(new Color(128, 0, 128));
		btnReset.setBounds(360, 397, 153, 49);
		frame.getContentPane().add(btnReset);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String password = passwordField_1.getText();
				
				if(password.contentEquals("Saura") && username.contains("Mukherjee")) {
					textField.setText(null);
					passwordField_1.setText(null);
					cali.main(null);
				}
				else {
					JOptionPane.showMessageDialog(null,"INVALID LOGIN" , "ERROR" , JOptionPane.ERROR_MESSAGE);
					textField.setText(null);
					passwordField_1.setText(null);
				}
			}
		});
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnLogIn.setBackground(new Color(128, 0, 128));
		btnLogIn.setBounds(99, 397, 153, 49);
		frame.getContentPane().add(btnLogIn);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 31));
		passwordField_1.setForeground(new Color(255, 255, 255));
		passwordField_1.setBackground(new Color(128, 0, 128));
		passwordField_1.setBounds(274, 291, 418, 42);
		frame.getContentPane().add(passwordField_1);
	}
}
