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

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

[04/08/2014] Challenge #174 [Easy] Thue-Morse Sequences

Date Attempted - 05/08/2014

Description - 

The Thue-Morse sequence is a binary sequence (of 0s and 1s) that never repeats. It is obtained by starting with 0 and successively calculating the Boolean complement of the sequence so far. It turns out that doing this yields an infinite, non-repeating sequence. This procedure yields 0 then 01, 0110, 01101001, 0110100110010110, and so on. Thue-Morse Sequences: http://en.wikipedia.org/wiki/Thue%E2%80%93Morse_sequence

Input - Nothing

Output - Output the 0 to 6th order Thue-Morse Sequences

Extra Challenge [Not attempted yet] - 

Be able to output any nth order sequence. Display the Thue-Morse Sequences for 100. Note: Due to the size of the sequence it seems people are crashing beyond 25th order or the time it takes is very long. So how long until you crash. Experiment with it.

Language written in - Java

Comments -  

Reading the description did confuse me, but after looking at the graphic on the Wikipedia article I understood what to do. I didn't find the challenge that difficult. 

I have a for loop within a for loop in the main method (the inner loop is in the 'append' method). I would like to make it more efficient as it currently has the big-O notation O(n^2). It doesn't really matter for the output required but for larger orders it will take pretty long I would imagine. I'll try to resolve this issue in the 'Extra Challenge'.

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
