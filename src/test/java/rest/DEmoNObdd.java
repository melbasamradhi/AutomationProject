package rest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DEmoNObdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//http://dummy.restapiexample.com/api/v1/employees
		 RestAssured.baseURI="http://demo.guru99.com/V4/sinkministatement.php";
		 RequestSpecification hr = RestAssured.given();
		 Response r1=hr.queryParam("CUSTOMER_ID", "68195").queryParam("PASSWORD", "1234!").queryParam("Account_No", "1").get();
		//Response r= hr.request(Method.GET,"1");
	
		System.out.println(r1.asString());
	String body =	r1.getBody().asString();
	System.out.println(body);
	int a = r1.getStatusCode();
	System.out.println(a);
	}

}
