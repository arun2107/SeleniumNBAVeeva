package com.veeva.nba.runner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.veeva.nba.utils.Base;

public class NbaTestListener implements ITestListener {

	Base obj = new Base();
	@Override		
    public void onTestFailure(ITestResult Result) 					
    {		
    System.out.println("The name of the failed listener is :"+this.getClass().getSimpleName());					
    }		

    @Override		
    public void onTestSkipped(ITestResult Result)					
    {		
    System.out.println("The name of the skipped listener Skipped is :"+this.getClass().getSimpleName());					
    }		

    @Override		
    public void onTestStart(ITestResult Result)					
    {		
    System.out.println(Result.getName()+" test case started");					
    }	
	
    @Override		
    public void onTestSuccess(ITestResult Result)					
    {		
    System.out.println("The name of passed the listener Passed is :"+this.getClass().getSimpleName());					
    }
	

}
