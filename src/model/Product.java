package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import utility.Connect;

public class Product extends Model{
	
	private String id, name, description;
	private int price, stock;
	
	public Product(String id, String name, String description, int price, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
	}
	
	public static Vector<Product> getAll() {
		Vector<Product> result = new Vector<Product>();
		String query = "SELECT * FROM Product";
		
		ResultSet rs = null;
		try {
			PreparedStatement ps = Connect.getConnection().createPreparedStatement(query);
			rs = ps.executeQuery(query);
			
			while(rs.next()) {
				result.add(new Product(
						rs.getString("productId"),
						rs.getString("productName"),
						rs.getString("productDescription"),
						rs.getInt("productPrice"),
						rs.getInt("productStock")
				));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public boolean insertProduct() {
		String query = "INSERT INTO Product VALUES(?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = Connect.getConnection().createPreparedStatement(query);
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, description);
			ps.setInt(4, price);
			ps.setInt(5, stock);
			
			return ps.executeUpdate() == 1;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateProduct() {
		String query = "UPDATE Product SET productName = ?, productDescription = ?, productPrice = ?, productStock = ? WHERE productId = ?";
		try {
			PreparedStatement ps = Connect.getConnection().createPreparedStatement(query);
			ps.setString(1, name);
			ps.setString(2, description);
			ps.setInt(3, price);
			ps.setInt(4, stock);
			ps.setString(5, id);
			
			return ps.executeUpdate() == 1;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean deleteProduct() {
		String query = "DELETE From Product WHERE productId = ?";
		try {
			PreparedStatement ps = Connect.getConnection().createPreparedStatement(query);
			ps.setString(1, id);
			
			return ps.executeUpdate() == 1;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
