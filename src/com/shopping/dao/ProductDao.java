package com.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.shopping.configuration.HelperClass;
import com.shopping.dto.Product;

public class ProductDao {

	HelperClass helperClass = new HelperClass();
	Connection connection = null;

//==================================================================================================================

	// To Save the Product details

	public Product saveProduct(Product product) {
		connection = helperClass.getConnection();
		String sql = "Insert into Product values(?,?,?,?,?)";

		// Create the statement

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// Passed the value to delimiter/ placeholder --------> ?

			preparedStatement.setInt(1, product.getId());
			preparedStatement.setString(2, product.getName());
			preparedStatement.setString(3, product.getBrand());
			preparedStatement.setString(4, product.getStatus());
			preparedStatement.setDouble(5, product.getPrice());

			// Execute the statement

			preparedStatement.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Close the connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return product;

	}

//========================================================================================================================

	// To Delete the details of Product

	public boolean deleteProductById(int id) {
		connection = helperClass.getConnection();
		String sql = "Delete from Product where id = ?";
		int i = 0;

		// Create the statement

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id);

			// Execute the statement

			i = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Close the connection

			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		if (i > 0) {
			return true;
		} else {
			return false;
		}

	}

//=====================================================================================================================

	// To Update the Name of Product

	public boolean updateProductNameById(String name, int id) {
		connection = helperClass.getConnection();
		String sql = "Update Product set name = ? where id = ?";
		int i = 0;

		// Create Statement

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, id);

			// Execute Statement

			i = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Close the Connection

			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (i > 0) {
			return true;
		} else {
			return false;
		}

	}

//====================================================================================================================

	// To Update the Brand of Product

	public boolean updateProductBrandById(String brand, int id) {
		connection = helperClass.getConnection();
		String sql = "Update Product set brand = ? where id = ?";
		int i = 0;

		// Create Statement

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, brand);
			preparedStatement.setInt(2, id);

			// Execute Statement

			i = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Close the Connection

			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (i > 0) {
			return true;
		} else {
			return false;
		}

	}

//======================================================================================================================

	// To Update the Status of Product

	public boolean updateProductStatusById(String status, int id) {
		connection = helperClass.getConnection();
		String sql = "Update Product set status = ? where id = ?";
		int i = 0;

		// Create Statement

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, status);
			preparedStatement.setInt(2, id);

			// Execute Statement

			i = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Close the Connection

			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (i > 0) {
			return true;
		} else {
			return false;
		}

	}

//==================================================================================================================

	// To Update the Price of Product

	public boolean updateProductPriceById(double price, int id) {
		connection = helperClass.getConnection();
		String sql = "Update Product set price = ? where id = ?";
		int i = 0;

		// Create Statement

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setDouble(1, price);
			preparedStatement.setInt(2, id);

			// Execute Statement

			i = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Close the Connection

			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (i > 0) {
			return true;
		} else {
			return false;
		}

	}

//==================================================================================================================

	// Display the product details by id

	public void displayProductDetailsById(int id) {
		connection = helperClass.getConnection();
		String sql = "Select * from Product where id = ?";

		// Create Statement

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
				System.out.println("===============================================================");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Close the connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

//====================================================================================================================

	// Display the details of all products

	public void displayAllProductDetails() {
		connection = helperClass.getConnection();
		String sql = "Select * from Product";

		// Create Statement

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
				System.out.println("==============================================================");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Close the connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

//=================================================================================================================

	// To Save multiple Products details (Batch Operation)


	public void saveMultipleProducts(List<Product> products) {
		connection = helperClass.getConnection();
		String sql = "Insert into Product values(?,?,?,?,?)";

		for (Product p : products) {

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);

				// Passed the value to delimiter/ placeholder --------> ?

				preparedStatement.setInt(1, p.getId());
				preparedStatement.setString(2, p.getName());
				preparedStatement.setString(3, p.getBrand());
				preparedStatement.setString(4, p.getStatus());
				preparedStatement.setDouble(5, p.getPrice());

				// Execute the statement
				preparedStatement.addBatch();
				preparedStatement.executeBatch();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//==================================================================================================================

	// To Delete Multiple Products details (Batch Operation)

	public void deleteMultipleProducts(List<Product> products) {
		connection = helperClass.getConnection();
		String sql = "Delete from Product where id = ?";

		for (Product p : products) {

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);

				preparedStatement.setInt(1, p.getId());

				// Execute the statement
				preparedStatement.addBatch();
				preparedStatement.executeBatch();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//=======================================================================================================================

}
