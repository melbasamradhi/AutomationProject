package rest;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demoget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//http://localhost:8080/student/list
		RestAssured.baseURI="http://localhost:8080/student/1";
		RequestSpecification req = RestAssured.given();
		Response response = req.get();
		String s = response.getBody().asString();
		System.out.println(s);
	int a= 	response.getStatusCode();
	String b =response.getStatusLine();
	String c= response.getSessionId();
		
	System.out.println(a+"  "+b+"   "+c+"    ");
	
	//header
	System.out.println(response.header("content-Type"));
	System.out.println(response.header("server"));
	System.out.println(response.header("content-Encoding"));
	System.out.println(response.header("Date"));
	
	Assert.assertEquals(200, a);
	
	
	Headers head = response.headers();
	for(Header h1:head)
	{
		System.out.println(h1.getName()+"          "+h1.getValue());
		
	}
	
	JsonPath jp =response.jsonPath();
	String fName = jp.get("firstName");
	System.out.println(fName);
	
	
	}
		

	}


