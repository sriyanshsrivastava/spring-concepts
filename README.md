
# 📘 Spring Concepts Playground  

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)  
[![Java](https://img.shields.io/badge/Java-17%2B-blue)]()  
[![Spring](https://img.shields.io/badge/Spring-Framework%20&%20Boot-brightgreen)]()  

This repository is a **hands-on lab** where I implement and practice different concepts of the **Spring Framework** and **Spring Boot**, each as a **standalone project**.  
It’s structured to follow tutorials and learning paths — every concept starts fresh as its own project folder.  

---

## 📂 Repository Structure  

```

spring-concepts/
│
├── spring-core-demo/        # Dependency Injection, IoC container, Bean scopes
├── spring-mvc-demo/         # Spring MVC basics (Controllers, Views, DispatcherServlet)
├── spring-boot-demo/        # Spring Boot starters, auto-configuration, CLI
├── spring-security-demo/    # Authentication, Authorization, Security filters
├── spring-data-jpa-demo/    # JPA Repositories, Entity mapping, Hibernate integration
│
├── .gitignore               # Comprehensive ignore rules for Java, IDEs, OS junk
├── LICENSE                  # MIT License
└── README.md                # You are here

````

Each subfolder is a **separate Maven/Gradle project** with its own `pom.xml` (or `build.gradle`), so you can open them independently in IntelliJ IDEA or Eclipse.  

---

## 🚀 How to Use  

### Clone the Repository
```bash
git clone https://github.com/<your-username>/spring-concepts.git
cd spring-concepts
````

### Open a Project in IntelliJ IDEA

* Go to **File → Open**
* Select the project folder you want (e.g. `spring-core-demo/pom.xml`)
* IntelliJ will import it as a standalone project

👉 You can work on one project at a time, or import all subprojects as modules in one workspace.

### Run a Project

For Maven:

```bash
mvn spring-boot:run
```

For Gradle:

```bash
./gradlew bootRun
```

---

## 📚 Projects Included

| Project                  | Description                                                                  |
| ------------------------ | ---------------------------------------------------------------------------- |
| **spring-core-demo**     | Core concepts: IoC, Dependency Injection, Bean lifecycle, ApplicationContext |
| **spring-mvc-demo**      | Spring MVC basics: DispatcherServlet, Controllers, Models, JSP/Thymeleaf     |
| **spring-boot-demo**     | Auto-configuration, starters, embedded Tomcat, REST APIs                     |
| **spring-security-demo** | Authentication & Authorization with Spring Security                          |
| **spring-data-jpa-demo** | JPA integration with Hibernate, repositories, CRUD operations                |

*(More projects will be added as I continue learning)*

---

## 🛠️ Tech Stack

* **Java 17+**
* **Spring Framework 6**
* **Spring Boot 3+**
* **Maven / Gradle**
* **IntelliJ IDEA** (recommended)

---

## 🤝 Contributing

This is primarily a **learning repo**, but suggestions, issues, and pull requests are welcome!

* Fork the repo
* Create a feature branch (`git checkout -b feature/your-feature`)
* Commit your changes
* Push to your fork
* Open a Pull Request

---

## 📜 License

This repository is licensed under the **MIT License**.
You’re free to use, copy, modify, and distribute the code with attribution.

See [LICENSE](LICENSE) for details.

---

## 🌟 Acknowledgements

* [Spring Framework Documentation](https://spring.io/projects/spring-framework)
* [Spring Boot Documentation](https://spring.io/projects/spring-boot)
* Various tutorials, courses, and official guides that inspired this repo

---

💡 *This repo will grow as I continue my Spring journey — each new concept will be added as a standalone project folder.*
