# AsciiCanvas - Play
Text (ASCII) based drawing program (something similar to a simplified version of Paint). The basic program allows users to:
* Create a new canvas
* Draw on the canvas using text based commands
* Quit the program

## Requirements 

Should respond to commands entered manually
Example Description:
* C w h Create a new canvas of width w and height h
* L x1 y1 x2 y2
* Draw a new line from coordinates (x1, y1) to (x2, y2) horizontally or vertically. Lines are made up of the x character
* R x1 y1 x2 y2
* Draw a new rectangle, with upper left corner at coordinate (x1, y1) and lower right coordinate at (x2, y2). Lines are made up of the x character
* Q Quit the program

## Tools, frameworks and libraries used
* [Zulu OpenJDK 11 / Windows 10](https://www.azul.com/downloads/zulu-community/?version=java-11-lts&os=windows&architecture=x86-64-bit&package=jdk)
* [Maven 3.6.3](https://maven.apache.org)
* [Spring Tool Suite 4.5.0.RELEASE](https://spring.io/tools) with SonarLint (code quality and security) & JaCoCo (code coverage) plugins
* JUnit 5.5.2 

## For building and running the application
There are several ways to run this application locally.

1. Clone the repository (cmd line):

```shell
git clone https://github.com/catalinFlorea/AsciiCanvas.git
```
or clone from Eclipse STS ->`Import Project from Git` -> `Clone URI` -> Enter above cloning address.

To compile, build and execute unit tests from command line you can use the Maven (3.6.3) - needs to be installed and used with Java 11:
```shell
mvn clean package
```

## Improvements
* Refactor and clean even more the code, extract in a separate class logic from the Main class
* Increase code coverage - for all branches/instructions - Commands from console can also be tested, RegEx expression as well
* Add PowerMock/Mockito to test also private/static methods or behavior testing