package t20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t20two {

 public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\SEL\\chromedriver.exe");
    WebDriver d=new ChromeDriver();

    //go to URL
    d.get("https://www.guvi.in");

    //Maximize the browser window
    d.manage().window().maximize();
    Thread.sleep(1000);

    //Click on SIGNUP button
    d.findElement(By.xpath("//a [contains(@class,'text-white px-4')]")).click();

    //Enter the First name 
    d.findElement(By.id("firstName")).sendKeys("rohit");

    //Enter the Last name
    d.findElement(By.id("lastName")).sendKeys("sharma");

    //Enter the Email
    d.findElement(By.id("emailInput")).sendKeys("varishini22@gmail.com");

    //Enter the Password
    d.findElement(By.id("passwordInput")).sendKeys("rohitsharma5");

    //Enter the Mobile number
    d.findElement(By.id("mobileNumberInput")).sendKeys("9812345670");

    //click on sign-up
    d.findElement(By.id("signup")).click();
          Thread.sleep(2000);
          
    //Verify that the user is successfully registered 
    WebElement successMessage=d.findElement(By.xpath("//h2[@id='status_title']"));
    if (successMessage.getText().equals("Successfully Registered"))
     System.out.println("User is successfully registered");
    else
     System.out.println("User is not successfully registered");

    //Click on login button 
    d.findElement(By.className("btn btn-primary btn-gradient")).click();

    // Enter the Email address 
    d.findElement(By.xpath("//input[@id='login_email']")). sendKeys("varishini22@gmail.com");

    //Enter the Password 
    d.findElement(By.id("login_password")).sendKeys("rohitsharma5");

    //Click on login button 
    d.findElement(By.xpath("//button[@id='login_button']")).click();

    //Verify signed In successfully
    d.findElement(By.xpath("//button[contains(@class,'btn dropdown account-box-toggler')]")).click();

    WebElement clientNameElement=d.findElement(By.xpath("//div/h6[text()='Test ']"));
    if (clientNameElement.getText().equals("rohit"))
     System.out.println("User is signed  successfully");
    else
     System.out.println("User is not signed successfully");

    //Close the Browser
    d.close();

 }

}