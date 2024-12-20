@DataStructure @DsAlgo @Sanity
Feature: DataStructure Module

  Background: The user logged in to dsAlgo Portal and should be in DataStructure Page
    Given The user logged in to dsAlgo Portal and should be in DataStructure Page

  @DataStructure2timeComplixity
  Scenario: Navigate to implementation of DataStructure in timeComplixity page
    Given the user is in the DataStructure page after logged in
    When the user clicks DataStructure in timeComplixity link
    Then the user is navigated to DataStructure in timeComplixity page

  @DataStructure2tryeditor
  Scenario: Navigate to tryeditor window DataStructure in timeComplixity page
    Given the user is in DataStructure of timeComplixity page
    When the user clicks Try here>>> button
    Then the user is navigated to tryeditor window

  @DataStructureTryEditorFunc
  Scenario Outline: Implementation of DataStructure TryEditor Functionality
    Given The user is on the Try Editor DataStructure in timeComplixity page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @DataStructure2PrctQues
  Scenario: Navigated to Practice Questions page in DataStructure in timeComplixity page
    Given the user is in DataStructure of timeComplixity page
    When the user clicks Practice Questions link
    Then the user is navigated to Practice Questions page

  @DataStructure2signout
  Scenario: signout from DataStructure page
    Given the user is in the DataStructure page after logged in
    When the user clicks Sign out
    Then the user is directed to home page with message Logged out successfully
