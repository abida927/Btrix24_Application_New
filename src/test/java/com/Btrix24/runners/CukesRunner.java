package com.Btrix24.runners;





import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json",
                "html:target/default-cucumber-reports",
                "rerun:target/rerun.txt"
        },
        //tags = {"@negative or @storemanager"},
        features = {"src\\test\\resoucers\\features\\login.feature" //to specify where are the features
        },
        //feature contains scenarios
        //every scenario is like a test
        //where is the implementation for features
        glue = {"com\\Btrix24\\step_Definitions"},
        //dry run - to generate step definitions automatically
        //you will see them in the console output
        dryRun = true

)
public class CukesRunner {

}
