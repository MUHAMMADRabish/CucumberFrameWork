Feature: Contact us form

  @Runs
  Scenario Outline: 
    Verify if user clicks on contact us link the form displays and confirm the message when user click register button after entering valid data.

    Given Already opened the protrainingtech.com
    When user clicks on the contact us link
    Then user able to see the contact us form
    When user enters value for First Name "<First Name>"
    And user enters value for Last Name"<Last Name>"
    And user enters value for Email "<Email>"
    And user enters value for Phone "<Phone>"
    And user clcks on Register button
    Then user should see th confirmatin message

    Examples: 
      | First Name | Last Name | Email                     | Phone      |
      | Nadeem     | Shahbaz   | Protrainingtech@gmail.com | 7031346790 |
