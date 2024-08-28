package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/features", 
glue="stepDefinitions", 
monochrome=true, 
tags="@SmokeTest or @RegressionTest", 
plugin = {"pretty", "html:target/cucumber.html","junit:target/cucumber.xml",
		"json:target/cucumber.json"},

dryRun=true)


//@CucumberOptions(features="src/test/java/features", glue="stepDefinitions", monochrome=true, 
//tags="@SmokeTest or @RegressionTest", plugin = {"pretty", "html:target/cucumber.html"},
//dryRun=true)

/*@CucumberOptions(features="src/test/java/features", glue="stepDefinitions", monochrome=true, 
tags="@SmokeTest or @RegressionTest", plugin = {"pretty", "json:target/cucumber.json"})*/

/*
 * @CucumberOptions(features="src/test/java/features", glue="stepDefinitions",
 * monochrome=true, tags="@SmokeTest and @RegressionTest")
 * @CucumberOptions(features="src/test/java/features", glue="stepDefinitions", monochrome=true, tags="@SmokeTest")
 * 
 * @CucumberOptions(features="src/test/java/features", glue="stepDefinitions",
 * monochrome=true, tags="@SmokeTest or @RegressionTest")
 * 
 * @CucumberOptions(features="src/test/java/features", glue="stepDefinitions",
 * monochrome=true, tags="not @RegressionTest")
 */
public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	
		
	
}
