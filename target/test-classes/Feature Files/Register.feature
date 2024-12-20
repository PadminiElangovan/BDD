@Register @DsAlgo @Sanity
Feature: Registration Functionality

  @regfn
  Scenario Outline: Verifying Registration Functionality with different inputs
    Given the User is in the Registration page
    When the user enters <username> username <password> password <passwordconfirmation> password confirmation
    Then the an <message> should be displayed

    Examples: 
      | username | password | passwordconfirmation | message                                                           |
      | empty    | empty    | empty                | Please fill out this field. below the username field              |
      | valid    | empty    | empty                | Please fill out this field. below the password field              |
      | valid    | valid1   | empty                | Please fill out this field. below the password confirmation field |
      | valid    | invalid  | invalid              | Enter the valid password                                          |
      | valid    | valid    | mismatch             | password mismatch message                                         |
      | existing | existing | existing             | The User is already Registered                                    |
    # | valid    | valid    | valid                | Successfully registered                                          |
      | invalid  | valid    | valid                | Invalid username                                                  |

  @tologinpg
  Scenario: Verify that user navigates to the login page when login link is clicked in Registration page
    Given the User is in the Registration page
    When the user clicks login link
    Then The user should be redirected to the Login Page
