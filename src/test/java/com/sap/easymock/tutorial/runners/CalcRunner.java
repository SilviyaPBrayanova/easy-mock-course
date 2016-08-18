package com.sap.easymock.tutorial.runners;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.sap.easymock.tutorial.calc.MathApplicationTest;
import com.sap.easymock.tutorial.calc.MathApplicationNoAnotationsTest;

public class CalcRunner {
	public static void main(String[] args) {
		//Result result = JUnitCore.runClasses(MathApplicationTester.class);
		Result result = JUnitCore.runClasses(MathApplicationNoAnotationsTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}