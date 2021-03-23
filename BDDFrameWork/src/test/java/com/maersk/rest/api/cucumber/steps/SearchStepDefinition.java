package com.maersk.rest.api.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinition {
	
	
	@Given("I have a search field on amazon page")
	public void i_have_a_search_field_on_amazon_page() {
		
		System.out.println("1st Step Execution");
	}

	@When("I search product with name {string} and price {int}")
	public void i_search_product_with_name_and_price(String productName, Integer price) {
	    
		System.out.println("2nd Step exectution:" +productName + "Price" +price);
	}

	@Then("product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String string) {
		
		System.out.println("displayed name : "+string);

	}


}
