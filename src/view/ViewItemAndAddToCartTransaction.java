package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class ViewItemAndAddToCartTransaction extends View{
	public JTable table;
	public JScrollPane pane;
	public GroupLayout groupLayout;
	
	public ViewItemAndAddToCartTransaction() {
		setTitle("View Item and Add To Cart");
		table = new JTable();
		Object[] columns = {"ID", "Name", "Price", "Qty", " "};
		DefaultTableModel model = new DefaultTableModel();
		
		this.getContentPane().setBackground(Color.WHITE);
		this.getContentPane().setForeground(Color.WHITE);
		this.setBounds(100,100,513,433);
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
		groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(pane, GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
					.addGap(10))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addComponent(pane, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
					.addGap(11))
		);
		getContentPane().setLayout(groupLayout);
		
		Object[] row = new Object[5];
		
		this.setVisible(true);
	}
}
