package api;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class ApiTest {
	
	@Test
	public void getUserSuccessTest() {

	    given()
	        .baseUri("https://jsonplaceholder.typicode.com")
	    .when()
	        .get("/users/1")
	    .then()
	        .statusCode(200)
	        .body("id", equalTo(1))
	        .body("username", notNullValue())
	        .body("email", containsString("@"));
	}
	
	@Test
	public void getUserNotFoundTest() {

	    given()
	        .baseUri("https://jsonplaceholder.typicode.com")
	    .when()
	        .get("/users/999")   
	    .then()
	        .statusCode(404);
	}
}
