Feature: Money exchange
  As a user of the currency exchange application
  I want to convert amounts between different currencies
  So that I can understand the value of one currency in terms of another

  Scenario Outline: Conversion between currencies
    Given the currency exchange service is available
    And the following exchange rates are available:
      | Base Currency | Target Currency | Rate |
      | USD           | EUR             | 0.5  |
    When the user converts <Amount> <Base Currency> to <Target Currency>
    Then the user should receive <Converted Amount> <Target Currency>
    Examples:
      | Base Currency | Target Currency | Amount | Converted Amount |
      | USD           | EUR             | 100    | 50               |
