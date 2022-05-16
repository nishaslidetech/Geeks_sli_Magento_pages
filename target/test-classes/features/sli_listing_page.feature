@Sli_pagination_test
Feature: SLI POP UP test



@without_Login
  Scenario: SLI pagination & Mouse Hover test without log in
  Given User is on Home Page
  Then Enter keyword "Software" in search field
  Then Go to the listing page
  Then mouse hover on any of one ppts 
  Then verify the whether the pop-up is visible
  Then click on any of page number and verify the product below 
  Then click on any of ppt 
  Then verify the ppt page
 
  
  
@With_login
Scenario: SLI pagination & mouse Hover test with login
  Then Click on signup page
  Then Enter username "qaslidegeeks@gmail.com" and password "Qwerty@1"
  Then Enter keyword "Progress" in search fields
  Then Go to the listing pagei
  Then mouse hover on any of one pptsi 
  Then verify the whether the pop-up is visiblei
  Then click on Any of page number and verify the listing pagebelowi
  Then click on any of ppti
  Then verify the navigation on cottect ppt pageii
  Then click on Sign out button and verify the pagei
  
  