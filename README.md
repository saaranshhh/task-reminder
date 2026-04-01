Automated Task Reminder and Tracking
ApplicaƟon
Internship Project DocumentaƟon
1. IntroducƟon to the Project
The Automated Task Reminder and Tracking ApplicaƟon is a backend system developed using
Spring Boot. The purpose of this applicaƟon is to allow users to create, manage, and track tasks
while receiving reminders before deadlines.
The system stores task informaƟon in a database and automaƟcally manages reminders using
scheduling features provided by Spring Boot.
This project helps demonstrate the use of:
 Spring Boot framework
 REST API development
 Database interacƟon using Spring Data JPA
 Model-View-Controller architecture
 Task scheduling features
ObjecƟves of the Project
The main objecƟves of the project are:
 Create and manage tasks
 Store task informaƟon in a database
 Track task compleƟon status
 Send reminders before deadlines
 Organize applicaƟon logic using Spring Boot architecture
2. IntroducƟon to Spring Framework
The Spring Framework is one of the most popular frameworks used for developing enterpriselevel Java applicaƟons.
Spring provides a comprehensive infrastructure that helps developers build robust, scalable, and
maintainable applicaƟons.
It reduces the complexity of Java development by providing built-in soluƟons for many common
problems such as dependency management, database access, security, and web development.
Key Features of Spring Framework
1. Dependency InjecƟon (DI)
Dependency InjecƟon is a design paƩern used by Spring to manage object dependencies
automaƟcally. Instead of creaƟng objects manually, Spring creates and injects them where
required.
2. Inversion of Control (IoC)
In tradiƟonal programming, the developer controls object creaƟon. In Spring, the Spring
Container controls the creaƟon and lifecycle of objects.
3. Aspect-Oriented Programming (AOP)
AOP allows developers to separate cross-cuƫng concerns such as logging, security, and
transacƟons from the main business logic.
4. IntegraƟon Support
Spring integrates easily with various technologies such as:
 Hibernate
 JDBC
 REST APIs
 Microservices
 Cloud services
3. IntroducƟon to Spring Boot
Spring Boot is an extension of the Spring Framework that simplifies the process of building Java
applicaƟons.
Before Spring Boot, developers had to configure many files manually. Spring Boot eliminates this
complexity by providing auto configuraƟon and embedded servers.
This allows developers to build and run applicaƟons quickly without complicated setup.
Key Features of Spring Boot
1. Auto ConfiguraƟon
Spring Boot automaƟcally configures the applicaƟon based on the dependencies added in the
project.
For example, if Spring Web dependency is added, Spring Boot automaƟcally configures REST
controllers.
2. Embedded Server
Spring Boot applicaƟons include an embedded server such as:
 Tomcat
 JeƩy
 Undertow
This means the applicaƟon can run directly without deploying it separately on a server.
3. Standalone ApplicaƟon
Spring Boot applicaƟons can run independently using a simple main method.
4. Dependency Management
Spring Boot uses Maven or Gradle to manage project dependencies automaƟcally.
4. Architecture of the ApplicaƟon
The Automated Task Reminder and Tracking ApplicaƟon follows a layered architecture
commonly used in Spring Boot applicaƟons.
The main layers include:
Controller Layer
Handles incoming HTTP requests from users and returns responses.
Service Layer
Contains business logic and applicaƟon rules.
Repository Layer
Responsible for communicaƟon with the database.
Model Layer
Represents the structure of the data stored in the database.
This separaƟon improves the maintainability and scalability of the applicaƟon.
5. Steps to Create the Spring Boot Project
The following steps were followed to create the project.
Step 1 – Open IDE
The project was created using IntelliJ IDEA.
Step 2 – Create New Project
Select Spring IniƟalizr while creaƟng the new project.
Step 3 – Configure Project Details
Fill the following informaƟon:
Group:
com.example
ArƟfact:
taskreminder
Project Name:
Automated Task Reminder and Tracking ApplicaƟon
Language:
Java
Build Tool:
Maven
Step 4 – Add Dependencies
The following dependencies were added to the project:
 Spring Web
 Spring Data JPA
 MySQL Driver
 Lombok
Step 5 – Generate Project
AŌer adding dependencies, the project structure is generated automaƟcally.
6. Spring Boot ApplicaƟon Entry Point
Every Spring Boot applicaƟon starts from a main class containing the @SpringBootApplicaƟon
annotaƟon.
Code Example
@SpringBootApplicaƟon
public class TaskReminderApplicaƟon {
 public staƟc void main(String[] args) {
 SpringApplicaƟon.run(TaskReminderApplicaƟon.class, args);
 }
}
ExplanaƟon
@SpringBootApplicaƟon
This annotaƟon combines three annotaƟons:
 @ConfiguraƟon
 @EnableAutoConfiguraƟon
 @ComponentScan
