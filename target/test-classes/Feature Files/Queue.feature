@queue @DsAlgo
Feature: Queue Module

Background: The user logged in to dsAlgo Portal and should be in Queue Page
Given The user logged in to dsAlgo Portal and should be in Queue Page

@queue2Impqueue
Scenario: Navigate to implementation of queue in python page
Given the user is in the queue page after logged in
When the user clicks implementation of queue in python link
Then the user is navigated to implementation of queue in python page

@queue2ImpCollection
Scenario: Navigate to implementation using collections deque page
Given the user is in the queue page after logged in
When the user clicks implementation using collections deque link in queue page
Then the user is navigated to implementation using collections deque page

@queue2Imparray
Scenario: Navigate to implementation using array page
Given the user is in the queue page after logged in
When the user clicks implementation using array link in queue page
Then the user is navigated to implementation using array page

@queue2queueOperation
Scenario: Navigate to queue operations page
Given the user is in the queue page after logged in
When the user clicks queue operations link
Then the user is navigated to queue operations page

@Impqueue2tryeditor
Scenario: Navigate to tryeditor window
Given the user is in implementation of queue in python page
When the user clicks Try here>>> button
Then the user is navigated to tryeditor window

@ImpQueueTryEditorFunc
Scenario Outline: Implementation of queue TryEditor Functionality
Given The user is on the Try Editor implementation of queue page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
   Examples: 
      | code        | alert | 
      | Empty       | Error message in alert window| 
      |valid code   | displayed in the console | 
      |Invalid code1| nameerror pop up alert message  |
      |Invalid code2| syntaxerror pop up alert message | 
           
@tryeditor2Impqueue
Scenario: Redirected to implementation of queue in python page
Given The user is on the Try Editor implementation of queue page
When the user click browser back arrow
Then the user is navigated to implementation of queue in python page

@Impqueue2ImpCollection
Scenario: Navigated to implementation using collections deque page
Given the user is in implementation of queue in python page
When the user clicks implementation using collections deque link
Then the user is navigated to implementation using collections deque page

@ImpCollection2tryeditor
Scenario: Navigate to tryeditor window
Given the user is in implementation using collections deque page
When the user clicks Try here>>> button
Then the user is navigated to tryeditor window

@ImpCollTryEditorFunc
Scenario Outline: Implementation using collections deque TryEditor Functionality
Given The user is on the Try Editor implementation using collections deque page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed

   Examples: 
      | code        | alert | 
      | Empty       | Error message in alert window| 
      |valid code   | displayed in the console | 
      |Invalid code1| nameerror pop up alert message  |
      |Invalid code2| syntaxerror pop up alert message |               

@tryeditor2ImpCollection
Scenario: Redirected to implementation using collections deque page
Given The user is on the Try Editor implementation using collections deque page
When the user click browser back arrow
Then the user is navigated to implementation using collections deque page

@Impqueue2ImpArry
Scenario: Navigated to implementation using array page
Given the user is in implementation of queue in python page
When the user clicks implementation using array link
Then the user is navigated to implementation using array page

@Imparray2tryeditor
Scenario: Navigate to tryeditor window
Given the user is in implementation using array page
When the user clicks Try here>>> button
Then the user is navigated to tryeditor window

@ImpArrayTryEditorFunc
Scenario Outline: Implementation using array TryEditor Functionality
Given The user is on the Try Editor implementation using array page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed

   Examples: 
      | code        | alert | 
      | Empty       | Error message in alert window| 
      |valid code   | displayed in the console | 
      |Invalid code1| nameerror pop up alert message  |
      |Invalid code2| syntaxerror pop up alert message |  

@tryeditor2Imparray
Scenario: Redirected to implementation using array deque page
Given The user is on the Try Editor implementation using array page
When the user click browser back arrow
Then the user is navigated to implementation using array page

@Impqueue2queueOpr
Scenario: Navigated to queue operations page
Given the user is in implementation of queue in python page
When the user clicks queue operations link
Then the user is navigated to queue operations page

@queueOpr2tryeditor 
Scenario: Navigate to tryeditor window
Given the user is in queue operations page
When the user clicks Try here>>> button
Then the user is navigated to tryeditor window

@QueueOprTryEditorFunc
Scenario Outline: Queue operations TryEditor Functionality
Given The user is on the Try Editor queue operations page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed

   Examples: 
      | code        | alert | 
      | Empty       | Error message in alert window| 
      |valid code   | displayed in the console | 
      |Invalid code1| nameerror pop up alert message  |
      |Invalid code2| syntaxerror pop up alert message |

@tryeditor2queueOperation
Scenario: Redirected to queue operations page
Given The user is on the Try Editor queue operations page
When the user click browser back arrow
Then the user is navigated to queue operations page

@Impqueue2PrctQues
Scenario: Navigated to Practice Questions page
Given the user is in implementation of queue in python page
When the user clicks Practice Questions link
Then the user is navigated to Practice Questions page

@queue2signout
Scenario: signout from queue page
Given the user is in the queue page after logged in
When the user clicks Sign out
Then the user is directed to home page with message Logged out successfully
           
 