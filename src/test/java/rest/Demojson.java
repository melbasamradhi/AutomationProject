package rest;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demojson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		Response ans = req.get("/api/users?page=2");
		int a = ans.getStatusCode();
		System.out.println(a);
		Assert.assertEquals(a, 200, "response code mismatch");
		String s = ans.getBody().asString();
		System.out.println(s);
		
		String r = ans.getBody().jsonPath().prettify();
		System.out.println(r);

		JsonPath j = ans.jsonPath();
		int b = j.get("total_pages");
		System.out.println(b);
	}

}
