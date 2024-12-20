@Graph @DsAlgo
Feature: Graph Module

Background: The user logged in to dsAlgo Portal and navigated to Graph Introduction Page
Given The user is in graph main page after signing in

@GraphMain2Graph
Scenario: Navigate to graph page
Given The user is in graph main page
When the user clicks graph link in gmain page
Then the user is navigated to graph page

@GraphTryherebtn
Scenario: Navigate to graph tryeditor window
Given the user is in graph page 
When the user clicks Try here>>> button
Then the user is navigated to tryeditor window

@GraphTryEditorFunction
Scenario Outline: Implementation of Graph TryEditor Functionality
Given The user is on the Try Editor graph page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
   Examples: 
      | code        | alert | 
      | Empty       | Error message in alert window| 
      |valid code   | displayed in the console | 
      |Invalid code1| nameerror pop up alert message  |
      |Invalid code2| syntaxerror pop up alert message | 

@TryEditorToGraph
Scenario: Redirected to graph page
Given The user is on the Try Editor graph page
When the user click browser back arrow
Then the user is navigated to graph page

@Graph2GraphRepresentation
Scenario: Navigate to graphrepresentation page
Given The user is in graph main page
When the user clicks Graph Representation link
Then the user is navigated to graphrepresentation page

@GraphRepresentationTryherebtn
Scenario: Navigate to tryeditor window
Given the user is in graphrepresentation page
When the user clicks Try here>>> button
Then the user is navigated to tryeditor window

@GraphRepresentationTryEditorFunction
Scenario Outline: Implementation of GraphRepresentation TryEditor Functionality
Given The user is on the Try Editor graphrepresentation page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
   Examples: 
      | code        | alert | 
      | Empty       | Error message in alert window| 
      |valid code   | displayed in the console | 
      |Invalid code1| nameerror pop up alert message  |
      |Invalid code2| syntaxerror pop up alert message | 
           
 @TryEditorToGraphRepresentation
Scenario: Redirected to graphrepresentation page
Given The user is on the Try Editor graphrepresentation page
When the user click browser back arrow
Then the user is navigated to graphrepresentation page

@GraphtoPracticeQuestions
Scenario: Navigated to Practice Questions page
Given the user is in graph page
When the user clicks Practice Questions link
Then the user is navigated to Practice Questions page

@GraphSignOut
Scenario: signout from Graph page and navigated to hone page
Given The user is in graph main page
When the user clicks Sign out
Then the user is directed to home page with message Logged out successfully
