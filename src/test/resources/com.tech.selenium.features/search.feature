@smoke-test
Feature: Amazon Search
    AS A User
    I WANT TO perform a search using the google search engine for the term Amazon
    SO THAT I can investigate the returned search results

    Scenario: A user searches for Amazon
        Given I am on the google search page
        When I search for the term "Amazon"
        Then the Amazon shopping website link is returned within the results