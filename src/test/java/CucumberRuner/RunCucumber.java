package CucumberRuner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/search.feature",glue="steps")
public class RunCucumber extends AbstractTestNGCucumberTests 
{

}
