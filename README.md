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

## Lab-12: Spring and REST 
### Setup
Increasing mor dependencies 
```aidl
dependencies {
	compile 'org.springframework.boot:spring-boot-starter-data-jpa'
	implementation('org.springframework.boot:spring-boot-starter-thymeleaf')
	implementation('org.springframework.boot:spring-boot-starter-web')
	runtimeOnly('org.postgresql:postgresql')
	testImplementation('org.springframework.boot:spring-boot-starter-test')
}
```

### Description
By using this app, U can doing:
1- Add your Album throw the "/addAlbum" route, so that it can be saved in a database.
2- After adding the album U will redirect to the Albums page which include all the albums in ur DB.A user should be able to see information about all the albums on the site.
3- U can use the header for every page to deliver between pages.

### Running
You can run the app from the class: [SongrApplication.java](src/main/java/com/example/songr/SongrApplication.java) main method, then open the browser and type `http://localhost:8080/`