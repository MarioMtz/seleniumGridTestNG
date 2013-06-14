package TestNGPAck;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumGridTestNG { 
private WebDriver driver; 

//BeforeClass
@BeforeClass 
public void setUp() throws Exception {
DesiredCapabilities capabillities = DesiredCapabilities.firefox();
capabillities.setCapability("version", "21");
capabillities.setCapability("platform", Platform.WINDOWS);
capabillities.setCapability("name", "Testing Selenium 2");
driver = new RemoteWebDriver( new URL( "http://www.google.com"), capabillities);
}
@Test 
public void testSimple() throws Exception {
driver.get("http://www.google.com"); 
} 


@AfterClass 
public void tearDown() throws Exception { 
driver.quit(); 
} 
} 