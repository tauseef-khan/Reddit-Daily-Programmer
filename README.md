Reddit-Daily-Programmer
=======================

A showcase of all the challenges I have done on the subreddit 'Daily Programmer'.

Each week the subreddit 'Daily Programmer' posts three programming challenges of varying difficulty, Easy, Intermediate, Hard on Monday, Wednesday and Friday respectively.

I'll start of at the Easy difficulty just to get warmed up and into the swing of programming. Once, I feel comfortable to move on to the next level of difficulty, I'll do exactly that! If I have time or finish a challenge quicker than expected then I'll try to do some more challenges.

I will update the README file each time I add a file of the completed challenge to the repo, giving the details of the challenge, and maybe some comments of my own about how I completed the challenge or how difficult I felt it was.

What I hope to gain out of this is:

    - Improve my programming and problem-solving skills
    - A showcase to employers of my programming ability and enthusiasm for programming
    - Get the buzz of completing the challenges!
  
Here is the link to the subreddit: http://www.reddit.com/r/dailyprogrammer

That's all for now!!!

P.S - The subreddit uses the date format (mm/dd/yyyy) for the challenge dates, whereas I use the format (dd/mm/yyyy) for dates written in this README file and in general thoughout this repo...SO BEWARE!

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

[04/08/2014] Challenge #174 [Easy] Thue-Morse Sequences

Date Attempted - 05/08/2014

Link to Challenge - http://www.reddit.com/r/dailyprogrammer/comments/2cld8m/8042014_challenge_174_easy_thuemorse_sequences/

Extra Challenge - Not attempted yet 

Language written in - Java

Comments -  

Reading the description did confuse me, but after looking at the graphic on the Wikipedia article I understood what to do. I didn't find the challenge that difficult. 

I have a for loop within a for loop in the main method (the inner loop is in the 'append' method). I would like to make it more efficient as it currently has the big-O notation O(n^2). It doesn't really matter for the output required but for larger orders it will take pretty long I would imagine. I'll try to resolve this issue in the 'Extra Challenge'.

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

[11/08/2014] Challenge #175 [Easy] Bogo!

Date Attempted - 17/08/2014

Link to Challenge - http://www.reddit.com/r/dailyprogrammer/comments/2d8yk5/8112014_challenge_175_easy_bogo/

Extra Challenge - Not attempted yet 

Language written in - Java

Comments -  

This challenge was interesting as throughout my university studies we have looked at mostly efficient ways of sorting. So to have a go at coding an inefficient sort helps me put into perspective how efficient sorting is very beneficial.

I didn't know how to create a method which jumbles up an array. So I got the code for the 'shuffle' method of a website. I understood what the code was doing and from now on I shall implement my own shuffle methods if needed. 

Link to the shuffle code: http://www.leepoint.net/notes-java/algorithms/random/random-shuffling.html

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

[18/08/2014] Challenge #176 [Easy] Spreadsheet Developer pt.1: Cell Selection 

Date Attempted - 21/08/2014

Date Completed - 24/08/2014

Link to Challenge - http://www.reddit.com/r/dailyprogrammer/comments/2dvc81/8182014_challenge_176_easy_spreadsheet_developer/

Extra Challenge  - None, but has a part 2 with a difficulty of hard 

Language written in - Java

Comments -  

This challenge was interesting as throughout my university studies we have looked at mostly efficient ways of sorting. So to have a go at coding an inefficient sort helps me put into perspective how efficient sorting is very beneficial.
This challenge was fun as I have used spread sheets before and to now code a feature of it (cell selection) has made me more appreciative of the work that has to go into it. It specified to use a bijective Base-26 system which I didn’t really understand so I decided to make a 10 by 10 grid instead as it was easier for me to work with. Other than that I didn’t make any other changes.


I decided I would convert the column names which were letters of the alphabet into numbers to make it easier to work with co-ordinates. But I didn’t know how to do this so I used code from a post I saw on StackOverflow. 


Link to StackOverflow post: http://stackoverflow.com/questions/4262567/convert-letter-to-digits

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

[25/08/2014] Challenge #177 [Easy] Quicksort

Date Attempted - 29/08/2014

Date Completed - 30/08/2014

Link to Challenge - http://www.reddit.com/r/dailyprogrammer/comments/2ejl4x/8252014_challenge_177_easy_quicksort/

