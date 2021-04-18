# songr
## Lab-11: Spring for Full-Stack Web Apps 
### Setup
Use the Spring Initializr to create a new application with artifact songr with Web and Thymeleaf (and optionally Devtools) dependencies. 

### Feature Tasks
1- I was insuring first from running the app
2- U can go throw the route '/hello' and see this sentence: hello world
3- '/capitalize' route will capitalize any letter after '/capitalize/'.
4- '/' route will produce the root page (splash page)
5- '/albums' route it shows three album instances that I made before by using AlbumModel class

### Testing
[SongrApplicationTests.java](src/test/java/com/example/songr/SongrApplicationTests.java)

### Project Structure

         └── songr
             ├── AlbumController.java
             ├── AlbumModel.java
             ├── GeneralController.java
             └── SongrApplication.java

    └── resources
     ├── application.properties
     ├── static
        ├── albumsPageStyle.css
        └── splashPageStyle.css
     └── templates
         ├── albumsPage.html
         ├── helloTemplate.html
         └── splashPage.html
    └── test
     └── SongrApplicationTests.java