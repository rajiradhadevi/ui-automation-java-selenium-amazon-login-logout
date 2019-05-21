
package com.raji.qe.base;

import com.raji.config.AppConfiguration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

/**
 * <strong>FunctionalTest</strong> handles setup and teardown of WebDriver.
 * @author Kim Schiller
 */
public class FunctionalTest {

	protected static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Exception{
		driver = AppConfiguration.ConfigureDriver();
		driver.get(AppConfiguration.BaseUrl);
	}
	
	@AfterClass
	public static void tearDown(){
		AppConfiguration.ExitDriver();
	}	
}
