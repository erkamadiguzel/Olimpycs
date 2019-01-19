import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class TestOlympics extends TestBase {

    List<WebElement> list;




@Test
    public void sortRank(){

;
//}
int convert=0;


   List <WebElement> ranks= driver.findElements( By.xpath( "//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr[position()>0 and position()<11]/td[1]" ) );

    ArrayList<Integer> l= new ArrayList<Integer>();


    boolean allInOrder = true;

   for (int i=0; i<ranks.size(); i++){
        convert=Integer.parseInt( ranks.get( i ).getText() );

       l.add(convert  );

   }

   for (int i = 0; i < l.size()-1; i++) {
       if (l.get( i ) >= l.get( i+1 )){
           allInOrder = false;
           break;
       }
   }

Assert.assertTrue( allInOrder );
    System.out.println("TestPassed");



    }
/*
@FindBy(xpath = "//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']//tbody/tr[position() > 0 and position() < 12 and not(position()=11)]/td[2]")
    List<WebElement> goldColumn;

    @FindBy(xpath = "//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']//tbody/tr[position() > 0 and position() < 12 and not(position()=8)]/td[3]")
    List<WebElement> silverColumn;

    @FindBy(xpath = "//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']//tbody/tr[position() > 0 and position() < 12 and not(position()=8)]/td[4]")
    List<WebElement> bronzeColumn;
 */

    @Test
    public void sortCountry() {


        WebElement clickNocs = driver.findElement( By.xpath( "//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr[11]/td[2]" ) );
        clickNocs.click();

///table[@class='wikitable sortable plainrowheaders jquery-tablesorter']//tbody/tr[position() > 0 and position() < 12 and not(position()=11)]/td[2]")
//   List<WebElement> goldColumn;


        List<WebElement> countryCol = driver.findElements( By.xpath( "//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr[position()<87]/th[1]" ) );

        WebElement sortIt = driver.findElement( By.xpath( "(//th[.='NOC'])[1]" ) );

        sortIt.click();


        String firstRankIsOne = driver.findElement( By.xpath( "//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr[1]/td[1]" ) ).getText();

        Assert.assertNotEquals( firstRankIsOne, "1" );

    }
        @Test
        public void gold(){


            WebElement clickNocs = driver.findElement( By.xpath( "//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr[11]/td[2]" ) );
            clickNocs.click();


            List<WebElement>list=driver.findElements(  By.xpath( "//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/td[2]" ) );
            List<Integer>list1=new ArrayList<Integer>();





            int biggestNumber=0;

            for(int i=0; i<list.size(); i++){
            biggestNumber=Integer.parseInt( list.get( i ).getText() );


                list1.add( biggestNumber );

            }

            for(int a=0; a<list1.size(); a++){
                if(list1.get(a)>biggestNumber){
                    biggestNumber=list1.get( a );

                }
            }

            System.out.println(biggestNumber);
        }









}
