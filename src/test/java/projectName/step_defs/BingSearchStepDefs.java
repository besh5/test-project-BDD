package projectName.step_defs;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import projectName.pages.BingSearchPage;
import projectName.utilities.BrowserUtils;
import projectName.utilities.Driver;

import java.time.Duration;

public class BingSearchStepDefs {

    BingSearchPage bingSearchPage = new BingSearchPage();

    @Given("User is on the Bing search page")
    public void userIsOnTheBingSearchPage() {
        Driver.getDriver().get("https://www.bing.com/");
    }

    @Then("user should see title is Bing")
    public void userShouldSeeTitleIsBing() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Being"));
    }

    @When("User search for {string}")
    public void userSearchFor(String search_word) {

        bingSearchPage.searchBox.sendKeys(search_word);
        bingSearchPage.searchBox.submit();
        //BrowserUtils.sleep(3);

    }

    @Then("User should see {string} in the title")
    public void userShouldSeeInTheTitle(String search_word) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains(search_word));
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(search_word));
    }
}
