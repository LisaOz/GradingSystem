# Grading System
This is a Java program for managing and processing student grades. The program takes the points from the user as inputs, converts the points into grades, displays the grade distribution using stars, and calculates both the average of points and the average of grades.

The program consists of the following classes:

### GradeRegister Class
This class focuses on data storage and calculations, separating the logic of handling data from the user interaction. It provides the following methods to perform calculations and manipulate the data:
- **pointsToGrade()**: Converts points into grades based on the predefined ranges
- **averageOfPoints()**: Calculates the average of all points stored in the ArrayList
- **averageOfGrades()**: Calculates the average of the stored grades
- **numberOfGrades()**: Counts how many times a speciic grade appears in the stored data

### UserInterface Class
This class manages the interaction between the program and the user: it collects inputs and  display output. It contains the following methods:
- **readPoints()**: Prompts the user for the input and validates the inputs before adding them to the GradeRegister
- **printGradeDistribution()**: Displays the grade distribution using asterisks
- **printAverages()**: Method to display the average points and grades from the GradeRegister

### Main Class
This class initialises the GradeRegister and UserInterface objects and starts the user interface.

## Usage
Clone the repository and run the program. When prompted, enter the points (0 - 100). To stop entering points,  press the spacebar or leave the input empty. The program will then display:

- The count of each grade.
- A histogram distribution of the grades represented with stars.
- The average of the entered points.
- The average of the calculated grades.

## License
This program is licensed under MIT Licence, feel free to copy, modify and use it.

