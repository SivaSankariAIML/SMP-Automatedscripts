package testRunner;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedTestNGRunner;
import cucumber.api.CucumberOptions;

//Below is newly added on 08102017 - vinu


@ExtendedCucumberOptions
		(
				jsonReport = "testResult/cucumber.json",
				retryCount = 0,
				detailedReport = true,
				detailedAggregatedReport = true,
				overviewReport = true,
				coverageReport = true,

				jsonUsageReport = "testResult/cucumber-usage.json",
				usageReport = true,
				toPDF = true,
				excludeCoverageTags = {"@flaky" },
				includeCoverageTags = {"@passed" },
				outputFolder = "testResult/cucumber_detailed_result/DATE(yyyy-MM-dd HH-mm-ss)"

				//outputFolder = "${user.dir}/DATE(yyyy-MM-dd HH:mm:ss.S)"
				//reportPrefix = "results-${user}"
		)



//Above is newly added


@CucumberOptions(plugin = { "html:testResult/cucumber-html-report",
		"json:testResult/cucumber.json", "pretty:testResult/cucumber-pretty.txt",
		"usage:testResult/cucumber-usage.json", "junit:testResult/cucumber-results.xml" },
		features = { "Features//JuneRelease2018//Regression" },
		glue = { "steps" },
		tags = {"@Web"})


//@RunWith(CucumberRunner.class)
public class RunnerTest extends ExtendedTestNGRunner {

}