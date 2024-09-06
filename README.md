# f24-rest-api-demo
## Demo for a basic REST API with Java, SpringBoot, Maven.
- Clone the project (or download zip) and open it in IntelliJ.
- MAC OS users may need to change the permissions (chmod -R 777 path/to/project/folder in your terminal) for the project folder when they clone or download this repo.
- Make sure jdk versions match.
- Run the main method.
- On POSTMAN:
  * http://localhost:8080/hello (GET)
  * http://localhost:8080/greeting?name=jane (GET)
  * http://localhost:8080/students/all (GET)
  * http://localhost:8080/students/1 (GET)
  * http://localhost:8080/univ (GET)
  * http://localhost:8080/brew (GET)
  * http://localhost:8080/students/create (POST, with Student JSON object in the request body.)
  * http://localhost:8080/students/delete/1 (DELETE, if you have POSTED more than one student.)
