@LinkedList @DsAlgo
Feature: Linked List Module
I want to use this template for my LinkedList feature file

Background: The user logged in to dsAlgo Portal and should be in LinkedList Page
Given The user logged in to dsAlgo Portal and should be in LinkedList Page

@LL2Intro
Scenario: Navigate to Introduction page on clicking the Introduction link
Given the user is in the linked list page after Logged in
When the user clicks Introduction link
Then the user is navigated to Introduction page

@LL2CreateLL
Scenario: Navigate to creating linked list page on clicking the creating linked list
Given the user is in the linked list page after Logged in
When the user clicks creating linked list link
Then the user is navigated to creating linked list page

@LL2TypesLL
Scenario: Navigate to Types of linked list page on clicking the Types of linked list link
Given the user is in the linked list page after Logged in
When the user clicks Types of linked list link
Then the user is navigated to Types of linked list page

@LL2ImpLL
Scenario: Navigate to implement linked list in python page on clicking the implement linked list
Given the user is in the linked list page after Logged in
When the user clicks implement linked list in python link
Then the user is navigated to implement linked list in python page

@LL2Traversal
Scenario: Navigate to traversal page on clicking the traversal link
Given the user is in the linked list page after Logged in
When the user clicks traversal link in linked list page
Then the user is navigated to traversal page

@LL2Insertion
Scenario: Navigate to insertion page on clicking the insertion link
Given the user is in the linked list page after Logged in
When the user clicks insertion link in linked list page
Then the user is navigated to insertion page

@LL2Deletion
Scenario: Navigate to Deletion page on clicking the Deletion link
Given the user is in the linked list page after Logged in
When the user clicks deletion link in linked list page
Then the user is navigated to deletion page

@LLIntro2TryEditor
Scenario: Navigate to Try editor window on clicking try here button from Introduction page
Given the user is in Introduction page
When the user clicks Try here>>> button
Then the user is navigated to tryeditor window

@LLIntroTryEditorFunc
Scenario Outline: Linked List Introduction TryEditor Functionality
Given The user is on the Try Editor Introduction page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
   Examples: 
      | code        | alert | 
      | Empty       | Error message in alert window| 
      |valid code   | displayed in the console | 
      |Invalid code1| nameerror pop up alert message  |
      |Invalid code2| syntaxerror pop up alert message | 

@TryEditor2LLIntro
Scenario: Redirected to Introduction page by clicking browser back in tryeditor window	
Given The user is on the Try Editor Introduction page
When the user click browser back arrow
Then the user is navigated to Introduction page

@LLIntro2CreateLL
Scenario: Navigated to creating linked list page on clicking the creating linked list in Introduction page
Given the user is in Introduction page
When the user clicks creating linked list link
Then the user is navigated to creating linked list page

@CreateLL2TryEditor
Scenario: Navigate to Try editor window on clicking try here button from creating linked list page
Given the user is in creating linked list page
When the user clicks Try here>>> button
Then the user is navigated to tryeditor window

@CreateLLTryEditorFunc
Scenario Outline: Creating linked list TryEditor Functionality
Given The user is on the Try Editor creating linked list page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
   Examples: 
      | code        | alert | 
      | Empty       | Error message in alert window| 
      |valid code   | displayed in the console | 
      |Invalid code1| nameerror pop up alert message  |
      |Invalid code2| syntaxerror pop up alert message |
      
@TryEditor2CreateLL
Scenario: Redirected to creating linked list page by clicking browser back from tryeditor window
Given The user is on the Try Editor creating linked list page
When the user click browser back arrow
Then the user is navigated to creating linked list page

@LLIntro2TypesLL
Scenario: Navigates to Types of linked list page on clicking the Types of linked list link from Introduction page
Given the user is in Introduction page
When the user clicks Types of linked list link
Then the user is navigated to Types of linked list page

@TypesLL2TryEditor
Scenario: Navigate to Try editor window on clicking try here button from Types of linked list page
Given the user is in Types of linked list page
When the user clicks Try here>>> button
Then the user is navigated to tryeditor window

@TypesLLTryEditorFunc
Scenario Outline: Types of linked list page TryEditor Functionality
Given The user is on the Try Editor Types of linked list page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
   Examples: 
      | code        | alert | 
      | Empty       | Error message in alert window| 
      |valid code   | displayed in the console | 
      |Invalid code1| nameerror pop up alert message  |
      |Invalid code2| syntaxerror pop up alert message |
      
@TryEditor2TypesLL
Scenario: Redirected to Types of linked list page by clicking browser back from tryeditor window
Given The user is on the Try Editor Types of linked list page
When the user click browser back arrow
Then the user is navigated to Types of linked list page

