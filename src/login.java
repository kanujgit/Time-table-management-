import java.awt.Even
tQueue;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

public class login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection conn = null;
	private JTextField textField;
	private JPasswordField passwordField;
	/**
	 * Create the application.
	 */
	public login() {
		initialize();
		conn = sqlite_connection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 568, 398);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(46, 108, 86, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(46, 160, 104, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(182, 107, 109, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("AUTHENTICATE");
		Image img3 = new ImageIcon(this.getClass().getResource("/2.jpg")).getImage();
		btnNewButton.setIcon(new ImageIcon(img3));;
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String query = "select * from login where username=? and password=? ";
					PreparedStatement pst = conn.prepareStatement(query);
					pst.setString(1, textField.getText());
					pst.setString(2, passwordField.getText());
					ResultSet rs = pst.executeQuery();
					int count=0;
					while(rs.next())
					{
						count=count+1;
					}
						if(count==1)
						{
							JOptionPane.showMessageDialog(null,"Username and Password is correct");
							frame.dispose();
							next nxt = new next();
							nxt.setVisible(true);
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Username and Password is incorrect");
						}
						rs.close();
						pst.close();
					
				}
				catch(Exception e)
				{	
					JOptionPane.showMessageDialog(null,e);
					
					
				}
			}
		});
		
		
		btnNewButton.setBounds(90, 225, 177, 38);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(182, 159, 109, 32);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/1.gif")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));;
		lblNewLabel_2.setBounds(352, 108, 167, 168);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/admin_login.gif")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img1));;
		lblNewLabel_3.setBounds(149, 20, 277, 76);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
