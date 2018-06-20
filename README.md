### Backend

Spring-boot based backend, Google Authentication and Swagger api documentation enabled

## Maven
### Running locally

`cd backend`

`mvn spring-boot:run`

To use vist: http://localhost:8080/

### API Documentation

Navigate to [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) to find the swagger documentation (generated automatically)


## Testing

`mvn verify`

As you add / modify the source code (`src/main/java/...`) it's very useful to add [unit testing](https://cloud.google.com/appengine/docs/java/tools/localunittesting)
to (`src/main/test/...`).  The following resources are quite useful:

* [Junit4](http://junit.org/junit4/)
* [Mockito](http://mockito.org/)
* [Truth](http://google.github.io/truth/)


