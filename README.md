# globalkinetic

Quick Test the application

I have spring security to secure my endpoints 

Please use the below credentials to login and test the app

username:ndumiso
password:ayabonga 


The app will start running at <http://162.253.124.163/globalkinetic>.

Create user
POST -d '{"emailAddress": "xmbete@gmail.com","name": "ndumiso","password": "ayabonga1234","phoneNumber": "0731230109","surename": "Mbete","username": "siphelo","userId": 2}'http://162.253.124.163/globalkinetic/users
Update user
PUT -d '{"emailAddress": "xmbete@gmail.com","name": "ndumiso","password": "ayabonga1234","phoneNumber": "0731230109","surename": "Mbete","username": "siphelo","userId": 2}' http://162.253.124.163/globalkinetic/users/{id}
List all users
GET http://162.253.124.163/globalkinetic/users
Get User info
GET http://162.253.124.163/globalkinetic/users/{id}

Delete User
DELETE http://162.253.124.163/globalkinetic/users/{id}




If you would like to run the app in you local machine please clone the project

I have also attached the db script(globalkinetic.sql) for you to run quickly


The app will start running at <http://localhost:8080/globalkinetic>.

Create user
POST -d '{"emailAddress": "xmbete@gmail.com","name": "ndumiso","password": "ayabonga1234","phoneNumber": "0731230109","surename": "Mbete","username": "siphelo","userId": 2}'http://localhost:8080/globalkinetic/users
Update user
PUT -d '{"emailAddress": "xmbete@gmail.com","name": "ndumiso","password": "ayabonga1234","phoneNumber": "0731230109","surename": "Mbete","username": "siphelo","userId": 2}' http://localhost:8080/globalkinetic/users/{id}
List all users
GET http://localhost:8080/globalkinetic/users
Get User info
GET http://localhost:8080/globalkinetic/users/{id}

Delete User
DELETE http://localhost:8080/globalkinetic/users/{id}



