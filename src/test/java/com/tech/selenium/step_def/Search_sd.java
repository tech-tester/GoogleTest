package com.tech.selenium.step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.tech.selenium.cucumber.Driver.driver;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by mullrve on 23/02/2017.
 */
public class Search_sd {





    @Given("^I am on the google search page$")
    public void navigateToSearch() throws Throwable {

        driver.get("http://www.google.co.uk");
    }

    @When("^I search for the term \"([^\"]*)\"$")
    public void I_search_for_the_term(String search_term) throws Throwable {

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(search_term);
        driver.findElement(By.name("q")).submit();


    }

    @Then("^the Amazon shopping website link is returned within the results$")
    public void the_Amazon_website_link_is_returned_within_the_results()
            throws Throwable {
        List<String> searchResult_content = new ArrayList<String>();
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".r>a")));

        List<WebElement> searchResultList = driver.findElement(By.id("search")).findElements(By.tagName("a"));
        for (WebElement item : searchResultList)
            searchResult_content.add(item.getAttribute("href"));

        assertTrue(searchResult_content.contains("https://www.amazon.co.uk/"));
    }
}
