import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.sql.*;
import javax.swing.*;
import java.awt.Font;

public class course extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					course frame = new course();
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
	public course() {
		conn = sqlite_connection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 438);
		
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
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(242, 50, 388, 314);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				add_course a = new add_course();
				a.main(null);
			}
		});
		btnAdd.setBounds(42, 50, 103, 23);
		contentPane.add(btnAdd);
		
		JButton btnRemove = new JButton("REMOVE");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				delete_course d = new delete_course();
				d.main(null);
			}
		});
		btnRemove.setBounds(42, 103, 103, 23);
		contentPane.add(btnRemove);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				update_course u = new update_course();
				u.main(null);
			}
		});
		btnUpdate.setBounds(42, 158, 103, 23);
		contentPane.add(btnUpdate);
		
		JButton btnNewButton = new JButton("Load Table");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query = "select * from course";
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
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(395, 11, 116, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add Subject");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				add_subject a = new add_subject();
				a.main(null);
			}
		});
		btnNewButton_1.setBounds(42, 215, 116, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Remove Subject");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				delete_subject d = new delete_subject();
				d.main(null);
			}
		});
		btnNewButton_2.setBounds(42, 260, 116, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Update Subject");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				update_subject u = new update_subject();
				u.main(null);
			}
		});
		btnNewButton_3.setBounds(42, 308, 116, 23);
		contentPane.add(btnNewButton_3);
	}
}
