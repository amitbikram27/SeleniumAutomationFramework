package com.Amit.Selenium;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import generic_Utlilities.Driver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    public static void main(String[] args) {
		Driver.lunchBrowser("chrome");
		Driver.driver.get("http://localhost/login.do");
	}
}
