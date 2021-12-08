package view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteProductManagement extends View {
	public JLabel lblConfirmationDelete;
	public JLabel lblIDProduct;
	public JLabel lblImage;
	public GroupLayout groupLayout;
	public Image image;
	public JButton btnDelete;
	public JButton btnCancel;
	
	public DeleteProductManagement() {
		setTitle("Delete");
		this.getContentPane().setBackground(Color.WHITE);
		this.getContentPane().setForeground(Color.WHITE);
		this.setBounds(100,100,513,433);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblConfirmationDelete = new JLabel("Are you sure you want to delete?");
		lblConfirmationDelete.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirmationDelete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblIDProduct = new JLabel("TR0001");
		lblIDProduct.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIDProduct.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblImage = new JLabel("");
		image = new ImageIcon(this.getClass().getResource("/warning.png")).getImage();
		lblImage.setIcon(new ImageIcon(image));
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnDelete = new JButton("Delete");
		btnDelete.setBackground(Color.RED);
		btnDelete.setForeground(Color.BLACK);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnCancel = new JButton("Cancel");
		groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(183)
					.addComponent(lblImage, GroupLayout.PREFERRED_SIZE, 127, Short.MAX_VALUE)
					.addGap(187))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(93)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
							.addGap(111)
							.addComponent(btnCancel, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
						.addComponent(lblIDProduct, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
						.addComponent(lblConfirmationDelete, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
					.addGap(102))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addComponent(lblConfirmationDelete, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(lblIDProduct)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblImage, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addGap(91)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
						.addComponent(btnCancel, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
					.addGap(21))
		);
		getContentPane().setLayout(groupLayout);
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
	}
}