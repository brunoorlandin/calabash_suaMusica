package com.suaMusica.suaMusicaBruno;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class AppTest{
}
