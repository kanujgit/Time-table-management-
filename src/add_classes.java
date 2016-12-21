import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class add_classes extends JFrame {

	private JPanel contentPane;
	private JTextField textfield;
	private JTextField textField_1;
	private JTextField textField_2;
	//private JTable table;
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add_classes frame = new add_classes();
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
	public add_classes() {
		conn = sqlite_connection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Class Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(64, 70, 81, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Strength");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(64, 107, 72, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Location");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(64, 142, 72, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblAddClass = new JLabel("Add Class");
		lblAddClass.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddClass.setBounds(188, 11, 72, 20);
		contentPane.add(lblAddClass);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(!(Character.isLetterOrDigit(c) ||(c==KeyEvent.VK_BACK_SPACE) ||(c==KeyEvent.VK_DELETE)))
				{
				arg0.consume();
					}
				

			}
		});
		textField.setBounds(174, 68, 126, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(!(Character.isDigit(c) ||(c==KeyEvent.VK_BACK_SPACE) ||(c==KeyEvent.VK_DELETE)))
				{
				arg0.consume();
					}

			}
		});
		textField_1.setBounds(174, 105, 126, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(!((c=='0') ||(c=='1')||(c==KeyEvent.VK_BACK_SPACE) ||(c==KeyEvent.VK_DELETE)))
				{
				arg0.consume();
				}


			}
		});
		textField_2.setBounds(174, 140, 126, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query = "insert into classes (class_name,strength,location) values (?,?,?)";
					PreparedStatement pst = conn.prepareStatement(query);
					pst.setString(1, textField.getText());
					pst.setString(2, textField_1.getText());
					pst.setString(3, textField_2.getText());
					pst.execute();
					JOptionPane.showMessageDialog(null,"Data Saved");
					
					pst.close();
					dispose();
					
					
					
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"Error");
				}
				//refreshTable();
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSave.setBounds(108, 202, 89, 23);
		contentPane.add(btnSave);
		
		JLabel lbllocationShoiuldBe = new JLabel("*Location shoiuld be 1 for class in department else 0 ");
		lbllocationShoiuldBe.setBounds(64, 179, 310, 14);
		contentPane.add(lbllocationShoiuldBe);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*classes c = new classes();
				c.main(null);*/
				dispose();
			}
		});
		btnNewButton.setBounds(230, 202, 89, 23);
		contentPane.add(btnNewButton);
	}
}
