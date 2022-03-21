package rest;

import java.util.ArrayList;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demopost1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI= "http://localhost:8080/student";
		RequestSpecification req = RestAssured.given();
		req.header("Content-Type","application/json");
		JSONObject j = new JSONObject();
		j.put("firstName","david Melba");
		j.put("lastName","praisy");
		j.put("email","mpp3.dav@gmail.com");
		j.put("programme","Financial Analysis");
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("Accounting");
		courses.add("Statistics");
		j.put("courses",courses);
		req.body(j.toString());
	
		Response res = req.post();
		System.out.println(res.asPrettyString());
		
		String s = res.getBody().jsonPath().prettify();
		System.out.println(s);
		
		int r = res.getStatusCode();
		System.out.println(r);
		

		
		

	}

}
