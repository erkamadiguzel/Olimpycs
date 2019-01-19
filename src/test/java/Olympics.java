import org.testng.annotations.Test;
import pages.HomePage;
import utilities.Driver;
import utilities.TestBase;

public class Olympics extends TestBase {






        @Test
    public void testIt(){



            HomePage page=new HomePage();
            Driver.getDriver();

            driver.get( "https://en.wikipedia.org/wiki/2016_Summer_Olympics" );

            System.out.println(page.findBiggest());

        }

















}
