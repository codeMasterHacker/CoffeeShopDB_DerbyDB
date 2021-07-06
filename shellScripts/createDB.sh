#!/bin/bash

javac src/CreateCoffeeDB.java 
mv src/CreateCoffeeDB.class bin/ 
cd bin/
java CreateCoffeeDB 
mv CoffeeDB ../
cd ../ 
