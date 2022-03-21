package rest;

import static io.restassured.RestAssured.given;

import io.restassured.response.ResponseBody;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= given().queryParam("CUSTOMER_ID", "68195").queryParam("PASSWORD", "1234!").queryParam("Account_No", "1")
		.when().get("http://demo.guru99.com/V4/sinkministatement.php").getStatusLine();
		System.out.println(a);
		
		int b =given().queryParam("CUSTOMER_ID", "68195").queryParam("PASSWORD", "1234!").queryParam("Account_No", "1")
		.when().get("http://demo.guru99.com/V4/sinkministatement.php").getStatusCode();
		System.out.println(b);
		
		ResponseBody c = given().queryParam("CUSTOMER_ID", "68195").queryParam("PASSWORD", "1234!").queryParam("Account_No", "1")
		.when().get("http://demo.guru99.com/V4/sinkministatement.php").getBody();
		System.out.println(c);
	}

}
