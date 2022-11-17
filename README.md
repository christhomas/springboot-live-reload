# Simple Live Reload Java Spring Boot App

This app is the smallest version of a spring boot app with live reloading that will run in a docker container that I could build.

It's obviously not production ready.

But if you edit the java source, it'll detect the changes and rebuild it. Although it's not very fast to be honest, it takes about 30 seconds
before the class files are rebuilt and you can refresh. 

But it's better than having to do everything by hand.

It uses `supervisord` to run multiple processes, one for running the app and the other for watching for file changes
All output from all processes are sent to the stdout, which means you can use `docker logs` to easily watch for output

It has a very basic customer REST API which allows you to list, create, update, and delete customers. 

The purpose of this code is to show the simplest solution to this problem I could do without going into overdrive and over the top. 

The REST API works like this

```
[GET] / -> list all customers in database as a json array
[POST] / -> Create a new customer, post a JSON object like {"id": "uuid string", "firstName": "The first name", "lastName": "The last name"}
[PUT] / -> Update an existing customer, use the same object from [POST], but with an existing uuid
[DELETE] /uuid-string -> Delete a customer with a particular uuid
```

Yeah, not really exciting right? But it at least works. I should probably add a react frontend onto this, with perhaps users for authentication. Flesh it out into a real app with potentially real world use, at least from a template standpoint. But I was really just interested to know how java and docker would work together, because for me Java is an old-world language and docker is new-world and I was not sure how well they would work together.

What I should do also is investigate how a debugger would connect to the java system inside the container, but debug it directly from my desktop. That would be an interesting addition.

If you have any ideas, drop them into the "Issues" and if anybody knows the solution, we can go from there.