import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class delete_classes extends JFrame {

	private JPanel contentPane;
	private JTextField textfield;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					delete_classes frame = new delete_classes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection conn = null;
	private JTextField textField;
	/**
	 * Create the frame.
	 */
	public delete_classes() {
		conn = sqlite_connection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 334, 238);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(!(Character.isAlphabetic(c) ||(c==KeyEvent.VK_BACK_SPACE) ||(c==KeyEvent.VK_DELETE)))
				{
				arg0.consume();
					}

			}
		});
		textField.setBounds(159, 69, 137, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Class Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(34, 75, 86, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				

			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query = "delete from classes where class_name = '"+textField.getText()+"'";
					PreparedStatement pst = conn.prepareStatement(query);
					
					pst.execute();
					JOptionPane.showMessageDialog(null,"Data Deleted");
					
					pst.close();
					dispose();
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"Error");
				}
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(51, 134, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblDeleteClass = new JLabel("Delete Class");
		lblDeleteClass.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDeleteClass.setBounds(101, 11, 99, 14);
		contentPane.add(lblDeleteClass);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(159, 134, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
	}

}
