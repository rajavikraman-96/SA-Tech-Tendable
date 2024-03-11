# TestNg Integerated with Page Object Model (POM)
This repository contains a Page Object Model (POM) framework implemented in Java for automated testing of Tendable Application. The framework is designed to improve code maintainability, readability, and reusability by organizing test code into separate page classes and utilizing TestNG for test execution.

# Features:
Page Object Model (POM): Each web page is represented as a separate class, encapsulating its elements and functionality. This enhances code organization and readability.

TestNG Integration: TestNG is utilized for test execution, providing features like annotations for setup and teardown methods.

Reusable Base Class: A base class is provided to store common functionalities.

# Structure:
src/main/java/com/tendable/base: Contains the base class with common functionalities and configurations.

src/main/java/com/tendable/pom: Contains individual page classes representing different pages of the web application.

src/test/java/com/runner: Contains test classes with test methods using TestNG annotations for execution.

# Usage:
# 1.Clone the repository:
git clone https://github.com/rajavikraman-96/SA-Tech-Tendable.git

# 2
Import the project into your preferred Java IDE.

# 3
Configure dependencies and ensure TestNG is installed.

# 4
Run the TendableRunner class for execution.

# Dependencies:
 # * IntelliJ / Eclipse (IDE)
 # * Java Development Kit (JDK)
 # * TestNG
 # * Selenium 


