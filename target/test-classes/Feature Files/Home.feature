@Home @DsAlgo @Sanity
Feature: Home Functionality

  Background: The user logged in to dsAlgo Portal
    Given The user is in the Home Page

  @DSdropdwn
  Scenario Outline: Verify navigation to  DataStructures pages after selecting options from dropdown menu in Home page
    Given The user clicks the Datastructure dropdown
    When The user clicks the <Options> from the dropdown
    Then The user should be navigated to <Pages>

    Examples: 
      | Options     | Pages            |
      | Arrays      | Array page       |
      | Linked List | Linked List page |
      | Stack       | Stack page       |
      | Queue       | Queue page       |
      | Tree        | Tree page        |
      | Graph       | Graph page       |

  @DSgetstd
  Scenario Outline: Verify navigation to Datastructure pages after clicking its corresponding GetStarted button
    Given: The user is in the Home Page

    When The user clicks the <Getstarted> button
    Then The user should be navigated to <Pages>

    Examples: 
      | Getstarted  | Pages            |
      | Arrays      | Array page       |
      | Linked List | Linked List page |
      | Stack       | Stack page       |
      | Queue       | Queue page       |
      | Tree        | Tree page        |
      | Graph       | Graph page       |