Extra Challenge  - None

Language written in - Java

Comments - 

This challenge went well as I was familiar with quicksort and recursion with lisp lists. So I used a similar structure to the programs I wrote for lisp lists with recursion. I just tailored it to this challenge and it worked out for me. Overall, a good refresher to quicksort.

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

[01/09/2014] Challenge #178 [Easy] Transformers: Matrices in Disguise, pt. 1

Date Attempted - 03/09/2014

Date Completed - 06/09/2014

Link to Challenge - http://www.reddit.com/r/dailyprogrammer/comments/2f6a7b/9012014_challenge_178_easy_transformers_matrices/

Extra Challenge  - None

Language written in - Java

Comments - 

This challenge was something which I thoroughly enjoyed. As I got to use the some methods in the Math class which I hadn’t used before such as sin() and cos(). Also, it was a challenge which required some planning out when it came to user inputting the commands repeatedly but I managed to figure it out. 

Overall, a challenge I enjoyed because even though the commands were familiar to me, e.g. translating, reflecting, rotating and scaling, implementing them into code was interesting. As I could now figure out the values just by inputting a command rather than using pen and paper like in school! I learnt about the Rotation matrix for the rotating command, so as well as coding practise, I go to learn about a new concept.

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

[08/09/2014] Challenge #179 [Easy] You make me happy when clouds are gray...scale 

Date Attempted - 08/09/2014

Date Completed - 15/09/2014

Link to Challenge - http://www.reddit.com/r/dailyprogrammer/comments/2ftcb8/9082014_challenge_179_easy_you_make_me_happy_when/

Extra Challenge  - None

Language written in - Java

Comments - 

The challenge introduced me to new concepts. I never really used Java’s AWT library to manipulate images like that. Although, I have used third party library to convert images into grayscale, it was called JavaCV. JavaCV had a built-in function whereas in this challenge you have to do it yourself. I had to look up how to do certain things but in the end I managed to complete the challenge.

Overall, it was a good challenge as I learnt how to use some of the functions in the AWT library. However, I did use a simplistic method of taking the average value of RGB even though there is a problem doing it this way which is stated on the brief. But I didn’t know any other way as image manipulation is something I’m relatively new at. Maybe layer on I could find a better method and implement that.

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

[15/09/2014] Challenge #180 [Easy] Look'n'Say 

Date Attempted - 19/09/2014

Date Completed - 20/09/2014

Link to Challenge - http://www.reddit.com/r/dailyprogrammer/comments/2ggy30/9152014_challenge180_easy_looknsay/

Extra Challenge  - Not yet attempted, but I'm confident as it is simple and it's more to do with pattern observation

Language written in - Java

Comments - 

This challenge was a bit tricky to begin with as I didn’t know what to do when I had to reach the end of the string. So after some research I decided to add a special character. I used the ‘@’ symbol as I was dealing with numbers and this symbol won’t come up with any of the sequences.  The first time I tried to solve the problem I thought I had a good idea of what to do on paper. But as I typed out my solution I realised I hadn’t covered certain situations and it was a downward spiral when it came to getting the solution. However, the next day I was refreshed and within 10 minutes or so I identified the issues and fixed them and I got the complete solution in no time!

Overall, a challenge which tested me a little more than usual. I know my solution isn’t as efficient as it could be as I have a loop within a loop, big-O notation of O(n^2). So I hope I can come up with a better solution if I come back to this problem again in the future. 

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

[22/09/2014] Challenge #181 [Easy] Basic Equations 

Date Attempted - 23/09/2014

Date Completed - 24/09/2014

Link to Challenge - http://www.reddit.com/r/dailyprogrammer/comments/2h5b2k/09222014_challenge_181_easy_basic_equations/

Extra Challenge  - Not yet attempted

Language written in - Java

Comments - 

This challenge was pretty straightforward. The split() method was very useful as I could easily get rid of any unwanted characters and it would separate the result into an array. I ran into a problem when the user would input an equation in the form y=ab instead of y=ax+b, so I had to use if statements to check the length of the arrays and made adjustments accordingly. 
Overall, it was a good challenge to do as it required some careful planning. Once I had come up with a plan it was easy to implement and I finished the challenge quickly.

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
