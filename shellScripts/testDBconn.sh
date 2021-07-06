#!/bin/bash

javac src/TestConnection.java 
mv src/TestConnection.class bin/ 
cd bin/
java TestConnection 
cd ../ 
