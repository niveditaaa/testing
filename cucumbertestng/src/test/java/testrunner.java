
//import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import com.cucumber.listener.Reporter;
import java.io.File;
import cucumber.api.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "json:target/json/output.json" },
 features = {"C:\\Users\\Adminindia\\workspace\\shaurya\\cookies\\src\\test.feature"},
 glue = {"step_definitions"}, tags = {"@tag1"},
 plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"})

public class testrunner {
	@AfterClass
	public static void teardown() {

		Reporter.loadXMLConfig(new File("target/extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}
