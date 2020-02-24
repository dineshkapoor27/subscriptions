Building Docker Image:

docker build -t subscriptions:1.0 .

Running Docker container:

docker run -d -p 8080:8080 subscriptions:1.0

Example Subscription POST request:

 curl --header "Content-Type: application/json" --request POST --data '{"first_name": "Dinesh", "gender": "Male", "dateOfBirth": "17/02/1983", "email": "dinesh@email.com", "consent": true}' http://localhost:8080/subscription

Example Response: {subscriptionId: 8ee09371-f8b7-4925-a717-c81dce21179e, notificationId: 87c3c9c9-55ce-4c0e-9631-394df0226772}

Example Subscription GET request:

http://localhost:8080/subscription?id=5e5fcc50-c221-462c-9c67-de6df3575676

Example Subscription GET response:

{"subscriptionId":"5e5fcc50-c221-462c-9c67-de6df3575676","verificationURL":"https://www.adidas.com/5e5fcc50-c221-462c-9c67-de6df3575676","first_name":"Dinesh","gender":"Male","dateOfBirth":"17/02/1983","email":"dinesh@email.com","consent":true}




