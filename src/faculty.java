import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.sql.*;
import javax.swing.*;
import java.awt.Font;

public class faculty extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					faculty frame = new faculty();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection conn = null;
	private JTable table_1;
	/**
	 * Create the frame.
	 */
	public faculty() {
		conn = sqlite_connection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 438);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenuItem mntmNewMenuItem = new JMenuItem("Course");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				course c = new course();
				c.main(null);
			}
		});
		menuBar.add(mntmNewMenuItem);
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Faculty");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				faculty f = new faculty();
				f.main(null);
			}
		});
		menuBar.add(mntmNewMenuItem_1);
		JMenuItem mntmClass = new JMenuItem("Class");
		mntmClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				classes cs = new classes();
				cs.main(null);
			}
		});
		menuBar.add(mntmClass);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Prepare TimeTable");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				schedule s = new schedule();
				s.main(null);
			}
		});
		menuBar.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Log Out");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					dispose();
					login l = new login();
					l.main(null);
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"Logout unsuccessful");
				}
			}
		});
		mntmNewMenuItem_3.setHorizontalAlignment(SwingConstants.RIGHT);
		menuBar.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(242, 50, 388, 314);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				add_faculty a = new add_faculty();
				a.main(null);
				
			}
		});
		btnAdd.setBounds(42, 50, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnRemove = new JButton("REMOVE");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				delete_faculty a = new delete_faculty();
				a.main(null);
			}
		});
		btnRemove.setBounds(42, 103, 89, 23);
		contentPane.add(btnRemove);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				update_faculty a = new update_faculty();
				a.main(null);
			}
		});
		btnUpdate.setBounds(42, 158, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnNewButton = new JButton("Load Table");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query = "select * from faculty";
					PreparedStatement pst = conn.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
					pst.close();
					rs.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(388, 11, 112, 23);
		contentPane.add(btnNewButton);
	}

}