@LLIntro2ImpLL
Scenario: Navigates to implement linked list in python page from Introduction page
Given the user is in Introduction page
When the user clicks implement linked list in python link
Then the user is navigated to implement linked list in python page

@ImpLL2TryEditor
Scenario: Navigate to Try editor window on clicking try here button from implement linked list in python page
Given the user is in implement linked list in python page
When the user clicks Try here>>> button
Then the user is navigated to tryeditor window

@ImpLLTryEditorFunc
Scenario Outline: Implement linked list in python page TryEditor Functionality
Given The user is on the Try Editor implement linked list page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
   Examples: 
      | code        | alert | 
      | Empty       | Error message in alert window| 
      |valid code   | displayed in the console | 
      |Invalid code1| nameerror pop up alert message  |
      |Invalid code2| syntaxerror pop up alert message |

@TryEditor2ImpLL
Scenario: Redirected to implement linked list in python page by clicking browser back from tryeditor window
Given The user is on the Try Editor implement linked list page
When the user click browser back arrow
Then the user is navigated to implement linked list in python page

@LLIntro2Traversal
Scenario: Navigates to traversal page on clicking the traversal link from Introduction page
Given the user is in Introduction page
When the user clicks traversal link
Then the user is navigated to traversal page

@Traversal2TryEditor
Scenario: Navigates to Try editor window on clicking try here button from traversal page
Given the user is in traversal page
When the user clicks Try here>>> button
Then the user is navigated to tryeditor window

@TraversalTryEditorFunc
Scenario Outline: Traversal page TryEditor Functionality
Given The user is on the Try Editor traversal page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
   Examples: 
      | code        | alert | 
      | Empty       | Error message in alert window| 
      |valid code   | displayed in the console | 
      |Invalid code1| nameerror pop up alert message  |
      |Invalid code2| syntaxerror pop up alert message |
      
@TryEditor2Traversal
Scenario: Navigates back to traversal page by clicking browser back from tryeditor window
Given The user is on the Try Editor traversal page
When the user click browser back arrow
Then the user is navigated to traversal page

@LLIntro2Insertion
Scenario: Navigates to insertion page on clicking the insertion link from Introduction page
Given the user is in Introduction page
When the user clicks insertion link
Then the user is navigated to insertion page

@Insertion2TryEditor
Scenario: Navigate to Try editor window on clicking try here button from insertion page
Given the user is in insertion page
When the user clicks Try here>>> button
Then the user is navigated to tryeditor window

@InsertionTryEditorFunc
Scenario Outline: Insertion page TryEditor Functionality
Given The user is on the Try Editor insertion page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
   Examples: 
      | code        | alert | 
      | Empty       | Error message in alert window| 
      |valid code   | displayed in the console | 
      |Invalid code1| nameerror pop up alert message  |
      |Invalid code2| syntaxerror pop up alert message |
      
@TryEditor2Insertion
Scenario: Redirected to insertion page by clicking browser back from tryeditor window
Given The user is on the Try Editor insertion page
When the user click browser back arrow
Then the user is navigated to insertion page

@LLIntro2Delection
Scenario: Navigates to Deletion page on clicking the Deletion link from Introduction page
Given the user is in Introduction page
When the user clicks Deletion link
Then the user is navigated to deletion page

@Deletion2TryEditor
Scenario: Navigate to Try editor window on clicking try here button from Deletion page
Given the user is in Deletion page
When the user clicks Try here>>> button
Then the user is navigated to tryeditor window

@DeletionTryEditorFunc
Scenario Outline: Deletion page TryEditor Functionality
Given The user is on the Try Editor Deletion page
When The user enters the <code> in Text Editor and clicks RUN button
Then The <alert> should be displayed
   Examples: 
      | code        | alert | 
      | Empty       | Error message in alert window| 
      |valid code   | displayed in the console | 
      |Invalid code1| nameerror pop up alert message  |
      |Invalid code2| syntaxerror pop up alert message |

@TryEditor2Deletion
Scenario: Navigated back to Deletion page by clicking browser back from tryeditor window
Given The user is on the Try Editor Deletion page
When the user click browser back arrow
Then the user is navigated to deletion page

@LLIntro2PracticeQues
Scenario: Navigated to Practice Questions page on clicking the Practice Questions link from Introduction page
Given the user is in Deletion page
When the user clicks Practice Questions link
Then the user is navigated to Practice Questions page

@LLIntro2Signout
Scenario: Verify that user able to sign out successfully from linked list page
Given the user is in the linked list page after Logged in
When the user clicks Sign out
Then the user is directed to home page with message Logged out successfully
