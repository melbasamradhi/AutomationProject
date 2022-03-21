package rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
////import org.testng.annotations.Test;

public class DemoLocalhost {
	
	//@Test
	public static void main( String[] args ){
		// TODO Auto-generated method stub
		RestAssured.baseURI="http://localhost:8080/student/";
		RequestSpecification req = RestAssured.given();
Response res = req.get("1");
ResponseBody body = res.getBody();
String s =body.asString();

System.out.println(s);
//s.contains("Vernon")
Assert.assertEquals(s.contains("Vernn"), true, "no it is not  vernon");//when notequal error msg
int a =res.getStatusCode();
System.out.println(a);

	}

}
