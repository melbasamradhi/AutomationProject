package rest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demodelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://reqres.in/api/users/2";
		RequestSpecification req = RestAssured.given();
		req.header("Content-Type","application/json");
	Response res =	req.delete();
	int a = res.getStatusCode();
	System.out.println(a);
	
	
	String s =res.getBody().asString();
	System.out.println(s);
	
	try
	{
	JsonPath jp = res.jsonPath();
	String s1 = jp.get("job");
	
	
	
	}
	catch(Exception e)
	{
		System.out.println(e);
		
	}
	

}
}
