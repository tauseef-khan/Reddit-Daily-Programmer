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

[11/08/2014] Challenge #175 [Easy] Bogo!

Date Attempted - 17/08/2014

Description - 

A bogo sort is a purposefully inefficient algorithm for sorting a sequence. Today we will be using this for strings to test for equality. Bogosort Wikipedia article: http://en.wikipedia.org/wiki/Bogo-sort

Input - Bogo("lolhe","Hello")

Output - 1456 iterations

Extra Challenge [Not attempted yet] - 

For a bit of fun, the LEAST efficient algorithm wins. Check out the bogo-bogo sort, an algorithm that's designed not to succeed before the heat death of the universe

http://www.dangermouse.net/esoteric/bogobogosort.html

If you have designed an algorithm but it still hasn't finished sorting, if you can prove it WILL sort, you may post your proof.

Language written in - Java

Comments -  

This challenge was interesting as throughout my university studies we have looked at mostly efficient ways of sorting. So to have a go at coding an inefficient sort helps me put into perspective how efficient sorting is very beneficial.

I didn't know how to create a method which jumbles up an array. So I got the code for the 'shuffle' method of a website. I understood what the code was doing and from now on I shall implement my own shuffle methods if needed. 

Link to the shuffle code: http://www.leepoint.net/notes-java/algorithms/random/random-shuffling.html

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
