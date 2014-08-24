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

[18/08/2014] Challenge #176 [Easy] Spreadsheet Developer pt.1: Cell Selection 

Date Attempted - 21/08/2014		Date Completed – 24/08/2014

Description - 

Today and on Wednesday we will be developing a terminal-based spreadsheet package somewhat like ed used to be. Today we'll be taking a look at the mechanism for selecting ranges of cells from textual data.

In the spreadsheet, each cell may be represented by one of two systems:
•	Co-ordinate in memory. This looks like [X, Y] and represents the cell's position in the internal array or memory structure. X and Y begin at 0.
•	Column-row syntax. This looks like A3, B9 or AF140 and is created from the row's alphabetical header and the column number, starting from 1. You may be more familiar with this syntax in programs such as Excel, Lotus 1-2-3 (lol as if) or LibreOffice Calc. Pay close attention to the naming of the columns - it's not a simple Base-26 system as you may expect. It's called bijective Base-26.


Now to select a range, we need another syntax. The following symbols apply in order of precedence, top-to-bottom:
•	A formula may have one or more :s (colons) in it. If so, a rectangle of cells is selected. This behaves the same way in Excel. Such a selection is called a range. For example, A3:C7 looks like this.
•	A formula may have one or more &s (ampersands) in it. If so, both the cell/range specified to the left and right are selected. This is just a concatenation. For example, A1:B2&C3:D4 looks like this.
•	A formula may have one ~ (tilde) symbol in it. If so, any cells specified before the tilde are added to the final selection, and any cells after the tilde are removed from the final selection of cells. For example, if I enterA1:C3~B2 then all cells from A1 to C3 except B2 are selected, which looks like this. (This acts like a relative complement of the right hand side in the left hand side.)


Your challenge today will be, given a selection string like A3:C6&D1~B4&B5, print the co-ordinates of all of the selected cells, along with the count of selected cells.

Input - You will be given a selection string like A3:C6&D1~B4&B5 on one line. E.g. B1:B3&B4:E10&F1:G1&F4~C5:C8&B2


Output - First, print the number of cells selected (eg. if 50 cells are selected, print 50.)
Then, on separate lines, print the co-ordinates of each selected cell.
E.g. 29 [1, 0] [1, 2] [1, 3] [1, 4] [1, 5] [1, 6].....[5, 3]

Extra Challenge  - None, but has a part 2 with a difficulty of hard 

Language written in - Java

Comments -  

This challenge was interesting as throughout my university studies we have looked at mostly efficient ways of sorting. So to have a go at coding an inefficient sort helps me put into perspective how efficient sorting is very beneficial.
This challenge was fun as I have used spread sheets before and to now code a feature of it (cell selection) has made me more appreciative of the work that has to go into it. It specified to use a bijective Base-26 system which I didn’t really understand so I decided to make a 10 by 10 grid instead as it was easier for me to work with. Other than that I didn’t make any other changes.

I decided I would convert the column names which were letters of the alphabet into numbers to make it easier to work with co-ordinates. But I didn’t know how to do this so I used code from a post I saw on StackOverflow. 
Link to StackOverflow post: http://stackoverflow.com/questions/4262567/convert-letter-to-digits

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
