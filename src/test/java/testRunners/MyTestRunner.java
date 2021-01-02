package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\CUCUMBER_Framework_Projects\\CucumberPOMFraamework\\"
				+ "src\\test\\resources\\AppFeatures\\LoginPage.feature"},
		glue= {"stepDefinitions","AppHooks"},
		plugin={"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			   },
		stepNotifications=true,
		monochrome=true
		)
public class MyTestRunner {

}
