#!/bin/bash

javac src/ShowCoffeeData.java 
mv src/ShowCoffeeData.class bin/ 
cd bin/
java ShowCoffeeData 
cd ../ 
