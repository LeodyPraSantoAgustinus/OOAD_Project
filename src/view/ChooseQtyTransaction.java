package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ChooseQtyTransaction extends View {
	public JLabel lblQty;
	public JTextField textIsi;
	public JButton btnOk;
	public JButton btnCancel;
	public ButtonGroup buttonGroup = new ButtonGroup();
	public JLabel lblTotal;
	public GroupLayout groupLayout;
	
	public ChooseQtyTransaction() {
		setTitle("Choose Qty");
		this.getContentPane().setBackground(Color.WHITE);
		this.getContentPane().setForeground(Color.WHITE);
		this.setBounds(100,100,513,433);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblQty = new JLabel("Qty:");
		lblQty.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		textIsi = new JTextField();
		textIsi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textIsi.setColumns(10);
		
		btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblTotal = new JLabel("/ 10");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(126)
					.addComponent(lblQty, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(textIsi, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblTotal, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
					.addGap(152))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(99)
					.addComponent(btnOk, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
					.addGap(37)
					.addComponent(btnCancel, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
					.addGap(113))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(119)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textIsi, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
						.addComponent(lblTotal, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
						.addComponent(lblQty, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
					.addGap(86)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnOk, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
						.addComponent(btnCancel, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
					.addGap(115))
		);
		getContentPane().setLayout(groupLayout);
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
	}
}