package com.customerapp.model.dao;

import java.sql.*;

import java.util.*;
import java.util.Date;

import com.customerapp.model.entity.Customer;
import com.customerapp.model.exceptions.DataAccessException;



public class CustomerDaoImpl implements CustomerDao {

	private Connection connection;

	public CustomerDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public void addCustomer(Customer customer) {
        Date tempdate=customer.getDob();
		java.sql.Date sqlDate = new java.sql.Date(tempdate.getTime());
		PreparedStatement pstmt;
		try {
			pstmt = connection.prepareStatement("insert into customer(name, address,phoneNumber , dob) values (?,?,?,?)");
			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getAddress());
			pstmt.setString(3, customer.getPhoneNumber());
			pstmt.setDate(4, sqlDate);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
	@Override
	public Optional<Customer> getCustomerById(int eid) throws DataAccessException{
		PreparedStatement pstmt;
		Customer customer=null;
		try {
			pstmt = connection.prepareStatement("select * from customer where id=?");
			pstmt.setInt(1, eid);

			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				customer=new Customer
						(rs.getInt("id"), 
						rs.getString("name"),
						rs.getString("address"),
						rs.getString("phoneNumber"), 
						rs.getDate("dob")); 
			}
			
		} catch(SQLException ex) {
			throw new DataAccessException(ex.getMessage());
		}
		
		return Optional.ofNullable(customer);
	}

}
