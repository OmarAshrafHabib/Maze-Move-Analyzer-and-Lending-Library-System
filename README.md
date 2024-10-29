# Maze Move Analyzer & Entertainment Lending Library System

## Overview
This project consists of two main components to practice working with two-dimensional arrays, partially filled arrays of objects, and static variables.

1. **Maze Move Analyzer**: A utility class for checking if a character in a maze can make a valid move in a specified direction (left or down). The maze is represented by a 2D array where different symbols represent the hero, unoccupied spaces, and enemies.

2. **Entertainment Lending Library System**: A system designed to manage an entertainment lending library for residents of a retirement community. This system includes resident and item classes to keep track of membership, borrowed items, and rules specific to different types of residents.

### Key Components

1. **Maze Move Analyzer**:
   - **MoveAnalyzer Class**: Contains the static `checkMove` method to validate whether a hero can move or jump in a specified direction within the maze. The hero can jump over enemies but must land on an unoccupied space ('U').

2. **Entertainment Lending Library**:
   - **EntertainmentItem Class**: Represents any item available in the library, including details like description, original price, and benefactor status.
   - **ResidentMember Class**: Represents a permanent resident of the facility who can borrow up to seven items at a time. Each resident has a membership number, name, condo unit, phone number, and a list of borrowed items.
   - **ShortTermResidentMember Class**: Inherits from `ResidentMember`, with a restriction that prevents borrowing items donated by benefactors. Each short-term resident also has a specified departure date.

### Features
- **Two-Dimensional Array Processing**: Uses loops to analyze a 2D array representing the maze without modifying it or creating additional arrays.
- **Partial Arrays of Objects**: Manages a partially filled array of borrowed items for each resident, allowing up to seven items at a time.
- **Inheritance and Polymorphism**: The `ShortTermResidentMember` class inherits from `ResidentMember`, modifying the borrowing rules.
- **Static Variable for Membership**: Resident membership numbers are assigned in ascending order starting from 500000, stored as a static variable.

## Usage
1. **Maze Move Analyzer**: Use the `MoveAnalyzer.checkMove` method to validate possible moves in a maze for the hero character, based on specific move rules.
2. **Lending Library System**: Use the classes to add resident members, track borrowed items, and enforce borrowing restrictions for short-term residents.

## Documentation
Javadoc comments are provided for each class, method, and variable, describing their purposes and parameters.

## Project Files
- `MoveAnalyzer.java`: Static method to check if a hero can move within a 2D array maze.
- `EntertainmentItem.java`: Class for library items with details like description, price, and benefactor status.
- `ResidentMember.java`: Class for residents borrowing items from the library.
- `ShortTermResidentMember.java`: Class for short-term residents with specific borrowing restrictions.
- `As7Q1TestDriver.java` and `As7Q2TestDriver.java`: Test drivers for validating `MoveAnalyzer` and library classes.
