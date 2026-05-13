# Selenium Automation Framework

## 📌 Project Overview
A robust, scalable, and maintainable automation framework developed using **Selenium WebDriver** and **Java**. This project follows the **Page Object Model (POM)** design pattern to ensure code reusability and ease of maintenance for web application testing.

---

## 🛠 Tech Stack
*   **Language:** Java
*   **Automation Tool:** Selenium WebDriver (4.x)
*   **Test Runner:** TestNG
*   **Build Tool:** Maven
*   **Design Pattern:** Page Object Model (POM)
*   **Reporting:** Extent Reports / TestNG Reports
*   **Dependency Management:** WebDriverManager

---

## 🏗 Framework Architecture
The framework is designed with a clear separation of concerns:
*   **`src/main/java`**: Contains Page Objects, Base Class setup, and utility functions (Excel readers, screenshot captures).
*   **`src/test/java`**: Contains functional test scripts organized by application modules.
*   **`src/test/resources`**: Stores test data (Excel/JSON) and `config.properties` for environment-specific variables.
*   **`testng.xml`**: Manages test execution suites and parallel execution settings.

---

## 🚀 Key Features
*   **Data-Driven Testing:** Integrated with Apache POI to fetch test data from external sheets.
*   **Wait Mechanism:** Implemented Explicit and Fluent Waits to handle asynchronous elements.
*   **Parallel Execution:** Optimized for speed using TestNG thread counts.
*   **Screenshots:** Automatic screenshot capture on test failure for easier debugging.
*   **Cross-Browser Testing:** Support for Chrome, Firefox, and Edge via configuration.

---

## 💻 How to Run the Tests
1. **Clone the repository:**
   ```bash
   git clone [https://github.com/pratham1696/Selenium-Automation-Framework.git](https://github.com/pratham1696/Selenium-Automation-Framework.git)

2.cd Selenium-Automation-Framework
3.mvn clean test


---

## 📧 Contact
**Prathamesh Dhakane**  
*Senior QA Consultant*  
[https://www.linkedin.com/in/prathamesh-dhakane-140763131/]
