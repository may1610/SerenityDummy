Feature: Upload a file

  Scenario: Upload a file
    Given I am on upload page
    When I select a file and upload
    Then I get link download of this file below the message "Done! Your file is available at:"
