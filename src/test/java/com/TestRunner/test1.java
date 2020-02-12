package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue="com.stepDefinations")

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HI...");
	}

}
