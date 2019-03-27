# Java 4: Advanced OOP

http://gwu-csci2113.github.io/java/4/

### To build and complie the code on the seasdb server:

  1. Navigate inside the `src` folder (NOTE: each individual folder in the `src` defines a package). 
  2. If the package doesn't depend on other packages you can just do the following to compile and run: 
  ```console
  javac ./files/RandReader.java
  java -cp . ./files/RandReader
  ```
  3. If the package depends on another package you have to tell the compiler the location. The simplest way to do it:
  ```console
  javac -cp . ./shapes/TestShapes.java 
  java -cp . ./shapes/TestShapes
  ```
