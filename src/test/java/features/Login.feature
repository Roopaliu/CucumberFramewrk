Feature: Application Login

  @SmokeTesting
  Scenario: Home page default Login
    Given : User is on landing Page
    When : User Login into application with username "Roops" and password "1234"
    Then : Home page is populated
    And : Bank account details are displaying "True"


  Scenario: Home page default Login
    Given : User is on landing Page
    When : User Login into application with username "Ray " and password "4321"
    Then : Home page is populated
    And : Bank account details are not getting displaying "False"

