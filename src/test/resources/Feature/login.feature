Feature: To validate login functionality of adactin hotel application 

Scenario: Verify that user can login by valid credentials 

  Given user has to launch the browser and url
  When user has to  enter the valid username and valid password
  |peter|parker@7|
  |tony |stark@t|
  |steve|rogers@1|
  |mike |mike212|  
  And user has to click the login button
  Then verify that user has reached the homepage and close the browser
  
  
  