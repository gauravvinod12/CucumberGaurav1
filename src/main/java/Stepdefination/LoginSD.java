package Stepdefination;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSD
{
    WebDriver driver;
    @Given("I am on login page")
    public void i_am_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://ip2.scriptinglogic.net");
        System.out.println("I am on login page");
    }

    @When("i enter correct username and password")
    public void i_enter_correct_username_and_password() {
        System.out.println("i enter correct username and password");
        driver.findElement(By.name("email")).sendKeys("amolujagare@gmail.com");
        driver.findElement(By.name("password")).sendKeys("admin123");
    }

    @When("i click on login button")
    public void i_click_on_login_button() {
        System.out.println("i click on login button");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("i should land up to home page")
    public void i_should_land_up_to_home_page() {
        System.out.println("i should land up to home page");
        String expected = "http://ip2.scriptinglogic.net/index.php/dashboard";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals("Result not as expected :",expected,actual);

    }

    @When("i enter Incorrect username and password")
    public void i_enter_Incorrect_username_and_password() {
        System.out.println("i enter Incorrect username and password");
        driver.findElement(By.name("email")).sendKeys("amol@gmail.com");
        driver.findElement(By.name("password")).sendKeys("admin");
    }

    @Then("i should not land up to home page")
    public void i_should_not_land_up_to_home_page() {
        System.out.println("i should not land up to home page");
        String expected = "http://ip2.scriptinglogic.net/index.php/sessions/login";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals("Result not as expected :",expected,actual);
    }

}
