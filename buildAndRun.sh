#!/bin/sh
mvn clean package && docker build -t blog.elmland/jenkins-web-test .
docker rm -f jenkins-web-test || true && docker run -d -p 8080:8080 -p 4848:4848 --name jenkins-web-test blog.elmland/jenkins-web-test 
