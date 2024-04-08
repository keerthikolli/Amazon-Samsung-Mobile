Test Amazon Web / Java-Cucumber-Selenium

This repository contains a sample project on Amazon website searching for Samsung Mobile with certain requirement.
Libraries that demonstrate how to use `selenium-cucumber-java`, a BDD (Behaviour-Driven Development) framework with Cucumber (v 3.0.0) and Java. 
The projects showcase automation script development and utilise various reporters such as Allure, HTML, and JSON. 
Additionally, it offers the ability to capture screenshots and generate error shots for failed test cases.

-- The Given application is production Amazon which is very Flaky and unstable, this volatile change is resulting in inconsistent behaviour of test failure even for same elements.

-- Actual scenario path itself is error, there is no separate mobile section available to perform Action.

-- Alternative path for selecting All—>Electronics and computers-->Phones and accessories--> Mobiles--> simfree--> the selection of filters was done in test
  but in Amazon price filter is not working , its a bug.


### Installation & Prerequisites

1. JDK 21 (Ensure that the Java class path is properly set)
2. Maven (Ensure that the .m2 class path is properly set)
3. IntelliJ IDE
4. Required Plugins:
   - Maven
   - Cucumber(4.8.1)
   - Selenium(4.19.1)
5. Browser driver (Defaulted to chrome)
6. Run through Cucumber runner file ( Alternatively add tag for scenario in FF and run through mavan command)

## Reporting

### Allure Report

To generate an Allure report, you can use one of the following commands:

- `mvn allure:serve`: This command generates the report in the temp folder and opens a web server with the results in your default browser. 


- `mvn allure:report`: This command generates the report in the `target/site/allure-maven/index.html` directory, allowing you to view it locally.
- Screenshot folder is added in ocal system for failed scenarios.
