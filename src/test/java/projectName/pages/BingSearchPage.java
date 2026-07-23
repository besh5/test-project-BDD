package projectName.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectName.utilities.Driver;

public class BingSearchPage {

   public BingSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "sb_form_q" )
    public WebElement searchBox;


}
