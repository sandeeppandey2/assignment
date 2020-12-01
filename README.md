
# Assignment
## 1.Code contains rest endpoints which calculates area of triangle and display number sequence.
   

##Steps to run code

1.clone code in local repo

2.run command mvn clean install

3.run command mvn spring-boot:run

4.check if application started successfully

#Acces API.

1.Get Sequence of Numbers

GET Method:

Request: http://localhost:8090/api/demo/numberSequence/10

Response: 

{
    "listofNumbers": [
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        10
    ]
}

2.Get Area of Triangle

Request: http://localhost:8090/api/demo/areaOfTriangle/10/20

Response:

{
    "triangleArea": 100.0
}

**Pipeline

*created github pipleline to build and run test

*Steps to check the same.

1.Go to Actions tab in repository and see jobs running.

**Notes
1.Basic Restendpoint is created just to demo and some docs added.

2.Docker can be added, more test scenarios also need to add .
