package pack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LogInTest {
	    WebDriver driver;

	    @BeforeMethod
	    public void setup() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://the-internet.herokuapp.com/login");
	        driver.manage().window().maximize();
	    }

	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
	    @Test
	    public void validLoginTest() {

	        driver.findElement(By.id("username")).sendKeys("tomsmith");
	        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	        driver.findElement(By.cssSelector("button[type='submit']")).click();

	        String successMsg = driver.findElement(By.id("flash")).getText();

	        Assert.assertTrue(successMsg.contains("You logged into a secure area!"));
	    }
	    
	    @Test
	    public void invalidLoginTest() {

	        driver.findElement(By.id("username")).sendKeys("wrongusername");
	        driver.findElement(By.id("password")).sendKeys("wrongpassword");
	        driver.findElement(By.cssSelector("button[type='submit']")).click();

	        String errorMsg = driver.findElement(By.id("flash")).getText();

	        Assert.assertTrue(errorMsg.contains("Your username is invalid!"));
	    }
	    @Test
	    public void emptyFieldTest() {

	        driver.findElement(By.id("username")).sendKeys("");
	        driver.findElement(By.id("password")).sendKeys("");
	        driver.findElement(By.cssSelector("button[type='submit']")).click();

	        String errorMsg = driver.findElement(By.id("flash")).getText();

	        Assert.assertTrue(errorMsg.contains("Your username is invalid!"));
	    }
	}

