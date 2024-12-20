@Tree @DsAlgo
Feature: Tree functionality

  Background: The user logged in to dsAlgo Portal
    Given The user is in the Home Page

  @overview @one
  Scenario: Verify that user is able to navigate to OVERVIEW OF TRESS page
    Given The user is in the TREE INTRODUCTION Page
    When The user clicks OVERVIEW OF TRESS tab
    Then The user should be navigated to Overview of Trees Page

  @overviewtryhere
  Scenario: Verify that user is able to navigate to TRY HERE page which has try Editor in it
    Given The user is on the OVERVIEW OF TRESS page
    When The user clicks TRY HERE button in the Overview of Trees Page
    Then The user should be navigated to try Editor page with a RUN button to test

  @txteditorfnoverview
  Scenario Outline: Verify TryEditor Functionality with different Input
    Given The user is on the Try Editor page of Overview of Trees page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @backtooverview
  Scenario: Verify The user is able to navigate back to The OVERVIEW OF TREES page
    Given The user is on the Try Editor page of Overview of Trees page
    When The user clicks The left arrow in The browser

  @Terminologies @two
  Scenario: Verify that user is able to navigate to TERMINOLOGIES page
    Given The user is in the TREE INTRODUCTION Page
    When The user clicks TERMINOLOGIES tab
    Then The user should be navigated to Terminologies page

  @tryhere
  Scenario: Verify that user is able to navigate to TRY HERE page which has try Editor
    Given The user is in The TERMINOLOGIES  page
    When The user clicks TRY HERE button in The Terminologies page
    Then The user should be navigated to try Editor page with a RUN button to test

  @txteditforTerminologies
  Scenario Outline: Verify TryEditor Functionality with different Input
    Given The user is on the Try Editor in Terminologies page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @backtoTerminologies
  Scenario: Verify The user is able to navigate back to The TERMINOLOGIES page
    Given The user is on the Try Editor in Terminologies page
    When The user clicks The left arrow in The browser
    Then The user should be navigated to Terminologies page

  @typesoftrees @three
  Scenario: Verify that user is able to navigate to TYPES OF TREES page
    Given The user is in the TREE INTRODUCTION Page
    When The user clicks TYPES OF TREES tab
    Then The user should be navigated to Types of Trees page

  @tryheretypesoftrees
  Scenario: Verify that user is able to navigate to TRY HERE page which has try Editor
    Given The user is in The TYPES OF TREES  page
    When The user clicks TRY HERE button in The Types of Trees page
    Then The user should be navigated to try Editor page with a RUN button to test

  @txteditorfntypesoftrees
  Scenario Outline: Verify TryEditor Functionality with different Input
    Given The user is on the Try Editor in Types of Trees page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @backtotypesoftrees
  Scenario: Verify The user is able to navigate back to The TYPES OF TREES
    Given The user is on the Try Editor in Types of Trees page
    When The user clicks The left arrow in The browser
    Then The user should be navigated to Types of Trees page

  @treetraversals @four
  Scenario: Verify that user is able to navigate to TREE TRAVERSALS page
    Given The user is in the TREE INTRODUCTION Page
    When The user clicks TREE TRAVERSALS tab
    Then The user should be navigated to Trees Traversals page

  @treetraversalstrtryhere
  Scenario: Verify that user is able to navigate to TRY HERE page which has try Editor in Tree Traversals
    Given The user is in The TREE TRAVERSALS  page
    When The user clicks TRY HERE button in The Tree Traversals page
    Then The user should be navigated to try Editor page with a RUN button to test

  @txteditorfntreetraversals
  Scenario Outline: Verify TryEditor Functionality with different Input
    Given The user is on the Try Editor in Tree Traversals Page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @backtotreetraversals
  Scenario: Verify The user navigates back to The TREE TRAVERSALS page
    Given The user is on the Try Editor in Tree Traversals Page
    When The user clicks The left arrow in The browser
    Then The user should be navigated to Trees Traversals page

  @travelsillus @five
  Scenario: Verify that user is able to navigate to TRAVERSALS-ILLUSTRATION page
    Given The user is in the TREE INTRODUCTION Page
    When The user clicks TRAVERSALS-ILLUSTRATION tab
    Then The user should be navigated to Traversals Illustration page

  @tryheretraversalsillustration
  Scenario: Verify that user is able to navigate to TRY HERE page which has try Editor in Traversals-Illustration
    Given The user is in The TRAVERSALS-ILLUSTRATION page
    When The user clicks TRY HERE button in The Traversals-Illustration page
    Then The user should be navigated to try Editor page with a RUN button to test

  @tryeditorfntravelillustration
  Scenario Outline: Verify TryEditor Functionality with different Input
    Given The user is on the Try Editor in Traversals-Illustration Page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @backtotravelsillus
  Scenario: Verify The user navigates back to The TRAVERSALS-ILLUSTRATION page
    Given The user is on the Try Editor in Traversals-Illustration Page
    When The user clicks The left arrow in The browser
    Then The user should be navigated to Traversals Illustration page

  @binarytrees @six
  Scenario: Verify that user is able to navigate to BINARY TREES page
    Given The user is in the TREE INTRODUCTION Page
    When The user clicks BINARY TREES tab
    Then The user should be navigated to Binary Trees page

  @tryherebinarytrees
  Scenario: Verify that user is able to navigate to TRY HERE page which has try Editor in Binary Trees
    Given The user is in The BINARY TREES page
    When The user clicks TRY HERE button in The Binary Trees page
    Then The user should be navigated to try Editor page with a RUN button to test

  @txteditorfnbinarytrees
  Scenario Outline: Verify TryEditor Functionality with different Input
    Given The user is on the Try Editor in Binary Trees Page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @backtobinarytrees
  Scenario: Verify The user navigates back to The Binary Trees page
    Given The user is on the Try Editor in Binary Trees Page
    When The user clicks The left arrow in The browser
    Then The user should be navigated to Binary Trees page

  @typesofbinarytrees @seven
  Scenario: Verify that user is able to navigate to TYPES OF BINARY TREES page
    Given The user is in the TREE INTRODUCTION Page
    When The user clicks TYPES OF BINARY TREES tab
    Then The user should be navigated to The Types of Binary Trees page

  @tryheretypesofbinarytrees
  Scenario: Verify that user is able to navigate to TRY HERE page which has try Editor in Types of Binary Trees
    Given The user is in The TYPES OF BINARY TREES page
    When The user clicks TRY HERE button in The Types of Binary Trees page
    Then The user should be navigated to try Editor page with a RUN button to test

  @txteditorfntypesofbinarytrees
  Scenario Outline: Verify TryEditor Functionality with different Input
    Given The user is on the Try Editor page in Types of Binary Trees Page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @backtotypesofbinarytrees
  Scenario: Verify The user navigates back to The Types of Binary Trees page
    Given The user is on the Try Editor page in Types of Binary Trees Page
    When The user clicks The left arrow in The browser
    Then The user should be navigated to The Types of Binary Trees page

  @impinpython @eight
  Scenario: Verify that user is able to navigate to IMPLEMENTATION IN PYTHON page
    Given The user is in the TREE INTRODUCTION Page
    When The user clicks IMPLEMENTATION IN PYTHON tab
    Then The user should be navigated to implementation in python page

  @tryhereimpinpython
  Scenario: Verify that user is able to navigate to TRY HERE page which has try Editor implementation in python page
    Given The user is in IMPLEMENTATION IN PYTHON page
    When The user clicks TRY HERE button in Implementation in Pytton page
    Then The user should be navigated to try Editor page with a RUN button to test

  @txteditorfnimpinpython
  Scenario Outline: Verify TryEditor Functionality with different Input
    Given The user is on the Try Editor in IMPLEMENTATION IN PYTHON Page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @backtoimpinpython
  Scenario: Verify The user navigates back to Implementation in Python page
    Given The user is on the Try Editor in IMPLEMENTATION IN PYTHON Page
    When The user clicks The left arrow in The browser
    Then The user should be navigated to implementation in python page

  @bintreetraver @nine
  Scenario: Verify that user is able to navigate to BINARY TREE TRAVERSALS page
    Given The user is in the TREE INTRODUCTION Page
    When The user clicks BINARY TREE TRAVERSALS tab
    Then The user should be navigated to Binary Tree Traversals page

  @tryherebintreetraver
  Scenario: Verify that user is able to navigate to TRY HERE page which has try Editor in Binary Tree Traversals page
    Given The user is in BINARY TREE TRAVERSALS page
    When The user clicks TRY HERE button in Binary Tree Traversals page
    Then The user should be navigated to try Editor page with a RUN button to test

  @txteditforbintreetraver
  Scenario Outline: Verify TryEditor Functionality with different Input
    Given The user is on the Try Editor in BINARY TREE TRAVERSALS Page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @backtobintreetraver
  Scenario: Verify The user navigates back to Binary tree traversals page
    Given The user is on the Try Editor in BINARY TREE TRAVERSALS Page
    When The user clicks The left arrow in The browser
    Then The user should be navigated to Binary Tree Traversals page

  @impofbintree @ten
  Scenario: Verify that user is able to navigate to IMPLEMENTATION OF BINARY TREE page
    Given The user is in the TREE INTRODUCTION Page
    When The user clicks IMPLEMENTATION OF BINARY tab
    Then The user should be navigated to Implementation of Binary page

  @tryhereIBT
  Scenario: Verify that user is able to navigate to TRY HERE page which has try Editor in Implementation of Binary Tree
    Given The user is in IMPLEMENTATION OF BINARY TREE page
    When The user clicks TRY HERE button in IMPLEMENTATION OF BINARY TREE page
    Then The user should be navigated to try Editor page with a RUN button to test

  @txteditforIBT
  Scenario Outline: Verify TryEditor Functionality with different Input
    Given The user is on the Try Editor in IMPLEMENATATION OF BINARY TREE Page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @backtoIBT
  Scenario: Verify The user navigates back to Implementation of Binary Tree page
    Given The user is on the Try Editor in IMPLEMENATATION OF BINARY TREE Page
    When The user clicks The left arrow in The browser
    Then The user should be navigated to Implementation of Binary page

  @appofBT @eleven
  Scenario: Verify that user is able to navigate to APPLICATION OF BINARY TREES page
    Given The user is in the TREE INTRODUCTION Page
    When The user clicks APPLICATION OF BINARY TREES tab
    Then The user should be navigated to Application of Binary Trees page

  @tryhereappofBT
  Scenario: Verify that user is able to navigate to TRY HERE page which has try Editor in Application of Binary Trees
    Given The user is in APPLICATION OF BINARY TREES page
    When The user clicks TRY HERE button in APPLICATION OF BINARY TREES page
    Then The user should be navigated to try Editor page with a RUN button to test

  @txteditorappofBT
  Scenario Outline: Verify TryEditor Functionality with different Input
    Given The user is on the Try Editor in APPLICATION OF BINARY TREES Page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @backtpappofbT
  Scenario: Verify The user navigates back to Application of Binary Trees page
    Given The user is on the Try Editor in APPLICATION OF BINARY TREES Page
    When The user clicks The left arrow in The browser
    Then The user should be navigated to Application of Binary Trees page

  @BST @twelve
  Scenario: Verify that user is able to navigate to BINARY SEARCH TREE page
    Given The user is in the TREE INTRODUCTION Page
    When The user clicks BINARY SEARCH TREE tab
    Then The user should be navigated to Binary Search Tree page

  @tryhereBST
  Scenario: Verify that user is able to navigate to TRY HERE page which has try Editor in Binary Search Tree Page
    Given The user is in BINARY SEARCH TREE page
    When The user clicks TRY HERE button in BINARY SEARCH TREE page
    Then The user should be navigated to try Editor page with a RUN button to test

  @txteditBST
  Scenario Outline: Verify TryEditor Functionality with different Input
    Given The user is on the Try Editor in BINARY SEARCH TREE Page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @backtBST
  Scenario: Verify The user navigates back to Application of Binary Trees page
    Given The user is on the Try Editor in BINARY SEARCH TREE Page
    When The user clicks The left arrow in The browser
    Then The user should be navigated to Binary Search Tree page

  @IBST @thirteen
  Scenario: Verify that user is able to navigate to IMPLEMENTATION OF BINARY SEARCH TREE page
    Given The user is in the TREE INTRODUCTION Page
    When The user clicks IMPLEMENTATION OF BINARY SEARCH TREE tab
    Then The user should be navigated to Implementation of Binary Search Tree page

  @tryhereIBST
  Scenario: Verify that user is able to navigate to TRY HERE page which has try Editor in Binary Search Tree Page
    Given The user is in IMPLEMENTATION OF BINARY SEARCH TREE page
    When The user clicks TRY HERE button in IMPLEMENTATION OF BINARY SEARCH TREE page
    Then The user should be navigated to try Editor page with a RUN button to test

  @txteditIBST
  Scenario Outline: Verify TryEditor Functionality with different Input
    Given The user is on the Try Editor in IMPLEMENTATION OF BINARY SEARCH TREE Page
    When The user enters the <code> in Text Editor and clicks RUN button
    Then The <alert> should be displayed

    Examples: 
      | code          | alert                            |
      | Empty         | Error message in alert window    |
      | valid code    | displayed in the console         |
      | Invalid code1 | nameerror pop up alert message   |
      | Invalid code2 | syntaxerror pop up alert message |

  @backtoIBST
  Scenario: Verify The user navigates back to Application of Binary Trees page
    Given The user is on the Try Editor in IMPLEMENTATION OF BINARY SEARCH TREE Page
    When The user clicks The left arrow in The browser
    Then The user should be navigated to Implementation of Binary Search Tree page

  @practice
  Scenario: Verify that user is able to navigate to PRACTICE QUESTION Page under Trees page
    Given The user is in The TERMINOLOGIES  page
    When The user clicks PRACTICE QUESTIONS tab
    Then The user should be navigated to The Practice Question page

  @logout
  Scenario: Verify that user is able to LOGOUT from TREE Data Structure Page
    Given The user is in the TREE INTRODUCTION Page
    When The user clicks The SIGN OUT button
    Then The user should see logged out Successfully message
