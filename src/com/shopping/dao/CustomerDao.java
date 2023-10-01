package com.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.shopping.configuration.HelperClass;
import com.shopping.dto.Customer;

public class CustomerDao {

	HelperClass helperClass = new HelperClass();
	Connection connection = null;

	
//==================================================================================================================
	
	
	// To Save the Customer details

	public Customer saveCustomer(Customer customer) {
		connection = helperClass.getConnection();
		String sql = "Insert into Customer values(?,?,?,?)";

		// Create the statement

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// Passed the value to delimiter/ placeholder --------> ?

			preparedStatement.setInt(1, customer.getId());
			preparedStatement.setString(2, customer.getName());
			preparedStatement.setString(3, customer.getEmail());
			preparedStatement.setString(4, customer.getAddress());

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

		return customer;

	}

//========================================================================================================================

	// To Delete the details of Customer

	public boolean deleteCustomerById(int id) {
		connection = helperClass.getConnection();
		String sql = "Delete from Customer where id = ?";
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

	// To Update the Name of Customer

	public boolean updateCustomerNameById(String name, int id) {
		connection = helperClass.getConnection();
		String sql = "Update Customer set name = ? where id = ?";
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
	
	// To Update the Email of Customer

		public boolean updateCustomerEmailById(String email, int id) {
			connection = helperClass.getConnection();
			String sql = "Update Customer set email = ? where id = ?";
			int i = 0;

			// Create Statement

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, email);
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
		
		// To Update the Address of Customer

		public boolean updateCustomerAddressById(String address, int id) {
			connection = helperClass.getConnection();
			String sql = "Update Customer set address = ? where id = ?";
			int i = 0;

			// Create Statement

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, address);
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

	// Display the customer details by id

	public void displayCustomerDetailsById(int id) {
		connection = helperClass.getConnection();
		String sql = "Select * from Customer where id = ?";

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

	// Display the details of all customers

	public void displayAllCustomerDetails() {
		connection = helperClass.getConnection();
		String sql = "Select * from Customer";

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

	// To Save multiple Customers details (Batch Operation)
	

		public void saveMultipleCustomers(List<Customer> customers) {
			connection = helperClass.getConnection();
			String sql = "Insert into Customer values(?,?,?,?)";

			for(Customer c : customers) {
				
				try {
					PreparedStatement preparedStatement = connection.prepareStatement(sql);

					// Passed the value to delimiter/ placeholder --------> ?

					preparedStatement.setInt(1, c.getId());
					preparedStatement.setString(2, c.getName());
					preparedStatement.setString(3, c.getEmail());
					preparedStatement.setString(4, c.getAddress());

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

	
		// To Delete Multiple Customers details (Batch Operation)

		public void deleteMultipleCustomers(List<Customer> customers) {
			connection = helperClass.getConnection();
			String sql = "Delete from Customer where id = ?";
			
			
			for(Customer c : customers) {
				
				try {
					PreparedStatement preparedStatement = connection.prepareStatement(sql);

					preparedStatement.setInt(1, c.getId());

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
