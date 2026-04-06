 QA Automation CI/CD Project using Jenkins
 Project Title
Continuous Integration and Delivery with Jenkins for Automated Testing
________________________________________
 Project Description
This project demonstrates the implementation of a CI/CD pipeline using Jenkins to automate testing for a web application and API.
The pipeline automatically:
•	Clones code from GitHub
•	Builds the project using Maven
•	Executes Selenium UI tests
•	Runs Postman API tests using Newman
•	Generates test reports
________________________________________
 Tools & Technologies Used
•	Jenkins – CI/CD pipeline
•	Selenium WebDriver – UI Automation
•	TestNG – Test execution & reporting
•	Postman & Newman – API Testing
•	Maven – Build tool
•	GitHub – Version control
•	Java – Programming language
________________________________________
 Project Structure
Assignment/
 ├── JavaSeleniumProject/
 │   ├── src/test/java/pack/LogInTest.java
 │   ├── testng.xml
 │   └── pom.xml
 ├── ReqRes User Authentication API Tests.postman_collection.json
 └── Jenkinsfile
________________________________________
 Test Scenarios
 Selenium UI Tests
•	Valid Login Test
•	Invalid Login Test
•	Empty Field Test
 API Tests (Postman)
•	User Login API (https://reqres.in/api/login)
•	Valid and Invalid authentication scenarios
________________________________________
 Jenkins Pipeline Workflow
1.	Clone code from GitHub repository
2.	Navigate to Selenium project folder
3.	Build project using Maven
4.	Execute TestNG test cases
5.	Run Postman collection using Newman
6.	Generate and display test reports
________________________________________
 How to Run the Project
🔹 Prerequisites
•	Java (JDK 17)
•	Maven
•	Jenkins installed
•	Node.js (for Newman)
________________________________________
 Steps
1.	Clone repository:
git clone https://github.com/Subha89844/Assignment.git
2.	Navigate to project:
cd JavaSeleniumProject
3.	Run tests:
mvn clean test
4.	Run API tests:
newman run "ReqRes User Authentication API Tests.postman_collection.json"
________________________________________
Jenkins Execution
•	Jenkins Pipeline automatically triggers build
•	Executes Selenium and API tests
•	Displays results in Jenkins dashboard
________________________________________
Test Reports
•	TestNG Reports generated in:
target/surefire-reports/
•	Jenkins displays test results using JUnit plugin
________________________________________
 Key Features
•	End-to-end CI/CD pipeline
•	Automated UI + API testing
•	Headless browser execution
•	Integration with GitHub
•	Automated test reporting
________________________________________
 Conclusion
This project demonstrates how to integrate automation testing with CI/CD pipelines using Jenkins, enabling continuous testing and faster feedback for software quality.
________________________________________
 Author
Subhashree Rout

