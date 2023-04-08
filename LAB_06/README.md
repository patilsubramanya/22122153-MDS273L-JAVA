Read the given text file in a object.
Declare two arrays vowel and digit to store the count of the vowels and digit.
Create a function which reads the file and converts it to the string so as to make it easy for taking out the count of vowels and digit.
Now pass this file to the function "vowelcount" and "digitcount" to get the vowel and digit count.
These function will return the count of vowel and digit in the file. 
Now display the vowels and their counts respectively along with digits and their counts.
Now read the file again, but this time after reading the first line of the file process it first. Process in the sense, split the line into different words separated by ",",".","?"," ","!" etc.(punctuations).
After the line has been split into different words, add all the unique words to the array words. 
If any word is repeated in the line then just increament the count of that particular word in the counts array.
Repeat this process for all the lines in the file.
After completing reading the file you will have the words array which will have all the unique words and count array which will have count of all the words which are repeated.
Now display the top five repeated words in the file by accessing it through the count array.
Similarly display the top five least repeated words.
Next you have to read the file again and this time rather converting it to string convert it to the array of characters.
Pass this read file to the function which will go through all the characters in the array, and keep a track of unique  characters, and repeated characters.
Now, with the help of the previous functions used in the program i.e "findminIndex" and "findmaxIndex", we will get the count of most repeated and least repeated characters in the file.
Now display the top five most repeated characters and top five least repeated characters in the file.