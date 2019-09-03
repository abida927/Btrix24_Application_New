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
        tags = {"@helpdesk"},
        features = {"src\\test\\resoucers\\features\\login.feature"},
        //to specify where are the features
        //feature contains scenarios
        //every scenario is like a test
        //where is the implementation for features
        glue = {"src\\test\\java\\com\\Btrix24\\step_definitions\\Login_Step_Definition"},
        //dry run - to generate step definitions automatically
        //you will see them in the console output
        dryRun = false
)
public class CukesRunner {

}
