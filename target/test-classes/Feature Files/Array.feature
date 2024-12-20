@Array @DsAlgo
Feature: Array Module

  Background: The user logged in to dsAlgo Portal and should be in Array Page
    Given The user logged in to dsAlgo Portal and should be in Array Page

  @Array2Python
  Scenario: Navigate to implementing Arrays in Python page
    Given the user is in the Array page after logged in
    When the user clicks Arrays in Python link
    Then the user is navigated to Arrays in Python page

  @Array2List
  Scenario: Navigate to implementing Arrays using List page
    Given the user is in the Array page after logged in
    When the user clicks Arrays using List link
    Then the user is navigated to Arrays using List page

  @Array2Operations
  Scenario: Navigate to implementing Basic operations in Lists page
    Given the user is in the Array page after logged in
    When the user clicks Basic operations in Lists link
    Then the user is navigated to Basic operations in Lists page

  @Array2AppPython
  Scenario: Navigate to implementing Applications of Array page
    Given the user is in the Array page after logged in
    When the user clicks Applications of Array in link
    Then the user is navigated to Applications of Array page

  @ArrayPython2tryeditor
  Scenario: Navigate to tryeditor window
    Given the user is in Arrays in Python page
    When the user clicks Try here>>> button
    Then the user is navigated to tryeditor window

  @ArrayPythonTryEditorFunc
  Scenario Outline: Arrays in Python TryEditor Functionality
    Given The user is on the Try Editor of Arrays in Python page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @tryeditor2ArrayPython
  Scenario: Redirected to Arrays in Python page
    Given The user is on the Try Editor of Arrays in Python page
    When the user click browser back arrow
    Then the user is navigated to Arrays in Python page

  @ArrayList2tryeditor
  Scenario: Navigate to tryeditor window
    Given the user is in Arrays Using List page
    When the user clicks Try here>>> button
    Then the user is navigated to tryeditor window

  @ArrayListTryEditorFunc
  Scenario Outline: Arrays Using List TryEditor Functionality
    Given The user is on the Try Editor Arrays Using List page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @Arraytryeditor2List
  Scenario: Redirected to implementation using Arrays Using List page
    Given The user is on the Try Editor Arrays Using List page
    When the user click browser back arrow
    Then the user is navigated to Arrays using List page

  @ArrayBasicOpr2tryeditor
  Scenario: Navigate to tryeditor window
    Given the user is in Basic Operations in Lists page
    When the user clicks Try here>>> button
    Then the user is navigated to tryeditor window

  @ArrayBasicOprTryEditorFunc
  Scenario Outline: Array Basic Operations in Lists TryEditor Functionality
    Given The user is on the Try Editor Basic Operations in Lists page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @tryeditor2ArrayBasicOpr
  Scenario: Redirected to implementation using Basic Operations in Lists page
    Given The user is on the Try Editor Basic Operations in Lists page
    When the user click browser back arrow
    Then the user is navigated to Basic operations in Lists page

  @ArrayOpr2tryeditor
  Scenario: Navigate to tryeditor window
    Given the user is in Applications of Array page
    When the user clicks Try here>>> button
    Then the user is navigated to tryeditor window

  @ArrayAppTryEditorFunc
  Scenario Outline: Applications of Array TryEditor Functionality
    Given The user is on the Try Editor Applications of Array page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @tryeditor2ApplicationsofArray
  Scenario: Redirected to Applications of Array page
    Given The user is on the Try Editor Applications of Array page
    When the user click browser back arrow
    Then the user is navigated to Applications of Array page

  @ArrayPython2PrctQues
  Scenario: Navigated to Practice Questions page from Arrays in Python
    Given the user is in Arrays in Python page
    When the user clicks Practice Questions link
    Then the user is navigated to Practice Questions page

  #-----------------------------------------------------------------------------------------------------------------------------------------------------
  #Navigation to Assesment page
  @ArrayAssessment
  Scenario Outline: Navigated to Assessment Page from Practice Questions page
    Given the user is in Practice Question main page
    When the user clicks <Practice link>
    Then the should be navigated to <corresponding> page

    Examples: 
      | Practice link      | corresponding  |
      | search the Array   | Question1 page |
      | Max Cons Ones      | Question2 page |
      | Find even no digit | Question3 page |
      | Sq of sorted Array | Question4 page |

  #-------------------------------------------------------------------------------------------------------------------------------------------------
 

  @ques1Run
  Scenario: Search the Array Question Page with Valid code for Run button
    Given the user is in the Search the Array Question page
    When the user enters valid code in Search The Array and clickd Run Button
    Then The Element Found should be displayed

  @ques1Sub
  Scenario: Search the Array Question Page with Valid code for Submit button
    Given the user is in the Search the Array Question page
    When user enters valid code in Search The Array and clickd Submit Button
    Then the submission success should be displayed

  #----------------------------------------------------------------------------------------------------------------------------
 
  @ques2Run
  Scenario: Max Cons Ones Question Page with Valid code for Run button
    Given the user is in the Max Cons Ones Question page
    When the user enters valid code in Max Cons Ones and clickd Run Button
    Then Number two should be displayed

  @ques2Sub
  Scenario: Max Cons Ones Question Page with Valid code for Submit button
    Given the user is in the Max Cons Ones Question page
    When user enters valid code in Max Cons Ones and clickd Submit Button
    Then the submission success should be displayed

  #--------------------------------------------------------------------------------------------------------------------------
 
  @ques3Run
  Scenario: Nos with Even Nos Of Digits Question Page with Valid code for Run button
    Given the user is in the Nos with Even Nos Of Digits Question page
    When the user enters valid code in Nos with Even Nos Of Digits and clickd Run Button
    Then Number two should be displayed

  @ques3Sub
  Scenario: Nos with Even Nos Of Digits Question Page with Valid code for Submit button
    Given the user is in the Nos with Even Nos Of Digits Question page
    When user enters valid code in Nos with Even Nos Of Digits and clickd Submit Button
    Then the submission success should be displayed

  #----------------------------------------------------------------------------------------------------------------------------
 
  @ques4Run
  Scenario: Sq of Sorted Array Question Page with Valid code for Run button
    Given the user is in the Sq of Sorted Array Question page
    When the user enters valid code in Sq of Sorted Array and clickd Run Button
    Then Numbers should be displayed

  @ques4Sub
  Scenario: Sq of Sorted Array Question Page with Valid code for Submit button
    Given the user is in the Sq of Sorted Array Question page
    When user enters valid code in Sq of Sorted Array and clickd Submit Button
    Then the submission success should be displayed

  #-------------------------------------------------------------------------------------------------------------------------------------------------------
  #logout
  @Array2signout
  Scenario: signout from Array page
    Given the user is in the Array page after logged in
    When the user clicks Sign out
    Then the user is directed to home page with message Logged out successfully
