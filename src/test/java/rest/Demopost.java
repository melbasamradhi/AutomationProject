package rest;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demopost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://reqres.in/api/users";
		RequestSpecification req = RestAssured.given();
		req.header("Content-Type","application/json");
		
		JSONObject js = new JSONObject();
		js.put("name","morpheus");
		js.put("job","leader");
		
		
		req.body(js.toString());
		
	Response res =	req.post();
	int a =res.getStatusCode();
		System.out.println(a);
		long  time = res.getTime();
		System.out.println(time);
		
		String r = res.getBody().jsonPath().prettify();
		System.out.println(r);

		
		String s =res.getBody().asString();
		System.out.println(s);
		
		JsonPath j = res.jsonPath();
		String t = j.get("job");
		System.out.println(t);
		
		
		
	}

}
