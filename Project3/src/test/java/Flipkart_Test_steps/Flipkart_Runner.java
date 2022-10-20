package Flipkart_Test_steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/FeatureFile/Flipkart.feature",
glue= {"Flipkart_Test_steps"},
plugin = {"pretty","html:TestData/cucumber-reportss1.html"},
monochrome = true)
public class Flipkart_Runner extends AbstractTestNGCucumberTests
{
	
}
