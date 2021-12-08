package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Transaction extends View{
	public JTable table;
	public JScrollPane pane;
	public JButton btnCart;
	public JButton btnLogout;
	public JButton btnTransaction;
	public JButton btnViewTransaction;
	public JButton btnCheckOut;
	public GroupLayout groupLayout;
	
	public Transaction() {
		setTitle("Transaction");
		table = new JTable();
		Object[] columns = {"ID", "Item Name", "Stock", "Price", " "};
		DefaultTableModel model = new DefaultTableModel();
		
		this.getContentPane().setBackground(Color.WHITE);
		this.getContentPane().setForeground(Color.WHITE);
		this.setBounds(100,100,1335,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		table.getColumnModel().getColumn(4).setPreferredWidth(5);
		
		table.setBackground(Color.WHITE);
		table.setForeground(Color.BLACK);
		table.setSelectionBackground(Color.RED);
		table.setGridColor(Color.RED);
		table.setSelectionForeground(Color.WHITE);
		table.setFont(new Font("Tahoma", Font.PLAIN,17));
		table.setRowHeight(30);
		table.setAutoCreateRowSorter(true);
		
		pane = new JScrollPane(table);
		pane.setForeground(Color.RED);
		pane.setBackground(Color.WHITE);
		
		//add button
		btnCart = new JButton("Cart");
		btnCart.setFont(new Font("Tahoma", Font.PLAIN, 20));

		//delete button
		btnLogout = new JButton("Logout");
		btnLogout.setHorizontalAlignment(SwingConstants.LEFT);
		
		btnTransaction = new JButton("Transaction");
		btnTransaction.setHorizontalAlignment(SwingConstants.LEFT);
		
		btnViewTransaction = new JButton("View Today's Transaction");
		btnViewTransaction.setHorizontalAlignment(SwingConstants.LEFT);
		
		btnCheckOut = new JButton("Check Out");
		btnCheckOut.setFont(new Font("Tahoma", Font.PLAIN, 20));
		groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(363)
					.addComponent(btnViewTransaction, GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(156)
					.addComponent(btnTransaction, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(953, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1161, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(pane, GroupLayout.DEFAULT_SIZE, 1299, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(552)
					.addComponent(btnCart, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
					.addGap(557))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(552)
					.addComponent(btnCheckOut, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
					.addGap(557))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnViewTransaction, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnTransaction, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnLogout, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(13)
					.addComponent(pane, GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
					.addGap(34)
					.addComponent(btnCart, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
					.addGap(24)
					.addComponent(btnCheckOut, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
					.addGap(41))
		);
		getContentPane().setLayout(groupLayout);
		
		Object[] row = new Object[5];
		
		this.setVisible(true);
	}
}
