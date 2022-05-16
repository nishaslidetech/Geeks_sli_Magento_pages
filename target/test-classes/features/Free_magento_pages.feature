@Free_Magento_pages_test
Feature: pagination test for Free Magento pages



@without_Login
  Scenario: pagination test for Free Magento pages without log in
  Given user is on Home Page
  Then click on Free Slides button on top navigation bar
  Then click on any of page number and verify the listing page below
  Then select any of one ppt on the page
  Then verify the navigation on correct ppt page 
  
@With_login
Scenario: Pagination test for Free Magento pages with log in
  Then Click on signin page
  Then Enter username "qaslidegeeks@gmail.com" and passwordi "Qwerty@1"
  Then Click on Free Slides button on top navigation bar
  Then Click on any of page number and verify the listing page 
  Then Click on any of one ppt under free ppts 
  Then Verify the navigation on correct ppt page 
  Then User logout from the application 

  