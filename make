#!/bin/bash

mkdir -p bin
javac -d ./bin -cp "lib/junit-4.11.jar" \
    ./src/com/growingwiththeweb/designpatterns/*/*.java \
    ./test/com/growingwiththeweb/designpatterns/*/*.java
