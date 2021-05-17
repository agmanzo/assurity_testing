The repository contains a project with a java class (TestApi_Gradle/src/main/java/GetApi.java) that calls upon an API (API = https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false).

Included in the project is a test class which will test the following UAT:
1. Name = "Carbon credits"
2. CanRelist = true
3. The Promotions element with Name = "Gallery" has a Description that contains the text "2x larger image" 


To run the test, follow the following steps:
1. Open the project TestApi_Gradle (Intellij IDEA recommended)
2. Open class TestApi_Gradle/src/test/java/TestGetApi.java
3. Run the test class