It enables Spring Boot features and starts the applicaƟon.
7. Model Class in the Project
The Model class represents the structure of the data stored in the database.
In the Automated Task Reminder and Tracking ApplicaƟon, the model class is TaskModel.
Each object of the model represents a task stored in the database.
Important Fields in the Model
id
Unique idenƟfier for each task.
Ɵtle
Represents the name of the task.
descripƟon
Provides detailed informaƟon about the task.
dueDate
Represents the deadline of the task.
status
Indicates whether the task is pending or completed.
Model Class Code Example
package com.example.taskreminder.model;
import jakarta.persistence.EnƟty;
import jakarta.persistence.Id;
import java.Ɵme.LocalDateTime;
@EnƟty
public class TaskModel {
 @Id
 private int id;
 private String Ɵtle;
 private String descripƟon;
 private LocalDateTime dueDate;
 private String status;
}
ExplanaƟon
@EnƟty
Marks the class as a database enƟty.
@Id
Defines the primary key of the table.
LocalDateTime
Used to store date and Ɵme informaƟon for task deadlines.
8. Variables and Data Types Used
Variables are used to store data in a program. Java provides several data types.
Common Data Types Used in the Project
Data Type DescripƟon
int Used to store numeric values
String Used to store text
boolean Used to store true or false values
LocalDateTime Used to store date and Ɵme
Example:
int id = 1;
String Ɵtle = "Complete Assignment";
boolean completed = false;
9. Java CollecƟon Framework
The Java CollecƟon Framework (JCF) provides classes and interfaces used to store and
manipulate groups of objects.
CollecƟons are used in applicaƟons to manage large amounts of data efficiently.
Advantages of CollecƟon Framework
 Dynamic memory allocaƟon
 Built-in data structures
 Efficient searching and sorƟng
 Reusable code
Main Interfaces in Java CollecƟon Framework
List Interface
A List stores ordered elements and allows duplicates.
Examples:
 ArrayList
 LinkedList
Example:
List<String> tasks = new ArrayList<>();
tasks.add("Submit Assignment");
tasks.add("AƩend MeeƟng");
Set Interface
A Set stores unique elements and does not allow duplicates.
Examples:
 HashSet
 TreeSet
Example:
Set<Integer> taskIds = new HashSet<>();
taskIds.add(1);
taskIds.add(2);
Map Interface
A Map stores data in key-value pairs.
Examples:
 HashMap
 TreeMap
Example:
Map<Integer, String> taskMap = new HashMap<>();
taskMap.put(1, "Complete report");
taskMap.put(2, "Prepare presentaƟon");
10. Spring Boot AnnotaƟons Used in the Project
AnnotaƟons are special markers used to provide metadata to the compiler and Spring
framework.
They help simplify configuraƟon and reduce the need for XML configuraƟon files.
Important AnnotaƟons Used
@SpringBootApplicaƟon
Used to start the Spring Boot applicaƟon.
@RestController
Indicates that the class is a REST controller used to handle HTTP requests.
@RequestMapping
Maps web requests to specific controller methods.
@GetMapping
Handles HTTP GET requests.
@PostMapping
Handles HTTP POST requests.
@Autowired
AutomaƟcally injects dependencies into classes.
@Service
Marks a class as a service component containing business logic.
@Repository
Indicates that the class interacts with the database.
11. Conclusion
The Automated Task Reminder and Tracking ApplicaƟon demonstrates the use of the Spring
Boot framework for developing backend applicaƟons.
Through this project, the following concepts were implemented:
 Spring Framework fundamentals
 Spring Boot architecture
 REST API development
 Database interacƟon using Spring Data JPA
 Model class design
 Java CollecƟon Framework
 Spring Boot annotaƟons
