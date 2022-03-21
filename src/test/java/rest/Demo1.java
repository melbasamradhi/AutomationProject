package rest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1
RestAssured.baseURI="http://demo.guru99.com/V4/sinkministatement.php";
given().queryParam("CUSTOMER_ID", "68195").queryParam("PASSWORD", "1234!").queryParam("Account_No", "1")
.when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log().all().assertThat().statusCode(200);
	}

}
