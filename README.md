# QA Assignment – UI & API Testing

## Application Chosen

Used OrangeHRM for UI testing and JSONPlaceholder for API testing, as they are simple and suitable for demonstrating test scenarios.
URL - 

## Framework & Language

Java, Selenium WebDriver (UI), RestAssured (API), TestNG, Maven, and Page Object Model (POM).

## How to Run the Tests

1. Clone the repository:

   ```
   git clone <repo-url>
   ```

2. Run UI tests:

   ```
   cd ui-tests
   mvn clean test
   ```

3. Run API tests:

   ```
   cd api-tests
   mvn clean test
   ```

4. View reports:

   TestNG reports are generated in the `test-output/` folder

## Assumptions / Limitations

JSONPlaceholder is a mock API, so limited negative validation. 

## Notes

Covered both positive and negative scenarios with proper assertions. Maintained clean code structure and commits.
