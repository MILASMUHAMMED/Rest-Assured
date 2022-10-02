package parametersTests;
import org.testng.annotations.DataProvider;

public class DataForTests {
	@DataProvider(name="DataForPost")
	public Object[][] dataForPost() {
		
//		Object[][] data = new Object[2][3];
//		
//		data[0][0] = "morpheusNew";
//		data[0][1] = "leaderNew";
//		data[0][2] = "morpheusNew@abc.com";
//		
//		data[1][0] = "morpheus2New";
//		data[1][1] = "leader2New";
//		data[1][2] = "morpheus2New@abc.com";
//		
//	return data;
		
		return new Object[][] {
			{"morpheusNewTest", "leaderNewTest", "morpheusNewTest@abc.com"},
			{"morpheusNewTestIn", "leaderNewTestIn", "morpheusNewTestIn@abc.com"}
		};
		
	}
}
