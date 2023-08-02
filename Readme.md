# INDEX

- [PROJECT DESCRIPTION](#project-description)
- [TEST APPROACH](#test-approach)
    - [TEST LEVELS](#test-levels)
        - [UNIT TESTING](#unit-testing)
        - [INTEGRATION TESTING](#integration-testing)
        - [SYSTEM TESTING](#system-testing)
- [TEST MANAGEMENT](#test-management)
- [AGILE METRICS](#agile-metrics)
- [DEFECT MANAGEMENT](#defect-management)



# PROJECT DESCRIPTION

Tax Calculator is a user-friendly and efficient web-based application designed to help individuals calculate their income tax liability accurately and easily. The platform aims to simplify the process of calculating taxes by providing a user-friendly interface that enables users to input their financial data and receive instant tax calculations based on the prevailing tax laws and regulations.


# TEST APPROACH

We intend to assure extensive testing of the Tax Calculator by using the **Attribute, Component, and Capability** (ACC) testing strategy. This method allows us to concentrate on important attributes, components, and capabilities, ensuring that the Tax Calculator is secure, compliant, auditable, accessible to all users, and responsive across several devices and browsers. The ACC technique will assist us in identifying and addressing any difficulties early in the development process, allowing us to provide our users with a high-quality, user-friendly, and dependable Tax Calculator.

> Note: <br />
> **Secure** and **Auditable** attributes are not included because the MVP (minimum viable product) at this level did not require a login feature to maintain security and does not have any records to contemplate an audit.


- Compliance: Focus in testing any expected results or acceptance criteria.
- Accessible: Focus in testing the application from the perspective of a person with different abilities
- Responsive: Focus in testing the application in different browsers and screen dimensions

## TEST LEVELS


### Unit testing

[UI Component Test Suit](https://techdojob2.atlassian.net/projects/QTC?selectedItem=com.atlassian.plugins.atlassian-connect-plugin:com.kanoah.test-manager__main-project-page#!/v2/testCases?projectId=10003)

Individual software units or components are tested separately during unit testing. Verifying that each unit performs as intended is the aim.
For identifying and repairing errors early in the development cycle, unit testing is quite beneficial. In the tax calculator, four units are regarded as MVP. 
the Tax Summary report, a button, and an error message.

>Note:<br/>
> In regards Compliance, Auditable, Accessible, Responsive focused while testing
> - Input field: 'Income' has been placed as a placeholder. While doing testing, responsive and accessible qualities were taken into account.
> - Button: Calculate Tax label has been added. When testing, responsive and accessible qualities were taken into consideration simultaneously.
> - Tax Summary report: Fields for "Total tax" and "Tax Bracket" have been added. When testing, responsive and accessible qualities were taken into consideration simultaneously.
> - Error message: 'An error occurred while calculating tax.' There is now a mandatory error message.  When testing, responsive and accessible qualities were taken into consideration simultaneously.


### Integration testing
[Integration Test Suit ](https://techdojob2.atlassian.net/projects/QTC?selectedItem=com.atlassian.plugins.atlassian-connect-plugin:com.kanoah.test-manager__main-project-page#!/v2/testCases?projectId=10003)


API testing on the tax calculator involves evaluating the functionality, performance, and security of the application programming interfaces. 
It ensures accurate tax calculations, proper handling of input parameters, and reliable responses. 
API testing validates data retrieval and integration, ensuring the tax calculator works seamlessly with other systems.
>Note:<br/>
The major goals of this sprint are to accurately calculate the tax when the test is running, find the correct tax bracket, and retrieve the correct tax bracket.



### System testing


[System Test Suit](https://techdojob2.atlassian.net/projects/QTC?selectedItem=com.atlassian.plugins.atlassian-connect-plugin:com.kanoah.test-manager__main-project-page#!/v2/testCases?projectId=10003)

When conducting system testing for the Tax Calculator that you built, several factors and aspects need to be considered to ensure its accuracy, reliability, and compliance with requirements. 
Here are some key considerations for system testing of the Tax Calculator:

---

**Functional Testing**
Verify that the Tax Calculator correctly calculates taxes based on the provided inputs, including income, deductions, credits, and tax rules.
Test different scenarios and edge cases to ensure accurate results in various situations.
Check if the Tax Calculator handles different tax types (e.g., income tax, sales tax) appropriately.

---
**Integration Testing:**
Test the integration of different modules or components within the Tax Calculator to ensure seamless communication and data flow.
Verify that all components work together as expected to provide accurate tax calculations.

---
**Input Validation:**
Test the Tax Calculator with valid inputs to ensure it accepts correct data without errors.
Test with invalid inputs and verify that appropriate error messages are displayed.

---
**Performance Testing:**
Assess the performance of the Tax Calculator under different load conditions to ensure it responds efficiently to user inputs.
Check for any performance bottlenecks and optimize the system as needed.

---
**Compatibility Testing:**
Test the Tax Calculator on different browsers, operating systems, and devices to ensure cross-platform compatibility.
Verify that the user interface is responsive and usable on various screen sizes.

---
**Usability Testing:**
Assess the user interface and user experience to ensure the Tax Calculator is user-friendly and intuitive.
Gather feedback from real users to identify areas for improvement.

---
**Error Handling:**
Validate that the Tax Calculator gracefully handles errors and exceptions, providing clear and meaningful error messages to users.

___

**Regression Testing:**
Perform regression testing after making updates or modifications to the Tax Calculator to ensure new changes do not introduce new issues.

---


### Acceptance testing

The team demonstrated the Tax Calculator at the sprint review, using it as an acceptance testing step. 
The main goal of this review was to highlight the Tax Calculator's functionality and show that it complies with the acceptance standards and business objectives established for the sprint.

The primary components of the Tax Calculator, including the button for tax computation, the input field for adding income, and the summary report component showing the computed result, were presented by the team during the sprint review. 
To highlight the Tax Calculator's accuracy, the team presented a variety of situations, such as those with diverse income levels.

Stakeholders actively engaged in the evaluation and offered insightful input on the functionality, user interface, and overall user experience of the Tax Calculator.
The problems or issues brought up during the review were documented and given priority for fixing in upcoming sprints or development cycles.







## Test Types

### Black Box

**Functional Testing :**


In the Tax Calculator, primarily focuses on verifying that the software functions as intended, according to its specifications or requirements.


**Boundary Value Analysis:**
![Upper Boundary Value testing.png](Asserts%2FUpper%20Boundary%20Value%20testing.png)

Test the application's behavior at the input range's edges using boundary values. 
To make sure the Tax Calculator calculates taxes correctly, test it with entries that are just below and over the lower and higher income thresholds.

**Equivalence Partitioning:**

Divide the input space into equivalent classes using equivalence partitioning, then test representative inputs from each class.
To verify accurate tax estimates, use the Tax Calculator with a variety of income numbers inside each partition.



#### Non-functional
Performance Testing: Evaluating the speed and responsiveness of the tax calculator under different user loads to ensure quick and efficient tax calculations.

Security Testing: Verifying that user data is handled securely, with proper encryption and access controls, safeguarding sensitive financial information.

Usability Testing: Assessing the user interface for ease of use, clear navigation, and overall user-friendliness to ensure a positive experience for taxpayers.

Compatibility Testing: Checking that the tax calculator functions correctly on various devices, browsers, and platforms to accommodate different user preferences.

Reliability Testing: Ensuring the tax calculator consistently provides accurate results and remains stable even during prolonged periods of usage, preventing disruptions.


### White Box

**Code Coverage Analysis:** 

Ensure that all sections of the tax calculator's code have been executed and tested. 
This includes statement coverage, branch coverage, and path coverage to identify untested or dead code.



**Branch Testing:** 

All decision points in the code are tested to ensure that both true and false branches are executed and verified for accuracy.


# TEST MANAGEMENT

## JIRA & Zephyr scale

## Test Plans

### Sprint 1

- **Date -** May 22nd, 2023 - June 5th, 2023 

- **Sprint goal -**  Calculate Income Tax

We were able to focus on UI testing throughout this sprint. We may generally be divided into 4 categories. field for entering income, calculate button, summary report, and message at the end.


![Test plan Sprint 1](/Asserts/Slide2.JPG)

![input field.png](Asserts%2Finput%20field.png)
![Calculate Button.png](Asserts%2FCalculate%20Button.png)
![Summary Report.png](Asserts%2FSummary%20Report.png)
![message.png](Asserts%2Fmessage.png)


### Sprint 2

- **Date -** June 5th, 2023 - June 19th, 2023

- **Sprint goal -** do all the component testing, do all the API testing, manage time properly this time.
we were able to focus on this sprint validate functionality and behaviour of the API, Security measures, Identify the defect vulnerabilities.


![Test plan Sprint 1](/Asserts/Slide3.JPG)

### Sprint 3

- **Date -** June 19th, 2023 - July 3rd, 2023
- **Sprint goal** - Automate the UI testing using Selenium Finish testing on Tax Calculator


![Test plan Sprint 1](/Asserts/Slide4.JPG)

#### Test Artifacts

Test suits
: 

- [UI Component Test Suit](https://techdojob2.atlassian.net/projects/QTC?selectedItem=com.atlassian.plugins.atlassian-connect-plugin:com.kanoah.test-manager__main-project-page#!/v2/testCases?projectId=10003)
- [API Test Suit](https://techdojob2.atlassian.net/projects/QTC?selectedItem=com.atlassian.plugins.atlassian-connect-plugin:com.kanoah.test-manager__main-project-page#!/v2/testCases?projectId=10003)
- [System Test Suit](https://techdojob2.atlassian.net/projects/QTC?selectedItem=com.atlassian.plugins.atlassian-connect-plugin:com.kanoah.test-manager__main-project-page#!/v2/testCases?projectId=10003)

Test analysis and design
: 

- [**Income Tax Calculation-UI**-Test analysis and design](https://docs.google.com/document/d/1RmNcYZimInADYbaS5WCcUtNw1NeDR47olZXLoImyVE8/edit)
- [**Income Tax Calculation-API**-Test analysis and design](https://docs.google.com/document/d/1RmNcYZimInADYbaS5WCcUtNw1NeDR47olZXLoImyVE8/edit)
- [**Income Tax Calculation-Integration**-Test analysis and design](https://docs.google.com/document/d/1RmNcYZimInADYbaS5WCcUtNw1NeDR47olZXLoImyVE8/edit)

# AGILE METRICS

![Burndownchart](/Asserts/IH_Dynamic_Status_Update_2023-07-24_21_29.png)
![Burndownchart](/Asserts/IH_Dynamic_Status_Update_2023-07-24_21_30.png)

# DEFECT MANAGEMENT

Defect management for the tax calculator involves a structured process to identify, track, prioritize, and rectify any issues or anomalies discovered during development, testing, and usage. 
Here's how defect management would work for the tax calculator:


Defect Tracking: Systematically identifying and documenting defects, including their descriptions, replication steps, and impact, using a tracking tool or system.

Prioritization: Assessing defects based on their severity and potential impact on tax calculations, ensuring critical issues are addressed promptly.

Assigning and Resolving: Assigning defects to the development team, who investigate, fix, and validate them, ensuring accurate tax calculations and compliance.

Revalidation: Rigorous retesting of the tax calculator after defect resolution to confirm that fixes are successful and do not introduce new issues.

Process Improvement: Analyzing trends in defects to identify recurring issues, enhancing development processes, testing strategies, and user feedback loops for continuous improvement.
![Defect Report](/Asserts/Defect%20reporting.png)

# TEST EXIT REPORT

