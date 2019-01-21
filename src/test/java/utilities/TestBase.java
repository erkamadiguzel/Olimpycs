package utilities;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestBase {


    protected Actions actions;
    protected WebDriver driver;
    protected SoftAssert softAssert;
    protected Random random;
    protected Select select;
    protected Faker faker;


    @BeforeClass
    public void setUpClass() {
        WebDriverManager.chromedriver().setup();


    }

    @BeforeClass
    public void setUpMethod() {
        driver = new ChromeDriver(  );
        driver.get( "https://en.wikipedia.org/wiki/2016_Summer_Olympics" );

        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        actions = new Actions( driver );
        softAssert = new SoftAssert();
        driver.manage().window().maximize();


    }

    @AfterClass
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep( 10000 );
        //driver.quit();

    }
}