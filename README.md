[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/kjzW9mKg)
# Game Programming 1 - Midterm Exam

This template repository is the starter project for Game Programming 1 Midterm Exam. Written in Java/Stride using Greenfoot.

### Instructions

#### **Objective:**
Create a game in Greenfoot based on the provided screenshot. The game will involve a Pig that must eat Burgers while avoiding a Snake that moves randomly. The game will end when either the Pig eats all the Burgers or the Snake eats the Pig.

#### **Exam Overview:**
- **Worth:** 20% of the final grade
- **Tools:** Greenfoot IDE
- **Deadline:** Tuesday, September 24, 2024, at 10:00 AM

#### **Requirements:**

1. **World Setup:**
   - Create a new scenario in Greenfoot and name it `PigWorld`.
   - Place multiple Burger objects randomly on the grid.
   - Place the Pig object in the center of the world.
   - Place the Snake object in a corner of the world.
   - Save the world.

2. **Game Design:**
   - **Pig's Movement:** Allow the Pig to be controlled by the arrow keys (or "awsd").
   - **Eating Mechanism:** When the Pig overlaps with a Burger, the Burger should disappear, and the "eating.wav" sound should play.
   - **Snake's Behavior:** The Snake should move randomly around the world, aiming to catch the Pig.
   - **Winning Condition:** If the Pig eats all the Burgers, the game should transition to a "Winner" screen. Play the "win.wav" sound upon winning.
   - **Losing Condition:** If the Snake catches the Pig, the game should transition to a "Loser" screen. Play the "lost.wav" sound upon losing.

3. **Screens and Sounds:**
   - **Winner Screen:** Design a simple screen that displays a message like "You Win!" when the Pig eats all the Burgers.
   - **Loser Screen:** Design a simple screen that displays a message like "Game Over!" when the Snake eats the Pig.
   - **Sound Effects:** Ensure that the following sound effects are played at the appropriate moments:
     - "eating.wav" when the Pig eats a Burger.
     - "win.wav" when the Pig wins the game.
     - "lost.wav" when the Pig loses the game.

4. **Coding Standards:**
   - Use clear and descriptive variable names.
   - Comment your code to explain the functionality of each part.
   - Follow proper indentation and code structure practices.

5. **Submission:**
   - Put your project source code back into the repository's folder and push it to GitHub.

#### **Grading Rubric:**
- **World Setup (5%):** Correctly setting up the grid, placing the objects, and organizing the world.
- **Game Mechanics (10%):** Implementing the Pig's movement, Burger eating mechanism, Snake's random movement, and transition to Winner/Loser screens.
- **Sound Implementation (2.5%):** Correctly playing the "eating.wav", "win.wav", and "lost.wav" sounds at the right moments.
- **Code Quality (2.5%):** Code clarity, comments, structure, and adherence to coding standards.

### **Good Luck!**
Make sure to test your game thoroughly before submitting to ensure all mechanics and conditions work as expected.

