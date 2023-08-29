
package com.flipkartshopping;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\Flipkart Feature\\Phones.feature",
					glue="com.flipkartshopping",
					dryRun =false,
					monochrome = true,
					plugin={"html:target/Reports.html","json:target/Jsonreports.json"},
					tags= "")

public class TestRunner {


}
