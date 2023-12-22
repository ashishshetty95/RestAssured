package ReqreswithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class updateUser {
	@Test
	public void put() {
		JSONObject obj = new JSONObject();
		obj.put("name", "Ashish");
		obj.put("job", "employee");
		RequestSpecification ra = RestAssured.given();
		ra.body(obj);
		ra.contentType(ContentType.JSON);
		Response response = ra.put("https://reqres.in/api/users/2");
		System.out.println(response.prettyPeek());
	}
}
