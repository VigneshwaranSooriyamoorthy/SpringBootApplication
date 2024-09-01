package com.example.demo.cucumber;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.core.options.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.example.demo")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@Test")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty," +
        "html:target/cucumber-reports/cucumber.html," +
        "json:target/cucumber-reports/cucumber.json")
public class CucumberRunnerTest {
}
