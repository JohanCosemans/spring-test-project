### Backend

Spring-boot based backend, Google Authentication and Swagger api documentation enabled

## Maven
### Running locally

`mvn appengine:run`

To use vist: http://localhost:8080/

### Deploying

`mvn appengine:deploy`

To use vist:  https://YOUR-PROJECT-ID.appspot.com

## Testing

`mvn verify`

As you add / modify the source code (`src/main/java/...`) it's very useful to add [unit testing](https://cloud.google.com/appengine/docs/java/tools/localunittesting)
to (`src/main/test/...`).  The following resources are quite useful:

* [Junit4](http://junit.org/junit4/)
* [Mockito](http://mockito.org/)
* [Truth](http://google.github.io/truth/)


For further information, consult the
[Java App Engine](https://developers.google.com/appengine/docs/java/overview) documentation.


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
