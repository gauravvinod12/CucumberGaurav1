package TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith (Cucumber.class)
@CucumberOptions(features = "/Users/gaurav/IdeaProjects/CucumberGaurav1/Features",
glue = "Stepdefination")
public class Testrunner
{

}
