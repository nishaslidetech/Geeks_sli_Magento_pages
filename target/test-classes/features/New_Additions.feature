@New_Additions
Feature: pagination & Mouse Hovers on New Additions pages

@without_Login
  Scenario: pagination & Mouse Hovers on New Additions pages
  Given user is on Home Pagesi
  Then click on New Addition button on Top navigation bar
  Then mouse hover on any of one ppt and verify the popup
  Then click on pagination number and verify the listing below
  And  click on any of PPT  
  Then verify the page  

  @With_login
  Scenario: pagination & Mouse Hovers on New Additions pages
  Given Click on Login button
  Then Enter valid username "qaslidegeeks@gmail.com" and "Qwerty@1" password
  Then Click on New Addition button on Top navigation bar
  Then Mouse hover on any of one ppt and verify the the popup
  Then Click on pagination number and verify the listing below
  And  Click on any of PPT and verify the download button 
  Then Clicks on the Logout button