Feature: Test End to End flow of API Employee Functionality

  Scenario: validate HTTP post Request
    Given Get RequestSpecification Object to hit HTTP "POST" Request by passing basepath as "/employees"
    And user add contentType Header and Request body
    When user hit HTTP POST Request
    Then validate status code as 201
    And validate Status line a "HTTP/1.1 201 Created"
    And validate ContentType Header as "application/json; charset=utf-8"
    And capture id from responsebody

  Scenario: validate HTTP GET Request
    Given Get RequestSpecification Object to hit HTTP "GET" Request by passing basepath as "/employees"
    When user hit HTTP GET Request by passing id
    Then validate status code as 200
    And validate Status line a "HTTP/1.1 200 OK"
    And validate ContentType Header as "application/json; charset=utf-8"

  Scenario: validate HTTP DELETE Request
    Given Get RequestSpecification Object to hit HTTP "DELETE" Request by passing basepath as "/employees"
    When user hit HTTP GET Request by passing id
    Then validate status code as 200
    And validate Status line a "HTTP/1.1 200 OK"
    And validate ContentType Header as "application/json; charset=utf-8"

  Scenario: validate HTTP GET Request
    Given Get RequestSpecification Object to hit HTTP "GET" Request by passing basepath as "/employees"
    When user hit HTTP GET Request by passing id
    Then validate status code as 200
    And validate Status line a "HTTP/1.1 200 OK"