This project provides a strong foundaƟon for developing scalable backend systems using Java
and Spring Boot.
12. Spring Boot AnnotaƟons
Spring Boot provides a large number of annotaƟons that help simplify the development of Java
applicaƟons. AnnotaƟons are special markers used to provide metadata to the Spring
Framework so that it can automaƟcally configure the applicaƟon.
Using annotaƟons reduces the need for complex XML configuraƟon files and allows developers
to build applicaƟons quickly and efficiently.
In the Automated Task Reminder and Tracking ApplicaƟon, several Spring Boot annotaƟons are
used to manage applicaƟon components such as controllers, services, repositories, and
configuraƟon classes.
Below are some important Spring Boot annotaƟons used in the project.
@SpringBootApplicaƟon
The @SpringBootApplicaƟon annotaƟon is the main annotaƟon used to start a Spring Boot
applicaƟon. It is placed on the main class of the project.
This annotaƟon is actually a combinaƟon of three annotaƟons:
 @ConfiguraƟon
 @EnableAutoConfiguraƟon
 @ComponentScan
Code Example
@SpringBootApplicaƟon
public class TaskReminderApplicaƟon {
 public staƟc void main(String[] args) {
 SpringApplicaƟon.run(TaskReminderApplicaƟon.class, args);
 }
}
ExplanaƟon
 @ConfiguraƟon
Indicates that the class can be used by Spring as a source of bean definiƟons.
 @EnableAutoConfiguraƟon
AutomaƟcally configures the applicaƟon based on the dependencies added in the
project.
 @ComponentScan
Scans the project packages to detect components such as controllers, services, and
repositories.
@Component
The @Component annotaƟon marks a class as a Spring-managed component. When Spring
starts the applicaƟon, it automaƟcally detects this class and creates an object of it.
Example
@Component
public class TaskUƟlity {
}
ExplanaƟon
Spring will automaƟcally create and manage the object of this class inside the Spring Container.
@Service
The @Service annotaƟon is used to define service layer classes. These classes contain the
business logic of the applicaƟon.
Example
@Service
public class TaskService {
}
ExplanaƟon
The service layer processes data, applies rules, and communicates with the repository layer.
@Repository
The @Repository annotaƟon marks classes that interact with the database layer.
Repository classes perform database operaƟons such as:
 Saving data
 Fetching data
 UpdaƟng data
 DeleƟng data
Example
@Repository
public interface TaskRepository extends JpaRepository<TaskModel, Integer> {
}
ExplanaƟon
Spring Data JPA automaƟcally provides built-in methods for database operaƟons.
@Autowired
The @Autowired annotaƟon is used for dependency injecƟon. It allows Spring to automaƟcally
inject objects where they are required.
Example
@Autowired
private TaskService taskService;
ExplanaƟon
Instead of creaƟng objects manually using the new keyword, Spring automaƟcally provides the
required object.
@ConfiguraƟon
The @ConfiguraƟon annotaƟon indicates that the class contains configuraƟon methods for the
applicaƟon.
Example
@ConfiguraƟon
public class AppConfig {
}
ExplanaƟon
ConfiguraƟon classes define beans and applicaƟon seƫngs.
@Bean
The @Bean annotaƟon is used to define objects that should be managed by the Spring
container.
Example
@Bean
public TaskService taskService() {
 return new TaskService();
}
ExplanaƟon
Spring will create and manage the lifecycle of this object.
13. REST API in Spring Boot
REST stands for RepresentaƟonal State Transfer. It is an architectural style used for building
web services that allow communicaƟon between different applicaƟons over HTTP.
In the Automated Task Reminder and Tracking ApplicaƟon, REST APIs are used to perform
operaƟons such as:
 CreaƟng tasks
 UpdaƟng tasks
 Retrieving tasks
 DeleƟng tasks
 Tracking task status
Spring Boot provides several annotaƟons that simplify the creaƟon of REST APIs.
@RestController
The @RestController annotaƟon is used to create REST API controllers.
It combines two annotaƟons:
 @Controller
 @ResponseBody
Example
@RestController
public class TaskController {
}
ExplanaƟon
This annotaƟon tells Spring that the class will handle HTTP requests and return responses in
JSON format.
@RequestMapping
The @RequestMapping annotaƟon maps HTTP requests to specific controller classes or
methods.
Example
@RequestMapping("/tasks")
ExplanaƟon
This defines the base URL for all task-related APIs.
Example endpoints:
/tasks/create
/tasks/update
/tasks/delete
@GetMapping
The @GetMapping annotaƟon is used to retrieve data from the server.
Example
@GetMapping("/tasks")
public List<TaskModel> getAllTasks() {
 return taskService.getAllTasks();
}
ExplanaƟon
This method retrieves all tasks stored in the database.
@PostMapping
The @PostMapping annotaƟon is used to create new data in the database.
Example
@PostMapping("/tasks")
public TaskModel createTask(@RequestBody TaskModel task) {
 return taskService.saveTask(task);
}
ExplanaƟon
 Receives task data from the client.
 Saves the task in the database.
