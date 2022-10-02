import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Tests_GET {

	@Test
	void test_01() {
		
		//https://reqres.in/api/users?page=2
		
		baseURI = "https://reqres.in/api/";
		given()
			.param("page","2")
			.get("/users")
			.then()
			.statusCode(200)
			.body("data.id[1]", equalTo(8))
			.body("data.first_name", hasItems("Michael", "Lindsay"))
			.log().all();
	}
}
