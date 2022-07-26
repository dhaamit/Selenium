Feature: MouseMovemet demo

  Scenario: User print all items under main section
    Given user is on flipkart page
    When user perfom mouse movement on menu and print the result
      | Men         |
      | women       |
      | Baby & Kids |
    Then close the browser
