package com.Btrix24.Runner;

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
        tags = {"@hr"},
        features = {"src\\test\\resourses\\features\\login.feature"},//"src/test/resources/features"
        //to specify where are the features
        //feature contains scenarios
        //every scenario is like a test
        //where is the implementation for features
        glue = {"com/Btrix24/step_definitions"},  //"com/vytrack/step_definitions"

        //src\test\java\com\Btrix24\step_definitions
        //dry run - to generate step definitions automatically
        //you will see them in the console output
        dryRun = false

)
public class CukesRunner{

}




