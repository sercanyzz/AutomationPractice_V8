#Author: Sercan YILMAZ
#Date: 02.08.2020
#Description: Automation Practice Test

@AutomationPracticeFeature
Feature: Automation Practice web page functionality
  
  @AutomationPracticeTest
  Scenario: Adding and Ordering product
  
    Given Open Chrome Browser
    And Open Automation Practice page
    When Sign Up
    And Add products to the cart
    And Proceed to checkout
    Then Order history and details
    
    
