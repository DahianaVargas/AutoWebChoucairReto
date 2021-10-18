Feature: I as user of the Utest.com
  i want to create a new user
  to access

  Scenario: Successfully user creation
    Given user in the home page
    When user create an account filling all fields
    Then user sees its username