Feature: Test examples REST API

  Scenario: All employees have an ID
    Given a list of employees
    Then an id exists for each employee
    And and there is at least an employee named "Tiger Nixon"
