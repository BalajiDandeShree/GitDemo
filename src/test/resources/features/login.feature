Feature: Login
       To perform login to site
       As a use

  Scenario: Login to the facebook website as valid User
    Given user navigates to the facebook website
    When user validates the homepage title
    Then user enters "valid" username
    And user enters "valid" password
    And user clicks on the sign button
    
    
     Scenario: Login to the facebook website as invalid User
    Given user navigates to the facebook website
    When user validates the homepage title
    Then user enters "invalid" username
    And user enters "invalid" password
    And user clicks on the sign button
