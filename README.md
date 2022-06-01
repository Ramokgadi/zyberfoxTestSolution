# zyberfoxTestSolution
This is a maven project, please run mvn clean install  to install the plugins and build project, 
then you can run the build jar file or run spring-booot:run command to deploy the project locally

I would suggest download IntelliJ IDE to run the project then
  - install  at least Java 1.8 to run the project
  - install Maven or you can use the pre packaged one that comes with intelliJ
  - open new project then select the pom.xml then open it as project to load everything
  - then you can use it pre-package maven  plugin to build and install the app
  - The project is running on localhost:8080

 screeshots of how you can build and run the porject using prepackaged maven that came with IntelliJ
![Screenshot from 2022-06-01 21-29-59](https://user-images.githubusercontent.com/105210477/171491719-f8136217-8061-4470-9e63-dbc663cddb3b.png)

![Screenshot from 2022-06-01 21-30-15](https://user-images.githubusercontent.com/105210477/171491796-6b6c0f9b-1f48-4926-a49c-a2dc7dffc1bc.png)

default Data:
Employee Data
[
    {
        "id": 1,
        "first_name": "Amy",
        "last_name": "Smith",
        "birth_date": "1999-02-19T22:00:00.000+00:00",
        "hire_date": "1992-01-19T22:00:00.000+00:00",
        "salary": 3500.0,
        "department": {
            "id": 1,
            "name": "HR"
        },
        "image": null
    }
]

Department Data
[
    {
        "id": 1,
        "name": "HR"
    },
    {
        "id": 2,
        "name": "IT"
    },
    {
        "id": 3,
        "name": "Marketing"
    }
]

--------------------------------------------------------------------------------------------------
Tasks
 - add new record of employee using and save the image as base64 and display the saved record
 - update the employee image and display the updated record
 - increase employee's salary and display updated record
 - get emplooyes who birthday in the specified month
 
 Rest endpoint (RestAPI) of the above mention task are found in the Employee Controller class. the Structure of the data passed to the API is also depfined in the class.
  
