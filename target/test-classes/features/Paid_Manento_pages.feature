@Paid_Magento_pages_test
Feature: pagination & Mouse Hovers on paid Magento pages



@without_Login
  Scenario: pagination & Mouse Hovers on Magento pages test without log in
  Given User is on Home Pageii
  Then click on Most Popular PPts 
  Then mouse hover on any of one most Popular PPt
  Then verify the displayed pop-up is visible
  Then click on Any of page number and verify the listing of most populat ppts
  Then click on any of one Ppt 
  Then verify the user will navigation on cottect ppt page 
  
@With_login
Scenario: pagination & Mouse Hovers on Magento pages test with log in
  Then Click on signin pageii
  Then Enter username "nisha.dhiman@slidetech.in" and passwordii "Qwerty"
  Then Click on Most popular ppts 
  Then Mouse hover on any of one ppti 
  Then Verify the displayed pop-up is visibleii
  Then Click on any of page number
  Then Click on any of ppt 
  Then Verify the navigation on cottect ppt page 

  
  