Prooject 2  
Assigned: Thursday, February 10, 2022  
Due: Thursday, February 24, 2022, at noon  

The FirstLastFootball class encapsulates the (simplified) score of a football game and enforces the (simplified) rules.  
The state of a football game includes the following:  
1. Names of both teams playing (two Strings)
2. Current score for each team (two integers)
3. What team has the ball (a boolean)
4. Yard line of where the ball is, in relation to the team that has the ball (an int, will have a value between 0 and 99)
5. Number of downs (an integer)

Notes:  
**A team can only run, attempt a pass, or attempt a field goal.  
There are no punts in this game and there is no point after either.   
The field is 100 yards long. Yardage goes from 0 to 100 (not 0 to 50 and 50 to 0) in both directions.  
A team has 4 downs to gain 10 yards or score. If a team does not do either, it loses the ball.  
As soon as the team gains 10 yards (from the spot of the ball on down # 1), the team gets another set of 4 downs.  
A touchdown is worth 7 points and a field goal 3 points.   
After a score, the ball is placed on the 20 yard line of the team that did not score (and now gets the ball).    
For the purpose of computing the distance of field goals, the posts are located on the goal line (100 yard line).   
The team that scores 13 points or more first wins the game.  
When the game is over, your program should terminate. You cannot call the exit method.**   

The FirstLastFootball class includes the following methods:
1. A constructor that takes only 2 parameters (for the two team names). It sets the names of the teams.  
It flips a coin to decide which team has the ball. The ball is placed on the 20 yard line of the team that has the ball.   
It will be 1st down (i.e. down # 1).      
2. A public play method: it accepts one parameter, an int, whose value can be as follows: 0 for a run, 1 for a pass, 2 for a field goal.  
These are the only available plays.  Depending on the value of the marameter, this method calls the appropriate method (run, pass, or kick).    
3. A public run method: when a team runs, it always runs for 3 yards. Note 1: the team that runs may score on that play. Note 2: it is possible that the team that runs may turn over the ball on downs on that play.  
4. A public pass method: when a team passes, the pass is completed 50% of the time, and not completed 50% of the time. There is never an interception.  
If the pass is completed, the pass is between 0 and 19 yards, with equal probablity for each number of yards.  Note 1: the team that runs may score on that play. Note 2: it is possible that the team that passes may turn over the ball on downs on that play.     
5. A kick method: if the field goal is 30 yards or less, the field goal is always good. If it is between 31 and 40 yards, it is good 75% of the time.   
If it is between 41 yards and 50 yards, it is good 50% of the time. If it is over 50 yards, it is good 10% of the time.  
Note 1: the team that kicks may score on that play.  
Note 2: it is possible that the team that kicks may turn over the ball on downs on that play (if a kick goal is missed, the other team automatically gets the ball on its 20 yard line, even if the field goal was attempted on 1st, 2nd or 3rd down).   
6. A score method: This method is called by the run, pass, or kick method in case a team scores. That method takes a parameter, the number of points that is scored.   
In practice, it is going to be either 7 or 3. This method updates the score of the game.   
7. A isGameOver method: it returns 0 if the game is not over yet, 1 if the away team won, and 2 if the home team won. A game is over when a team has scored 13 or more points.
8. A toString method: it should return something like:  
Ravens 7 New York Jets 3; Down # 2; Ravens have the ball on their 25 yard line
or
Ravens 14 New York Jets 10; Ravens won

The FirstLastPlayFootball class enables user input in order to play football, one play at a time (the user input should be 0, 1, 2 – and you should explain to the user at the beginning of the program what those numbers mean), until the game is over.   
You must call the toString method after each play.

**Submission Details**:  
You should have two classes. You should write your program from scratch.  
Name your classes FirstLastFootball (for example, I would name my class HerveFranceschiFootball) and FirstLastPlayFootball. Submit the Java source code (.java files) on Moodle and push to Github.  
1. GitHub: Completed .java files (including comments).  
2. Moodle: Same as above.  

Testing notes:
In main, after each play, you should call toString (that will help you test if your code is working correctly).

Grading and topics:   

Comments at top of each file (name, ..) 2     
Choice of variable names 6  
Style (indentation, alignment, ..) 6  
File name matches class name 2  
Instance variables 6  
Constructor 6   
play method 7   
run method 7  
pass method 7  
kick method 7  
score method 7  
isGameOver method 7   
toString method 6  
javadoc comments for all methods of the Football class 4   
Playing in main 20
