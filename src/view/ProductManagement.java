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

public class ProductManagement extends View{
	public JTable table;
	public JScrollPane pane;
	public JButton btnInsert;
	public JButton btnLogout;
	public GroupLayout groupLayout;
	public ProductManagement() {
		setTitle("Product Management");
		table = new JTable();
		Object[] columns = {"ID", "Product Name", "Price", "Stock", " ", " ", " "};
		DefaultTableModel model = new DefaultTableModel();
		
		this.getContentPane().setBackground(Color.WHITE);
		this.getContentPane().setForeground(Color.WHITE);
		this.setBounds(100,100,1335,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		table.getColumnModel().getColumn(4).setPreferredWidth(5);
		table.getColumnModel().getColumn(5).setPreferredWidth(5);
		table.getColumnModel().getColumn(6).setPreferredWidth(5);
		
		table.setBackground(Color.WHITE);
		table.setForeground(Color.BLACK);
		table.setSelectionBackground(Color.RED);
		table.setGridColor(Color.RED);
		table.setSelectionForeground(Color.WHITE);
		table.setFont(new Font("Tahoma", Font.PLAIN,17));
		table.setRowHeight(30);
		table.setAutoCreateRowSorter(true);
		table.setEnabled(false);
		
		pane = new JScrollPane(table);
		pane.setForeground(Color.RED);
		pane.setBackground(Color.WHITE);
		
		//add button
		btnInsert = new JButton("Insert");

		//delete button
		btnLogout = new JButton("Logout");
		btnLogout.setHorizontalAlignment(SwingConstants.LEFT);
		groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(btnLogout, GroupLayout.DEFAULT_SIZE, 1319, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(554)
					.addComponent(btnInsert, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
					.addGap(555))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(pane, GroupLayout.DEFAULT_SIZE, 1299, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(btnLogout, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(13)
					.addComponent(pane, GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnInsert, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
					.addGap(35))
		);
		getContentPane().setLayout(groupLayout);
		
		Object[] row = new Object[5];
		
		this.setVisible(true);
	}
}
