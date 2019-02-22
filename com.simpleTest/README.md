## simple-BDD-Test
##### Summary: a simple java code example to show you how cucumber executes java test scripts
---
### End-To-End Test
This Test respository was created to help in understanding below concepts:

Cucumber Gerkin keyword; Feature file; Step-definitions; Maven; run test as Junit test; 

---

### Get started

1. Set up the environment to execute test scripts:

	 (1)-Must have code editing tool like Eclipse or intellij; 
	 
	 (2)-download and install [JDK(Java Development Kit)](https://openjdk.java.net/) ;
	 
	 (3)-Install Cucumber Eclipse Plugin from Eclipse Marketplace menu;
	 
	 (4)-Install Maven plugin form Eclipse Marketplace menu;
	 
	 (5)-Create a New Maven Project in Eclipse;
	 
---	 

### Built With
⋅⋅* [Selenium Standalone Server](https://www.seleniumhq.org/download/)- Provides Webdriver APIs to run Tests on Browsers; 

⋅⋅* [Maven](https://mvnrepository.com/repos/central) - Dependency Management 

⋅⋅* [Junit](https://github.com/junit-team/junit4/wiki/Download-and-Install) - testing framework which uses annotations to identify methods that specify a test;

⋅⋅* Java - object-oriented programing language to write our automation test scripts;

### Structure of this simple Framework
1. Cuke(Test) Runner class: We will execute the feature files by running Cuke Runner Class and generate step definitions methods in the console. 

2. Step Definitions Class: we will paste the cucumber generated methods in Step definition class and customize these Java methods based on its behaviour, then run these methods as Junit test. Cucumber finds the Step Definition file with the help of Glue code in Cucumber Options which resides in Cuke Runner Class. 

3. Feature Files: defines application behavior using simple English text and Gerkin keyword [Given-When-Then-And](https://docs.cucumber.io/gherkin/reference/)

4. pom.xml File: we will manage/maintain all dependencies in pom.xml file provided by Maven. To add any dependencies/libraries in pom.xml file, just visit [Maven Center Repository](https://mvnrepository.com/) to search the dependency and copy it to pom.xml file. For example, we need to at least add dependencies for selenium, cucumber, junit. 




