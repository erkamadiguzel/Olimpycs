package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.TestBase;
import utilities.Driver;

import java.util.List;

public class HomePage extends TestBase {



    public HomePage(){
        PageFactory.initElements( Driver.getDriver(),this );
    }





    @FindBy(xpath = "//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr[position()<11]/td[1]")
    public List<WebElement> rankesList;


    @FindBy(xpath = "//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr[position()<11]/td[2]")
    public List<WebElement>goldList;




    public int findBiggest(){

        driver.get( "https://en.wikipedia.org/wiki/2016_Summer_Olympics#Medal_table." );

        int biggestNumber=0;




            for(int i=0; i<goldList.size(); i++){
                biggestNumber=Integer.parseInt( goldList.get( i ).getText() );
                if(biggestNumber>=Integer.parseInt( goldList.get( i+1 ).getText() ))  {
                    return biggestNumber;

                }
            }
            return biggestNumber;


        }









    public boolean isSorted(){

        HomePage page=new HomePage();

        driver.get( "https://en.wikipedia.org/wiki/2016_Summer_Olympics#Medal_table." );

        int c=0;
        boolean check=true;

        for(int i=0; i< page.rankesList.size()-1; i++){

            c=Integer.parseInt( page.rankesList.get( i ).getText() );


            if(c>=c+1){
                check=false;

            }
        }

      return check;

    }




}
