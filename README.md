# Simple Live Reload Java Spring Boot App

This app is the smallest version of a spring boot app with live reloading that will run in a docker container that I could build.

It's obviously not production ready.

But if you edit the java source, it'll detect the changes and rebuild it. Although it's not very fast to be honest, it takes about 30 seconds
before the class files are rebuilt and you can refresh. 

But it's better than having to do everything by hand.

It uses `supervisord` to run multiple processes, one for running the app and the other for watching for file changes
All output from all processes are sent to the stdout, which means you can use `docker logs` to easily watch for output