package com.automationpractice.stepDefs;

import java.util.List;
import java.util.Map;

import com.automationpractice.pojos.Product;
import com.automationpractice.pojos.User;

import io.cucumber.java.DataTableType;

public class CustomTypeTransformer {
	
	
	@DataTableType
	public Product productEntry ( Map<String, String> row) {
		
		String productName = row.get("Product name");
		String quantity = row.get("Quantity");
		String condition = row.get("Condition");
		String price = row.get("Price");
		String size = row.get("Size");
		String model = row.get("Model");
		
		
		return new Product(productName, quantity, condition, price, size, model);
	}
	
	
	
	
	@DataTableType
	public User userEntry ( Map<String, String> row) {
		
			
		return new User(row.get("First name"), 
						row.get("Last name"), 
						row.get("Password"),
						row.get("Address"),
						row.get("City"),
						row.get("Zip"),
						row.get("Phone no"));
	}
	
	
	
	
	

}
