package parametersTests;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.restassured.http.ContentType;

public class DataDrivenExamples extends DataForTests{
	
		//@Test(dataProvider="DataForPost")
		public void test_1_post(String name, String job, String email) {
			
			JSONObject request = new JSONObject();	
			request.put("name", name);
			request.put("job", job);
			request.put("email", email);
			
			System.out.println(request);
			System.out.println(request.toJSONString());
			
			given().header("Content-Type", "application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)	
			.body(request.toJSONString())
			.when()
				.post("https://reqres.in/api/users")
			.then()
				.statusCode(201);		
		}
		
		@Parameters({"userId"})
		@Test
		public void test_2_delete(int userId) {
				
			System.out.println("value for userid is" + userId);
			given()
				.delete("https://reqres.in/api/users/" + userId)
			.then()
				.statusCode(204)
				.log().all();
		}
		
}
