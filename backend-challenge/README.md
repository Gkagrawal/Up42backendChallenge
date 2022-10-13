# Up42backendChallenge

project structure Info:
----com.up42.coding.challenge.webApi has all the endpoints(/features and /features/{featureId}/quicklook)
----com.up42.coding.challenge.services has all endpoints implementation logic
----com.up42.coding.challenge.repositories has data saving and retrieving logic
----other than that the project has Utils/Constants and Models(Pojos) folder.

Assumptions made during coding:
----Implemented this code challenge into java with a fresh new spring boot gradle project.
----Used the same source-data.json in this project so that there is no data discrepancy. 
----To store the required feature response data I have used the Json file (name -src/main/resources/static/persisited-faeture.json) instead of any database.
----Assumed that the source-data.json is static in nature.

How to run the Application:
----Extract the attached Zip file "backend-challenge.zip" in the file system
----Import the existing gradle spring boot project into your IDE(STS/IntelliJ) after providing the path of extracted project folder.
----Make sure all the project dependencies are resolved.
----As project is default configured for 8080 port , hence either make 8080 port empty before running the application or change the port in application.properties.
----Now Right click on the spring boot starter class "BackendChallengeApplication.java" and run as Spring boot application.
----Hit the below mentioned endpoints.

Endpoints Url:
----localhost:8080/features (will list down all the features with required attributes)
----localhost:8080/features/{featureId}/quicklook 

How to run the Junits:
---Goto the scr/test/java/com.up42.coding.challenge.services/FeaturesServiceTest.java and run the class as Junit Test.
---Junit class has 3 tests: getImagePositiveTestCase(Passing correct feature Id), getImageNegativeTestCase(Passing wrong feature Id), getImageNegativeTestCaseWithNull and getFeatures.