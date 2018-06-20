Project skeleton: Spring boot (API, backend) and separate front-end service on appengine standard
============================


* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Maven](https://maven.apache.org/download.cgi) (at least 3.5)
* [Google Cloud SDK](https://cloud.google.com/sdk/) (aka gcloud command line tool)

### Build project

mvn clean install -P<profile>

eg: mvn clean install -Ptest

### Backend

Spring-boot based backend, Google Authentication and Swagger api documentation enabled

Urls: 

#### Authentication

Navigate to:
[http://localhost/login](http://localhost/login)
to be redirected to Google authentication

Navigate to 
[http://localhost/logout](http://localhost/logout)
to sign out

To check whether a user is logged in already, or to get details from a user, 
navigate to [http://localhost/api/v1/user](http://localhost/api/v1/user)

```
{
    name: "Johan Cosemans",
    firstName: "Johan",
    lastName: "Cosemans",
    avatarUrl: "https://lh5.googleusercontent.com/-LnnyPfBCN5M/AAAAAAAAAAI/AAAAAAAAAEc/vTvS7mO5vr0/photo.jpg",
    email: "johan@gcompany.nl",
    roles: - [
    "ROLE_USER"
    ]
}
```

#### API Documentation

Navigate to [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) to find the swagger documentation (generated automatically)

### Deploy on appengine

- Front-end
cd frontend
mvn clean install -P<profile>
mvn appengine:deploy

- Back-end
cd frontend
mvn clean install -P<profile>
mvn appengine:deploy


