package rest;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demoget1 {

	public static void main(String[] args) {
		// localhost:8080/student/list
		RestAssured.baseURI= "http://localhost:8080/student/list";
		RequestSpecification req = RestAssured.given();
		Response res  = req.get();
		String s = res.jsonPath().prettify();
		System.out.println(s);
		//to get all emil on List
	List<String> id =	res.jsonPath().get("email");
	
	// print first email

	String ans = id.get(0);
	System.out.println(ans);
	//print all emailid
	for(String mail:id)  
		  System.out.println(mail); 
	
	for(String mail:id)  
		  System.out.println(mail.equalsIgnoreCase("davisolo@cisco.com")); 
	
	
	
	
	
	}

}