@PutMapping
The @PutMapping annotaƟon is used to update exisƟng records.
Example
@PutMapping("/tasks/{id}")
public TaskModel updateTask(@PathVariable int id, @RequestBody TaskModel task) {
 return taskService.updateTask(id, task);
}
ExplanaƟon
Updates the task with the specified ID.
@DeleteMapping
The @DeleteMapping annotaƟon is used to delete data from the database.
Example
@DeleteMapping("/tasks/{id}")
public String deleteTask(@PathVariable int id) {
 taskService.deleteTask(id);
 return "Task deleted successfully";
}
ExplanaƟon
Deletes the task with the given ID from the database.
@RequestBody
The @RequestBody annotaƟon is used to bind HTTP request data to a Java object.
Example
@PostMapping("/tasks")
public TaskModel createTask(@RequestBody TaskModel task) {
}
ExplanaƟon
The JSON request body is automaƟcally converted into a Java object.
@PathVariable
The @PathVariable annotaƟon extracts values from the URL.
Example
@GetMapping("/tasks/{id}")
public TaskModel getTask(@PathVariable int id) {
}
ExplanaƟon
The ID from the URL is passed to the method.
Example request:
GET /tasks/1
14. Frontend Development
In this project, a simple frontend is developed using HTML, CSS, and Thymeleaf.
궸궹궺궻 Technologies Used
 HTML → Structure of pages
 CSS → Styling and UI design
 Thymeleaf → Dynamic data rendering
굽굾굿궀 Pages Created
1. Login Page (login.html)
 Allows user to enter email and password
 Redirects to dashboard
2. Register Page (register.html)
 Allows user to create account
 Takes basic user details
3. Dashboard Page (dashboard.html)
 Displays all tasks
 Shows task status and due dates
虞號虠虡虢 CSS Styling
A separate CSS file is used:
src/main/resources/staƟc/css/style.css
Features of CSS:
 Centered login/register form
 Modern UI with spacing and colors
 Styled buƩons and inputs
 Responsive layout
꼏꼐 ConnecƟng CSS
CSS is linked using:
<link rel="stylesheet" href="/css/style.css">
15. Task Reminder Scheduler
The applicaƟon includes an automaƟc reminder system using Spring Boot Scheduler.
궸궹궺궻 Scheduler Purpose
 Runs automaƟcally every 1 minute
 Checks all tasks
 Prints reminder if task is overdue
궸궹궺궻 Code Concept
@Scheduled(fixedRate = 60000)
public void checkTasks() {
 List<TaskModel> tasks = taskManager.getTasks();
 for (TaskModel task : tasks) {
 if (task.getStatus() != null &&
 task.getStatus().equalsIgnoreCase("pending") &&
 task.getDueDate().isBefore(LocalDateTime.now())) {
 System.out.println("Reminder: Task is overdue!");
 }
 }
}
궸궹궺궻 AnnotaƟon Used
@EnableScheduling
踰踱踲踳 Enables scheduling in Spring Boot
16. ApplicaƟon Flow
踰踱踲踳 Step-by-step working of your project:
1. User opens applicaƟon → /login
2. User logs in → redirected to dashboard
3. Dashboard requests data from controller
4. Controller calls Service layer
5. Service calls Repository
6. Repository fetches data from database
7. Data is sent back to frontend
8. Scheduler runs in background
9. If task overdue → reminder printed
17. Database IntegraƟon
The project uses MySQL database.
궸궹궺궻 ConfiguraƟon (applicaƟon.properƟes)
spring.datasource.url=jdbc:mysql://localhost:3306/taskdb
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
궸궹궺궻 Table Structure
Field Type
id int
Ɵtle varchar
descripƟon varchar
dueDate dateƟme
status varchar
18. GitHub IntegraƟon
The project is uploaded to GitHub using Git commands.
궸궹궺궻 Steps Followed
git init
git add .
git commit -m "IniƟal commit"
git remote add origin <repo-link>
git pull origin main --allow-unrelated-histories
git push -u origin main
궸궹궺궻 License Used
MIT License is added to allow open usage of the project.
19. Challenges Faced
During development, the following challenges were faced:
 Git merge conflict issues
 Vim editor blocking commit process
 CSS not loading due to wrong staƟc path
 Database column mismatch (status not found)
 NullPointerExcepƟon in scheduler
궸궹궺궻 SoluƟons
 Used Notepad instead of Vim
 Fixed staƟc folder structure
 Added status column in database
 Added null check in scheduler 
