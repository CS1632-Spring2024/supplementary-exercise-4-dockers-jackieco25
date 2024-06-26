package edu.pitt.cs;
// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import java.time.Duration;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class D3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    driver = new ChromeDriver(options);
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tEST1LINKS() {
    // Test name: TEST-1-LINKS
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/ | 
    driver.get("http://localhost:8080");
    // 2 | storeAttribute | xpath=/html/body/div/header/nav/ul/li[8]/a@href | link
    {
      WebElement element = driver.findElement(By.xpath("/html/body/div/header/nav/ul/li[8]/a"));
      String attribute = element.getAttribute("href");
      vars.put("link", attribute);
    }
    // 3 | assert | link | /reset
    assertEquals(vars.get("link").toString(), "http://localhost:8080/reset");
  }
  @Test
  public void tEST2RESET() {
    // Test name: TEST-2-RESET
    // Step # | name | target | value
    // 1 | open | http://localhost:8080 | 
    driver.get("http://localhost:8080");
    // 2 | runScript | document.cookie = "1=true";document.cookie = "2=true";document.cookie = "3=true"; | 
    js.executeScript("document.cookie = \"1=true\";document.cookie = \"2=true\";document.cookie = \"3=true\";");
    // 3 | click | linkText=Reset | 
    driver.findElement(By.linkText("Reset")).click();
    // 4 | assertText | xpath=//*[@id="listing"]/ul/li[1] | ID 1. Jennyanydots
    assertThat(driver.findElement(By.xpath("//*[@id=\"listing\"]/ul/li[1]")).getText(), is("ID 1. Jennyanydots"));
    // 5 | assertText | xpath=//*[@id="listing"]/ul/li[2] | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.xpath("//*[@id=\"listing\"]/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    // 6 | assertText | xpath=//*[@id="listing"]/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//*[@id=\"listing\"]/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void tEST3CATALOG() {
    // Test name: TEST-3-CATALOG
    // Step # | name | target | value
    // 1 | open | http://localhost:8080 | 
    driver.get("http://localhost:8080");
    // 2 | click | linkText=Catalog | 
    driver.findElement(By.linkText("Catalog")).click();
    // 3 | storeAttribute | xpath=/html/body/div/main/div[1]/ol/li[2]/img@src | catpic
    {
      WebElement element = driver.findElement(By.xpath("/html/body/div/main/div[1]/ol/li[2]/img"));
      String attribute = element.getAttribute("src");
      vars.put("catpic", attribute);
    }
    // 4 | assert | catpic | /images/cat2.jpg
    assertEquals(vars.get("catpic").toString(), "http://localhost:8080/images/cat2.jpg");
  }
  @Test
  public void tEST4LISTING() {
    // Test name: TEST-4-LISTING
    // Step # | name | target | value
    // 1 | open | http://localhost:8080 | 
    driver.get("http://localhost:8080");
    // 2 | click | linkText=Catalog | 
    driver.findElement(By.linkText("Catalog")).click();
    // 3 | assertElementPresent | xpath=//*[@id="listing"]/ul/li[3] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"listing\"]/ul/li[3]"));
      assert(elements.size() > 0);
    }
    // 4 | assertElementNotPresent | xpath=//*[@id="listing"]/ul/li[4] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"listing\"]/ul/li[4]"));
      assert(elements.size() == 0);
    }
    // 5 | assertText | xpath=//*[@id="listing"]/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//*[@id=\"listing\"]/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void tEST5RENTACAT() {
    // Test name: TEST-5-RENT-A-CAT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080 | 
    driver.get("http://localhost:8080");
    // 2 | click | linkText=Rent-A-Cat | 
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 3 | assertElementPresent | xpath=//button | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button"));
      assert(elements.size() > 0);
    }
    // 4 | assertText | css=.form-group:nth-child(3) .btn | Rent
    assertThat(driver.findElement(By.cssSelector(".form-group:nth-child(3) .btn")).getText(), is("Rent"));
    // 5 | assertElementPresent | xpath=//div[3]/div[3]/button | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[3]/div[3]/button"));
      assert(elements.size() > 0);
    }
    // 6 | assertText | xpath=//div[3]/div[3]/button | Return
    assertThat(driver.findElement(By.xpath("//div[3]/div[3]/button")).getText(), is("Return"));
  }
  @Test
  public void tEST6RENT() {
    // Test name: TEST-6-RENT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080 | 
    driver.get("http://localhost:8080");
    // 2 | click | linkText=Rent-A-Cat | 
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 3 | click | xpath=//input[@id='rentID'] | 
    driver.findElement(By.xpath("//input[@id=\'rentID\']")).click();
    // 4 | type | xpath=//input[@id='rentID'] | 1
    driver.findElement(By.xpath("//input[@id=\'rentID\']")).sendKeys("1");
    // 5 | click | xpath=//button[contains(.,'Rent')] | 
    driver.findElement(By.xpath("//button[contains(.,\'Rent\')]")).click();
    // 6 | assertText | xpath=//div/ul/li | Rented out
    assertThat(driver.findElement(By.xpath("//div/ul/li")).getText(), is("Rented out"));
    // 7 | assertText | xpath=//div/ul/li[2] | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.xpath("//div/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    // 8 | assertText | xpath=//div/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//div/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
    // 9 | assertText | xpath=//div[4] | Success!
    assertThat(driver.findElement(By.xpath("//div[4]")).getText(), is("Success!"));
  }
  @Test
  public void tEST7RETURN() {
    // Test name: TEST-7-RETURN
    // Step # | name | target | value
    // 1 | open | http://localhost:8080 | 
    driver.get("http://localhost:8080");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=true";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=true\";document.cookie = \"3=false\";");
    // 3 | click | xpath=//li[2]/a | 
    driver.findElement(By.xpath("//li[2]/a")).click();
    // 4 | click | xpath=//div[3]/div[2]/input | 
    driver.findElement(By.xpath("//div[3]/div[2]/input")).click();
    // 5 | type | xpath=//div[3]/div[2]/input | 2
    driver.findElement(By.xpath("//div[3]/div[2]/input")).sendKeys("2");
    // 6 | click | xpath=//div[3]/div[3]/button | 
    driver.findElement(By.xpath("//div[3]/div[3]/button")).click();
    // 7 | assertText | xpath=//div/ul/li | ID 1. Jennyanydots
    assertThat(driver.findElement(By.xpath("//div/ul/li")).getText(), is("ID 1. Jennyanydots"));
    // 8 | assertText | xpath=//div/ul/li[2] | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.xpath("//div/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    // 9 | assertText | xpath=//div/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//div/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
    // 10 | assertText | xpath=//div[3]/div[4] | Success!
    assertThat(driver.findElement(By.xpath("//div[3]/div[4]")).getText(), is("Success!"));
  }
  @Test
  public void tEST8FEEDACAT() {
    // Test name: TEST-8-FEED-A-CAT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080 | 
    driver.get("http://localhost:8080");
    // 2 | click | xpath=//li[4]/a | 
    driver.findElement(By.xpath("//li[4]/a")).click();
    // 3 | assertElementPresent | xpath=//button | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button"));
      assert(elements.size() > 0);
    }
    // 4 | assertText | xpath=//button | Feed
    assertThat(driver.findElement(By.xpath("//button")).getText(), is("Feed"));
  }
  @Test
  public void tEST9FEED() {
    // Test name: TEST-9-FEED
    // Step # | name | target | value
    // 1 | open | http://localhost:8080 | 
    driver.get("http://localhost:8080");
    // 2 | click | linkText=Feed-A-Cat | 
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    // 3 | click | id=catnips | 
    driver.findElement(By.id("catnips")).click();
    // 4 | type | id=catnips | 6
    driver.findElement(By.id("catnips")).sendKeys("6");
    // 5 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 6 | assertText | xpath=//div[4] | Nom, nom, nom.
    assertThat(driver.findElement(By.xpath("//div[4]")).getText(), is("Nom, nom, nom."));
  }
  @Test
  public void tEST10GREETACAT() {
    // Test name: TEST-10-GREET-A-CAT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080 | 
    driver.get("http://localhost:8080");
    // 2 | click | xpath=//li[6]/a | 
    driver.findElement(By.xpath("//li[6]/a")).click();
    // 3 | assertText | xpath=//div[2]/h4 | Meow!Meow!Meow!
    assertThat(driver.findElement(By.xpath("//div[2]/h4")).getText(), is("Meow!Meow!Meow!"));
  }
  @Test
  public void tEST11GREETACATWITHNAME() {
    // Test name: TEST-11-GREET-A-CAT-WITH-NAME
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/greet-a-cat/Jennyanydots | 
    driver.get("http://localhost:8080/greet-a-cat/Jennyanydots");
    // 2 | assertText | xpath=//div[2]/h4 | Meow! from Jennyanydots.
    assertThat(driver.findElement(By.xpath("//div[2]/h4")).getText(), is("Meow! from Jennyanydots."));
  }
}
