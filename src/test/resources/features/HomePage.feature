Feature: feature1
Scenario Outline: scenario1
Given user is in "Web Examples - CrossBrowserTesting.com" page
When user clicks on  Selenium Example Page link
Then system should display "Selenium Test Example Page" page
When user enters "<names1>" on the Form Elements
And user enters   "<names2>" on the text box
When user click on submit button 
Then system should display "Selenium Test Example Page" page


Examples: 
|names1|names2|
|sheereesh|RAMESH|
|mohaN|RAGHU|
|RDFGBDGDG|GFSGFSAFGSA|