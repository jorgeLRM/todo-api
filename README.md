# Todo API

### Introduction
Todo API is a Rest API that manages tasks.

### Todo API Features
* Create a new task
* List all tasks
* Find all by status
* Mark a task as finished
* Delete a task

### Installation Guide
* Clone this repository [here](https://github.com/jorgeLRM/todo-api.git).
* cd todo-api
* ./mvnw package
* java -jar target/*.jar

### Usage
You can then access todo-api by swagger platform here: http://localhost:8080/swagger-ui/

### API Endpoints
| HTTP Verbs | Endpoints | Action |
| --- | --- | --- |
| POST | /tasks | Create a new task |
| GET | /tasks | Find all tasks |
| GET | /tasks/status/{status} | Find all by status |
| PATCH | /tasks/mark_as_finished/{id} | Mark a task as finished |
| DELETE | /tasks/{id} | Delete a task by id |

### Technologies Used
* [Spring boot](https://spring.io/projects/spring-boot)
* [MySQL](https://www.mysql.com/)
* [Swagger](https://swagger.io/)
* [Hibernate](https://hibernate.org/)

