Feature: Verify that appropriate visa result is displayed for different visa application scenarios

  @Smoke
  Scenario: Verify visa result for an Australian coming to the UK for Tourism
    Given User is on homepage
    When User clicks on reject cookies
    And User click on start now
    And User select nationality <"Australia">
    And User click on next step after selecting nationality
    And User select reason for visit <"Tourism">
    And User click on next step after reason for travel
    Then User should get visa result message <"You will not need a visa to come to the UK">

  @Smoke @Sanity
  Scenario: Verify visa result for a Chilean coming to the UK for work and plans on staying for longer than six months
    Given User is on homepage
    When User clicks on reject cookies
    And User click on start now
    And User select nationality <"Chile">
    And User click on next step after selecting nationality
    And User select reason for visit <"Work, academic visit or business">
    And User click on next step after reason for travel
    And User select length of stay <"longer than 6 months">
    And User click on next step after length of stay
    And User select job type <"Health and care professional">
    And User click on next step after job type
    Then User should get visa result <"You need a visa to work in health and care">

    @Sanity @Regression
    Scenario: Verify visa result for a Columbian national coming to the UK to join a partner for a longer stay
      Given User is on homepage
      When User clicks on reject cookies
      And User click on start now
      And User select nationality <"Colombia">
      And User click on next step after selecting nationality
      And User select reason for visit <"Join partner or family for a long stay">
      And User click on next step after reason for travel
      And User select immigration status <"yes">
      And User click on next step after immigration status
      Then User should get visa result for joining a partner <"You'll need a visa to join your family or partner in the UK">