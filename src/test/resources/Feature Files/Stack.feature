@Stack @DsAlgo
Feature: Stack Data strucutre WorkFlow

  Background: The user logged in to dsAlgo Portal and navigated to Stack Introduction Page
    Given The user is in Stack main page after signing in

  @Opinstack
  Scenario: user navigated to Operations in Stack link
    Given user is on the Stack Introduction page
    When user clicks on Operations in Stack link
    Then user navigated to operations in stack page

  @OpinstacktotryEditor
  Scenario: user navigated to tryEditor page
    Given the user is in operations in stack page
    When the user clicks Try here>>> button
    Then the user is navigated to tryeditor window

  @OpinstacktryEditorFunction
  Scenario Outline: : Implementation of OP stack TryEditor Functionality
    Given The user is on the tryEditor page of Opinstack
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
        Examples:

      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @TryEditorToOpinstack
  Scenario: user is able to navigate back to the Operations in Stack  page
    Given The user is on the tryEditor page of Opinstack
    When the user click browser back arrow
    Then user navigated to operations in stack page

  @implementation
  Scenario: Navigate to implementation page
    Given user is on the Stack Introduction page
    When user clicks on implementations link
    Then user is navigated to implementation page

  @ImplementationTryherebtn
  Scenario: user is able to navigate to tryEditor page of Implementation page
    Given user is on the Implementation page
    When the user clicks Try here>>> button
    Then the user is navigated to tryeditor window

  @iImplementationTryEditorFunction
  Scenario Outline: : Verify TryEditor Functionality with different Input in Implementation
    Given The user is on the tryEditor page of Implentation
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
        Examples:

      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @TryEditorToImplementation
  Scenario: user is able to navigate back to the implementation  page
    Given The user is on the tryEditor page of Implentation
    When the user click browser back arrow
    Then user is navigated to implementation page

  @applications
  Scenario: Navigate to applications page
    Given user is on the Stack Introduction page
    When user clicks on Applications link
    Then user is navigated to stack-applications page

  @ApplicationsToTryEditor
  Scenario: Navigate to tryEditor page
    Given user is on the stack applications page
    When the user clicks Try here>>> button
    Then the user is navigated to tryeditor window

  @ApplicationsTryEditorFunction
  Scenario Outline: : Verify TryEditor Functionality with different Input in Applications
    Given The user is on the tryEditor page of applications
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
        Examples:

      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @TryEditorToApplications
  Scenario: user navigate back to the stack-applications  page
    Given The user is on the tryEditor page of applications
    When the user click browser back arrow
    Then user is navigated to stack-applications page

  @PracticeQuestions
  Scenario: Navigated to Practice Questions page
    Given the user is in operations in stack page
    When the user clicks Practice Questions link
    Then the user is navigated to Practice Questions page

  @StackSignOut
  Scenario: signout from Stack page and navigated to home page
    Given user is on the Stack Introduction page
    When the user clicks Sign out
    Then the user is directed to home page with message Logged out successfully
